package publisher;

import javax.xml.ws.Endpoint;

import Book.BookImpl;

public class BookPublisher {
	
	private static String URL = "http://localhost:8081/ws/hello";
	
	public static void main(String [] args){
		Endpoint.publish(URL, new BookImpl());
	}
}