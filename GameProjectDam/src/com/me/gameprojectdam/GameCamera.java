package com.me.gameprojectdam;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class GameCamera {
	private Sprite objetivo;
	private Vector2 posicion;

	public GameCamera() {
		posicion = new Vector2();
		
	}
	
	public void init(){
		
	}
	
	public void setSprite(Sprite objetivo){
		this.objetivo = objetivo;
	}

	public void update(){
		posicion.x = objetivo.getOriginX()+objetivo.getX();
		posicion.y = objetivo.getOriginY()+objetivo.getY();
	}
	
	public void moverCamera(OrthographicCamera camera){
		camera.position.x = posicion.x;
		camera.position.y = posicion.y;
		camera.update();
	}
}
