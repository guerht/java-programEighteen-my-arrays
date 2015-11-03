public class myArrays {
  public static void main(String args[]) {
    char ch[] = new char[26];
    int index = 0;
    for(int x=65; x<91; x++) {
      ch[index] = (char) x;
      System.out.println(ch[index]);
      index++;
    }
    for(int i=0; i<ch.length-1;i++) {
      System.out.println(ch[i] + ", ");
    }
    System.out.println(ch[25]);
  }
}
