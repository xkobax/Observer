package com.ciklum.study.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyObserver {
    private Map<Class,List<MyHandler>> observer = new HashMap<Class, List<MyHandler>>();

    public void subscribe(MyHandler myHandler){
        List<MyHandler> listOfHandlers = observer.get(myHandler.getType());
        if (listOfHandlers == null) {
            listOfHandlers = new ArrayList<MyHandler>();
            observer.put(myHandler.getType(),listOfHandlers);
        }
        listOfHandlers.add(myHandler);
    }

    public void fireEvent(MyEvent event) {
        Class type = event.getObject().getClass();
        List<MyHandler> hs = observer.get(type);
        if (hs != null) {
            for (MyHandler h: hs) {
                h.handle(event);
            }
        }
    }


}
