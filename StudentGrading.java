public class StudentGrading{
  public static void main(String[] args) {   
 
    char[][] grade = {{'A','D','D','C'},{'A','A','C','B'},{'D','B','C','D'}};
    char[] key = {'A','D','C','B'};
    
   
    for (int i = 0; i < grade.length; i++) {
    
      System.out.println("\nStudents " + i +"'s result:");
      
      int total = 0; 
      for (int j=0; j < grade[i].length; j++) {
          
        if (key[j] == grade[i][j]) {
           System.out.println(grade[i][j] + " is correct" );
           total++;
           }else{
           System.out.println(grade[i][j] + " is wrong");
           }
       }
       System.out.println("total correct = " + total);

   }
  } 
}