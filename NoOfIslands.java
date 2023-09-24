import java.util.*;

public class NoOfIslands {
	
    static void DFS(int[][] M, int i, int j, int row, int col) {
		
        if (i < 0 || j < 0 || i > (row - 1) || j > (col - 1) || M[i][j] != 1)
		    return;

		    if (M[i][j] == 1) {
			    M[i][j] = 0;
			    DFS(M, i + 1, j, row, col);
			    DFS(M, i - 1, j, row, col);
			    DFS(M, i, j + 1, row, col);
			    DFS(M, i, j - 1, row, col);
			    DFS(M, i + 1, j + 1, row, col);
			    DFS(M, i - 1, j - 1, row, col);
			    DFS(M, i + 1, j - 1, row, col);
			    DFS(M, i - 1, j + 1, row, col);
		}
	}

	  static int countIslands(int[][] M) {
  		int ROW = M.length;
		  int COL = M[0].length;
		  int count = 0;
		  for (int i = 0; i < ROW; i++) {
  			for (int j = 0; j < COL; j++) {
				  if (M[i][j] == 1) {
  					count++;
					  DFS(M, i, j, ROW, COL);
				  }
			  }
		  }
		  return count;
	  }

	public static void start() {
    System.out.println("Inside Counting Number of Islands");
		int[][] M = { { 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 1 }, { 1, 0, 0, 1, 1 }, { 0, 0, 0, 0, 0 }, { 1, 0, 1, 0, 1 } };
		System.out.print("No. of Islands are => " + countIslands(M));
	}
}
