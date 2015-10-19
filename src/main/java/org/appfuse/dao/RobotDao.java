package org.appfuse.dao;

import java.util.List;

import org.appfuse.model.Robot;

public interface RobotDao extends Dao {
	public List getRobots();
	public Robot getRobot(Long id);
	public void saveRobot(Robot robot);
	public void removeRobot(Long id);
}