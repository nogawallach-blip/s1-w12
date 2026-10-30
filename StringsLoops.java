public class StringsLoops{
    public StringsLoops(){
  
    }
  
    public int length(String s){
      int count = 0;
      while(!s.equals("")){
        s = s.substring(1);
        count++;
            }
      return count;
    }
  
    public String copy(String s, int num){
      int count = 0;
      String b = "";
      while(count <= num){
        b += s;
        count++;
      }
      return b;
    }
  
    public String interweaving(String s1, String s2){
      String s = "";
      for(int i = 0; i < s1.length(); i++){
        s += s1.substring(i, i+1) + s2.substring(i, i+1);

      }
      return s;
    }
  
  
  }