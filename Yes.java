public class Yes {
  public static void main(String[] args) {
    while(true) {
      String str = "y";	    
      if (args.length > 0) str = args[0];
      System.out.println(str);
    }
  }
}
