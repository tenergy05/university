package com.vins.university.model;

/**
 * Created by vova on 7/30/2016.
 */
public class Course extends BaseEntity
{
    private String cid;
    private String name;
    private Dept dept;

    public Course(String cid, String name, Dept dept)
    {
        this.cid = cid;
        this.name = name;
        this.dept = dept;
    }

    public String getCid()
    {
        return cid;
    }

    public String getName()
    {
        return name;
    }

    public Dept getDept()
    {
        return dept;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Course{");
        sb.append("cid='").append(cid).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", dept=").append(dept);
        sb.append('}');
        return sb.toString();
    }
}
