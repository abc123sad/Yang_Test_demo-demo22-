package buba.com.cn.servlet.impl;

import buba.com.cn.dao.SoldierDao;
import buba.com.cn.dao.impl.SoldierDaoImpl;
import buba.com.cn.entity.Soldier;
import buba.com.cn.servlet.SoldierService;

import java.util.List;

public class SoldierServiceImpl implements SoldierService {
    private SoldierDao soldierDao = new SoldierDaoImpl();
    @Override
    public List<Soldier> findAllSoldiers() {
        return soldierDao.findAllSoldiers();
    }

    @Override
    public Integer deleteSoldiers(int soldier) {
        return soldierDao.deleteSoldiers(soldier);
    }

    @Override
    public Integer addSoldiers(Soldier soldier) {
        return soldierDao.addSoldiers(soldier);
    }

    @Override
    public Integer updateSoldiers(Soldier soldier) {
        return soldierDao.updateSoldiers(soldier);
    }
}
