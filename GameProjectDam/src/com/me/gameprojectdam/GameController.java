package com.me.gameprojectdam;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.utils.Array;

public class GameController extends InputAdapter {
	private Pixmap plataforma;
	public Texture textura,textura2,textura3;
	public Sprite cubo,platStatic1,platStatic2,mapa;
	public GameCamera gcCamera;
	public TextureAtlas miTextureAtlas;
	public Array<Sprite> misSprites; 

	public GameController() {
		this.init();
	}
	
	public void init(){
		this.initPlataformas();	
		gcCamera = new GameCamera();
		gcCamera.setSprite(cubo);
		Gdx.input.setInputProcessor(this);
	}
	
	public void update(float deltaTime){
		hldKeys(deltaTime);
		gcCamera.update();
		
	}
	
	private void initPlataformas(){
		
		miTextureAtlas = new TextureAtlas("./data/textureAtlas.txt");
		misSprites = miTextureAtlas.createSprites();
//		
//		plataforma = new Pixmap(32,32,Format.RGBA8888);
//		
//		plataforma.setColor(1f,0f,0f,1f);
//		plataforma.fill();
//		plataforma.setColor(1f,1f,0f,1f);
//		plataforma.drawLine(0,0,32,32);
//		plataforma.drawLine(32,0,0,32);
//		plataforma.setColor(0,1,1,1);
//		plataforma.drawRectangle(0, 0, 32, 32);
		
		
		
//		textura = new Texture(plataforma);
		//cubo = new Sprite(textura);
		mapa = misSprites.get(0);
		mapa.setPosition(-465, 50);
		cubo = misSprites.get(2);
		cubo.setPosition(0, 0);
//		plataforma.dispose();
		createPixmapsDebug();
	}
	
	private void hldKeys(float deltaTime){
		float moveSpeed = 100*deltaTime;
		if(Gdx.input.isKeyPressed(Keys.A)|Gdx.input.isKeyPressed(Keys.LEFT)){
			moveCube(-moveSpeed,0);			
		}
		if(Gdx.input.isKeyPressed(Keys.W)|Gdx.input.isKeyPressed(Keys.UP)){
			moveCube(0,moveSpeed);
		}
		if(Gdx.input.isKeyPressed(Keys.S)|Gdx.input.isKeyPressed(Keys.DOWN)){
			moveCube(0,-moveSpeed);
		}
		if(Gdx.input.isKeyPressed(Keys.D)|Gdx.input.isKeyPressed(Keys.RIGHT)){
			moveCube(moveSpeed,0);
		}
	}
	
	private void createPixmapsDebug(){
		
		plataforma = new Pixmap(32,32,Format.RGBA8888);
		plataforma.setColor(0f,0f,0f,1f);
		plataforma.fill();
		plataforma.setColor(1f,1f,0f,1f);
		plataforma.setColor(0,1,1,1);
		plataforma.drawRectangle(0, 0, 32, 32);
		
		textura2 = new Texture(plataforma);
		platStatic1 = new Sprite(textura2);
		platStatic1.setPosition(-100, 0);
		plataforma.dispose();
		
		plataforma = new Pixmap(32,32,Format.RGBA8888);
		plataforma.setColor(0.8f,0.8f,0.8f,1f);
		plataforma.fill();
		plataforma.setColor(1f,1f,0f,1f);
		plataforma.setColor(0,1,1,1);
		plataforma.drawRectangle(0, 0, 32, 32);
		
		textura3 = new Texture(plataforma);
		platStatic2 = new Sprite(textura3);
		platStatic2.setPosition(100, 50);
		plataforma.dispose();
	}
		
	
	@Override
	public boolean keyUp(int keycode){
		if(keycode == Keys.ESCAPE){
			this.init();
		}
		return true;
	}
	
	private void moveCube(float xAmount, float yAmount){
		cubo.translate(xAmount, yAmount);
	}
}
