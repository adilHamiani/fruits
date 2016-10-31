package fruitbasket.fruits;

class Orange extends Fruit implements Sellable
{
   public Orange ( String color, float weight )
   {  super( color, weight );  }

   public void describe ()
   {  System.out.println( "A ripe " + color + " " + weight + " lb. Orange." );  }

   public float cost ()
   {  return 0.39f * weight;  }
}
