package usingarrays;
import java.util.Arrays;
public class UsingArrays {
    // Utilizando arrays de Java.
    private int intArray[] = { 1, 2, 3, 4, 5, 6 };
    private double doubleArray[] = { 8.4, 9.3, 0.2, 7.9, 3.4 };
    private int filledIntArray[], intArrayCopy[];
    // construtor inicializa arrays
    public UsingArrays() {
        filledIntArray = new int[ 10 ]; // cria array int com 10 elementos
        intArrayCopy = new int[ intArray.length ];
        Arrays.fill( filledIntArray, 7 ); // preenche com 7s
        Arrays.sort( doubleArray ); // classifica doubleArray ascendente
        // copia array intArray no array intArrayCopy
        System.arraycopy( intArray, 0, intArrayCopy, 0, intArray.length );
    } // fim do construtor UsingArrays
    // gera saída de valores em cada array
    public void printArrays() {
        System.out.print( "doubleArray: " );
        for ( double doubleValue : doubleArray )
            System.out.printf( "%.1f ", doubleValue );
        System.out.print( "\nintArray: " );
        for ( int intValue : intArray )
            System.out.printf( "%d ", intValue );
        System.out.print( "\nfilledIntArray: " );
        for ( int intValue : filledIntArray )
            System.out.printf( "%d ", intValue );
        System.out.print( "\nintArrayCopy: " );
        for ( int intValue : intArrayCopy )
            System.out.printf( "%d ", intValue );
        System.out.println( "\n" );
    } // fim do método printArrays
    // localiza valor no array intArray
    public int searchForInt( int value ) {
        return Arrays.binarySearch( intArray, value );
    } // fim do método searchForInt
    // compara conteúdo do array
    public void printEquality() {
        boolean b = Arrays.equals( intArray, intArrayCopy );
        System.out.printf( "intArray %s intArrayCopy\n",( b ? "==" : "!=" ) );
        b = Arrays.equals( intArray, filledIntArray );
        System.out.printf( "intArray %s filledIntArray\n",( b ? "==" : "!=" ) );
    } // fim do método printEquality
    public static void main( String args[] ) {
        UsingArrays usingArrays = new UsingArrays();
        usingArrays.printArrays();
        usingArrays.printEquality();
        int location = usingArrays.searchForInt( 5 );
        if ( location >= 0 ) 
            System.out.printf("Found 5 at element %d in intArray\n", location );
        else 
            System.out.println( "5 not found in intArray" ); 
        location = usingArrays.searchForInt( 8763 );
        if ( location >= 0 ) 
            System.out.printf("Found 8763 at element %d in intArray\n", location ); 
        else
            System.out.println( "8763 not found in intArray" ); 
    } // fim do main 
} // fim da classe UsingArrays
    
    
    

    

