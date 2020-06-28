package cn.day01.reflect;

import cn.day01.domain.Person;

import java.lang.reflect.Field;

public class ReflectDemo02 {
    public static void main(String[] args) {

        Person p = new Person();
        Class<? extends Person> aClass = p.getClass();
        Class personClass = Person.class;

        Field[] fields = personClass.getFields();
        for (Field field : fields) {

        }


    }
}
