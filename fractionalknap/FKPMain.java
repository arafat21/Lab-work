package fractionalknap;
import java.util.*;
public class FKPMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ItemValue> itemValues = new ArrayList<ItemValue>();
		
		//ItemValue1
		ItemValue item1 = new ItemValue(1, 12, 3);
		ItemValue item2 = new ItemValue(2,5,1);
		ItemValue item3 = new ItemValue(3,16,4);
		ItemValue item4 = new ItemValue(4,7,2);
		ItemValue item5 = new ItemValue(5,9,9);
		ItemValue item6 = new ItemValue(6,11,4);
		ItemValue item7 = new ItemValue(7,6,3);
		//Add List
		itemValues.add(item1);
		itemValues.add(item2);
		itemValues.add(item3);
		itemValues.add(item4);
		itemValues.add(item5);
		itemValues.add(item6);
		itemValues.add(item7);
		
		Collections.sort(itemValues,new FractionComparator());
		Knapsack fkp = new Knapsack();
		fkp.FKP(itemValues);
		
	}

}
