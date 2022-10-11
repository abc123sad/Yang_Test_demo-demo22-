package buba.com.cn.servlet;

import buba.com.cn.entity.Soldier;

import java.util.List;

public interface SoldierService {
    List<Soldier> findAllSoldiers();
    Integer deleteSoldiers(int soldier);
    Integer addSoldiers(Soldier soldier);
    Integer updateSoldiers(Soldier soldier);
}
