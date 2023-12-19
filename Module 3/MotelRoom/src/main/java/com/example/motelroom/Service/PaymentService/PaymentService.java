package com.example.motelroom.Service.PaymentService;

import com.example.motelroom.Model.MotelRoom;
import com.example.motelroom.Model.PaymentMethod;
import com.example.motelroom.Repository.PaymentMethod.IPaymentRepo;
import com.example.motelroom.Repository.PaymentMethod.PaymentRepo;

import java.util.List;

public class PaymentService implements IPayMentService {
    IPaymentRepo iPaymentRepo = new PaymentRepo();
    @Override
    public void add(PaymentMethod obj) {

    }

    @Override
    public List<PaymentMethod> findAll() {
        return iPaymentRepo.findAll();
    }

    @Override
    public PaymentMethod findByID(int V) {
        return null;
    }

    @Override
    public void update(PaymentMethod obj) {

    }

    @Override
    public List<MotelRoom> delete(int id) {
        return null;
    }

    @Override
    public int getNumberPage() {
        return 0;
    }

    @Override
    public List<PaymentMethod> getPaging(int V) {
        return null;
    }
}
