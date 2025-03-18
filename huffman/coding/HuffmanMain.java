package huffman.coding;
import java.util.*;
public class HuffmanMain {
	public static int printCode(HuffmanNode z,String str,int c) {
		if(z.left == null && z.right == null && Character.isLetter(z.c)) {
			System.out.println(z.c + ":" + str);
			return c;
		}
		return printCode(z.left, str+"0", c+1)+printCode(z.right,str+"1", c+1);
		//printCode(z.right,str+"1", c+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		char[] charArray = { 'A', 'C', 'E', 'M', 'U', 'Z' }; 
        int[] charfreq = { 100, 53, 133, 60, 44, 8 }; 
        PriorityQueue<HuffmanNode> q = new PriorityQueue<HuffmanNode>(n,new MyComparator());
        
        for(int i=0;i<n;i++) {
        	HuffmanNode hn = new HuffmanNode();
        	
        	hn.c = charArray[i];
        	hn.data = charfreq[i];
        	hn.left = null;
        	hn.right = null;
        	q.add(hn);
        }
        HuffmanNode root = null;
        while(q.size()>1) {
        	HuffmanNode x = q.peek();
        	q.poll();
        	HuffmanNode y = q.peek();
        	q.poll();
        	HuffmanNode f = new HuffmanNode();
        	f.data = x.data + y.data;
        	f.c = '-';
        	f.left = x;
        	f.right = y;
        	root = f;
        	q.add(f);
        }
        int count=0;
        int a=printCode(root,"",count);
        System.out.println("Ascii needs: "+n*8);
        System.out.println("HuffmanCode needs: "+a);
	}

}
