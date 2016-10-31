package fruitbasket.fruits;

public abstract class Fruit {

	protected String color;
	protected float weight;

	public Fruit ( String color, float weight )
	{  this.color = color;
	this.weight = weight;
	}

	public void describe ()
	{
		System.out.println( "I am " + color +
				" and I weigh " + weight + " pounds." );
	}

}
