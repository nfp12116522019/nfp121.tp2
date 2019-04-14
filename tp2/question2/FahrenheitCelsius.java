package question2;


public class FahrenheitCelsius{

     /** le point d'entr�e de cette application, 
      * dont le commentaire est � compl�ter
      *
      *  @param args ...
      */
     public static void main(String[] args){
       int fahrenheit = 0;
		float celsius = 0;
         try{
       for(int x=0;x<args.length;x++){
		    fahrenheit=Integer.parseInt(args[x]);
		    celsius=fahrenheitEnCelsius(Integer.parseInt(args[x]));
		System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); // ligne,
																				// format
																				// impos�s
																				
	

      
       }}catch(NumberFormatException nfe){
           System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
       }
       
     }
     
     /** 
      * la m�thode � compl�ter. 
      *   @param f la valeur en degr� Fahrenheit
      *   @return  la conversion en degr� Celsius
      */
     public static float fahrenheitEnCelsius( int f){
         float celsius=5/9f * (f-32);
                 float resultat=(int)(celsius*10)/10.0f;
		return resultat;
     }

}