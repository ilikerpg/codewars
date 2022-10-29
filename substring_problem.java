//Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).
public class substring_problem {
     public static boolean solution(String str, String ending) {
    
    
    int SlicingIndex=str.length() - ending.length();
    
    
    String temp=str.substring(SlicingIndex); 
    if(temp.equals(ending)){
      return true;
    }
    return false;
  }
  public static void main(String[] args) {
    String s1="sumo";
    String s2="sumo";
    System.out.println(solution(s1, s2));
    
  }
}
