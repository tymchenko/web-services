package Book;

import javax.jws.WebService;

@WebService(endpointInterface = "Book.Bookable")
public class BookImpl implements Bookable{

	@Override
	public String getBookById(String id) {
		
		return "Book with " + id;
	}
}
