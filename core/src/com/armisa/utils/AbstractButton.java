package com.armisa.utils;

import com.armisa.utils.Func;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public abstract class AbstractButton extends Sprite implements Button{

	/**
	 * Calls super constructor of the Sprite class, and sets the origin to the center of the image
	 * associated with the str String
	 * @param str Name of an image stored in the assets folder which will visually represent this button
	 */
	public AbstractButton(String str) {
		super(new Texture(str)); //makes the texture of the button into whatever filepath str goes to
		this.setOriginCenter();
	}

	/**
	 * Calls super constructor of the Sprite class, and sets the origin to the center of the image
	 * associated with the str String.  Sets position to the X,Y coordinated given
	 * @param str Name of an image stored in the assets folder which will visually represent this button
	 * @param x X position of button
	 * @param y Y position of button
	 */
	public AbstractButton(String str, float x, float y) {
		super(new Texture(str)); //makes the texture of the button into whatever filepath str goes to
		this.setOriginCenter();
		this.setPosition(x, y);
	}
	
	/**
	 * Takes in an x and y position for a "press" location of the user's finger, stylus, or cursor.  Calls the
	 * clicked() function if the button is pressed
	 * @param x X position of "press" location
	 * @param y Y position of "press" location
	 */
	public void checkPressed(int x, int y)
	{
		
		if(x > this.getX() && x < this.getX() + this.getWidth())
			if(y < Func.invertY(this.getY()) && y > Func.invertY(this.getY()) - this.getHeight())
				clicked();
		
	}
	
	/**
	 * Takes in an x and y position for a "press" location of the user's finger, stylus, or cursor, as well as
	 * an array of Objects for parameters.  Calls the clicked(Object[] params) function if the button is pressed
	 * @param x X position of "press" location
	 * @param y Y position of "press" location
	 */
	public void checkPressed(int x, int y, Object[] params)
	{
		
		if(x > this.getX() && x < this.getX() + this.getWidth())
			if(y < Func.invertY(this.getY()) && y > Func.invertY(this.getY()) - this.getHeight())
				clicked(params);
		
	}
	
}
