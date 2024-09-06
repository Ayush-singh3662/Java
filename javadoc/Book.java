/**
 * @author Ayush Kumar
 * @version 1.0.0
 * @since 2024
 */


 /**
  * Class for book maintanence of library
  */
public class Book {

    /**
     * Default value of id = 10
     * @value 10 default value given
     */
    private int id = 10;

    /**
     * Parametrized Constructor
     * @param s Name of the book
     */
    Book(String s) {

    }

    /**
     * Function for issuing book from library
     * @param s Name of the book which user want to issue from library
     * @throws Exception if the book which user wants is not present in library then it will throw an exception
     */
    public void issue(String s) throws Exception {

    }


    /**
     * Function for checking if the given book is available or not
     * @param s Name of the book which we are checking that it is available or not in tha library
     * @return if the book is available in the library then it will return true else false
     */
    public boolean available(String s) {
        return true;
    }


    /**
     * Function for getting the name of the book of its equivalent given id
     * @param id id of the book for which we want to get the name of the book
     * @return name of the book of the given id
     */
    public String getName(int id) {
        return "";
    }
}
