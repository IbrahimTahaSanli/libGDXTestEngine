package com.tahasanli.gdxplatformer;

import com.badlogic.gdx.math.Octree;

public enum ComponentCode {
    Comp(0),
    ColliderComp(1),
    TextureComp(2),
    UITextComp(3)

;
    public final int value;
    ComponentCode(int i) {
        this.value = i;
    }
}
