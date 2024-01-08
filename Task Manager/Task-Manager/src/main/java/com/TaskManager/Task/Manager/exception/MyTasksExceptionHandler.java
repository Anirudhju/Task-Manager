package com.TaskManager.Task.Manager.exception;

import com.TaskManager.Task.Manager.model.MyTasks;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice

public class MyTasksExceptionHandler
{
    @ExceptionHandler(value={MyTasksNotFoundException.class})
    public ResponseEntity<Object> handleMyTasksNotFoundException(MyTasksNotFoundException myTasksNotFoundException)
    {
        MyTasksException myTasksException = new MyTasksException(myTasksNotFoundException.getMessage(),
                myTasksNotFoundException.getCause(), HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(myTasksException, HttpStatus.NOT_FOUND);
    }
}
