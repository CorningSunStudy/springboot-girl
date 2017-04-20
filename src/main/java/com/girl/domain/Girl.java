package com.girl.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

/**
 * Created by corning on 2017/4/20.
 */
@Entity
public class Girl {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @Min(value = 18, message = "未成年少女禁止入内")
    private Integer age;

    public Girl() {
    }

    public Girl(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
