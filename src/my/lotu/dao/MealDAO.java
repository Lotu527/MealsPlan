package my.lotu.dao;

import java.util.List;

import my.lotu.bean.Meal;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for Meal
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see my.lotu.bean.Meal
 * @author MyEclipse Persistence Tools
 */
public class MealDAO extends BasicDao {
	private static final Logger log = LoggerFactory.getLogger(MealDAO.class);
	// property constants
	public static final String TYPE = "type";
	public static final String FOODS = "foods";
	public static final String PRICE = "price";
	public static final String CALORIE = "calorie";
	public static final String SCORE = "score";
	
	private Session getSession() {
		return getSessionFactory().getCurrentSession();
	}
	
	public void save(Meal transientInstance) {
		log.debug("saving Meal instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Meal persistentInstance) {
		log.debug("deleting Meal instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Meal findById(java.lang.Integer id) {
		log.debug("getting Meal instance with id: " + id);
		try {
			Meal instance = (Meal) getSession().get("my.lotu.bean.Meal", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Meal instance) {
		log.debug("finding Meal instance by example");
		try {
			List results = getSession().createCriteria("my.lotu.bean.Meal")
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
		log.debug("finding Meal instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Meal as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	public List findByFoods(Object foods) {
		return findByProperty(FOODS, foods);
	}

	public List findByPrice(Object price) {
		return findByProperty(PRICE, price);
	}

	public List findByCalorie(Object calorie) {
		return findByProperty(CALORIE, calorie);
	}

	public List findByScore(Object score) {
		return findByProperty(SCORE, score);
	}

	public List findAll() {
		log.debug("finding all Meal instances");
		try {
			String queryString = "from Meal";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Meal merge(Meal detachedInstance) {
		log.debug("merging Meal instance");
		try {
			Meal result = (Meal) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Meal instance) {
		log.debug("attaching dirty Meal instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Meal instance) {
		log.debug("attaching clean Meal instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}