package fruitbasket.fruits;

public class Peache extends Fruit implements Sellable {
	
	   public Peache ( String color, float weight )
	   {  super( color, weight );  }

	   public void describe ()
	   {  System.out.println( "A " + color + " " + weight + " lb. Peaches." );  }

	   public float cost ()
	   {  return 0.83f * weight;  }

}

