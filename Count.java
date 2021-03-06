import java.util.Scanner;
import java.io.File;
import java.util.Hashtable;

class Count
{
  public static void main(String[] args)
  {
    try {
	
	  Hashtable<String,Integer>  wordFreqHashtable =  new Hashtable<String,Integer>();
	  
	  for(int fileID=0; fileID<51; fileID++)
	  {
	    File inputFile;
	    String fileName             = "NonSpamTrain" + fileID + ".txt";
	    System.out.println(fileName);
		inputFile               = new File(fileName);
		Scanner fileReader      = new Scanner(inputFile); 
		while( fileReader.hasNext() )
		{
                  String token = fileReader.next(); // returns the data in the scanner

		  if( wordFreqHashtable.containsKey(token.toLowerCase()) )
		  { // true
		    wordFreqHashtable.put(token.toLowerCase(), wordFreqHashtable.get(token.toLowerCase())+1);
		  }
		  else
		  { // not in the table yet!
		    wordFreqHashtable.put(token.toLowerCase(), 1);
		  }
		  // how i will scan the elements in the hastable
		  System.out.println(token);
}

		  
		  // scan all the elements in the hastable
		   
    for (String key : wordFreqHashtable.keySet())
    {
       if( wordFreqHashtable.get(key) > 25)        
     System.out.println(" key: " + key + " value: " + wordFreqHashtable.get(key));
	
	
}
	}
               

            }
	catch(Exception exception)// will catch all the exceptions
	{
	  System.out.println(exception.getMessage());
}

  }
}



