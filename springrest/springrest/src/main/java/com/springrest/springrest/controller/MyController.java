package com.springrest.springrest.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.Entities.Customer;
import com.springrest.springrest.Entities.PurchaseOrder;
import com.springrest.springrest.Entities.ShippingDetails;
import com.springrest.springrest.Services.Services;

@RestController
public class MyController {
    @Autowired
    private Services customer_service;
    @Autowired
    private Services order_service;
    @Autowired
    private Services Shipping_Details;

    //Q1(Add a customer) 
    @PostMapping("/Customers")
    public Customer AddCustomer(@RequestBody Customer x)
    {
        return this.customer_service.AddCustomer(x);
    }

    //Get List of  Customers.
    @GetMapping("/Customers")
    public List<Customer> getCustomers()
    {
        
        return this.customer_service.getCustomers();
    }
    // Get a particular customer by id.
    @GetMapping("/Customers/{customer_id}")
    public Customer getCustomer(@PathVariable String customer_id)
    {
        return this.customer_service.getCustomer(Long.parseLong(customer_id));
    }
    // Q2(Get all purchase orders)
    @GetMapping("/PurchaseOrder")
    public List<PurchaseOrder> getPurschaseData()
    {
        return this.order_service.getPurchaseOrders();
    }
    // Add a purchase Order.
    @PostMapping("/PurchaseOrder")
    public PurchaseOrder AddPurchaseOrder(@RequestBody PurchaseOrder x)
    {
        return this.order_service.AddPurchaseOrder(x);
    }

    // Q3 (Get All Shipping Details)
    @GetMapping("/ShippingDetails")
    public List<ShippingDetails> getShippingDetails()
    {
        return this.Shipping_Details.getShippingDetails();
    }

    //Q4 (Get Customers with City Filter)
    @GetMapping("/Customers/City")
    public List<Customer> getCusomersInCity(@RequestBody String c)
    {
        return this.customer_service.getCusomersInCity(c);
    }

    // Q5 (Get Customers with all Purchase Order)
    @GetMapping("/Customers/Purchase")
    public Map<Customer,List<PurchaseOrder>> getCustomersWRTpurchase()
    {
        return this.customer_service.getCustomersWRTpurchase();
    }

    // Q6 (Customer with all Purchase order and Shipping details)
    @GetMapping("/Customers/Purchase+Shipping")
    public Map<Customer, Map<PurchaseOrder, ShippingDetails>> getFullData()
    {
        return this.customer_service.getFullData();
    }
}