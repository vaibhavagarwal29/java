import java.util.*;
class  List1
{
	public static void main(String[] args) 
	{
        String s1[]={"A","A","B","L","C","F","D","E","D","Z","R","F"};
		String s2[]={"C","E","X","Z","M","X","P","L","M","N","S","T","P","B","A"};
		
        List l=Arrays.asList(s1);
		ArrayList<String> a1=new ArrayList<String>(l);
		List l1=Arrays.asList(s2);
		ArrayList<String> a2=new ArrayList<String>(l1);
			Map <String,Integer>mp1=new HashMap<String,Integer>();
    ArrayList al3=new ArrayList<String>();
			for(String s:a1)
		{
				if(mp1.get(s)==null)
				mp1.put(s,1);
				else
			{
					int v=mp1.get(s);
					mp1.put(s,v+1);
			}

		}

		for(String s:a2)
		{
				if(mp1.get(s)==null)
				mp1.put(s,1);
				else
			{
					int v=mp1.get(s);
					mp1.put(s,v+1);
			}

		}
Set <String>keyset=mp1.keySet();
for( String s:keyset)
		{
if(mp1.get(s)==2)
			{
	al3.add(s);
			}
		}
		
	System.out.println(a1);
	System.out.println(a2);
System.out.println(mp1);
System.out.println(al3);
	}
}
