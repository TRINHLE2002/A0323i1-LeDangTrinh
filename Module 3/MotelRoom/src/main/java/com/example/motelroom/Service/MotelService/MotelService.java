package com.example.motelroom.Service.MotelService;

import com.example.motelroom.Model.MotelRoom;
import com.example.motelroom.Repository.MotelRepo.IMotelRepo;
import com.example.motelroom.Repository.MotelRepo.MotelRepo;

import java.util.List;

public class MotelService implements IMotelService {
    IMotelRepo iMotelRepo = new MotelRepo();
    @Override
    public void add(MotelRoom obj) {

    }

    @Override
    public List<MotelRoom> findAll() {
        return iMotelRepo.findAll();
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
        return iMotelRepo.delete(id);
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
