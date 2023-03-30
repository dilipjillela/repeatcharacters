import java.util.HashMap;
import java.util.Map;

class Atm{
	public static void main(String[] args) {
		String a="aabbbcccccccc";
		char [] b=a.toCharArray();

		Map<Character,Integer>charmap =new HashMap<>();
		for(Character ch:b){
			if(charmap.containsKey(ch)){
				charmap.put(ch,charmap.get(ch)+1);
			}
			else{
				charmap.put(ch,1);
			}
		}
		
		System.out.println(charmap);
		for(Map.Entry<Character,Integer>m:charmap.entrySet()){
			if(m.getValue()>1){

				System.out.print(m.getKey()+""+ m.getValue());
			}
			

		}
	
		 
	
	}
}
