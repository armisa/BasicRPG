package buttons;

import com.armisa.basicRPG.BasicRPG;
import com.armisa.utils.AbstractButton;

public class PlayGameButton extends AbstractButton{

	/**
	 * The button to start the game
	 * @param str Name of the image file to represent this button
	 * @param x X location of the button
	 * @param y Y location of the button
	 */
	public PlayGameButton(String str, float x, float y) {
		super(str, x, y);
	}

	/**
	 * Should never get called.  Game exits in error state, as access to the Opening screen is required
	 * for the functionality of this button
	 */
	@Override
	public void clicked() {
		
		System.exit(1);
		
	}

	/**
	 * Takes the user to the Opening screen.  If BasicRPG is not in index 0 of params, exit in error state
	 * @param params Holds the BasicRPG object in index 0
	 */
	@Override
	public void clicked(Object[] params) {
		Object game = params[0];
		if(game instanceof BasicRPG){
			((BasicRPG) game).changeScreen(BasicRPG.screens.HUB);
		} else{
			System.exit(1);
		}
		
	}

}
