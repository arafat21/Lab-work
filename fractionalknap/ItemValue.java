package fractionalknap;

public class ItemValue {
	
		int profit,weight,object;
		double ratio;
		public ItemValue(int object,int profit,int weight) {
			this.profit = profit;
			this.weight = weight;
			this.object = object;
			ratio = ((double)profit/(double)weight);
		}
		public int getProfit() {
			return profit;
		}
		public int getWeight() {
			return weight;
		}
		public int getObject() {
			return object;
		}
		public double getRatio() {
			return ratio;
		}
		@Override
		public String toString() {
			return "ItemValue [profit=" + profit + ", weight=" + weight + ", object=" + object + ", ratio=" + ratio
					+ "]";
		}
		
	
}
