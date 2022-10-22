package com.epam.mjc.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    //TODO: Refactor Method-1
    public <T> List<T> boxingMethod(String name) {
        List firstList = new ArrayList<>();
        firstList.add(name);
        List secondList = new ArrayList<>();
        secondList.add(firstList);
        return secondList;
    }

    //TODO: Refactor Method-2
    public <T> T genericMethod(T data) {
        return data;
    }

    //TODO: Refactor Method-3
    public <T> void cloneMethod(List<T> consumer, List<T> producer) {
        consumer.addAll(producer);
    }

}
