package com.springrest.springrest.Entities;

public class ShippingDetails {
    String address;
    String city;
    String pinCode;
    int PoId;
    int Cid;


    public ShippingDetails(String add, String City, String pinCode, int i, int j)
    {
        super();
        this.address=add;
        this.city=City;
        this.pinCode=pinCode;
        this.PoId=i;
        this.Cid=j;
    }
    public ShippingDetails()
    {
        super();
    }
    public void setAddress(String add)
    {
        this.address=add;
    }
    public String getAddress()
    {
        return this.address;
    }
    public void setCity(String c)
    {
        this.city=c;
    }
    public String getCity()
    {
        return this.city;
    }
    public void setPinCode(String p)
    {
        this.pinCode=p;
    }
    public String getPinCode()
    {
        return this.pinCode;
    }
    public void setPurchaceId(int Poid)
    {
        this.PoId=Poid;
    }
    public int getPurchaseId()
    {
        return this.PoId;
    }
    public void setCustomerId(int cid)
    {
        this.Cid=cid;
    }
    public int getCustomerId()
    {
        return this.Cid;
    }
}
