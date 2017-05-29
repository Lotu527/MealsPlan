package my.lotu.dao;

import java.util.List;

import my.lotu.bean.DayPlan;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * DayPlan entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see my.lotu.bean.DayPlan
 * @author MyEclipse Persistence Tools
 */
public class DayPlanDAO extends BasicDao {
	private static final Logger log = LoggerFactory.getLogger(DayPlanDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String BREAKFAST = "breakfast";
	public static final String LUNCH = "lunch";
	public static final String DINNER = "dinner";
	public static final String PRICE = "price";
	public static final String CALORIE = "calorie";
	public static final String SCORE = "score";

	private Session getSession() {
		return getSessionFactory().getCurrentSession();
	}
	
	public void save(DayPlan transientInstance) {
		log.debug("saving DayPlan instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DayPlan persistentInstance) {
		log.debug("deleting DayPlan instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DayPlan findById(java.lang.Integer id) {
		log.debug("getting DayPlan instance with id: " + id);
		try {
			DayPlan instance = (DayPlan) getSession().get(
					"my.lotu.bean.DayPlan", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(DayPlan instance) {
		log.debug("finding DayPlan instance by example");
		try {
			List results = getSession().createCriteria("my.lotu.bean.DayPlan")
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
		log.debug("finding DayPlan instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from DayPlan as model where model."
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

	public List findByBreakfast(Object breakfast) {
		return findByProperty(BREAKFAST, breakfast);
	}

	public List findByLunch(Object lunch) {
		return findByProperty(LUNCH, lunch);
	}

	public List findByDinner(Object dinner) {
		return findByProperty(DINNER, dinner);
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
		log.debug("finding all DayPlan instances");
		try {
			String queryString = "from DayPlan";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DayPlan merge(DayPlan detachedInstance) {
		log.debug("merging DayPlan instance");
		try {
			DayPlan result = (DayPlan) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DayPlan instance) {
		log.debug("attaching dirty DayPlan instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DayPlan instance) {
		log.debug("attaching clean DayPlan instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}