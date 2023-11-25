package com.example.Polling.App.Exception;

public class UserNotFoundException extends RuntimeException  {
    public UserNotFoundException(Integer id){
        super("Could not find user with ID " +id);
    }
}
