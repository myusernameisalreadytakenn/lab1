package labs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class lab4 {

    public static class Furniture
	{
		String name;
		int catalogId;
		String color;
		int weight;
		String locType;
		
		public Furniture(String name, int catId, String col, int weight, String loc)
		{
			this.name = name;
			this.catalogId = catId;
			this.color = col;
			this.weight = weight;
			this.locType = loc;
		}
		
		public String getName()
		{
			return name;
		}
		
		public int getWeight()
		{
			return weight;
		}
		
		@Override
		public String toString() 
		{
			return("Furniture " + this.getName() + " with weight " + this.getWeight());
		} 
	}
	
	public static class FurnitureCatalog
	{
		ArrayList<Furniture> entries = new ArrayList<Furniture>();
		
		public FurnitureCatalog(int amount)
		{
			Random rand = new Random();
			String[] names = {"Shelve", "Box", "Chair", "Table", "Deck", "Sofa", "Carpet"};

			for (int i = 0; i < amount; ++i)
			{
				String name = names[rand.nextInt(names.length)];
				int weight = rand.nextInt(100) + 1;
				
				this.entries.add(new Furniture(name, i, "Black", weight, "Indoor"));
			}
		}
		
		public void sortByWeightAscending()
		{
			Collections.sort(entries, new Comparator<Furniture>() {
				  @Override
				  public int compare(Furniture f1, Furniture f2) {
					  Integer f1w = f1.getWeight();
					  Integer f2w = f2.getWeight();
					  return f1w.compareTo(f2w);
				    }
				});
		}
		
		public void sortByNameDescending()
		{
			Collections.sort(entries, new Comparator<Furniture>() {
				  @Override
				  public int compare(Furniture f1, Furniture f2) {
					  return f2.getName().compareTo(f1.getName());
				    }
				});
		}
		
		public void dumpCatalog()
		{
			for (Furniture entry : entries)
			{
				System.out.println(entry);
			}
		}
	}
	
	public static void main(String[] args) {
		FurnitureCatalog catalog = new FurnitureCatalog(10);
		
		System.out.println("Sorting by weight in ascending order");
		catalog.sortByWeightAscending();
		catalog.dumpCatalog();
		System.out.println();
		
		System.out.println("Sorting by name in descending order");
		catalog.sortByNameDescending();
		catalog.dumpCatalog();
	}
}
