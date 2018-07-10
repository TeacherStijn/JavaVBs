class Vissen {
	public static void main (String args[])
	{
		System.out.println("Vis vangen...");
		Vis eersteVis = new Vis();
		System.out.println("Vis gevangen...");	
		gooiVisOpBBQ(eersteVis);
	}
	
	static void gooiVisOpBBQ(Vis visje){
		System.out.println("Er ligt een: " + visje.soort + " op de BBQ en die is wel " + visje.lengte + " lang!");
	}
}

class Vis {
	String soort = "Zalm";
	int lengte = 30;
	int positieX;
	int positieY;
	int positieZ;
	
	void zwemmen(){
		System.out.println("Ik zwem!");
	}
}

