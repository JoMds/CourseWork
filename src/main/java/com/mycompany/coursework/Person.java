/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coursework;

import java.util.ArrayList;

/**
 *
 * @author giann
 */
public class Person {
    
    private String name;
    private String gender;
    private String fathersName;
    private String mothersName;
    private ArrayList<String> children;
    
    public Person(String name, String gender, String fathersName, String mothersName) {
        this.name = name;
        this.gender = gender;
        this.fathersName = fathersName;
        this.mothersName = mothersName;
        children = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getFathersName() {
        return fathersName;
    }

    public String getMothersName() {
        return mothersName;
    }

    public ArrayList<String> getChildren() {
        return children;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    public void setChildren(ArrayList<String> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", gender=" + gender + ", fathersName=" + fathersName + ", mothersName=" + mothersName + ", children=" + children + '}';
    }
}
    