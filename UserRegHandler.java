package com.ciklum.study.observer;

public class UserRegHandler implements MyHandler<User> {

    @Override
    public void handle(MyEvent<User> event) {
        event.getObject();
        event.setOperation(Operation.CREATE);
        MailSender.sendEmail(event.getObject().getEmail(),"Welcome","Hello, " + event.getObject().getName() + "! You have sold your ass for just 5 bux");

    }

    @Override
    public Class<User> getType() {
        return User.class;
    }
}
