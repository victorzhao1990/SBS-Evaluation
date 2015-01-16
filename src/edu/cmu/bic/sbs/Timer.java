package edu.cmu.bic.sbs;

/**
 * The Timer Class
 * @author Victor Zhao <xinyunzh@andrew.cmu.edu>
 *
 */
public class Timer {
	// The time has two field, one is start offset, the other 
	// is the end offset.
	private float[] offset;
	
	public float[] getTime() {
		return offset;
	}
	
	public void setTime(float start, float end) {
		offset[0] = start;
		offset[1] = end;
	}
	
	Timer() {
		offset = new float[2];
	}
}
