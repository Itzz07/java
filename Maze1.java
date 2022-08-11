/**
*
*@author Joel Katongo Zimba 2019052725
*/
import java.util.LinkedList;
public class Maze1{
   //The Maze  array
   static int[][] maze1 = {
      {0,1,1,1,0,0,0,1},
      {0,0,0,1,0,1,0,1},
      {1,1,0,1,0,1,0,0},
      {1,1,0,1,0,0,1,0},
      {1,0,0,0,1,0,1,0},
      {0,0,1,0,1,0,1,0},
      {0,1,1,0,0,0,1,1},
      {0,0,0,0,1,0,1,0}
    };
   
   //To link the path of movement
   static LinkedList<Position> path = new LinkedList<Position>();
      
   public static void main(String[] args){
      //The start position
      Position p = new Position(0,0);
      //Adds the current position to the path
      path.push(p);
      
      while(true){
         //Keep track of the current position
         int y = path.peek().y;
         int x = path.peek().x;
         
         maze1[y][x] = 1;
         
         if (maze1[7][x] == 0){
            maze1[7][x] = 2;
         }
         
         //Down movement
         if(isValid(y+1,x)){
            
            if(maze1[y+1][x] == 2){
               System.out.println("Well Done!You're Out Of Maze.");
               return;
            }else if(maze1[y+1][x] == 0){
               System.out.println("Moved Down.");
               path.push(new Position(y+1,x));
               continue;
            }
         }
         
         
         //Right movement
         if(isValid(y,x+1)){  
            
            if(maze1[y][x+1] == 2){
               System.out.println("Well Done!You're Out Of Maze.");
               return;
            }else if(maze1[y][x+1] == 0){
               System.out.println("Move Right.");
               path.push(new Position(y,x+1));
               continue;
            }
         }
         
         //Left movement
         if(isValid(y,x-1)){   
            
            if(maze1[y][x-1] == 2){
               System.out.println("Well Done!You're Out Of Maze.");
               return;
            }else if(maze1[y][x-1] == 0){
               System.out.println("Move Left.");
               path.push(new Position(y,x-1));
               continue;
            }
         }
         
         //Up movement 
         if(isValid(y-1,x)){ 
            
            if(maze1[y-1][x] == 2){
               System.out.print("Well Done!You're Out Of Maze.");
               return;
            }else if(maze1[y-1][x] == 0){
               System.out.println("Moved Up.");
               path.push(new Position(y-1,x));
               continue;
            }
         }
         
         //Goes a step back
         path.pop();
            System.out.println("Moved Back.");
         if(path.size() <= 0){
            System.out.println("No Path");
            return;
         }
            
      }
   }
   
   //Boundary Method of the array
   public static boolean isValid(int y,int x){
      if(y<0 || y >= maze1.length || x<0 || x >= maze1[y].length){
         return false;
      }
      return true;
   }
}

class Position{
   //Column position of the maze array
   public int x;
   //Row position of the maze array
   public int y;
   
   public Position(int y,int x){
      this.x = x;
      this.y = y;
      
   }
}