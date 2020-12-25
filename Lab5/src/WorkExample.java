import java.util.Vector;

public class WorkExample {

	public static void main(String[] args) {
		Vector <IDrawable> allFig = new Vector<IDrawable>();
		allFig.add(new Treugolnik("Треугольник 1", "Blue", 2.0, 3.4, 5.1));
		allFig.add(new PryamParallelepiped("Прямоуголный параллелепипед 1", "Yellow", 6.0, 4.5, 2.005));
		allFig.add(new Trapecia("Трапеция 1", "Red", 2.0, 0.7, 0.5, 4.5));
		allFig.add(new PravShestiugolnik("Правильный шестиугольник 1", "Brown", 2.0));
		
		for(int i = 0; i < allFig.size(); i++)
		{
			System.out.println(allFig.get(i).Str());
			System.out.println();
			allFig.get(i).Draw();
			System.out.println();
		}
	}

}
