package com.armisa.basicRPG;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;

public class BasicRPG extends Game{
	private Screen startScreen;
	enum screens{
		START
	};
	
	/**
	 * After initial setup, change immediately to the StartScreen
	 */
	@Override
	public void create () {
		startScreen = new StartScreen(this);
		setScreen(startScreen);

	}

	public void changeScreen(screens screen){
		switch(screen){
		case START:
			setScreen(startScreen);
			break;
		default:
			break;
		
		}
	}
}
