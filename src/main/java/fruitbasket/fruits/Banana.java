package fruitbasket.fruits;

class Banana extends Fruit implements Sellable
{
   public Banana ( String color, float weight )
   {  super( color, weight );  }

   public void describe ()
   {  System.out.println( "A " + color + " " + weight + " lb. bunch of bananas." );  }

   public float cost ()
   {  return 0.88f * weight;  }
}
