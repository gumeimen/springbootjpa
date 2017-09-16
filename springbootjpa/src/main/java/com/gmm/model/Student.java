package com.gmm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**学生实体类;
 * Created by john on 2017-04-29.
 */
@Entity //此注解会通过配置文件映射到数据库表;
public class Student {
    @Id
    @GeneratedValue
    private Integer sId;
    private String sName;
    private Integer age;
    private String gender;

    public Student(){}


    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
