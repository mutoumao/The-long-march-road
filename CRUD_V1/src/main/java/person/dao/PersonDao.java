package person.dao;

import person.JavaBean.Person;
import person.Utility.dbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonDao {
  String sex;
    /*
* 查询所有人信息
* */
public List<Person> selectPerson() throws SQLException, ClassNotFoundException {
    List<Person> personList = new ArrayList<>();
    Connection conn =dbUtil.getConnection();
    String sql = "select * from mytest.persons";
    try {
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rst = pst.executeQuery();
        while (rst.next()) {
            Person person = new Person();
           person.setID(rst.getInt("per_id"));
            person.setName(rst.getString("per_name"));
            person.setSex(rst.getString("per_sex"));
           person.setAdress(rst.getString("per_adress"));

            personList.add(person);
        }
        rst.close();
        pst.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return personList;
}

/*
* 添加人员
* */

public boolean addPerson(Person person) throws SQLException, ClassNotFoundException {
    String sql = "INSERT INTO mytest.persons(per_id,per_name,per_sex,per_adress) VALUES(?,?,?,?)";
    Connection conn = dbUtil.getConnection();
    try {
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, person.getID());
        pst.setString(2, person.getName());
        pst.setString(3, person.getSex());
        pst.setString(4, person.getAdress());
        int count = pst.executeUpdate();
        pst.close();
        return count > 0 ? true : false;
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
}

/*
* 修改人员
 * */

public boolean updatePerson(Person person) throws SQLException, ClassNotFoundException {
    String sql = "UPDATE mytest.persons set per_name=?,per_sex=?,per_adress=? WHERE per_ID=?";
    Connection conn = dbUtil.getConnection();
    try {
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, person.getName());
        pst.setString(2, person.getSex());
        pst.setString(3, person.getAdress());
        pst.setInt(4,person.getID() );

        int count = pst.executeUpdate();
        pst.close();
        return count > 0 ? true : false;
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
}

/*
* 删除人员
* */

public boolean deleteperson(int per_ID) throws SQLException, ClassNotFoundException {
    String sql = "delete from mytest.persons where per_id = ?";
    Connection conn = dbUtil.getConnection();
    try {
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, per_ID);
        int count = pst.executeUpdate();
        pst.close();
        return count > 0 ? true : false;
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
}

 /*   public static void main(String[] args) throws SQLException, ClassNotFoundException {
        PersonDao personDao =new PersonDao();
        List<Person> per =personDao.selectPerson();
        for (Person p: per
             ) {
            System.out.println(p.getNum());
        }
    }*/
}
