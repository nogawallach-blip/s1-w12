public class NumbersLoops{
    public NumbersLoops(){
      int x = 0;
      while(x<10){
        x++;
        System.out.println(x);
      }
      System.out.println("What is the index now:" + x);

      for(int x1 = 0; x1 < 11; x1++){
        System.out.println(x1);
      
      }
      System.out.println("What is the x1 now:" + x);

    }
  
    public int digitSum(int num){
      int x1 = 0;
      int sum = 0;
      while(x1 <= num){
        sum = sum + x1++;
      }
      return sum; 
    }
  
    public int reverseNum(int num){
      int newNum = 0;
    
      while(num > 0){
        newNum = (newNum *10) + (num % 10);
        num = num / 10;

      }
      return newNum;

    }

    // EX:
    // Start 100, Finish 125
    // returns 3 (101, 111, 121)
    public int palindromeCount(int start, int finish){
      int count = 0;
      for(int x = start; x <= finish; x++){
        if(x== reverseNum(x))
          ++count;

      }
      return count;
    }
  
  
  }
