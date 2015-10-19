package org.appfuse.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.appfuse.dao.RobotDao;
import org.appfuse.model.Robot;
import org.appfuse.service.RobotManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "robotManager")
public class RobotManagerImpl implements RobotManager {
	@Autowired
	RobotDao dao;

	public List getRobots() {
		return dao.getRobots();
	}

	public Robot getRobot(Long id) {
		return dao.getRobot(id);
	}

	public void saveRobot(Robot robot) {
		dao.saveRobot(robot);
	}

	public void removeRobot(Long id) {
		dao.removeRobot(id);
	}

	public Map<Long, String> getRobotMap() {
		List<Robot> robots = getRobots();
		Map<Long, String> robotMap = new HashMap<Long, String>();
		for (Robot robot : robots) {
			robotMap.put(robot.getId(), robot.getDesignation());
		}
		return robotMap;
	}

}
