package com.ciklum.study.observer;


import java.util.Scanner;

public class Control {

    public static void main(String[] args) {
        boolean flow = true;
        User user = new User();

        System.out.println("USER REGISTRATION!");
        System.out.println("Enter new Name");
        Scanner t = new Scanner(System.in);
        String name = t.next();
        user.setName(name);
        System.out.println("Enter new E-mail");
        String email = t.next();
        user.setEmail(email);
        MyEvent<User> event = new MyEvent<User>();
        event.setObject(user);
        MyObserver obs = new MyObserver();
        MyHandler  userRegHandler = new UserRegHandler();

        obs.subscribe(userRegHandler);
        obs.fireEvent(event);


    }





}
