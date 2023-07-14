
import com.mycompany.factory.Cliente;

public abstract class Creator {

	/**
	 * 
	 * @param c
     * @return 
	 */
	public abstract CreditCard buildCard(Cliente c);
        public String generarNumeroCard(){
            //Genera numero de tarjeta
            return "";
            
        }
        
        public String generarCVV(){
            // genera un cvv
            return "";
        }

}