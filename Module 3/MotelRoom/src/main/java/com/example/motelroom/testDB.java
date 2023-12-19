package com.example.motelroom;

import com.example.motelroom.Model.MotelRoom;
import com.example.motelroom.Model.PaymentMethod;
import com.example.motelroom.Repository.MotelRepo.IMotelRepo;
import com.example.motelroom.Repository.MotelRepo.MotelRepo;
import com.example.motelroom.Repository.PaymentMethod.IPaymentRepo;
import com.example.motelroom.Repository.PaymentMethod.PaymentRepo;
import com.example.motelroom.Service.MotelService.IMotelService;
import com.example.motelroom.Service.MotelService.MotelService;

import java.util.List;

public class testDB {
    public static void main(String[] args) {
//        IPaymentRepo iPaymentRepo = new PaymentRepo();
//        List<PaymentMethod> list = iPaymentRepo.findAll();
//        for(PaymentMethod o : list ){
//            System.out.println(o);
//        }

        IMotelRepo i = new MotelRepo();
        List<MotelRoom> list = i.findAll();
        for (MotelRoom o : list) {
            System.out.println(o);
        }
    }
}
