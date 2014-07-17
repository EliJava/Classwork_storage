package tetris;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Figure {

	
	
	static final int[][] FIGURE_I = {
		{0, 1, 0, 0},
		{0, 1, 0, 0},
		{0, 1, 0, 0},
		{0, 1, 0, 0},
	};
	static final int[][] FIGURE_L = {
		{0, 1, 0, 0},
		{0, 1, 0, 0},
		{0, 1, 1, 0},
		{0, 0, 0, 0},
	};
	static final int[][] FIGURE_Z = {
		{0, 0, 0, 0},
		{0, 1, 1, 0},
		{0, 0, 1, 1},
		{0, 0, 0, 0},
	};
	static final int[][] FIGURE_T = {
		{0, 0, 0, 0},
		{0, 1, 1, 1},
		{0, 0, 1, 0},
		{0, 0, 0, 0},
	};
	static final int[][] FIGURE_O = {
		{0, 0, 0, 0},
		{0, 1, 1, 0},
		{0, 1, 1, 0},
		{0, 0, 0, 0},
	};
	
	static int[][] rotate(int[][] data){
		//rotate 90 degrees counter-clockwise
		//homework
		int[][] newdata = new int[4][4];
		return newdata;
	}
	
	static int[][] flip(int[][] data){
		//flip around vertical axis
		//homework
		int[][] newdata = new int[4][4];
		for (int i = 0; i < newdata.length; i++) {
			for (int j = 0; j <  newdata[0].length; j++) {
				if(data[i][3 - j] == 1){
					newdata[i][j] = 1;
				}
			}
		}
		return newdata;
	}
	
	static List<int[][]> figureData = new ArrayList<int[][]>(19);
	
	static{
		figureData.add(FIGURE_L);
		figureData.add(FIGURE_L);
		figureData.add(FIGURE_L);
		figureData.add(FIGURE_L);
		figureData.add(FIGURE_L);
		figureData.add(FIGURE_L);
		figureData.add(FIGURE_L);
		figureData.add(FIGURE_L);

		figureData.add(FIGURE_Z);
		figureData.add(FIGURE_Z);
		figureData.add(FIGURE_Z);
		figureData.add(FIGURE_Z);
		
		figureData.add(FIGURE_T);
		figureData.add(FIGURE_T);
		figureData.add(FIGURE_T);
		figureData.add(FIGURE_T);
		
		figureData.add(FIGURE_I);
		figureData.add(FIGURE_I);
		
		figureData.add(FIGURE_O);
		//replace with rotations and flips
	}
	
	static Random random = new Random();
	
	public int[][] data = new int[4][4];
	
	private Figure(){
		
	}

	public static Figure randomFigure() {
		Figure figure = new Figure();
		
		int[][] data = figureData.get(random.nextInt(figureData.size()));
		figure.data = data;
		return figure;
	}
}
