package org.appfuse.service;

import java.util.List;
import java.util.Map;

import org.appfuse.model.Robot;

public interface RobotManager {
	public List getRobots();
	public Robot getRobot(Long id);
	public void saveRobot(Robot robot);
	public void removeRobot(Long id);
	public Map<Long, String> getRobotMap();
}
