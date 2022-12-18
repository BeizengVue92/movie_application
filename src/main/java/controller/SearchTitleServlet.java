package controller;

import dao.MovieDao;
import dao.MovieDaoException;
import dao.MovieDaoImpl;
import model.Movie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet(name = "SearchTitleServlet", urlPatterns = "/SearchTitle")
public class SearchTitleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //TODO fetch the list of movie
        try {
            final MovieDao movieDao = new MovieDaoImpl();
            final List<Movie> film = movieDao.retrieveMovie();
            String filterString = request.getParameter("title");

            //TODO filter the list
            final List<Movie> filtered = film.stream()
                                             .filter( (Movie m) -> m.getTitle().equalsIgnoreCase(filterString))
                                             .collect(Collectors.toList());

            //TODO attach the list to the request
            request.setAttribute("movie", filtered);

        } catch (MovieDaoException e) {
            throw new RuntimeException(e);
        }

        //TODO forward the request (to the view)
        getServletContext().getRequestDispatcher("/view-all.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
