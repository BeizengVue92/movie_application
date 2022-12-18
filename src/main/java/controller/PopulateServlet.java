package controller;

import dao.MovieDao;
import dao.MovieDaoException;
import dao.MovieDaoImpl;
import utility.WorkbookUtility;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "PopulateServlet", value = "/Populate")
public class PopulateServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        final String filePath = getServletContext().getRealPath(WorkbookUtility.INPUT_FILE);

        final MovieDao movieDao = new MovieDaoImpl();

        String message = "";

        try {
            movieDao.populate(filePath);
            message = "The database was successfully populated";
        } catch (MovieDaoException e) {
            e.printStackTrace();
            message = "There was an error, the database was not populated";
        }

        request.setAttribute("message", message);
        getServletContext().getRequestDispatcher("/populate.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}