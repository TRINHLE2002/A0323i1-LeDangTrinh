package com.example.motelroom.Repository.MotelRepo;

import com.example.motelroom.Database.BaseRepository;
import com.example.motelroom.Model.MotelRoom;
import com.example.motelroom.Model.PaymentMethod;
import com.example.motelroom.Repository.PaymentMethod.IPaymentRepo;
import com.example.motelroom.Repository.PaymentMethod.PaymentRepo;

import java.sql.*;
import java.util.ArrayList;

import java.util.List;

import static com.example.motelroom.Database.BaseRepository.getConnection;


public class MotelRepo implements IMotelRepo {
    IPaymentRepo iPaymentRepo = new PaymentRepo();
    @Override
    public void add(MotelRoom obj) {

    }

    @Override
    public List<MotelRoom> findAll() {
        List<MotelRoom> list = new ArrayList<>();
        PaymentMethod paymentMethod = null;
        Connection connection = getConnection();
        MotelRoom motelRoom = null;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from motel_room;");
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String numberPhone = resultSet.getString("phone_number");
                String startDay = resultSet.getString("start_day");
                int idPay = resultSet.getInt("id_pay");
                paymentMethod = iPaymentRepo.findByID(idPay);
                String note = resultSet.getString("note");
                motelRoom = new MotelRoom(id,name,numberPhone,startDay,paymentMethod,note);
                list.add(motelRoom);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public MotelRoom findByID(int V) {
        return null;
    }

    @Override
    public void update(MotelRoom obj) {

    }

    @Override
    public List<MotelRoom> delete(int id) {
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM motel_room WHERE id = ?;");
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return findAll();
    }

    @Override
    public int getNumberPage() {
        return 0;
    }

    @Override
    public List<MotelRoom> getPaging(int V) {
        return null;
    }

    @Override
    public List<MotelRoom> search(String string) {
        return null;
    }

    @Override
    public void deleteAll(String[] ids) {

    }
}
