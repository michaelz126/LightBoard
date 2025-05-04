public class LightBoard
{
    
 public boolean[][] lights;

 public void setLights(boolean[][] arr)
 {
  lights = arr;
 }
 public LightBoard(int numRows, int numCols)
 { 
    lights = new boolean[numRows][numCols];
    for (int r = 0; r < numRows; r++) {
        for (int c = 0; c < numCols; c++) {
            if (Math.random() < 0.4) lights[r][c] = true; 
        }
    }
  }

 public boolean evaluateLight(int row, int col)
 { 
  int on = 0;
  for (int r = 0; r < lights.length; r++)
  if (lights[r][col]) on++;

  if (lights[row][col] == true && on % 2 == 0) return false;
  if (lights[row][col] == false && on % 3 == 0) return true;
  return lights[row][col];
 }

  public double test() {
    double on = 0;
    for (boolean[] row : lights) {
        for (boolean b : row) {
            if (b) on++;
        }
        
    }
    return on / (lights.length * lights[0].length);
  }
}
