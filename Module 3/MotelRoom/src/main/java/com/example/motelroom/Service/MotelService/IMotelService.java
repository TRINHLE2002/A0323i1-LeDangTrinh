package com.example.motelroom.Service.MotelService;

import com.example.motelroom.Model.MotelRoom;
import com.example.motelroom.Service.IService;

import java.util.List;

public interface IMotelService extends IService<MotelRoom> {
    List<MotelRoom> search(String string);
    void deleteAll(String[] ids);
}
