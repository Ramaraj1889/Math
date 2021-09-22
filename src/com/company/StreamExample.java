package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class StreamExample {
    public static void main(String[] args) {
        List<Employee> inputList = new ArrayList();
        inputList.add(new Employee(1));
        inputList.add(new Employee(2));

        List<Employee> existingList = new ArrayList<>();
        existingList.add(new Employee(1, "One"));
        existingList.add(new Employee(3, "Three"));

        List<Employee> outputList = existingList.stream().filter(two -> inputList.stream().anyMatch(one -> one.getId() == two.getId())).collect(Collectors.toList());
        for (Employee e : outputList) {
            System.out.println(e.getId() +" / "+ e.getName());
        }

    }
}
