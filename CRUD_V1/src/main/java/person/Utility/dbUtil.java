package person.Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbUtil {
    private static String url = "jdbc:mysql://localhost:3306/mytest?serverTimezone=UTC&characterEncoding=utf-8";// 数据库地址
    private static String userName = "root"; // 数据库用户名
    private static String passWord = "MAOmao5213344"; // 数据库密码
    private static Connection conn = null;
    /**
     * 获得数据库连接
     *
     * @return
     */
    public static Connection getConnection() throws ClassNotFoundException, SQLException {

            Class.forName("com.mysql.cj.jdbc.Driver");                       //加载数据库驱动
            conn = DriverManager.getConnection(url, userName, passWord);    //连接数据库return conn;
            return conn;
    }
    /**
     * 测试数据库是否连通
     * @param args
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        System.err.println(getConnection());
    }
}


