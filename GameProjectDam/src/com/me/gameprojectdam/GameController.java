package com.me.gameprojectdam;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.utils.Array;

// Aqui crearemos nuestros Sprites, texturas, definimos movimientos, etc..
public class GameController extends InputAdapter {
	public Texture textura,textura2,textura3;
	public Sprite personaje,zombie01, zombie02,mapa;
	public GameCamera gcCamera;
	public TextureAtlas miTextureAtlas;
	public Array<Sprite> misSprites; 

	public GameController() {
		this.init();
	}
	
	public void init(){
		this.initPlataformas();	
		gcCamera = new GameCamera();
		gcCamera.setSprite(personaje);
		Gdx.input.setInputProcessor(this);
	}
	
	public void update(float deltaTime){
		hldKeys(deltaTime);
		zombieMovement(deltaTime);
		gcCamera.update();
		
	}
	
	private void initPlataformas(){
		// Inicializamos miTextureAtlas con el archivo que hemos generado previamente.
		miTextureAtlas = new TextureAtlas("./data/textureAtlas.txt");
		// Ahora le pasamos al array de sprites misSprites los elementos del textureAtlas. 
		misSprites = miTextureAtlas.createSprites();
		// Asignamos al sprite mapa el sprite en la posición 0 del array de sprites misSprites
		mapa = misSprites.get(0);
		// Establecemos la posición del sprite mapa
		mapa.setPosition(-465, 50);
		// Asignamos al sprite personaje el sprite en la posición 2 del array de sprites misSprites
		personaje = misSprites.get(2);
		// Establecemos la posición del elemento personaje en la escena. 
		personaje.setPosition(0, 0);
		zombie01 = misSprites.get(8);
		zombie01.setPosition(100, 100);

	}
	
	private void hldKeys(float deltaTime){
		float moveSpeed = 100*deltaTime;
		if(Gdx.input.isKeyPressed(Keys.A)|Gdx.input.isKeyPressed(Keys.LEFT)){
			moveCube(-moveSpeed,0);
			if(personaje.getRotation()!=90f){
				personaje.setRotation(90f);
			}
		}
		if(Gdx.input.isKeyPressed(Keys.W)|Gdx.input.isKeyPressed(Keys.UP)){
			moveCube(0,moveSpeed);
			if(personaje.getRotation()!=0){
				personaje.setRotation(0f);
			}
		}
		if(Gdx.input.isKeyPressed(Keys.S)|Gdx.input.isKeyPressed(Keys.DOWN)){
			moveCube(0,-moveSpeed);
			if(personaje.getRotation()!=180){
				personaje.setRotation(180f);;
			}
		}
		if(Gdx.input.isKeyPressed(Keys.D)|Gdx.input.isKeyPressed(Keys.RIGHT)){
			moveCube(moveSpeed,0);
			if(personaje.getRotation()!=270){
				personaje.setRotation(270f);
			}
		}
		if((Gdx.input.isKeyPressed(Keys.A)|Gdx.input.isKeyPressed(Keys.LEFT) )&& (Gdx.input.isKeyPressed(Keys.W)|Gdx.input.isKeyPressed(Keys.UP))){
			if(personaje.getRotation()!=45f){
				personaje.setRotation(45f);
			}
		}
		if((Gdx.input.isKeyPressed(Keys.W)|Gdx.input.isKeyPressed(Keys.UP) )&& (Gdx.input.isKeyPressed(Keys.D)|Gdx.input.isKeyPressed(Keys.RIGHT))){
			if(personaje.getRotation()!=305f){
				personaje.setRotation(305f);
			}
		}
		if((Gdx.input.isKeyPressed(Keys.S)|Gdx.input.isKeyPressed(Keys.DOWN) )&& (Gdx.input.isKeyPressed(Keys.D)|Gdx.input.isKeyPressed(Keys.RIGHT))){
			if(personaje.getRotation()!=225){
				personaje.setRotation(225f);
			}
		}
		if((Gdx.input.isKeyPressed(Keys.S)|Gdx.input.isKeyPressed(Keys.DOWN) )&& (Gdx.input.isKeyPressed(Keys.A)|Gdx.input.isKeyPressed(Keys.LEFT))){
			if(personaje.getRotation()!=135f){
				personaje.setRotation(135f);
			}
		}
	
	
		
		
	}
	
	
	@Override
	public boolean keyUp(int keycode){
		if(keycode == Keys.ESCAPE){
			this.init();
		}
		return true;
	}
	
	private void moveCube(float xAmount, float yAmount){
		personaje.translate(xAmount, yAmount);
	}
	private void moveZombie01(float xAmount, float yAmount){
		zombie01.translate(xAmount, yAmount);
	}
	private float moviZombieX(){
		float move = 1f;
		if((personaje.getOriginX()-zombie01.getOriginX())>0){
			return move;
		}else if ((personaje.getOriginX()-zombie01.getOriginX())<0){
			return -move;
		}else return 0f;
	}
	
	private float moviZombieY(){
		float move = 1f;
		if((personaje.getOriginY()-zombie01.getOriginY())>0){
			return move;
		}else if ((personaje.getOriginY()-zombie01.getOriginY())<0){
			return -move;
		}else return 0f;
	}
	
	public void zombieMovement(float deltaTime){
		
		float moveSpeed2 = 20*deltaTime;
		float moveX, moveY;
		moveX = moviZombieX()*moveSpeed2;
		moveY = moviZombieY()*moveSpeed2;
		
		moveZombie01(moveX,moveY);
		
		if (moveX<0){
			if(moveY>0){
				zombie01.setRotation(135);
			}else if(moveY<0){
				zombie01.setRotation(225);
			}else zombie01.setRotation(90);
		}else if((moveX>0 && moveY==0)){
			if(moveY>0){
				zombie01.setRotation(45);
			}else if(moveY<0)
				zombie01.setRotation(305);
			else zombie01.setRotation(270);
		}else if((moveY>0 && moveX==0)){
			zombie01.setRotation(0);
		}else if((moveY<0 && moveX==0)){
			zombie01.setRotation(180);
		}
		
	}
}
