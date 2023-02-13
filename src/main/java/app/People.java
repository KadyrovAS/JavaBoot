package app;

import org.springframework.beans.factory.annotation.Value;

public class People {
    @Value("${name}")
    private String name;
    @Value("${age}")
    private int age;
    public People(){
        System.out.println("constructor People started...");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
