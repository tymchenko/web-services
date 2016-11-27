package bookService;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public interface Bookable {
	
	@WebMethod
	String getBookById(int id);

	@WebMethod
	String removeBookById(int id);
}
