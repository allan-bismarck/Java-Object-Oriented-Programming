package genericmethodtest;
public class GenericMethodTest {
// método genérico printArray
    public static < E > void printArray( E[] inputArray ) {
        // exibe elementos do array
        for ( E element : inputArray )
            System.out.printf( "%s ", element );
        System.out.println();
    } // fim do método printArray
    public static void main( String args[] ) {
        // cria arrays de Integer, Double e Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
        System.out.println( "Array integerArray contains:" );
        printArray( intArray ); // passa um array Integer
        System.out.println( "\nArray doubleArray contains:" );
        printArray( doubleArray ); // passa um array Double
        System.out.println( "\nArray characterArray contains:" );
        printArray( charArray ); // passa um array Character
    } // fim de main
} // fim da classe GenericMethodTest