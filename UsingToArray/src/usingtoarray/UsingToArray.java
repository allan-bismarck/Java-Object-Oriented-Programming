package usingtoarray;
import java.util.LinkedList;
import java.util.Arrays;
public class UsingToArray {
    // Utilizando o método toArray.
    // construtor cria LinkedList, adiciona elementos e converte em array
    public UsingToArray() {
        String colors[] = { "black", "blue", "yellow" };
        LinkedList< String > links = new LinkedList< String >( Arrays.asList( colors ) );
        links.addLast( "red" ); // adiciona como o último item
        links.add( "pink" ); // adiciona ao final
        links.add( 3, "green" ); // adiciona no terceiro índice
        links.addFirst( "cyan" ); // adiciona como primeiro item
        // obtém elementos LinkedList como um array
        colors = links.toArray( new String[ links.size() ] );
        System.out.println( "colors: " );
        for ( String color : colors )
        System.out.println( color );
    } // fim do construtor UsingToArray
    public static void main( String args[] ) {
        new UsingToArray();
    } // fim do main
} // fim da classe UsingToArray