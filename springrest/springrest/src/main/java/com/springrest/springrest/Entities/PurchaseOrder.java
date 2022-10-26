package com.springrest.springrest.Entities;


public class PurchaseOrder{
    private String Name;
    private Long Quantity;
    private double Pricing;
    private double MRP;
    private int OrderId;
    private int CustomerId;
    
    public PurchaseOrder(String name, Long qty, double sp, double mrp, int Oid, int Cid)
    {
        super();
        this.Name=name;
        this.Quantity=qty;
        this.Pricing=sp;
        this.MRP=mrp;
        this.OrderId=Oid;
        this.CustomerId=Cid;
    }
    public PurchaseOrder()
    {
        super();
    }
    public void setName(String name)
    {
        this.Name=name;
    }
    public String getName()
    {
        return this.Name;
    }
    public void setQuantity(Long x)
    {
        this.Quantity=x;
    }
    public Long getQuantity()
    {
        return this.Quantity;
    }
    
    public void setPrice(double x)
    {
        this.Pricing=x;
    }
    public double getPrice()
    {
        return this.Pricing;
    }
    public void setMRP(double x)
    {
        this.MRP=x;
    }
    public double getMRP()
    {
        return this.MRP;
    }
    
    public void setOrderId(int i)
    {
        this.OrderId=i;
    }
    public int getOrderId()
    {
        return this.OrderId;
    }
    
    public void setCustomerId(int i)
    {
        this.CustomerId=i;
    }
    public int getCustomerId()
    {
        return this.CustomerId;
    }
}