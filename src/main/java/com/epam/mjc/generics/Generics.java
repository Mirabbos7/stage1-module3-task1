package com.epam.mjc.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Generics {

    //TODO: Refactor Method-1
    public <T> List<T> boxingMethod(T name) {
        List<T> firstList = new ArrayList<>();
        firstList.add(name);
        List<T> secondList = new ArrayList<>();
        secondList.add((T) firstList);
        return secondList;
    }

    //TODO: Refactor Method-2
    public <T> T genericMethod (T data) {
        return data;
    }

    //TODO: Refactor Method-3
    public <T, G> void cloneMethod(List<T> consumer, List<G> producer) {
        consumer.addAll((Collection<? extends T>) producer);
    }

}
