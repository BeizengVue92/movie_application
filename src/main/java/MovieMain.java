import model.Movie;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import utility.WorkbookUtility;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class MovieMain {

    public final static String INPUT_FILE = "src\\main\\webapp\\assets\\spreadsheets\\JavaWebProgramming.xlsx";

    public static void main(String[] args) {

        final File inputFile = new File(INPUT_FILE);

        try {
            final List<Movie> movie = WorkbookUtility.retrieveMovieFromWorkBook(inputFile);

            for(int i = 0; i < movie.size(); i++) {

                System.out.println(movie.get(i));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }
    }
}

