/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid;
import java.util.ArrayList;
/**
 *
 * @author CltControl
 */
public class StoreBook implements Pago {
    private ArrayList<Book> books;
	private Book book;
	
	
	public StoreBook(){
		/** 
		 * Initialize array with books
		 */
	}
        public void pay(String method, Book book) {
		if(method == "card") {
			pay_card("numberCard", book);
		}else if ( method == "cash") {
			pay_cash( "money", book);
		}
	}
	public void removeBooksPurchased(ArrayList<Book> books) {
		/*
		 * store books with state true in new array and remove the original array
		 * 
		 */
	}

    @Override
    public void pay_card(String method, Book book) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pay_cash(String method, Book book) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
