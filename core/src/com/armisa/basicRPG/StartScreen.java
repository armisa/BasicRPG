package com.armisa.basicRPG;

import java.util.ArrayList;

import buttons.ExitGameButton;

import com.armisa.utils.AbstractButton;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * The opening screen containing basic START, LOAD, and EXIT options
 * @author Aaron
 *
 */
public class StartScreen implements Screen, InputProcessor{
	
	private BasicRPG game;
	private SpriteBatch batch;
	private ArrayList<AbstractButton> buttons = new ArrayList<AbstractButton>();
	private Texture background;
	
	/**
	 * The opening screen containing basic START, LOAD, and EXIT options
	 * @param game Reference to the game object, to help change screens
	 */
	public StartScreen(BasicRPG game){
		this.game = game;
		batch = new SpriteBatch();
		buttons.add(new ExitGameButton("exitButton.png", 100f, 100f));
		background = new Texture("background.png");
	}
	
	@Override
	public void show() {
		
		Gdx.input.setInputProcessor(this);
		
	}

	@Override
	public void render(float delta) {
		
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(background, 0, 0);
		for(AbstractButton button: buttons){
			button.draw(batch);
		}
		batch.end();
		
	}
	
	/**
	 * if the user touches somewhere on screen, check if a button was pressed, and call its
	 * click handler if so
	 */
	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		for(AbstractButton b : buttons){
			b.checkPressed(screenX, screenY, new Object[]{this});
		}
		return true;
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean keyDown(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
