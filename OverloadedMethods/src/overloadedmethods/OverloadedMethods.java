package overloadedmethods;
public class OverloadedMethods {
// Usando métodos sobrecarregados para imprimir um array de diferentes tipos.
    // método printArray para imprimir o array Integer
    public static void printArray( Integer[] inputArray ) {
        // exibe elementos do array
        for ( Integer element : inputArray )
            System.out.printf( "%s ", element );
        System.out.println();
    } // fim do método printArray
    // método printArray para imprimir o array Double
    public static void printArray( Double[] inputArray ) {
    // exibe elementos do array
        for ( Double element : inputArray )
            System.out.printf( "%s ", element );
        System.out.println();
    } // fim do método printArray
    // método printArray para imprimir um array Character
    public static void printArray( Character[] inputArray ) {
        // exibe elementos do array
        for ( Character element : inputArray )
            System.out.printf( "%s ", element );
        System.out.println();
    } // fim do método printArray
    public static void main( String args[] ) {
        // cria arrays do Integer, Double e Character
        Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
        Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };
        System.out.println( "Array integerArray contains:" );
        printArray( integerArray ); // passa um array Integer
        System.out.println( "\nArray doubleArray contains:" );
        printArray( doubleArray ); // passa um array Double
        System.out.println( "\nArray characterArray contains:" );
        printArray( characterArray ); // passa um array Character
    } // fim de main
} // fim da classe OverloadedMethods
