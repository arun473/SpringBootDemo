package com.example.classobjects;

import java.io.*;
import java.lang.reflect.*;

public class DifferentWaysToCreateClassObjects {

    public static void main(String[] args){

        // Here we are creating Object of
        // NewKeywordExample using new keyword
        NewKeywordExample newKeywordExample = new NewKeywordExample();
        System.out.println(newKeywordExample.name);

        // using new Instance
        try
        {
            Class cls = Class.forName("com.example.classobjects.NewInstanceExample");
            NewInstanceExample newInstanceExample = (NewInstanceExample) cls.newInstance();
            System.out.println(newInstanceExample.name);
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (InstantiationException e)
        {
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }

        // using clone() method
        CloneExample obj1 = new CloneExample();
        try
        {
            CloneExample obj2 = (CloneExample) obj1.clone();
            System.out.println(obj2.name);
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }


        // Java program to illustrate Serializing an Object.
        try
        {
            DeserializationExample d = new DeserializationExample("4.[ DeserializationExample object ]");
            FileOutputStream serializeFile = new FileOutputStream("file.txt");
            ObjectOutputStream oos = new ObjectOutputStream(serializeFile);
            oos.writeObject(d);
            oos.close();
            serializeFile.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        // Java program to illustrate creation of Object
        // using Deserialization.
        try
        {
            DeserializationExample d;
            FileInputStream deserializeFile = new FileInputStream("file.txt");
            ObjectInputStream oos = new ObjectInputStream(deserializeFile);
            d = (DeserializationExample)oos.readObject();
            System.out.println(d.name);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


        try
        {
            Constructor<ReflectionExample> constructor = ReflectionExample.class.getDeclaredConstructor();
            ReflectionExample r = constructor.newInstance();
            r.setName("5.[ ReflectionExample object ]");
            System.out.println(r.name);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}

// Java program to illustrate creation of Object
// using new keyword
class NewKeywordExample
{
    String name = "1.[ NewKeywordExample object ]";
}

// Java program to illustrate creation of Object
// using new Instance
class NewInstanceExample
{
    String name = "2.[ NewInstanceExample object ]";
}

// Java program to illustrate creation of Object
// using clone() method
class CloneExample implements Cloneable
{
    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    String name = "3.[ CloneExample object ]";
}


// Java program to illustrate Serializing
// an Object.
class DeserializationExample implements Serializable
{
    String name;
    DeserializationExample(String name)
    {
        this.name = name;
    }
}

// Java program to illustrate creation of Object
// using newInstance() method of Constructor class
class ReflectionExample
{
    String name;
    ReflectionExample()
    {
    }
    public void setName(String name)
    {
        this.name = name;
    }
}
