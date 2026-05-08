package com.swmansion.gesturehandler.core;

import android.view.MotionEvent;
import com.facebook.react.bridge.ReactApplicationContext;
import com.swmansion.gesturehandler.core.GestureHandler;
import defpackage.cb9;
import defpackage.pz5;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends GestureHandler {

    public static final class a extends GestureHandler.a<d> {
        @Override // com.swmansion.gesturehandler.core.GestureHandler.a
        public final GestureHandler a(ReactApplicationContext reactApplicationContext) {
            return new d();
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.a
        public final pz5 b(GestureHandler gestureHandler) {
            return new cb9((d) gestureHandler);
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.a
        public final String c() {
            return "ManualGestureHandler";
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.a
        public final Class<d> d() {
            return d.class;
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final void t(MotionEvent motionEvent, MotionEvent motionEvent2) {
        motionEvent2.getClass();
        if (this.f == 0) {
            d();
        }
    }
}
