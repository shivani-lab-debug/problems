package javaprograms;

public class ShortestDistance {
	public static int find_shortest_distance(String document,String word1,String word2)
	{
		String[] words = document.split("[,. ]");
		int shortest_dist = document.length();
		int first_word_dist  = 0;
		int second_word_dist = 0;
		
		int start = 0;
		
		for(String w: words)
		{
			if(w.equalsIgnoreCase(word1))
			{
				first_word_dist = start + (w.length()/2);
			}
			else if(w.equalsIgnoreCase(word2))
			{
				second_word_dist = start + (w.length()/2);
			}
		    start = start + w.length()+1;
			
		}
		
		if(first_word_dist>0 && second_word_dist>0)
        {
	      int distance = Math.abs(second_word_dist-first_word_dist);
	      if(distance<shortest_dist)
	    	  shortest_dist = distance;
        }
		
		if (first_word_dist==0 || second_word_dist==0)
			return -1;
          
       
		
	  return shortest_dist;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Shortest distance :" + find_shortest_distance("Example we just made up","we","just"));
		
	}
	

}
