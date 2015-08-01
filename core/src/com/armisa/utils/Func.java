package com.armisa.utils;

import com.badlogic.gdx.Gdx;

public class Func {

	static String[] motivationalPhrases;
	
	/**
	 * flips the y coordinates (sometimes needed)
	 * @param y - y coordinate to flip
	 * @return flipped Y value
	 */
	public static int invertY(float y)
	{
		
		return (int) (Gdx.graphics.getHeight()-y);
		
	}
}
