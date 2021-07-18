package com.add;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class People implements Cloneable{
    String name;
    Date birthday;

    public People(){

    }

    public People(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
        People p = (People) obj;
        Date date = (Date) this.getBirthday().clone();

        p.setBirthday(date);
        return obj;
    }
}
