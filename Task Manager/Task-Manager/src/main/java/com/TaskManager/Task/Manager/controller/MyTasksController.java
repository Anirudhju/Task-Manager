package com.TaskManager.Task.Manager.controller;

import com.TaskManager.Task.Manager.model.MyTasks;
import com.TaskManager.Task.Manager.service.MyTasksService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mytasks")
public class MyTasksController
{
    MyTasksService myTasksService;
    public MyTasksController(MyTasksService myTasksService) {
        this.myTasksService = myTasksService;
    }

    @GetMapping("{taskId}")
    public MyTasks getMyTasksDetails(@PathVariable("taskId") String taskId)
    {
        return myTasksService.getMyTasks(taskId);
    }

    @GetMapping()
    public List<MyTasks> getAllMyTasksDetails()
    {
        return myTasksService.getAllMyTasks();
    }

    @PostMapping
    public String createMyTasksDetails(@RequestBody MyTasks myTasks)
    {
        myTasksService.createMyTasks(myTasks);
        return "My Tasks Details Created Successfully";
    }

    @PutMapping
    public String updateMyTasksDetails(@RequestBody MyTasks myTasks)
    {
        myTasksService.updateMyTasks(myTasks);
        return "My Tasks Details Updated Successfully";
    }
    @DeleteMapping("{taskId}")
    public String deleteMyTasksDetails(@PathVariable("taskId") String taskId)
    {
        myTasksService.deleteMyTasks(taskId);
        return "My Tasks Details Deleted Successfully";
    }
}
