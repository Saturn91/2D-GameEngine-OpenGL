package game.level;

import org.lwjgl.util.vector.Vector2f;
import org.newdawn.slick.opengl.Texture;

import toolbox.Constants;
import Textures.ModelTexture;
import display.renderer.Loader;
import game.entities.costum.GameObject;
import game.entities.standart.Entity;
import game.entities.standart.RawModel;
import game.entities.standart.TexturedModel;
import game.main.Game;

public class Map {
	
	public Map() {
		
		Loader loader = new Loader();
		RawModel model= loader.loadToVAO(Constants.QuadVerticies(1, 1), Constants.TextureCords(), Constants.QuadIndices());
		ModelTexture texture = new ModelTexture(loader.loadTexture("transparence"));
		TexturedModel staticModel = new TexturedModel(model, texture);
		Entity entity = new Entity(staticModel);
		GameObject.addEntity("Test", entity);
		
		RawModel model2= loader.loadToVAO(Constants.QuadVerticies(1, 1), Constants.TextureCords(), Constants.QuadIndices());
		ModelTexture texture2 = new ModelTexture(loader.loadTexture("StandartTile"));
		TexturedModel staticModel2 = new TexturedModel(model2, texture2);
		Entity entity2 = new Entity(staticModel2);
		GameObject.addEntity("wall", entity2);
		
		Game.addEntity(new GameObject("Test", new Vector2f(-2,-2), 2, 1));
		Game.addEntity(new GameObject("Test", new Vector2f(1,1), 2, 1));
		
		for(int x = 0; x < 25; x++){
			for(int y = 0; y < 25; y++){
				GameObject gameObject = new GameObject("wall", new Vector2f(x, y), 1.0f, 0);
				Game.addEntity(gameObject);
			}
		}
		
		/*
		 * Attention! the order of rendering is very importent
		 */
		
	}
}
