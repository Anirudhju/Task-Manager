package com.TaskManager.Task.Manager.service;

import com.TaskManager.Task.Manager.model.MyTasks;

import java.util.List;

public interface MyTasksService
{
    public String createMyTasks(MyTasks myTasks);
    public String updateMyTasks(MyTasks myTasks);
    public String deleteMyTasks(String taskId);
    public MyTasks getMyTasks(String taskId);
    public List<MyTasks> getAllMyTasks();
}
