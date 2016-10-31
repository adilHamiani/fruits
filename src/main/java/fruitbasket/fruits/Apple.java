package fruitbasket.fruits;

public class Apple extends Fruit implements Sellable{

	   public Apple ( String color, float weight )
	   {  super( color, weight );  }

	   public void describe ()
	   {  System.out.println( "A  " + color + " " + weight + " lb. Apple." );  }

	   public float cost ()
	   {  return 1.15f * weight;  }
}
