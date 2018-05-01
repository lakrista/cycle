package com.lakrista.cycle.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class HttpNotFoundException extends RuntimeException {

    private String className;
    private String fieldName;
    private Object fieldValue;

    public HttpNotFoundException(String className, String fieldName, Object fieldValue) {
        super(String.format("%s not found with %s : %s", className, fieldName, fieldValue));
        this.className = className;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public Object getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(Object fieldValue) {
        this.fieldValue = fieldValue;
    }
}
