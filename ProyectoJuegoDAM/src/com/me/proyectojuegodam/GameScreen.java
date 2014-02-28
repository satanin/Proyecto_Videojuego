package com.me.proyectojuegodam;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;
 
public class GameScreen implements Screen {
  final ProyectoJuegoDam game;
  	// Declarar variables de todos los assets que vamos a usar
	Texture miFondo;
	Texture miDiana;
	Music backGroundMusic;
	Sound miSound;
	OrthographicCamera camera;
	Rectangle fondo,diana;
	Array<Rectangle> raindrops;

	public GameScreen(final ProyectoJuegoDam gam) {
		// Asigno a mi 
		this.game = gam;
		
		miFondo = new Texture(Gdx.files.internal("data/Gamefondo.jpg"));
		miDiana = new Texture(Gdx.files.internal("data/centro.png"));
		miSound = Gdx.audio.newSound(Gdx.files.internal("data/miSound.mp3"));
		backGroundMusic = Gdx.audio.newMusic(Gdx.files.internal("data/musicafondo.mp3"));
		backGroundMusic.setLooping(true);
 
		// create the camera and the SpriteBatch
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 800, 480);
 
		fondo = new Rectangle();
		fondo.x = -112;
		fondo.y = 0;
		fondo.width = 1024;
		fondo.height = 512;
		
		diana = new Rectangle();
		diana.x = 144;
		diana.y = 0;
		diana.width = 1024;
		diana.height = 512;
	}
 
	@Override
	public void render(float delta) {
		// clear the screen with a dark blue color. The
		// arguments to glClearColor are the red, green
		// blue and alpha component in the range [0,1]
		// of the color to be used to clear the screen.
		Gdx.gl.glClearColor(0.168f, 0.168f, 0.168f, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
 
		// tell the camera to update its matrices.
		camera.update();
 
		// tell the SpriteBatch to render in the
		// coordinate system specified by the camera.
		game.batch.setProjectionMatrix(camera.combined);
		game.batch.begin();
		
		game.batch.draw(miDiana, diana.x, diana.y);
		if(Gdx.input.isTouched()){
			miSound.play();
			game.batch.draw(miFondo, fondo.x, fondo.y);
		}
		game.font.draw(game.batch, "Próximamente en sus Pantallas!!", 800/2-80, 20);

		game.batch.end();
 
	}
 
	@Override
	public void resize(int width, int height) {
	}
 
	@Override
	public void show() {
		// start the playback of the background music
		// when the screen is shown
		backGroundMusic.play();
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
		miFondo.dispose();
		miDiana.dispose();
	}
 
}