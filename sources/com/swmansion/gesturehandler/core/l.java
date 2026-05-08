package com.swmansion.gesturehandler.core;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.swmansion.gesturehandler.core.GestureHandler;
import defpackage.h4;
import defpackage.jy1;
import defpackage.nn2;
import defpackage.pz5;
import defpackage.t8f;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends GestureHandler {
    public float U;
    public float V;
    public float W;
    public float X;
    public float Y;
    public float Z;
    public Handler a0;
    public int b0;
    public float M = Float.MIN_VALUE;
    public float N = Float.MIN_VALUE;
    public float O = Float.MIN_VALUE;
    public long P = 500;
    public long Q = 200;
    public int R = 1;
    public int S = 1;
    public int T = 1;
    public final jy1 c0 = new jy1(this, 5);

    public static final class a extends GestureHandler.a<l> {
        @Override // com.swmansion.gesturehandler.core.GestureHandler.a
        public final GestureHandler a(ReactApplicationContext reactApplicationContext) {
            return new l();
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.a
        public final pz5 b(GestureHandler gestureHandler) {
            return new t8f((l) gestureHandler);
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.a
        public final String c() {
            return "TapGestureHandler";
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.a
        public final Class<l> d() {
            return l.class;
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.a
        public final void e(GestureHandler gestureHandler, ReadableMap readableMap) {
            l lVar = (l) gestureHandler;
            super.e(lVar, readableMap);
            if (readableMap.hasKey("numberOfTaps")) {
                lVar.R = readableMap.getInt("numberOfTaps");
            }
            if (readableMap.hasKey("maxDurationMs")) {
                lVar.P = readableMap.getInt("maxDurationMs");
            }
            if (readableMap.hasKey("maxDelayMs")) {
                lVar.Q = readableMap.getInt("maxDelayMs");
            }
            if (readableMap.hasKey("maxDeltaX")) {
                lVar.M = nn2.G((float) readableMap.getDouble("maxDeltaX"));
            }
            if (readableMap.hasKey("maxDeltaY")) {
                lVar.N = nn2.G((float) readableMap.getDouble("maxDeltaY"));
            }
            if (readableMap.hasKey("maxDist")) {
                lVar.O = nn2.G((float) readableMap.getDouble("maxDist"));
            }
            if (readableMap.hasKey("minPointers")) {
                lVar.S = readableMap.getInt("minPointers");
            }
        }
    }

    public l() {
        this.z = true;
    }

    public final void H() {
        Handler handler = this.a0;
        if (handler == null) {
            this.a0 = new Handler(Looper.getMainLooper());
        } else {
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.a0;
        handler2.getClass();
        handler2.postDelayed(this.c0, this.P);
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final void a(boolean z) {
        super.a(z);
        j();
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final void r() {
        Handler handler = this.a0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final void t(MotionEvent motionEvent, MotionEvent motionEvent2) {
        motionEvent2.getClass();
        if (B(motionEvent2)) {
            int i = this.f;
            int actionMasked = motionEvent2.getActionMasked();
            if (i == 0) {
                this.W = 0.0f;
                this.X = 0.0f;
                this.U = h4.m(motionEvent2, true);
                this.V = h4.n(motionEvent2, true);
            }
            if (actionMasked == 5 || actionMasked == 6) {
                this.W = (this.Y - this.U) + this.W;
                this.X = (this.Z - this.V) + this.X;
                this.Y = h4.m(motionEvent2, true);
                float fN = h4.n(motionEvent2, true);
                this.Z = fN;
                this.U = this.Y;
                this.V = fN;
            } else {
                this.Y = h4.m(motionEvent2, true);
                this.Z = h4.n(motionEvent2, true);
            }
            if (this.T < motionEvent2.getPointerCount()) {
                this.T = motionEvent2.getPointerCount();
            }
            float f = (this.Y - this.U) + this.W;
            if (this.M == Float.MIN_VALUE || Math.abs(f) <= this.M) {
                float f2 = (this.Z - this.V) + this.X;
                if (this.N == Float.MIN_VALUE || Math.abs(f2) <= this.N) {
                    float f3 = (f * f) + (f2 * f2);
                    float f4 = this.O;
                    if (f4 == Float.MIN_VALUE || f3 <= f4 * f4) {
                        if (i == 0) {
                            if (actionMasked == 0 || actionMasked == 11) {
                                d();
                            }
                            H();
                            return;
                        }
                        if (i == 2) {
                            if (actionMasked != 0) {
                                if (actionMasked != 1) {
                                    if (actionMasked != 11) {
                                        if (actionMasked != 12) {
                                            return;
                                        }
                                    }
                                }
                                Handler handler = this.a0;
                                if (handler == null) {
                                    this.a0 = new Handler(Looper.getMainLooper());
                                } else {
                                    handler.removeCallbacksAndMessages(null);
                                }
                                int i2 = this.b0 + 1;
                                this.b0 = i2;
                                if (i2 == this.R && this.T >= this.S) {
                                    a(false);
                                    return;
                                }
                                Handler handler2 = this.a0;
                                handler2.getClass();
                                handler2.postDelayed(this.c0, this.Q);
                                return;
                            }
                            H();
                            return;
                        }
                        return;
                    }
                }
            }
            l();
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final void w() {
        this.b0 = 0;
        this.T = 0;
        Handler handler = this.a0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final void y() {
        super.y();
        this.M = Float.MIN_VALUE;
        this.N = Float.MIN_VALUE;
        this.O = Float.MIN_VALUE;
        this.P = 500L;
        this.Q = 200L;
        this.R = 1;
        this.S = 1;
        this.z = true;
    }
}
