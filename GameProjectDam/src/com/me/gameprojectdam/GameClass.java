package com.me.gameprojectdam;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class GameClass implements ApplicationListener {
	private GameController gameController;
	private GameRenderer gameRenderer;
	
	@Override
	public void create() {		
		gameController =  new GameController();
		gameRenderer = new GameRenderer(gameController);
		
	}

	@Override
	public void dispose() {
	
	}

	@Override
	public void render() {		
		gameController.update(Gdx.graphics.getDeltaTime());
		// Establecer el color del fondo de la pantalla y el alpha
		Gdx.gl.glClearColor(0.64f, 0.95f, 0.95f, 1);
		// Limpiar la pantalla
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		// Renderizar
		gameRenderer.render();
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}
