
public class ChineseZodiac {

	public static void main(String[] args) {
		
		int year = 1988;
	    	        
	        switch (year % 10) {
		      case 0: System.out.print("A white"); break;
		      case 1: System.out.print("A white"); break;
		      case 2: System.out.print("A black"); break;
		      case 3: System.out.print("A black"); break;
		      case 4: System.out.print("A blue"); break;
		      case 5: System.out.print("A blue"); break;
		      case 6: System.out.print("A red"); break;
		      case 7: System.out.print("A red"); break;
		      case 8: System.out.print("A yellow"); break;
		      case 9: System.out.print("A yellow"); break;
	 
		    }  
	        
		    switch (year % 12) {
		      case 0: System.out.println(" monkey for "+year+" year."); break;
		      case 1: System.out.println(" rooster for "+year+" year."); break;
		      case 2: System.out.println(" dog for "+year+ " year. "); break;
		      case 3: System.out.println(" pig for "+year+ " year. "); break;
		      case 4: System.out.println(" rat for "+year+ " year. "); break;
		      case 5: System.out.println(" ox for "+year+ " year. "); break;
		      case 6: System.out.println(" tiger for "+year+ " year. "); break;
		      case 7: System.out.println(" rabbit for "+year+ " year. "); break;
		      case 8: System.out.println(" dragon for "+year+ " year. "); break;
		      case 9: System.out.println(" snake for "+year+ " year. "); break;
		      case 10: System.out.println(" horse for "+year+ " year. "); break;
		      case 11: System.out.println(" sheep for "+year+ " year. "); break;
		      
		    }

	}

}
