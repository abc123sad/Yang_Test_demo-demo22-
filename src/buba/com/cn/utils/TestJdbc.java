package buba.com.cn.utils;

import buba.com.cn.entity.Soldier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;


/**
 * @program: firstJavaWeb
 * @ClassName TestJdbc
 * @description:
 * @author: MSY
 * @create: 2022-09-20 15:21
 * @Version 1.0
 **/
public class TestJdbc {
    public static void main(String[] args) {
        //创建JDBCTemplate对象
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDateSource());
        //3.调用方法
        String sql = "select * from t_soldier";
        List<Soldier> list = template.query(sql, new BeanPropertyRowMapper<>(Soldier.class));
        for (Soldier soldier : list) {
            System.out.println(soldier);
        }
    }

}
