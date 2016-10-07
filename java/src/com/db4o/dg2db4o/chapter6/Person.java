package com.db4o.dg2db4o.chapter6;

public class Person implements Comparable {
    private String _name;
    private int _age;
    
    public Person(){}
    
    public Person(String name, int age) {
        _name = name;
        _age = age;
    }
    
    public int getAge() {
        return _age;
    }
    
    public void setAge(int value) {
        _age = value;
    }
    
    public String getName() {
        return _name;
    }
    
    public void setName(String value) {
        _name = value;
    }
    
    public String toString() {
        return "[" + _name + ";"+ _age + "]";
    }
    
    public int compareTo(Object o) throws ClassCastException {
        Person p = (Person)o; // If this doesn't work, ClassCastException is thrown
        return this.getName().compareTo(p.getName());
    }
}
