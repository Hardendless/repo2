package cn.day01.reflect;

import cn.day01.domain.Person;

public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class cls1 = Class.forName("cn.day01.domain.Person");

        System.out.println(cls1);

        Class cls2 = Person.class;
        System.out.println(cls2);

        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);
    }
}
