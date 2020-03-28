package com.vins.university.service.exceptions;

/**
 * Created by vova on 7/30/2016.
 */
public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(String attributeName, String attributeValue) {
        super(attributeName + " "+attributeValue);
    }
}
