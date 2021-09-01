package com.yash.multithreading.multithreading;

import com.yash.multithreading.service.AddProduct;
import com.yash.multithreading.service.GetProductList;
import com.yash.multithreading.service.Payment;
import com.yash.multithreading.service.PaymentConfirmation;
import com.yash.multithreading.service.Receipt;
import com.yash.multithreading.service.VerifyCart;

public class ProductApp 
{
    public static void main( String[] args )
    {
        GetProductList gp=new GetProductList();
        AddProduct add=new AddProduct();
        VerifyCart vc=new VerifyCart();
        Payment pay=new Payment();
        PaymentConfirmation pc=new PaymentConfirmation();
        Receipt r=new Receipt();
        gp.start();
        add.start();
        vc.start();
        pay.start();
        pc.start();
        r.start();
    }
}
