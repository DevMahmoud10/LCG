package JavaPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LCGclass {
	
	public int a;
	public int c;
	public int m;
	ArrayList<Integer> z0 = new ArrayList<Integer>();

	public LCGclass() {
		// TODO Auto-generated constructor stub
		a=0;
		c=0;
		m=0;
	}
    public void getInput()
    {
    	Scanner in = new Scanner(System.in);
    	System.out.println("Enter a");
    	this.a = Integer.parseInt(in.nextLine());
    	
    	System.out.println("Enter m");
    	this.m = Integer.parseInt(in.nextLine());
    	
    	System.out.println("Enter c");
    	this.c = Integer.parseInt(in.nextLine());
    	
    	int i=0;
    	do
    	{
    		System.out.println("Enter z0 (Enter -1 to end )");
    		i=Integer.parseInt(in.nextLine());
    		if(i<0)
    		{
    			break;
    		}
    		this.z0.add(i);
    	}while (i>0);
    	
    }
    
    private int calculatePeriod(int z)
    {
    	
    		int period=0;
	    	ArrayList<Integer> zi = new ArrayList<Integer>();
	    	zi.add(z);
	    	
	    	
	    	while(0==0)
	    	{
	    		int ziPlus=((this.a*zi.get(period))+c)%this.m;
	    		boolean x=isFound(ziPlus,zi);
	    		if(isFound(ziPlus,zi)==false)
	    		{
	    			zi.add(ziPlus);
	    			period++;
	    		}
	    		else
	    			break;
	    	}	
	    	
	    	
	    	
	    	return period+1;
    	
    	
    }
    
    private Boolean isFound(int num,ArrayList<Integer>l)
    {
    	Collections.sort(this.z0);
    	int index = Collections.binarySearch(l,num);
    	if(index>=0)
    		return true;
    	else
    		return false;
    }
    
    
    public void getResult()
    {
    	for(int i=0;i<this.z0.size();i++)
    	{
    		System.out.println("The result where Zo ="+z0.get(i));
    		System.out.println(calculatePeriod(this.z0.get(i)));
    	}
    }
}
