public class BlackBoxTest {

    public static void main(String[] args) {
        BlackBox b = new BlackBox();

        int result = b.findIndexOfLetter("witch", "t");
        int result1 = b.findIndexOfLetter("witch", "h");
        int result2 = b.findIndexOfLetter("witch", "w");

        System.out.println("result: " + result + " result1: " + result1 + " result2: " + result2);

    }
    
}
