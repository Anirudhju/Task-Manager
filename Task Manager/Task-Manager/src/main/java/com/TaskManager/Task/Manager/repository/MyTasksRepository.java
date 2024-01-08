package com.TaskManager.Task.Manager.repository;

import com.TaskManager.Task.Manager.model.MyTasks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyTasksRepository extends JpaRepository<MyTasks,String>
{

}
