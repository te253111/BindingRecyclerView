package com.example.cylonz.bindingrecyclerview.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cylonz on 9/7/2559.
 */

public class Person {
    private String id;
    private String name;
    public Person(String id,String name){
        this.id=id;
        this.name=name;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
