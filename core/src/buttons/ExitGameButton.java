package buttons;

import com.armisa.utils.AbstractButton;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.Disposable;

/**
 * A button which, when pressed, closes out of the game
 * @author Aaron
 *
 */
public class ExitGameButton extends AbstractButton{

	/**
	 * Calls super constructor of AbstractButton class
	 * @param str Name of an image stored in the assets folder which will visually represent this button
	 */
	public ExitGameButton(String str, float x, float y) {
		super(str, x, y);
	}

	/**
	 * Exits Gdx application and gracefully exits
	 */
	@Override
	public void clicked() {
		
		Gdx.app.exit();
		
		System.exit(0);
		
	}

	/**
	 * Exits disposes any items in the array, exits Gdx application, and gracefully exits
	 */
	@Override
	public void clicked(Object[] params) {
		
		for(Object disp:params){
			if(disp instanceof Disposable){
				((Disposable) disp).dispose();
			}
		}
		
		Gdx.app.exit();
		
		System.exit(0);
		
	}
	
}
