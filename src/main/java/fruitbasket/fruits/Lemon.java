package fruitbasket.fruits;

public class Lemon extends Fruit implements Sellable {
	
	   public Lemon ( String color, float weight )
	   {  super( color, weight );  }

	   public void describe ()
	   {  System.out.println( "A  " + color + " " + weight + " lb. Lemon." );  }

	   public float cost ()
	   {  return 0.95f * weight;  }

}
