package mainProject;

import mainProject.dao.EditionDao;
import mainProject.entity.Edition;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EditionDao editionDao = new EditionDao();
        List<Edition> getAllEditions = editionDao.read();
        System.out.println(getAllEditions);
    }
}
