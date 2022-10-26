package com.springrest.springrest.Entities;

public class Customer {
    private String name;
    private String mail;
    private String number;
    private String city;
    private int id;
    public Customer(String name, String email, String number, String city, int i)
    {
        super();
        this.name=name;
        this.mail=email;
        this.number=number;
        this.city=city;
        this.id=i;
    }

    public  Customer()
    {
        super();
    }

    public void setCustomer_name(String n)
    {
        this.name=n;
    }
    public String getCustomer_name()
    {
        return this.name;
    }
    public void setEmail(String e)
    {
        this.mail=e;
    }
    public String getEmail()
    {
        return this.mail;
    }
    public void setMobile_Number(String num)
    {
        this.number=num;
    }
    public String getMobile_Number()
    {
        return this.number;
    }
    public void setCity(String c)
    {
        this.city=c;
    }
    public String getCity()
    {
        return this.city;
    }
    public void setCustomer_Id(int i)
    {
        this.id=i;
    }
    public int getCustomer_Id()
    {
        return this.id;
    }


}
