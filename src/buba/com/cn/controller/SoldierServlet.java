package buba.com.cn.controller;

import buba.com.cn.entity.Soldier;
import buba.com.cn.servlet.SoldierService;
import buba.com.cn.servlet.impl.SoldierServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class SoldierServlet extends ViewBaseServlet{
    private SoldierService soldierService = new SoldierServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        if ("findAllSoldiers".equals(req.getParameter("method"))){
            this.findAllSoldiers(req,resp);
        }
        if ("deleteSoldiers".equals(req.getParameter("method"))){
            this.deleteSoldiers(req,resp);
        }
        if ("addSoldiers".equals(req.getParameter("method"))){
            this.addSoldiers(req,resp);
        }
        if ("updateSoldiers".equals(req.getParameter("method"))){
            this.updateSoldiers(req,resp);
        } if ("update".equals(req.getParameter("method"))){
            this.update(req,resp);
        }
    }

    protected void findAllSoldiers(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Soldier> allSoldiers = soldierService.findAllSoldiers();
        req.setAttribute("soldierList",allSoldiers);
        processTemplate("list",req,resp);
    }
    protected void deleteSoldiers(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String soldierId = req.getParameter("soldierId");
        Integer integer = Integer.valueOf(soldierId);
        Integer integer1 = soldierService.deleteSoldiers(integer);
        this.findAllSoldiers(req,resp);
    }
    protected void addSoldiers(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String username1 = req.getParameter("username1");
        Soldier soldier = new Soldier(username, username1);
        Integer integer = soldierService.addSoldiers(soldier);
        this.findAllSoldiers(req,resp);

    }
    protected void updateSoldiers(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String weapon = req.getParameter("weapon");
        Integer integer = Integer.valueOf(id);
        Soldier soldier = new Soldier(integer, name, weapon);
        req.setAttribute("soldier",soldier);
        processTemplate("update",req,resp);
    }
    protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("soldierId");
        String name = req.getParameter("soldierName");
        String weapon = req.getParameter("soldierWeapon");
        Integer integer = Integer.valueOf(id);
        Soldier soldier = new Soldier(integer, name, weapon);
        Integer integer1 = soldierService.updateSoldiers(soldier);
        this.findAllSoldiers(req,resp);
    }

}
