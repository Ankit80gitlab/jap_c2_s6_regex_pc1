package com.jap.longestsubstring;

public class LongestSubstring {
     public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("playersplay");

        LongestSubstring longestSubstring = new LongestSubstring();
        // Call method to find longest substring that appears at both ends of a string
        System.out.println(longestSubstring.findLongestSubString(str));
    }



    //Function to find the longest substring that appears at both ends of a string
    public StringBuilder findLongestSubString(StringBuilder str) {
        //return new StringBuilder("");

		int i=0;
	   
	    String str1="";
	    String str2="";
		StringBuilder result = new StringBuilder();
		
		
		if(str==null )
	    {
		result.append("Invalid string");
	    	return result;
	    }
	    if(str.length()==0)//for null and empty input
	     {
		result.append("Invalid string");
	    	return result;
	    }
	     int j=str.length()-1;
		while(i<=j)//till they meet at mid-point of string
		{
			str1=str1+str.charAt(i);
			str2=str.charAt(j)+str2;
			if(str1.equalsIgnoreCase(str2))//when subsets match
			result.append(str1);
			i++;j--;
		}
		if(result.length()<=0)
		{
			result.append("Longest substring is not present in the given StringBuilder");
			return result;
		}
        return result;
    }
}

    /*
        int i=0;
        String sub1="";
        String sub2="";
        StringBuilder longest = new StringBuilder();

        int j=str.length()-1;

		if(str==null)
		{
			longest.append("Invalid string");
		}
		else if (str==null)
        {
            longest.append("Invalid string");
        }
        else if (str.length()==0)
        {
            longest.append("Invalid string");
        } 

        else if (str.length()==1)
        {
            longest.append(str);
        }
		else
		{
        while(i<=j)//till they meet at mid-point of string
        {
            sub1=sub1+str.charAt(i);
            sub2=str.charAt(j)+sub2;
            if(sub1.equalsIgnoreCase(sub2))//when subsets match
                longest.append(sub1);
            i++;j--;
        }
        if(longest.length()<=0)
        {
            longest.append("Longest substring is not present in the given StringBuilder");
            return longest;
        }
		}
        return longest;
    }
}*/
