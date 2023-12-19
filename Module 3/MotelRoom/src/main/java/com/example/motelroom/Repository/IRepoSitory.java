package com.example.motelroom.Repository;

import com.example.motelroom.Model.MotelRoom;

import java.util.List;

public interface IRepoSitory<T> {

    void add( T obj);
    List<T> findAll();
    T findByID(int V);
    void update(T obj);
    List<MotelRoom> delete(int id);
    int getNumberPage();
    List<T> getPaging(int V);

}
