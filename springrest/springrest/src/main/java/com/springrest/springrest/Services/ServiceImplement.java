package com.springrest.springrest.Services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.springrest.springrest.Entities.Customer;
import com.springrest.springrest.Entities.PurchaseOrder;
import com.springrest.springrest.Entities.ShippingDetails;
@Service
public class ServiceImplement implements Services {

    List<Customer> customerData;
    List<PurchaseOrder> PurchaseOrderData;
    List<ShippingDetails> ShippingDetailsData;
    List<Customer> SelectedCustomerData;
    Map<Customer, List<PurchaseOrder>> CustomersWRTpurchase;
    Map<Customer, Map<PurchaseOrder, ShippingDetails>> AllData;

    public ServiceImplement()
    {
        // Example data case.
        customerData=new ArrayList<>();
        customerData.add(new Customer("Kunal","na21b042@smail.iitm.ac.in", "9406825880", "Indore", 789));
        customerData.add(new Customer("Abc","xyz@gmail.com","123456789", "Bangalore", 654));
        PurchaseOrderData = new ArrayList<>();
        PurchaseOrderData.add(new PurchaseOrder("Soap", (long) 500, 68.25, 70, 123, 654));
        PurchaseOrderData.add(new PurchaseOrder("Battry", (long) 50, 8.75, 10, 987, 654));
        PurchaseOrderData.add(new PurchaseOrder("Soap", (long) 10, 68.25, 70, 321, 789));
        PurchaseOrderData.add(new PurchaseOrder("Battry", (long) 200, 8.75, 10, 789, 789));
        ShippingDetailsData= new ArrayList<>();
        ShippingDetailsData.add(new ShippingDetails("465654, alsidgncflaxbd", "Bangalore", "9871652", 123, 654));
        ShippingDetailsData.add(new ShippingDetails("465654, alsidgncflaxbd", "Bangalore", "9871652", 987, 654));
        ShippingDetailsData.add(new ShippingDetails("89, alsdk;ghfak;jdshf", "Indore", "654465", 321, 789));
        ShippingDetailsData.add(new ShippingDetails("89, alsdk;ghfak;jdshf", "Indore", "654465", 789, 789));
    }

    @Override
    public List<Customer> getCustomers(){
        return customerData;
    }

    @Override
    public Customer getCustomer(long customer_id) {
        
        Customer c=null;
        for(Customer local:customerData)
        {
            if(local.getCustomer_Id()==customer_id)
            {
                c=local;
                break;
            }
        }
        return c;
    }

    @Override // Q1
    public Customer AddCustomer(Customer x) {
        customerData.add(x);
        return x;
    }

    @Override // Q2
    public List<PurchaseOrder> getPurchaseOrders() {
        return PurchaseOrderData;
    }

    @Override 
    public PurchaseOrder AddPurchaseOrder(PurchaseOrder x) {
        PurchaseOrderData.add(x);
        return x;
    }

    @Override // Q3
    public List<ShippingDetails> getShippingDetails() {
        return ShippingDetailsData;
    }

    @Override // Q4
    public List<Customer> getCusomersInCity(String c) {
        SelectedCustomerData= new ArrayList<>();
        for(Customer local:customerData)
        {
            if(local.getCity().toLowerCase()==c.toLowerCase())
            {
                SelectedCustomerData.add(local);
            }
        }
        return SelectedCustomerData;
    }

    @Override // Q5
    public Map<Customer, List<PurchaseOrder>> getCustomersWRTpurchase() {
        CustomersWRTpurchase=new HashMap<>();
        for(Customer Cus:customerData)
        {
            List<PurchaseOrder> localList=new ArrayList<>();
            for(PurchaseOrder order:PurchaseOrderData)
            {
                if(Cus.getCustomer_Id()==order.getCustomerId())
                {
                    localList.add(order);
                }
            }
            CustomersWRTpurchase.put(Cus, localList);
        }
        return CustomersWRTpurchase;
    }

    @Override // Q6
    public Map<Customer, Map<PurchaseOrder, ShippingDetails>> getFullData() {
        AllData=new HashMap<>();
        for(Customer cus: customerData)
        {
            Map<PurchaseOrder, ShippingDetails> LocalData= new HashMap<>();
            for(PurchaseOrder puo: PurchaseOrderData)
            {
                if(cus.getCustomer_Id()==puo.getCustomerId())
                {
                    for(ShippingDetails ship: ShippingDetailsData)
                    {
                        if(ship.getCustomerId()==puo.getCustomerId() && ship.getPurchaseId()==puo.getOrderId())
                        {
                            LocalData.put(puo, ship);
                        }
                    }
                }
            }
            AllData.put(cus, LocalData);
        }
        return AllData;
    }
    
}