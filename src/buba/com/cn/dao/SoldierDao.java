package buba.com.cn.dao;

import buba.com.cn.entity.Soldier;

import java.util.List;

public interface SoldierDao {
   List<Soldier> findAllSoldiers();
   Integer deleteSoldiers(int soldier);
   Integer addSoldiers(Soldier soldier);
   Integer updateSoldiers(Soldier soldier);
}
