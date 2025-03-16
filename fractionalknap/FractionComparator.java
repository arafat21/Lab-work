package fractionalknap;

import java.util.*;
public class FractionComparator implements Comparator<ItemValue>{

	@Override
	public int compare(ItemValue o1, ItemValue o2) {
		// TODO Auto-generated method stub
		if(o1.getRatio()<o2.getRatio())
			return 1;
		else
			return -1;
	}
	
}
