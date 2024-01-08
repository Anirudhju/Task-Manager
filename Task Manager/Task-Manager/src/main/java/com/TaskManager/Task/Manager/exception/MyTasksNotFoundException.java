package com.TaskManager.Task.Manager.exception;

public class MyTasksNotFoundException extends RuntimeException
{
    public MyTasksNotFoundException(String message) {
        super(message);
    }

    public MyTasksNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
