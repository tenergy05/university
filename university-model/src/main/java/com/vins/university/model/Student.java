package com.vins.university.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Created by vova on 7/30/2016.
 */
@Entity
public class Student extends BaseEntity
{
    @Column(unique = true)
    private String sid;
    private String firstName;
    private String lastName;

    @ManyToOne(optional = false) //(cascade = CascadeType.ALL) // when saving child object create parent
    private Dept dept;

    public Student()
    {
    }

    public Student(String sid, String firstName, String lastName, Dept dept)
    {
        this.sid = sid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dept = dept;
    }

    public String getSid()
    {
        return sid;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public Dept getDept()
    {
        return dept;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append(super.toString());
        sb.append(", sid='").append(sid).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", dept=").append(dept);
        sb.append('}');
        return sb.toString();
    }
}
