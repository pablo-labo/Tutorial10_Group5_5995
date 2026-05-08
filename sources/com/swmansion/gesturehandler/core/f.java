package com.swmansion.gesturehandler.core;

import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.swmansion.gesturehandler.core.GestureHandler;
import defpackage.e3b;
import defpackage.nn2;
import defpackage.pz5;
import defpackage.qr3;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends GestureHandler {
    public float M;
    public float N;
    public final float O;
    public float P;
    public float d0;
    public float e0;
    public float f0;
    public float g0;
    public float h0;
    public float i0;
    public VelocityTracker j0;
    public boolean k0;
    public long l0;
    public Handler n0;
    public float Q = Float.MAX_VALUE;
    public float R = Float.MIN_VALUE;
    public float S = Float.MIN_VALUE;
    public float T = Float.MAX_VALUE;
    public float U = Float.MAX_VALUE;
    public float V = Float.MIN_VALUE;
    public float W = Float.MIN_VALUE;
    public float X = Float.MAX_VALUE;
    public float Y = Float.MAX_VALUE;
    public float Z = Float.MAX_VALUE;
    public float a0 = Float.MAX_VALUE;
    public int b0 = 1;
    public int c0 = 10;
    public final qr3 m0 = new qr3(this, 2);
    public k o0 = new k(0);

    public static final class a {
        public static final void a(VelocityTracker velocityTracker, MotionEvent motionEvent) {
            float rawX = motionEvent.getRawX() - motionEvent.getX();
            float rawY = motionEvent.getRawY() - motionEvent.getY();
            motionEvent.offsetLocation(rawX, rawY);
            velocityTracker.getClass();
            velocityTracker.addMovement(motionEvent);
            motionEvent.offsetLocation(-rawX, -rawY);
        }
    }

    public static final class b extends GestureHandler.a<f> {
        @Override // com.swmansion.gesturehandler.core.GestureHandler.a
        public final GestureHandler a(ReactApplicationContext reactApplicationContext) {
            return new f(reactApplicationContext);
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.a
        public final pz5 b(GestureHandler gestureHandler) {
            return new e3b((f) gestureHandler);
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.a
        public final String c() {
            return "PanGestureHandler";
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.a
        public final Class<f> d() {
            return f.class;
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.a
        public final void e(GestureHandler gestureHandler, ReadableMap readableMap) {
            boolean z;
            f fVar = (f) gestureHandler;
            super.e(fVar, readableMap);
            boolean z2 = true;
            if (readableMap.hasKey("activeOffsetXStart")) {
                fVar.Q = nn2.G((float) readableMap.getDouble("activeOffsetXStart"));
                z = true;
            } else {
                z = false;
            }
            if (readableMap.hasKey("activeOffsetXEnd")) {
                fVar.R = nn2.G((float) readableMap.getDouble("activeOffsetXEnd"));
                z = true;
            }
            if (readableMap.hasKey("failOffsetXStart")) {
                fVar.S = nn2.G((float) readableMap.getDouble("failOffsetXStart"));
                z = true;
            }
            if (readableMap.hasKey("failOffsetXEnd")) {
                fVar.T = nn2.G((float) readableMap.getDouble("failOffsetXEnd"));
                z = true;
            }
            if (readableMap.hasKey("activeOffsetYStart")) {
                fVar.U = nn2.G((float) readableMap.getDouble("activeOffsetYStart"));
                z = true;
            }
            if (readableMap.hasKey("activeOffsetYEnd")) {
                fVar.V = nn2.G((float) readableMap.getDouble("activeOffsetYEnd"));
                z = true;
            }
            if (readableMap.hasKey("failOffsetYStart")) {
                fVar.W = nn2.G((float) readableMap.getDouble("failOffsetYStart"));
                z = true;
            }
            if (readableMap.hasKey("failOffsetYEnd")) {
                fVar.X = nn2.G((float) readableMap.getDouble("failOffsetYEnd"));
                z = true;
            }
            if (readableMap.hasKey("minVelocity")) {
                fVar.a0 = nn2.G((float) readableMap.getDouble("minVelocity"));
                z = true;
            }
            if (readableMap.hasKey("minVelocityX")) {
                fVar.Y = nn2.G((float) readableMap.getDouble("minVelocityX"));
                z = true;
            }
            if (readableMap.hasKey("minVelocityY")) {
                fVar.Z = nn2.G((float) readableMap.getDouble("minVelocityY"));
            } else {
                z2 = z;
            }
            if (readableMap.hasKey("minDist")) {
                fVar.P = nn2.G((float) readableMap.getDouble("minDist"));
            } else if (z2) {
                fVar.P = Float.MAX_VALUE;
            }
            if (readableMap.hasKey("minPointers")) {
                fVar.b0 = readableMap.getInt("minPointers");
            }
            if (readableMap.hasKey("maxPointers")) {
                fVar.c0 = readableMap.getInt("maxPointers");
            }
            if (readableMap.hasKey("avgTouches")) {
                fVar.k0 = readableMap.getBoolean("avgTouches");
            }
            if (readableMap.hasKey("activateAfterLongPress")) {
                fVar.l0 = readableMap.getInt("activateAfterLongPress");
            }
        }
    }

    public f(Context context) {
        this.P = Float.MIN_VALUE;
        context.getClass();
        float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.O = scaledTouchSlop;
        this.P = scaledTouchSlop;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final void a(boolean z) {
        if (this.f != 4) {
            z();
        }
        super.a(z);
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final void r() {
        Handler handler = this.n0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0128  */
    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(android.view.MotionEvent r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instruction units count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.core.f.t(android.view.MotionEvent, android.view.MotionEvent):void");
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final void w() {
        Handler handler = this.n0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        VelocityTracker velocityTracker = this.j0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.j0 = null;
        }
        this.o0 = new k(0);
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final void y() {
        super.y();
        this.Q = Float.MAX_VALUE;
        this.R = Float.MIN_VALUE;
        this.S = Float.MIN_VALUE;
        this.T = Float.MAX_VALUE;
        this.U = Float.MAX_VALUE;
        this.V = Float.MIN_VALUE;
        this.W = Float.MIN_VALUE;
        this.X = Float.MAX_VALUE;
        this.Y = Float.MAX_VALUE;
        this.Z = Float.MAX_VALUE;
        this.a0 = Float.MAX_VALUE;
        this.P = this.O;
        this.b0 = 1;
        this.c0 = 10;
        this.l0 = 0L;
        this.k0 = false;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final void z() {
        this.d0 = this.h0;
        this.e0 = this.i0;
    }
}
