package com.vins.university.model;

import javax.persistence.Entity;

/**
 * Created by vova on 7/30/2016.
 */
@Entity
public class Dept extends BaseEntity
{
    private String deptCode;
    private String name;
//    @OneToMany
//    private Set<Student> students;


    public Dept()
    {
    }

    public Dept(String deptCode, String name)
    {
        this.deptCode = deptCode;
        this.name = name;
    }

    public String getDeptCode()
    {
        return deptCode;
    }

    public String getName()
    {
        return name;
    }

//    public Set<Student> getStudents() {
//        return students;
//    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Dept{");
        sb.append(super.toString());
        sb.append(", deptCode='").append(deptCode).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
