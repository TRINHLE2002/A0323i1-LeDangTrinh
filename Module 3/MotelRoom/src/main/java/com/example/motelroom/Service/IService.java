package com.example.motelroom.Service;

import com.example.motelroom.Model.MotelRoom;

import java.util.List;

public interface IService<T> {
    void add( T obj);
    List<T> findAll();
    T findByID(int V);
    void update(T obj);
    List<MotelRoom> delete(int id);
    int getNumberPage();
    List<T> getPaging(int V);
}
