package com.springrest.springrest.Services;

import java.util.List;
import java.util.Map;

import com.springrest.springrest.Entities.Customer;
import com.springrest.springrest.Entities.PurchaseOrder;
import com.springrest.springrest.Entities.ShippingDetails;

public interface Services {
    
    public List<Customer> getCustomers();
    public Customer getCustomer(long l);
    public Customer AddCustomer(Customer x);
    public List<PurchaseOrder> getPurchaseOrders();
    public PurchaseOrder AddPurchaseOrder(PurchaseOrder x);
    public List<com.springrest.springrest.Entities.ShippingDetails> getShippingDetails();
    public List<Customer> getCusomersInCity(String c);
    public Map<Customer, List<PurchaseOrder>> getCustomersWRTpurchase();
    public Map<Customer, Map<PurchaseOrder, ShippingDetails>> getFullData();
}

