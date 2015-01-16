package edu.cmu.bic.sbs;

public class Evaluator {
	private float score;
	
	public void calculateScore() {
		score++;
	} 
	
	public float getScore() {
		return score;
	}
	
	public String toString() {
		return "The score is " + score; 
	}
	
	Evaluator() {
		score = 0;
	}
}
