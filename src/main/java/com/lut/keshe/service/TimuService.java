package com.lut.keshe.service;

import com.lut.keshe.pojo.Timu;

import java.util.List;

/**
 * Created by ASUS on 2021/7/5.
 */
public interface TimuService {
    public Timu selectTimuByID(String name);
    public boolean updateTimuByID(Timu timu);
    public boolean deleteTimu(String name);
    public boolean addTimu(Timu timu);
    public List<Timu> findAllTimu();
}
