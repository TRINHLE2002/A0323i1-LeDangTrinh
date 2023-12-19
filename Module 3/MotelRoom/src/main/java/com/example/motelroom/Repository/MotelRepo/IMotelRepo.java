package com.example.motelroom.Repository.MotelRepo;

import com.example.motelroom.Model.MotelRoom;
import com.example.motelroom.Repository.IRepoSitory;

import java.util.List;

public interface IMotelRepo extends IRepoSitory<MotelRoom> {
    List<MotelRoom> search(String string);
    void deleteAll(String[] ids);
}
