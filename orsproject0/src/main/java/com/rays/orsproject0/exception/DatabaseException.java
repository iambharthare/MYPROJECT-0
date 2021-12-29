package com.rays.orsproject0.exception;


/**
 * DatabaseException is propogated by DAO classes when an unhandled Database
 * exception occurred
 * 
 * @author SHUBHAM
 * @version 1.0
 * Copyright (c) Chain of Responsibility
 * 
 */

public class DatabaseException extends Exception {

    /**
     * @param msg
     *            : Error message
     */
    public DatabaseException(String msg) {
        super(msg);
    }
}
