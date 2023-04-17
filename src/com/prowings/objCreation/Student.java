package com.prowings.objCreation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Student {
    static String name = "Ram";

    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("com.prowings.objCreation.Student");
            Constructor<?> constructor = cls.getDeclaredConstructor();
            Student obj = (Student) constructor.newInstance();
            System.out.println(obj.name);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
