package com.me.proyectojuegodam;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
 
public class MainMenuScreen implements Screen {
 
  final ProyectoJuegoDam game;
  Rectangle jugar;
  Texture miJugar;
 
	OrthographicCamera camera;
 
	public MainMenuScreen(final ProyectoJuegoDam gam) {
		game = gam;
		
		miJugar = new Texture(Gdx.files.internal("data/jugar.png"));
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 800, 480);
		
		jugar = new Rectangle();
		jugar.x = 144;
		jugar.y = -32;
		jugar.width = 512;
		jugar.height = 512;
		
 
	}
 
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0.168f, 0.168f, 0.168f, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
 
		camera.update();
		game.batch.setProjectionMatrix(camera.combined);
 
		game.batch.begin();
		game.batch.draw(miJugar,jugar.x,jugar.y);
		game.font.draw(game.batch, "Bienvenido a Zombie... DAM", 0, 20);
		game.font.draw(game.batch, "Presiona ENTER para iniciar o Escape para Salir", 800/2-100, 20);
		game.batch.end();
 
		if (Gdx.input.isKeyPressed(66)){
			game.setScreen(new GameScreen(game));
			dispose();
		}
		if (Gdx.input.isKeyPressed(131)){
			
			Gdx.app.exit();
		}
	}
 
	@Override
	public void resize(int width, int height) {
	}
 
	@Override
	public void show() {
	}
 
	@Override
	public void hide() {
	}
 
	@Override
	public void pause() {
	}
 
	@Override
	public void resume() {
	}
 
	@Override
	public void dispose() {
	}
}