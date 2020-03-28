package com.vins.university.rest;

import com.vins.university.service.exceptions.EntityNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created by vova on 8/8/2016.
 */
public abstract class BaseRestController
{
    final Logger logger = LoggerFactory.getLogger(BaseRestController.class);

    @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Entity not found")
    @ExceptionHandler({EntityNotFoundException.class})
    public void handleEntityNotFoundException(EntityNotFoundException e)
    {
        logger.error("{}", e);
    }


    @ResponseStatus(value = HttpStatus.SERVICE_UNAVAILABLE)
    @ExceptionHandler({RuntimeException.class})
    public void handleException(HttpServletRequest request, HttpServletResponse response, RuntimeException rte)
    {
        logger.error("{}", rte);
    }
}
