/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid;

/**
 *
 * @author CltControl
 */
public interface Pago {
    //Antiguamente estos métodos estaban en StoreBook, la solución fue crear una nueva clase
    //que maneje los pagos, ya que se estaba violando el principio numero 5
    	public void pay_card(String method, Book book);	
	public void pay_cash(String method, Book book);
}
