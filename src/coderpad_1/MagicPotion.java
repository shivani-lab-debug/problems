package coderpad_1;

public class MagicPotion
{
    private static int minimalSteps( String ingredients)
    {
        StringBuilder sb = new StringBuilder(ingredients);

        for(int i =0;i<sb.length();i++)
        {
            char startChar = sb.charAt(i);
            int walkingIndex1=i;
            int startIndex2 =sb.toString().indexOf(startChar,i+1);
            int  walkingIndex2=startIndex2;
            while(walkingIndex2 !=-1 && walkingIndex2<sb.length() && sb.charAt(walkingIndex1) == sb.charAt(walkingIndex2)  )
            {
                if(walkingIndex1+1==startIndex2)
                {
                   String subStringToBeEncoded = sb.substring(i,walkingIndex2+1);//substring the string found and the original "substring does not include the last index hence the +1
                   int matchStartIndex = sb.indexOf(subStringToBeEncoded,walkingIndex2+1);// look for first match for the whole string matched
                   int matchEndeIndex= matchStartIndex+subStringToBeEncoded.length();
                   int origStartIndex=i;
                   int origEndIndex = i+subStringToBeEncoded.length();
                   if (matchStartIndex!=-1 )
                   {
                       if(origEndIndex==matchStartIndex)
                       {
                           sb.replace(matchStartIndex,matchEndeIndex,"*");
                       }
                       else
                       {
                           while(matchStartIndex!=-1 && matchEndeIndex<sb.length() && sb.charAt(origEndIndex) == sb.charAt(matchEndeIndex)  )
                           {
                               if(origEndIndex==matchStartIndex-1)// if the index of the 2 strings are right behind one another
                               {
                                   sb.replace(matchStartIndex,matchEndeIndex+1,"*");
                               }
                               else
                               {
                                   origEndIndex++;
                                   matchEndeIndex++;
                               }
                           }
                       }
                   }
                   sb.replace(startIndex2,walkingIndex2+1,"*");
                   break;
                }
                walkingIndex1++;
                walkingIndex2++;
            }
        }
        System.out.println("orig= " + ingredients + " encoded = " + sb);
        return sb.length();
    }

    public static void main( String[] args )
    {

        if (    minimalSteps("ABCABCE") == 5 &&
                minimalSteps("ABCABCEA") == 6 &&
                minimalSteps("abbbbabbbb") == 5 &&
                minimalSteps("abcde") == 5 &&
                minimalSteps("abcbcbcbcd") == 6 &&
                minimalSteps("ababcababce") == 6 &&
                minimalSteps("ababababxx") == 6 &&
                minimalSteps("aabbccbbccaabbccbbcc") == 8)
        {
            System.out.println( "Pass" );
        }
  else
        {
            System.out.println( "Fail" );
        }
    }
}
