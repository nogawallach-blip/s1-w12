public class BlackBox {
    public int findIndexOfLetter(String word, String letter){
        for(int count = 0; count < word.length(); count++){
            if(word.substring(count, count+1).equals(letter))
                return count;
        }
        return -1;
    }
    
}
