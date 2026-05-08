package com.swmansion.gesturehandler.react;

import com.facebook.jni.HybridData;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.soloader.SoLoader;
import defpackage.f84;

/* JADX INFO: loaded from: classes3.dex */
@f84
public class RNGestureHandlerComponentsRegistry {

    @f84
    private final HybridData mHybridData;

    static {
        SoLoader.l("fabricjni");
        SoLoader.l("gesturehandler");
    }

    @f84
    private RNGestureHandlerComponentsRegistry(ComponentFactory componentFactory) {
        this.mHybridData = initHybrid(componentFactory);
    }

    @f84
    private native HybridData initHybrid(ComponentFactory componentFactory);

    @f84
    public static RNGestureHandlerComponentsRegistry register(ComponentFactory componentFactory) {
        return new RNGestureHandlerComponentsRegistry(componentFactory);
    }
}
