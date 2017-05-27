package my.lotu.bean;

import java.util.List;

import my.lotu.bean.Food;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for Food
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see my.lotu.bean.Food
 * @author MyEclipse Persistence Tools
 */
public class FoodDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(FoodDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String TYPE1 = "type1";
	public static final String TYPE2 = "type2";
	public static final String PICTURE = "picture";
	public static final String PRICE = "price";
	public static final String PROTEIN = "protein";
	public static final String CARBOHYDRA = "carbohydra";
	public static final String FAT = "fat";
	public static final String CALORIE = "calorie";
	public static final String MASS = "mass";

	public void save(Food transientInstance) {
		log.debug("saving Food instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Food persistentInstance) {
		log.debug("deleting Food instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Food findById(java.lang.Long id) {
		log.debug("getting Food instance with id: " + id);
		try {
			Food instance = (Food) getSession().get("my.lotu.bean.Food", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Food instance) {
		log.debug("finding Food instance by example");
		try {
			List results = getSession().createCriteria("my.lotu.bean.Food")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Food instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Food as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findByType1(Object type1) {
		return findByProperty(TYPE1, type1);
	}

	public List findByType2(Object type2) {
		return findByProperty(TYPE2, type2);
	}

	public List findByPicture(Object picture) {
		return findByProperty(PICTURE, picture);
	}

	public List findByPrice(Object price) {
		return findByProperty(PRICE, price);
	}

	public List findByProtein(Object protein) {
		return findByProperty(PROTEIN, protein);
	}

	public List findByCarbohydra(Object carbohydra) {
		return findByProperty(CARBOHYDRA, carbohydra);
	}

	public List findByFat(Object fat) {
		return findByProperty(FAT, fat);
	}

	public List findByCalorie(Object calorie) {
		return findByProperty(CALORIE, calorie);
	}

	public List findByMass(Object mass) {
		return findByProperty(MASS, mass);
	}

	public List findAll() {
		log.debug("finding all Food instances");
		try {
			String queryString = "from Food";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Food merge(Food detachedInstance) {
		log.debug("merging Food instance");
		try {
			Food result = (Food) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Food instance) {
		log.debug("attaching dirty Food instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Food instance) {
		log.debug("attaching clean Food instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}