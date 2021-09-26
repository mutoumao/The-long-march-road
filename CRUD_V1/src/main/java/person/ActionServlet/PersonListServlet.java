package person.ActionServlet;

import person.JavaBean.Person;
import person.dao.PersonDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
@WebServlet("/List")
public class PersonListServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PersonDao personDao = new PersonDao();
        List<Person> personList = null;
        try {
            personList = personDao.selectPerson();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        req.setAttribute("persons", personList);
        req.getRequestDispatcher("page/list.jsp").forward(req, resp);
    }



   /* public static void main(String[] args) {
        PersonDao personDao = new PersonDao();
        List<Person> personList = personDao.selectPerson();
        for (Person p:personList
             ) {
            System.out.println(p.getID());
        }
    }*/
}
