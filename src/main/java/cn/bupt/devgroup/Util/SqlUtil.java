package cn.bupt.devgroup.Util;

import java.sql.*;
import java.util.*;

/**
 * @author zhuangxu
 * @date 2019/12/10 9:54
 */
public class SqlUtil {
    static Map<String, String> map;

    static {
        map = new HashMap<>();
        map.put("information_schema", "");
        map.put("mysql", "");
        map.put("performance_schema", "");
    }
    /**
     * Mysql 遍历方法
     * userName:数据库用户名，password:密码
     */
    public static void ergodicMysql(String userNanme,String password) throws ClassNotFoundException,SQLException{
        //链接接口
        Connection con = null;
        //发送SQL语句接口
        Statement stmt = null;
        //返回结果集接口
        ResultSet rs = null;
        PreparedStatement ps = null;
        Class.forName("com.mysql.jdbc.Driver");
        String URL = "jdbc:mysql://127.0.0.1:3306/databaseinfo?useUnicode=true&serverTimezone=UTC&characterEncoding=utf8";
        con = DriverManager.getConnection(URL, userNanme, password);
        stmt = con.createStatement();
        //查询数据库中表的值，并且打印出来
        rs = stmt.executeQuery("show databases");
        ResultSet rsTable = null;
        List<String> dataBaseList = new ArrayList<>();
        ResultSetMetaData metaData = rs.getMetaData();
        //next()方法控制行数，一行一行读出返回结果集，直到null
        while (rs.next()) {
            for (int i = 1; i <= metaData.getColumnCount() && !map.containsKey(rs.getString(i)); i++) {
                dataBaseList.add(rs.getString(i));
            }
        }
        Map<String, List<String>> baseAndTable = new HashMap<>();
        for (String dataBase : dataBaseList) {
            rsTable = stmt.executeQuery(
                "select table_name from information_schema.tables where table_schema=" + "\"" + dataBase + "\"");
            List<String> tableList = new ArrayList<>();
            while (rsTable.next()) {
                ResultSetMetaData metaData2 = rsTable.getMetaData();
                for (int j = 1; j <= metaData2.getColumnCount(); j++) {
                    tableList.add(rsTable.getString(j));
                }
            }
            baseAndTable.put(dataBase, tableList);
        }
        Set<String> dataBaseKey = baseAndTable.keySet();
        for (String dataBase : dataBaseKey) {
            List<String> tableList = baseAndTable.get(dataBase);
            for (String table : tableList) {
                ResultSet rsTmp = stmt.executeQuery("select * from " + dataBase + "." + table);
                ResultSetMetaData metaData2 = rsTmp.getMetaData();
                while (rsTmp.next()) {
                    for (int i = 1; i < metaData2.getColumnCount(); i++) {
                        System.out.println(rsTmp.getString(i));
                    }
                }
            }
        }
        con.close();
    }
}
