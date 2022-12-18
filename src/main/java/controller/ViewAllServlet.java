package controller;

import comparator.DirectorComparator;
import comparator.LengthInMinutesComparator;
import comparator.TitleComparator;
import dao.MovieDao;
import dao.MovieDaoException;
import dao.MovieDaoImpl;
import model.Movie;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import utility.WorkbookUtility;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

@WebServlet(name = "ViewAllServlet", urlPatterns = "/ViewAll")
public class ViewAllServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String target = "/view-all.jsp";
        //TODO get access to our spreadsheet
//        final String filePath = getServletContext().getRealPath(WorkbookUtility.INPUT_FILE);
//        final File inputFile = new File(filePath);

        //TODO fetch the information and use it to populate the model
        try {
//            final List<Movie> movie = WorkbookUtility.retrieveMovieFromWorkBook(inputFile);
            final MovieDao movieDao = new MovieDaoImpl();
            final List<Movie> film = movieDao.retrieveMovie();

            String sortType = request.getParameter("sortType");

            if(null != sortType && sortType.equals("title")) {
                Collections.sort(film, new TitleComparator());
            } else if(null != sortType && sortType.equals("director")) {
                Collections.sort(film, new DirectorComparator());
            } else if(null != sortType && sortType.equals("lengthInMinutes")) {
                Collections.sort(film, new LengthInMinutesComparator());
            }

            //TODO attach the model to the request
            request.setAttribute("movie",film);
        } catch (MovieDaoException e) {
            e.printStackTrace();
        }

        //TODO forward the request to the view.
        getServletContext().getRequestDispatcher(target).forward(request, response);
    }
}
