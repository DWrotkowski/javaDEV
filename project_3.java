import java.util.Scanner;

public class Entry {
	
	private static Scanner scan = new Scanner(System.in);
   
	public static void main(String[] args) {
		//Main Menu
		System.out.print("\n");
		System.out.print("--------------------------------- \n");
		System.out.print("What do want to do? \n");
		System.out.print("----------------------- \n");
		System.out.print("calculator \n");
		System.out.print("result \n");
		System.out.print("calculator_2\n");
		System.out.print("result_2\n");
		System.out.print("Flowcharts\n");
		System.out.print("BlackJack\n");
		System.out.print("UniqueSum\n");
		System.out.print("Taxes\n");
		System.out.print("FizzBuzz\n");
		System.out.print("Primary_Number\n");
		System.out.print("Geater_Number\n");
		System.out.print("Rice_Bags\n");
		System.out.print("Numbers\n");
		System.out.print("Numbers_2\n");
		System.out.print("char\n");
		System.out.print("NR\n");
		
		System.out.print("--------------------------------- \n");
		String menu = scan.next();
		System.out.print("--------------------------------- \n");
		
		 switch (menu) {
	      case "calculator":
	        calc();

	      case "result":
	    	  res();
	      case "calculator_2":
	    	  calc2();
	      case "result_2":
	    	  res2();
	      case "Flowcharts":
	    	  flow();
	    	  System.out.print("--------------------------------- \n");
	    	  flow_2();
	      case "BlackJack":  
	    	  BlackJack();
	      case "UniqueSum":  
	    	  UniqueSum();	
	      case "Taxes":    
	    	  Taxes_1();
	    	  System.out.print("--------------------------------- \n");
	    	  Taxes_2();
	      case "FizzBuzz":   
	    	  FB() ;
	      case "Primary_Number":    
	    	  PM();
	      case "Geater_Number":    
	    	  GN();
	      case "Rice_Bags":    
	    	  rice();
	      case "Numbers":   
	    	  Numbers_1();
	      case "Numbers_2":     
	           Numbers_2();
	      case "char":     
	           chart();
	      case "NR":     
	           NR();
	    	  
	      default:
	        System.out.print("Wrong choice!\n");
	        System.out.print("--------------------------------- \n");
	        main(args);
		 }
	}
		
		

		
    public static void calc() {
    //Calculator
	System.out.print("plese enter a \n");
	int a = scan.nextInt();
	
	System.out.print("plese enter oprator(+ - * /) \n");
	String c = scan.next();
	System.out.print("plese enter b \n");
	int b = scan.nextInt();
	double answer;

    switch (c) {
      case "+":
        answer = a + b;
        break;

      case "-":
          answer = a - b;
        break;
        
      case "*":
          answer = a * b;
        break;

      case "/":
          answer = a / b;
        break;

      default:
        System.out.print("Wrong operator!");
        return;
    }

	System.out.print(answer + "\n");
	System.out.print("--------------------------------- \n");
	main(null);
	

	}
    
    public static void res() {
    	//Results
    	System.out.print("WELCOME TO RESULT CALCULATOR \n");
    	System.out.print("--------------------------------- \n");
    	System.out.print("What did you get from Phycis?(up to 150 score) \n");
    	int Physics = scan.nextInt();
    	System.out.print("What did you get from Chemistry?(up to 150 score) \n");
    	int Chemistry = scan.nextInt();
    	System.out.print("What did you get from Biology?(up to 150 score) \n");
    	int Biology = scan.nextInt();
    	
    	int Result = Physics +  Chemistry + Biology;
    	
    	double totalResult = ((Physics +  Chemistry + Biology) * 100) / 450; 
    	
    	System.out.print("--------------------------------- \n");
    	
    	System.out.print("Physics: " + Physics + "\n");
    	System.out.print("Chemistry: " + Chemistry + "\n");
    	System.out.print("Biology: " + Biology  + "\n");
    	System.out.print("Result: " + Result + "\n");
    	System.out.print("Percentage: " + totalResult + "%" + "\n");
    	System.out.print("--------------------------------- \n");
    	main(null);
    	
    }
    
    public static void calc2() {
        //Calculator 2
    	System.out.print("plese enter a \n");
    	int a = scan.nextInt();
    	
    	System.out.print("plese enter oprator(+ - * /) \n");
    	String c = scan.next();
    	System.out.print("plese enter b \n");
    	int b = scan.nextInt();
    	double answer ;

        switch (c) {
          case "+":
            answer = a + b;
            break;

          case "-":
              answer = a - b;
            break;
            
          case "*":
              answer = a * b;
            break;

          case "/":
        	  if ( a < b) {
        		   answer = a / b;
        	  }
        	  else{ System.out.print("that the division cannot be performed.");
        	  }
       

          default:
            System.out.print("Wrong operator! \n");
            return;
        }

    	System.out.print(answer + "\n");
    	System.out.print("--------------------------------- \n");
    	main(null);
    	

    	}
    public static void res2() {
    	//Results
    	System.out.print("WELCOME TO RESULT CALCULATOR \n");
    	System.out.print("--------------------------------- \n");
    	System.out.print("What did you get from Phycis?(up to 150 score) \n");
    	int Physics = scan.nextInt();
    	System.out.print("What did you get from Chemistry?(up to 150 score) \n");
    	int Chemistry = scan.nextInt();
    	System.out.print("What did you get from Biology?(up to 150 score) \n");
    	int Biology = scan.nextInt();
    	
    	int Result = Physics +  Chemistry + Biology;
    	double totalResult = ((Physics +  Chemistry + Biology) * 100) / 450; 
    	
    	System.out.print("--------------------------------- \n");
    	
    	System.out.print("Physics: " + Physics + "\n");
    	System.out.print("Chemistry: " + Chemistry + "\n");
    	System.out.print("Biology: " + Biology  + "\n");
    	System.out.print("Result: " + Result + "\n");
    	System.out.print("Percentage: " + totalResult + "%" + "\n");
    	System.out.print("--------------------------------- \n");
    	
    	
    	double Physics2 = (Physics * 100) / 150; 
    	double Chemistry2 = (Chemistry * 100) / 150; 
    	double Biology2 = ( Biology * 100) / 150; 

    	
    	int options = 0;
    	
    	if (Physics2 > 60) {
    		options = 1;
    	} else {options = 2;
    			}
    	
    	switch(options) {
    	
    	 case 1:
    		 System.out.print("Physic - SCORE: " + Physics2 +  "RESULT: PASS \n");

             break;
             
    	 case 2:
    		 System.out.print("Physic - SCORE: " + Physics2 +  "RESULT: FAIL \n");
             break;
    	}
    	
    	if (Chemistry2 > 60) {
    		options = 1;
    	} else {options = 2;
    			}
    	
    	switch(options) {
    	
    	 case 1:
    		 System.out.print("Chemistry - SCORE: " + Chemistry2 + "RESULT: PASS \n");

             break;
             
    	 case 2:
    		 System.out.print("Chemistry - SCORE: " + Chemistry2 + "RESULT: FAIL \n");
             break;
    	}
    	
    	if (Biology2 > 60) {
    		options = 1;
    	} else {options = 2;
    			}
    	
    	switch(options) {
    	
   	 case 1:
   		 System.out.print("Chemistry - SCORE: " + Biology2 + "RESULT: PASS \n");

            break;
            
   	 case 2:
   		 System.out.print("Chemistry - SCORE: " + Biology2 + "RESULT: FAIL \n");
            break;
   	}
    	
    	
    	if ((totalResult > 60) && (Physics2 > 60) && (Chemistry2 > 60) && (Biology2 > 60)) {
    		options = 1;
    	} else {options = 2;
    			}
    	
    	switch(options) {
    	
    	 case 1:
    		 System.out.print("Total Result - SCORE: " + totalResult + "RESULT: PASS \n");

             break;
             
    	 case 2:
    		 System.out.print("Total Result - SCORE: " + totalResult + "RESULT: FAIL \n");
             break;
            

    	}

    	main(null);
    	
    	 
    }
    public static void flow() {
    	
    	System.out.print("plese enter a \n");
    	int a = scan.nextInt();
    	System.out.print("plese enter b \n");
    	int b = scan.nextInt();
    	System.out.print("plese enter true or false \n");
    	boolean c = scan.nextBoolean();
    	int r;

    	if(c == true) {
    		r = a + b;
    	} else {
    		r = a * b;
    		
    	}
    	System.out.print(r);
    		 
    	 }
    public static void flow_2() {
    	System.out.print("plese enter a \n");
    	int a = scan.nextInt();
    	
    	if(a > 2000) {
    		System.out.print("A\n");
    		if(a > 6000) {
        		System.out.print("C\n");
        		main(null);
        	} else {
        		System.out.print("B\n");
        		if(a > 4000) {
            		System.out.print("D\n");
            		main(null);
            	} else {
            		System.out.print("E\n");
            		main(null);
            	}
        	}
        	
    	} else {
    		System.out.print("1\n");
    		if(a > 100) {
        		System.out.print("3\n");
        		if(a > 600) {
            		System.out.print("5\n");
            		main(null);
            	} else {
            		System.out.print("4\n");
            		if(a > 500) {
                		System.out.print("6\n");
                		main(null);
                	} else {
                		System.out.print("7\n");
                		main(null);
                	}
            	}
        		
        	} else {
        		System.out.print("2\n");
        		main(null);
        	}

    	}


    }
    
    public static void BlackJack() {
    	System.out.print("plese enter a \n");
    	int a = scan.nextInt();
    	System.out.print("plese enter b \n");
    	int b = scan.nextInt();
    	
    	if (a == 0 || b == 0 ) {
    		System.out.print("number cannot be zero");
    		 BlackJack();
    	} else if (a > b && !(a >= 21)) {
    		System.out.print(a);
    	}else if (a < b && !(b >= 21)) {
    		System.out.print(b);
    	} else {
    		System.out.print("0\n");
    	}
    	main(null);
    		
    	
    	
    }
    public static void UniqueSum() {
    	System.out.print("plese enter a \n");
    	int a = scan.nextInt();
    	System.out.print("plese enter b \n");
    	int b = scan.nextInt();
    	System.out.print("plese enter c \n");
    	int c = scan.nextInt();
    	
    	if (a == b && a == c && c == b )  {
    		System.out.print("0\n");
    	} else if (a == b  )
    	{
    		System.out.print(c);
    	} else if (a == c )
    	{
    		System.out.print(b);
    	} else if (b == c )
    	{
    		System.out.print(a);
    	} else {
    		int r = a + b + c;
    		System.out.print(r);
    	}

    }
    public static void Taxes_1() {
    	System.out.print("plese enter a \n");
    	int a = scan.nextInt();
    	int tax = 0;
    	if (a <= 14999) {
    		tax = 1;
    		System.out.print(" 0% tax");
    	}else if (a <= 19999 )
    	{
    		tax = 2;
    		System.out.print(" 10% tax");
    	}else if (a <= 29999 )
    	{
    		tax = 3;
    		System.out.print(" 15% tax");
    	}else if (a <= 44999 )
    	{
    		tax = 4;
    		System.out.print(" 20% tax");
    	}else if (a <= 45000 )
    	{
    		tax = 5;
    		System.out.print(" 25% tax");
    	}
    }
    public static void Taxes_2() {
    	System.out.print("plese enter a \n");
    	int a = scan.nextInt();
    	int tax = 0;
    	if (a <= 14999) {
    		tax = 1;
    		System.out.print(" 0% tax. ");
    	}else if (a <= 19999 )
    	{
    		tax = 2;
    		System.out.print(" 10% tax. ");
    	}else if (a <= 29999 )
    	{
    		tax = 3;
    		System.out.print(" 15% tax. ");
    	}else if (a <= 44999 )
    	{
    		tax = 4;
    		System.out.print(" 20% tax. ");
    	}else if (a <= 45000 )
    	{
    		tax = 5;
    		System.out.print(" 25% tax. ");
    	}
    	
    	double b = 0;
    	switch(tax) {
    	case 1:
    		 b = 0;
    		System.out.print("Tax amount: " + b);
    		  break;
    	case 2:
    		 b = a * 0.10; 
    		System.out.print("Tax amount: " + b);
    		  break;
    	case 3:
    		 b = a * 0.15; 
    		System.out.print("Tax amount: " + b);
    		  break;
    	case 4:
    		b = a * 0.20; 
    		System.out.print("Tax amount: " + b);
    		  break;
    	case 5:

    		b = a * 0.25; 
    		System.out.print("Tax amount: " + b);
    		  break;
    	
    	}
    	main(null);
    }
    public static void FB() {
    	System.out.print("plese enter a \n");
    	int a = scan.nextInt();
    	
    	if ((a % 3 == 0 ) && (a % 5 == 0 ))
    	{
    		System.out.print("FIZZBUZZ");
    	}
    	else if (a % 3 == 0 ) 
    	{
    		System.out.print("FIZZ");
    	}
          else if (a % 3 == 0 ) 
	    {
		System.out.print("FIZZ");
	    }
          else if (a % 5 == 0 ) 
          {
        	  System.out.print("BUZZ");
          }
          else {
        	  System.out.print(a);
          }
    	main(null);

    }
    public static void PM() {
    	
    	System.out.print("plese enter a \n");
    	int a = scan.nextInt();
    	
        boolean check = false;
   
          if (a % 2 == 0) {
        	  check = true;
          }
        

        if (!check) {
        	 System.out.println("It is prime number.");
        }
        else {
          System.out.println("Is not a prime number.");
        }
        main(null);
      }
       
  public static void GN() {
    	
    	System.out.print("plese enter a \n");
    	int a = scan.nextInt();
    	
    	System.out.print("plese enter a \n");
    	int b = scan.nextInt();
    	
    	int c;
    	if ( a > b) {
    		c = (a + b)/a;
    	}else {
    		c = (a+ b)/b;
    	}
      	System.out.print(c);	
	
       
      	
      }
  public static void rice() {
  	System.out.print("plese enter KG\n");
  	int a = scan.nextInt();
  	
  	if ((a % 3 == 0 ) && (a % 5 == 0 ))
  	{
  		System.out.print("true");
  	}
  	else if (a % 3 == 0 ) 
  	{
  		System.out.print("true");
  	}
        else if (a % 3 == 0 ) 
	    {
		System.out.print("true");
	    }
        else if (a % 5 == 0 ) 
        {
      	  System.out.print("true");
        }
        else {
      	  System.out.print("false");
        }
  	main(null);

  }
  
  public static void Numbers_1() {
	  System.out.print("plese enter number fron 10-99\n");
	  	int a = scan.nextInt();
	  	int b = a / 10;
	  	int c = a % 10;
	  	int d = b + c;
	  	
	  	System.out.print(d+ "\n");
	  	
	  	

	  	
  }
  
  public static void Numbers_2() {
	  System.out.print("plese enter number fron 1-9999\n");
	  	int a = scan.nextInt();

	  	int b = a;
	  	 int c = 0;
	  	
	  	if(a<10){
	  		NW(a);
	  		main(null);
	  	} else if((a >= 10)  && (a < 13)) {
	  		NW_2(a);
	  		main(null);
	  		
	  	} else if((a >= 13)  && (a <= 19)) {
		  	  a = a % 10;
		  	  NW_3(a);
		  	  System.out.print("teen") ;
	  		main(null);
	  		
	  		
	  		
	  	}else if((a >= 20)  && (a <= 99)) {
               a = a / 10;
               c = a;
		  	  NW_3(a);
		  	  System.out.print("ty ") ;
		  	  a = b - (c * 10);
		  	   a = a % 10;
		  	   NW(a);
	  		main(null);
	  		
	  		
	  		
	  	}else if((a >= 100)  && (a <= 999)) {
	  		a = a / 100;
	  		 c = a;
		  	  NW(a);
		  	  System.out.print("hundred  ") ;
		  	  a = b - (c * 100);
            a = a / 10;
            c = a;
		  	  NW_3(a);
		  	  System.out.print("ty ") ;
		  	  a = b - (c * 10);
		  	   a = a % 10;
		  	   NW(a);
	  		main(null);
	  	}
	  	else if((a >= 1000)  && (a <= 9999)) {
      
	  		a = a / 1000;
	  		 c = a;
		  	  NW(a);
		  	  System.out.print("thousand  ") ;
		  	 a = b - (c * 1000);
	  		 a =  a/ 100;
	  		 c = a;
		  	  NW(a);
		  	  System.out.print("hundred  ") ;
		  	a = b - (c * 100);
            a = a / 10;
            c = a;
		  	  NW_3(a);
		  	  System.out.print("ty ") ;
		  	  a = b - (c * 10);
		  	   a = a % 10;
		  	   NW(a);
	  		main(null);
	  	}
	  	
	  	
	  		
	  	}
  
  private static int NW(int a ) {
	  	switch (a) {
	  	case 1:
	  	      System.out.print("one");
	  	      break;
        case 2:
          	  System.out.print("two");
          	break;
        case 3:
        	  System.out.print("three");
        	  break;
        case 4:
        	  System.out.print("four");
        	  break;
        case 5:
        	  System.out.print("five");
        	  break;
        case 6:
        	  System.out.print("six");
        	  break;
        case 7:
        	  System.out.print("seven");
        	  break;
        case 8:
        	  System.out.print("eight");
        	  break;
        case 9:
        	  System.out.print("nine");
        	  break;
        case 0:
        	  System.out.print("");
        	  break;
  	}
		return a;

	  	
  }
  private static int NW_2(int a ) {
	  	switch (a) {
	  	case 10:
	  	      System.out.print("ten");
	  	      break;
      case 11:
        	  System.out.print("eleven");
        	  break;
      case 12:
      	  System.out.print("twelve");
      	  break;
      
	}
	  	return a;
	  	
}
  private static int NW_3(int a ) {
	  	switch (a) {
	  	case 1:
	  	      System.out.print("");
	  	      break;
      case 2:
        	  System.out.print("twenty");
        	  break;
      case 3:
      	  System.out.print("thir");
      	  break;
      case 4:
      	  System.out.print("four");
      	  break;
      case 5:
      	  System.out.print("fif");
      	  break;
      case 6:
      	  System.out.print("six");
      	  break;
      case 7:
      	  System.out.print("seven");
      	  break;
      case 8:
      	  System.out.print("eight");
      	  break;
      case 9:
      	  System.out.print("nine");
      	  break;
      case 0:
      	  System.out.print("");
      	  break;
	}
  return a;

  }    
  
  public static void chart() {
	  boolean playing = true;
	 
	  for(int i = 100; i > 200; i++) {
          System.out.println(i);
      }
	  
	 do  {
		  int b = 100;
		  if(b%2 == 0) {
			  System.out.println("-");	  
          b++;
		  } else {
			  System.out.println("=");	 
		  b++;
		  }
		  
          if (!(b <= 200)) {
              playing = false;
          }
      } while(playing);
	 
	 
	 for(int i = 1; i > 10; i++) {
		 for(int b = 1; b > 10; b++) {
         System.out.println(i);
     }
		 
		 for(int c = 100; c > 200 ;) {
			 if(c%2 == 0) {
				  System.out.println("-");	  
	          c++;
			  } else {
				  System.out.println("=");	 
			  c++;
			  }
			 
			 
		 }
   
  }
	 int v = 6;
	 switch (v) {
	  	case 1:
	  		 for(v = 1; v > 1; v++) {
	  	      System.out.print(v);
	  		 }
	  	      break;
   case 2:
	   for(v = 1; v > 2; v++) {
	  	      System.out.print(v);
	  		 }
   case 3:
	   for(v = 1; v > 3; v++) {
	  	      System.out.print(v);
	  		 }
   	  break;
   case 4:
	   for(v = 1; v > 4; v++) {
	  	      System.out.print(v);
	  		 }
   	  break;
   case 5:
	   for(v = 1; v > 5; v++) {
	  	      System.out.print(v);
	  		 }
   	  break;
   case 6:
	   for(v = 1; v > 6; v++) {
	  	      System.out.print(v);
	  		 }
   	  break;
   case 7:
	   for(v = 1; v > 7; v++) {
	  	      System.out.print(v);
	  		 }
   	  break;
   case 8:
	   for(v = 1; v > 8; v++) {
	  	      System.out.print(v);
	  		 }
   	  break;
   case 9:
	   for(v = 1; v > 9; v++) {
	  	      System.out.print(v);
	  		 }
   	  break;
   case 0:
	   for(v = 1; v > 10; v++) {
	  	      System.out.print(v);
	  		 }
   	  break;
	}
	 
	 
     }
  public static void NR() {
	  
	  
	  System.out.print("plese enter number fron 1-99\n");
	  	int f = scan.nextInt();
	   
	  	for(int d = 1; d <= f; d++) {
	  	 System.out.print( "\n " + d + "- ");
	  	int a = d;
	  	int b = a;
	  	 int c = 0;
	  	
	  	if(a<10){
	  		NW(a);
	  	} else if((a >= 10)  && (a < 13)) {
	  		NW_2(a);
	  		
	  		
	  	} else if((a >= 13)  && (a <= 19)) {
		  	  a = a % 10;
		  	  NW_3(a);
		  	  System.out.print("teen") ;
	  		
	  		
	  		
	  		
	  	}else if((a >= 20)  && (a <= 99)) {
             a = a / 10;
             c = a;
		  	  NW_3(a);
		  	  System.out.print("ty ") ;
		  	  a = b - (c * 10);
		  	   a = a % 10;
		  	   NW(a);
	  		
	  		
	  		
	  		
	  	}else if((a >= 100)  && (a <= 999)) {
	  		a = a / 100;
	  		 c = a;
		  	  NW(a);
		  	  System.out.print("hundred  ") ;
		  	  a = b - (c * 100);
          a = a / 10;
          c = a;
		  	  NW_3(a);
		  	  System.out.print("ty ") ;
		  	  a = b - (c * 10);
		  	   a = a % 10;
		  	   NW(a);
	  		
	  	}
	  	}
	  	main(null);
	  
  }
	  	
  public static void COIN() {
	  	System.out.print("plese enter COST\n");
	  	double b = scan.nextInt();

	  	System.out.print("plese enter amount\n");
	  	int c = scan.nextInt();
	  	
	  	double a = c - b;
	  	double e = a;
	  	
	  	//41  2 x 20 + 1
	  	
	  	if (a >= 20) {;
	  		a = a % 20;
	  		a = c;
	  		System.out.print("20 pounds: " + a);
	  	}
	  	if (a >= 10) {
	  		b = e - (c * 20);
	  		a = a % 10;
	  		a = c;
	  	}
	  	if (a >= 5) {
	  		a = a % 5;
	  		a = c;
	  	}
	  	if (a >= 2) {
	  		a = a % 10;
	  		a = c;
	  	}
	  	if (a >= 1) {
	  		a = a % 1;
	  		a = c;
	  	}
	  	if (a >= 0.5) {
	  		a = a % 0.5;
	  		a = c;
	  	}
	  	if (a >= 0.2) {
	  		a = a % 0.2;
	  		a = c;
	  	}
	  	if (a >= 0.1) {
	  		a = a % 0.1;
	  		a = c;
	  	}
	  	
  }

}
