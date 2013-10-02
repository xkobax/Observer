package com.ciklum.study.observer;


public interface MyHandler<T> {
    void handle(MyEvent<T> event);
    Class<T> getType();




}
