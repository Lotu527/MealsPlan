package my.lotu.dao;

import java.util.List;

import my.lotu.bean.Plan;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for Plan
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see my.lotu.bean.Plan
 * @author MyEclipse Persistence Tools
 */
public class PlanDAO extends BasicDao {
	private static final Logger log = LoggerFactory.getLogger(PlanDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String TYPE = "type";
	public static final String DAY_PLAN_ID = "dayPlanId";
	public static final String PRICE = "price";
	public static final String SCORE = "score";
	public static final String TIME = "time";

	private Session getSession() {
		return getSessionFactory().getCurrentSession();
	}
	
	public void save(Plan transientInstance) {
		log.debug("saving Plan instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Plan persistentInstance) {
		log.debug("deleting Plan instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Plan findById(java.lang.Integer id) {
		log.debug("getting Plan instance with id: " + id);
		try {
			Plan instance = (Plan) getSession().get("my.lotu.bean.Plan", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Plan instance) {
		log.debug("finding Plan instance by example");
		try {
			List results = getSession().createCriteria("my.lotu.bean.Plan")
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
		log.debug("finding Plan instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Plan as model where model."
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

	public List findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	public List findByDayPlanId(Object dayPlanId) {
		return findByProperty(DAY_PLAN_ID, dayPlanId);
	}

	public List findByPrice(Object price) {
		return findByProperty(PRICE, price);
	}

	public List findByScore(Object score) {
		return findByProperty(SCORE, score);
	}

	public List findByTime(Object time) {
		return findByProperty(TIME, time);
	}

	public List findAll() {
		log.debug("finding all Plan instances");
		try {
			String queryString = "from Plan";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Plan merge(Plan detachedInstance) {
		log.debug("merging Plan instance");
		try {
			Plan result = (Plan) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Plan instance) {
		log.debug("attaching dirty Plan instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Plan instance) {
		log.debug("attaching clean Plan instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}