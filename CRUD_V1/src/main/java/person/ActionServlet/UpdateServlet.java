package person.ActionServlet;

import person.JavaBean.Person;
import person.dao.PersonDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class UpdateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        int personID = Integer.parseInt(req.getParameter("ID"));
        String personName = req.getParameter("name");
        String personSex = req.getParameter("sex");
        String personAdress = req.getParameter("address");

        Person person=new Person();
        person.setID(personID);
        person.setName(personName);
        person.setSex(personSex);
        person.setAdress(personAdress);

        PersonDao personDao = new PersonDao();
        try {
            personDao.updatePerson(person);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/List").forward(req,resp);
    }
}
