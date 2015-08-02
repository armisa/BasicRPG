package com.armisa.basicRPG;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;

public class BasicRPG extends Game{
	private Screen startScreen;
	private Screen hubScreen;
	public enum screens{
		START,
		HUB
	};
	
	/**
	 * After initial setup, change immediately to the StartScreen
	 */
	@Override
	public void create () {
		startScreen = new StartScreen(this);
		hubScreen = new HubScreen(this);
		setScreen(startScreen);

	}

	public void changeScreen(screens screen){
		switch(screen){
		case START:
			setScreen(startScreen);
			break;
		case HUB:
			setScreen(hubScreen);
			break;
		default:
			break;
		
		}
	}
}
