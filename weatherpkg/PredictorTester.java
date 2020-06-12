package weatherpkg;

import java.awt.Dimension;

import javax.swing.JFrame;

public class PredictorTester {

	public static void main(String[] args) {

		layout test = new layout();
		Predictor myPredictor = new Predictor();
		
		//System.out.println(myPredictor.prewind01(8, 8,2016));
		//System.out.println(myPredictor.predictTemp01(8, 8,2016));
		//System.out.println(myPredictor.getDay(new DayStats(8,8,2015)));
		System.out.println(myPredictor.predictDay(8,8,2015));
	    System.out.println(myPredictor.predictAverageDailyTemp(8,8,2015));
		//System.out.println(myPredictor.predictAverageDailyTemps(8,8,2015,10));
	
		
		JFrame frame = new JFrame("Weather Predictor");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(500,360) );
		
		frame.getContentPane().add(test);
		
		frame.pack();
		frame.setVisible(true);
		
		
	}
}
