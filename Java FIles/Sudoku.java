import java.util.*;
import java.io.*;

/*
 * Solve a Sudoku puzzle using recursion.
 * Set to read in a puzzle from the keyboard in the
 * form of 9 lines of 9 digits each (0 represents
 * empty cell).
 */

public class Sudoku {

	public static void main(String[] args) throws Exception {
		  Scanner fin = new Scanner(System.in);
		  
		  int puzzle[][] = new int[9][9]; for(int i=0;i<9;++i){ for(int j = 0;
		  j < 9; ++j) { puzzle[i][j] = fin.nextInt(); } }
		 /*
		 int[][] puzzle = {{4,0,6,0,7,0,0,0,2},
                 {0,8,0,0,3,2,0,0,0},
                 {0,2,7,0,5,0,0,0,0},
                 {0,0,5,0,0,0,0,3,0},
                 {2,3,0,0,0,0,0,8,4},
                 {0,7,0,0,0,0,6,0,0},
                 {0,0,0,0,2,0,8,9,0},
                 {0,0,0,7,6,0,0,4,0},
                 {7,0,0,0,1,0,5,0,3}};
		 */


		if (solve(0, 0, puzzle)) // solves in place
			writeMatrix(puzzle);
		else
			System.out.println("NONE");
	}

	static boolean solve(int i, int j, int[][] cells) {
		if (i == 9) {
			i = 0;
			if (++j == 9)
				return true;
		}
		if (cells[i][j] != 0) // skip filled cells
			return solve(i + 1, j, cells);

		for (int val = 1; val <= 9; ++val) {
			if (legal(i, j, val, cells)) {
				cells[i][j] = val;
				if (solve(i + 1, j, cells))
					return true;
			}
		}
		cells[i][j] = 0; // reset on backtrack
		return false;
	}

	static boolean legal(int i, int j, int val, int[][] cells) {
		for (int k = 0; k < 9; ++k)
			// row
			if (val == cells[k][j])
				return false;

		for (int k = 0; k < 9; ++k)
			// col
			if (val == cells[i][k])
				return false;

		int boxRowOffset = (i / 3) * 3;
		int boxColOffset = (j / 3) * 3;
		for (int k = 0; k < 3; ++k)
			// box
			for (int m = 0; m < 3; ++m)
				if (val == cells[boxRowOffset + k][boxColOffset + m])
					return false;

		return true; // no violations, so it's legal
	}

	static void writeMatrix(int[][] mat) {
		for (int i = 0; i < 9; ++i) {
			for (int j = 0; j < 9; ++j) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

}
