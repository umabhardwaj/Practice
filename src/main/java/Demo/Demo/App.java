package Demo.Demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String s= "???Selenium";
        String rev ="";
        for(int i= s.length()-1;i>=0;i--) {
        	rev= rev+s.charAt(i);
        }
        StringBuffer sf= new StringBuffer(s);
        System.out.println(sf.reverse());
        System.out.println("Reverse is: "+rev);
        s=s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
        
        int in=1234;
        int irev=0;
        while(in!=0) {
        	irev =irev*10 +in%10;
        	in=in/10;
        }
        System.out.println(irev);
        String names[] = {"Java","Java","c#","c#","swift"};
        Set<String> store = new HashSet<String>();
        for(String name:names) {
        	if(store.add(name)==false) {
        		System.out.println("duplicate element is:"+name);
        	}
        }
        Map<String,Integer> storeMap= new HashMap<String,Integer>();
        for(String name:names) {
        	Integer count= storeMap.get(name);
        	if(count==null)
        	storeMap.put(name, 1);
        	else
        		storeMap.put(name, ++count);
        }
        Set<Entry<String,Integer>> entryset=storeMap.entrySet();
        for(Entry<String,Integer> entry: entryset) {
        	if(entry.getValue()>1) {
        		System.out.println("Duplicate value is: "+entry.getKey() );
        	}
        }
    }
}
