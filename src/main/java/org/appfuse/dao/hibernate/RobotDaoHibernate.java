package org.appfuse.dao.hibernate;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.appfuse.dao.RobotDao;
import org.appfuse.model.Robot;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ObjectRetrievalFailureException;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * This class interacts with Spring and Hibernate to save and retrieve Robot
 * objects.
 * 
 * @author lucas
 */
@Repository(value = "robotDao")
public class RobotDaoHibernate implements RobotDao {
	HibernateTemplate hibernateTemplate;
	Log logger = LogFactory.getLog(RobotDaoHibernate.class);

	@Autowired
	public RobotDaoHibernate(SessionFactory sessionFactory) {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	public List getRobots() {
		return hibernateTemplate.find("from Robot");
	}

	public Robot getRobot(Long id) {
		Robot robot = (Robot) hibernateTemplate.get(Robot.class, id);
		if (robot == null) {
			throw new ObjectRetrievalFailureException(Robot.class, id);
		}
		return robot;
	}

	public void saveRobot(Robot robot) {
        hibernateTemplate.saveOrUpdate(robot);

        if (logger.isDebugEnabled()) {
            logger.debug("robotId set to: " + robot.getId());
        }
	}

	public void removeRobot(Long id) {
		  hibernateTemplate.delete(getRobot(id));	
	}
}
