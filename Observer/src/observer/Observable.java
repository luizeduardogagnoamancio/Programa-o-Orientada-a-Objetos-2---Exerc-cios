package observer;

import java.util.ArrayList;
import java.util.List;

public class Observable {
	List<Observer> monitores = new ArrayList();
	
	public void addObserver(Observer ob)
	{
		this.monitores.add(ob);
	}
	
	public void deleteObserver(Observer ob)
	{
		this.monitores.remove(ob);
	}
	
	public void notifyObserver()
	{
		for (Observer ob : monitores)
		{
			ob.update(this);
		}
	}
}
