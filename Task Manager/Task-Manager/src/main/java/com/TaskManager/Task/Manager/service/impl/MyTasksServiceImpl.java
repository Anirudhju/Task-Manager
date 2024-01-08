package com.TaskManager.Task.Manager.service.impl;

import com.TaskManager.Task.Manager.exception.MyTasksNotFoundException;
import com.TaskManager.Task.Manager.model.MyTasks;
import com.TaskManager.Task.Manager.repository.MyTasksRepository;
import com.TaskManager.Task.Manager.service.MyTasksService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyTasksServiceImpl implements MyTasksService
{
    MyTasksRepository myTasksRepository;
    public MyTasksServiceImpl(MyTasksRepository myTasksRepository)
    {
        this.myTasksRepository = myTasksRepository;
    }

    @Override
    public String createMyTasks(MyTasks myTasks)
    {
        myTasksRepository.save(myTasks);
        return "Task Created";
    }

    @Override
    public String updateMyTasks(MyTasks myTasks)
    {
        myTasksRepository.save(myTasks);
        return "Task Updated";
    }

    @Override
    public String deleteMyTasks(String taskId)
    {
        myTasksRepository.deleteById(taskId);
        return "Task Deleted";
    }

    @Override
    public MyTasks getMyTasks(String taskId)
    {
        if(myTasksRepository.findById(taskId).isEmpty())
            throw new MyTasksNotFoundException("Requested Task Not Found");
        return myTasksRepository.findById(taskId).get();
    }

    @Override
    public List<MyTasks> getAllMyTasks()
    {
        return myTasksRepository.findAll();
    }
}
