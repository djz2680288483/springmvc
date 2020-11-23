package com.djz.pojo;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author djz
 * @date 2020/11/20 -19:42
 */
public class User implements Serializable {
    private String name;
    private int age;
    private List<String> hobbys;
    private Map<String,Object> key;

    public User() {
    }

    public User(String name, int age, List<String> hobbys, Map<String, Object> key) {
        this.name = name;
        this.age = age;
        this.hobbys = hobbys;
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getHobbys() {
        return hobbys;
    }

    public void setHobbys(List<String> hobbys) {
        this.hobbys = hobbys;
    }

    public Map<String, Object> getKey() {
        return key;
    }

    public void setKey(Map<String, Object> key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbys=" + hobbys +
                ", key=" + key +
                '}';
    }
}
