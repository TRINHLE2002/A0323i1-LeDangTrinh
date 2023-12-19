package com.example.motelroom.Repository.PaymentMethod;

import com.example.motelroom.Model.MotelRoom;
import com.example.motelroom.Model.PaymentMethod;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static com.example.motelroom.Database.BaseRepository.getConnection;

public class PaymentRepo implements IPaymentRepo{
    @Override
    public void add(PaymentMethod obj) {

    }

    @Override
    public List<PaymentMethod> findAll() {
        List<PaymentMethod> paymentMethodList = new ArrayList<>();
        String sql ="select* from payment_method; ";
        try(
                Connection connection = getConnection();
                PreparedStatement statement = connection.prepareStatement(sql);
        ){
            ResultSet rs = statement.executeQuery();
            while (rs.next()){

                int id = rs.getInt("id_pay");
                String name = rs.getString("name_pay");

                PaymentMethod paymentMethod = new PaymentMethod(id,name);
                paymentMethodList.add(paymentMethod);
            }
            return paymentMethodList;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public PaymentMethod findByID(int id) {
        PaymentMethod paymentMethod = null;
        String sql = "select * from payment_method where id_pay = ?;";
        try(
                Connection connection = getConnection();
                PreparedStatement statement = connection.prepareStatement(sql);
        ){
            statement.setInt(1,id);

            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                String tenKieuThue = rs.getString("name_pay");
                paymentMethod = new PaymentMethod(id,tenKieuThue);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return paymentMethod;
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
