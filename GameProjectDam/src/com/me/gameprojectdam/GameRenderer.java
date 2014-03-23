package com.me.gameprojectdam;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Disposable;

public class GameRenderer implements Disposable{
	private OrthographicCamera camera;
	private SpriteBatch batch;
	private GameController gC;

	public GameRenderer(GameController gC) {
		init();
		this.gC = gC;
	}
	
	public void init(){
		camera = new OrthographicCamera(480,320);
		camera.position.set(0,0,0);
		camera.update();
		
		batch = new SpriteBatch();
		
		
		
	}

	public void render(){
		batch.setProjectionMatrix(camera.combined);
		
		gC.gcCamera.moverCamera(camera);
		
		batch.begin();
			gC.mapa.draw(batch);
			gC.cubo.draw(batch);
		batch.end();
		
		
	}
	public void resize(int width, int height){
		
	}
	
	@Override
	public void dispose(){
		
	}
}
