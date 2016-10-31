package fruitbasket.fruits;

/**
 * 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        
        int numItems = 0;
        Sellable [] basket = new Sellable[10];  // An array of 10 "Sellable" items.

        basket[numItems++] = new Apple( "red", .25f );
        basket[numItems++] = new Banana( "yellow", 2.15f );
        basket[numItems++] = new Orange( "orange", 0.12f ); 
        basket[numItems++] = new Lemon( "yellow" , 1.5f);
        basket[numItems++] = new Peache( "red", 3.45f );


        float totalCost = 0;
        System.out.println( "\nYour basket contains the following items:\n" );
        for ( int i = 0; i < numItems; ++i )
        {
           basket[i].describe();
           totalCost += basket[i].cost();
        }
        
        System.out.println("\n total cost of your basket " + totalCost );
        
    }
}
