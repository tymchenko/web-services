package bookService;

import javax.jws.WebService;

@WebService(endpointInterface = "bookService.Bookable")
public class BookImpl implements Bookable{

	@Override
	public String getBookById(int id) {
		return "Book with " + id;
	}

	@Override
	public String removeBookById(int id) {
		return "Book with id " + id + " removed";
	}
	
	
}