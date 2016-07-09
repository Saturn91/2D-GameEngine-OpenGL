package game.level;

import org.lwjgl.util.vector.Vector2f;
import org.newdawn.slick.opengl.Texture;

import toolbox.Constants;
import Textures.ModelTexture;
import display.renderer.Loader;
import game.Game;
import game.entities.costum.GameObject;
import game.entities.costum.tileset.TileSet;
import game.entities.standart.Entity;
import game.entities.standart.RawModel;
import game.entities.standart.TexturedModel;

public class Map {
	
	public Map() {
		
		TileSet tileset = new TileSet("Standart", "TestTileSet", 32, 32);
		
		
		
		for(int x = 0; x < 25; x++){
			for(int y = 0; y < 25; y++){
				Game.addEntity(tileset.getTile(1, 1, new Vector2f(x, y), 1, 1));
			}
		}		
	}
	
	public void cleanUp(){
		Loader.cleanUp();
	}
}
