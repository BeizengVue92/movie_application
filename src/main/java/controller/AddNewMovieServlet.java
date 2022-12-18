package controller;

import com.google.common.base.Strings;
import dao.MovieDao;
import dao.MovieDaoException;
import dao.MovieDaoImpl;
import model.Movie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AddNewMovieServlet", urlPatterns = "/AddNewMovie")
public class AddNewMovieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // TODO get the information submitted by the user
        try {
            final String title = request.getParameter("title");
            final String director = request.getParameter("director");
            final String minuteString = request.getParameter("lengthInMinutes");

            if(Strings.isNullOrEmpty(title)
                || Strings.isNullOrEmpty(director)
                || Strings.isNullOrEmpty(minuteString)) {

                // User did not submit all the necessary information
                request.setAttribute("message", "You must complete all fields to submit the form.");

            } else {
                // User submitted all necessary data
                final int lengthInMinutes = Integer.parseInt(minuteString);

                final MovieDao movieDao = new MovieDaoImpl();

                // create movie object using the submitted info
                final Movie movie = new Movie(title, director, lengthInMinutes);

                // insert that movie object into the db using movieDao
                movieDao.insertMovie(movie);
                request.setAttribute("message", "The movie was added.");
            }
        } catch (MovieDaoException e) {
            e.printStackTrace();
            request.setAttribute("message", e.getMessage());
        }


        getServletContext().getRequestDispatcher("/add-movie.jsp").forward(request, response);


    }
}
