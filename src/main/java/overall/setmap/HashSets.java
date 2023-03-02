package overall.setmap;

/**
 * Hello world!
 *
 */
import java.util.*;
import java.util.logging.*;
public class HashSets
{
	
        public  void run()
        {
				Logger l=Logger.getLogger("com.api.jar");
                Scanner sin=new Scanner(System.in);
				int ch;
				do{
					l.info("1.Hashset\n2.Treeset\n3.Hashmap\n4.Treemap\n5.Exit\n");
					l.info("Enter your choice\n");
					ch=sin.nextInt();
				switch(ch)
				{
					case 1:
					Set<String> hs= new HashSet<String>();
                hs.add("Mr.");
                hs.add("Rohith R");
                hs.add("From");
                hs.add("Mepco");
                hs.add("Schlenk");
                hs.add("Engineering college");
                hs.add("Mepco");
				 hs.add("TA");
                hs.remove("TA");
                l.log(Level.INFO,()-> "HashSet is "+hs);
				break;
				case 2:  Set<String> ts=new TreeSet<>();
                ts.add("Rohith");
                ts.add("Where");
                ts.add("Are");
                ts.add("U");
                ts.add("From");
				 ts.add("TA");
                ts.remove("TA");
                l.log(Level.INFO,()->"\nTree Set is "+ts);
				break;
				case 3:
				   Map<String,String>hm=new HashMap<>();
                hm.put("Hi","Im vijay");
                hm.put("Hello","Im Vijay");
                hm.put("How r u","students");
				 hm.put("hj","tr");
                hm.remove("hj");
                l.log(Level.INFO,()->"\nHash Map is "+hm);
				break;
				case 4:
                Map<String,String>mp=new TreeMap<>();
                mp.put("Hi","Im vijay");
                mp.put("Hello","Im Vijay");
               mp.put("How r u","students");
			    mp.put("hj","tr");
               mp.remove("hj");
                l.log(Level.INFO,()->"\nTree Map is "+mp);
				break;
				case 5:l.info("Thank you\n");
				break;
				default:l.info("Enter valid input\n");
				break;
        }
				
				}while(ch!=5);
}
}
