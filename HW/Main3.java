public class Main3 {
  public static void main(String[] args) {
    String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    
  
    String bestCase = "A";

    
    long startTime1 = System.nanoTime();
    int index = match(text, bestCase);
    long endTime1 = System.nanoTime();
    long elapsedTime1 = endTime1 - startTime1;

    if (index >= 0)
        System.out.println("best-case input matched at index " + index);
    else
        System.out.println("best-case input unmatched");   
        System.out.println("Best case time: " + elapsedTime1 + " ns");

    String worstCase = "9";
    
    
    long startTime2 = System.nanoTime();
    index = match(text, worstCase);
    long endTime2 = System.nanoTime();
    long elapsedTime2 = endTime2 - startTime2;
    
    if (index >= 0)
      System.out.println("worst-case input matched at index " + index);
    else
      System.out.println("worst-case input unmatched");  
      
    System.out.println("Worst case time: " + elapsedTime2 + " ns");
}

  public static int match(String text, String pattern) {
    for (int i = 0; i < text.length() - pattern.length() + 1; i++) {
      if (isMatched(i, text, pattern))
        return i;}
        return -1;}
  
 
  private static boolean isMatched(int i, String text, 
      String pattern) {
    for (int k = 0; k < pattern.length(); k++) {
      if (pattern.charAt(k) != text.charAt(i + k)) {
        return false;}}
    
    return true; }}