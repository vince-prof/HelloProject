/**
*Classe java di inizio corso
*
*@author Mario, Rossi
*@version 1.0 
*/

public class Ciao {
	/**
		metodo principale
	*/
   public static void main(String[] args) {
      System.out.println("Ciao, World!\n");
	  int result = somma(5,6);

	  System.out.println("la somma di 5 + 6 e' "+ result);
   }
   /**@param a primo numero da sommare
     *@param b secondo numero da sommare
     *@return restituisce la somma di due numeri in input
	 */
   public static int somma(int a, int b){
	return (a+b);
   }


}