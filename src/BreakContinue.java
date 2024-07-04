public class BreakContinue {
    
    public static void main( String [] args ) {

              //Se o número de 1 a 10 for par, ele será pulado;
        
        
        for( int i = 0 ; i < 10 ; i++ ) {

                     if( i % 2 == 0) { 
                         continue;
                     }

                     System.out.println("O número é " + i );

                     if( i == 7 ) {
                      break;
                     }

               }
        }

}
