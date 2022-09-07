package com.tahasanli.gdxplatformer;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.ScreenUtils;

import java.util.ArrayList;
import java.util.Comparator;

public class GDXPlatformer extends ApplicationAdapter {

	ArrayList<GameObject> go;
	SpriteBatch batch;
	
	@Override
	public void create () {
		go = new ArrayList<>();
		go.add(new GameObject("FirstObject"));

		batch = new SpriteBatch();

		for(GameObject gameObject : go)
			for(Component comp : gameObject.components)
				comp.onCreate();
	}

	public void ComponentAdded(){
		for(GameObject obj: go)
			obj.SortComponent();
	}

	@Override
	public void render () {
		System.out.println(Gdx.graphics.getDeltaTime());
		batch.begin();

		for(GameObject gameObject : go)
			for(Component comp : gameObject.components)
				if(comp.Enabled)
					comp.onFrame(batch);

		batch.end();
	}

	public Vector2 getScreenDimension(){
		return new Vector2(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
	}
}
