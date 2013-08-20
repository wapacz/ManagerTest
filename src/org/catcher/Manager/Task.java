/**
 * 
 */
package org.catcher.Manager;

import java.util.ArrayList;

/**
 * @author catchers
 *
 */
public class Task extends Commentable { 
	String name;
	TaskType type;
	TaskState state;
	ArrayList<User> users;
	ArrayList<Task> childs;
	ArrayList<Task> parents;
	ArrayList<Task> dependecies;
	ArrayList<TaskDetail> details;
}
