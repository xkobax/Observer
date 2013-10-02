package com.ciklum.study.observer;

public class MyEvent<T> {
    private T object;
    private Operation operation;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }
}
