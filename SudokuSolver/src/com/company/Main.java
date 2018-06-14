package com.company;

import com.company.Sudoku;

/**
 * Main class
 * As, it is in another package, it has only the visibility on the Sudoku "API" class
 * This design enforce maintainability as the internals of the Solvers are not externally accessible.
 * 
 * Thus, Sudoku internal classes could evolve, without breaking client compatibility.
 */
public class Main {
	public static void main(String[] args) {
		// Here, input args parsing is possible to enable passing a sudoku as a CLI argument
		// It would have involved to parse 81 Integer and to generate a 9x9 array
		
		//Very hard sudoku (lot of 0)
		final int[][] sudoku = {
			{6,5,9,0,1,0,2,8,0},
			{1,0,0,0,5,0,0,3,0},
			{2,0,0,8,0,0,0,1,0},
			{0,0,0,1,3,5,0,7,0},
			{8,0,0,9,0,0,0,0,2},
			{0,0,3,0,7,8,6,4,0},
			{3,0,2,0,0,9,0,0,4},
			{0,0,0,0,0,1,8,0,0},
			{0,0,8,7,6,0,0,0,0}
		};
		// Print input sudoku
		System.out.println(Sudoku.asString(sudoku));
		// If sudoku sucessfuly solved
		if (Sudoku.solve(sudoku)) {
			//Print solved sudoku
			System.out.println(Sudoku.asString(sudoku));
		}
		
	}
}
