package publisher;

import javax.xml.ws.Endpoint;

import bookService.BookImpl;

public class BookPublisher {
	
	private static String URL = "http://localhost:9999/service/book";
	
	public static void main(String [] args){
		Endpoint.publish(URL, new BookImpl());
	}
}