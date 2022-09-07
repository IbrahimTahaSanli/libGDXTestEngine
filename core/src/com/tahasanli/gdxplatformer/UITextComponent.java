package com.tahasanli.gdxplatformer;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class UITextComponent extends Component{
    public static final String Name = "ColliderComponent";
    public int Code = 3;

    public BitmapFont font;

    public UITextComponent(Color c, int size){
        super.Code = Code;

        font = new BitmapFont();
        font.setColor(c);
        font.getData().setScale(size);
    }

    @Override
    public void onCreate() {
    }

    @Override
    public void onFrame(SpriteBatch batch) {

    }
}
