package com.swmansion.gesturehandler.core;

import com.facebook.react.bridge.ReactApplicationContext;
import com.swmansion.gesturehandler.core.GestureHandler;
import com.swmansion.gesturehandler.core.j;
import defpackage.jab;
import defpackage.pz5;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends GestureHandler {
    public double M;
    public double N;
    public j Q;
    public float R;
    public float S;
    public float O = Float.NaN;
    public float P = Float.NaN;
    public final b T = new b();

    public static final class a extends GestureHandler.a<g> {
        @Override // com.swmansion.gesturehandler.core.GestureHandler.a
        public final GestureHandler a(ReactApplicationContext reactApplicationContext) {
            return new g();
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.a
        public final pz5 b(GestureHandler gestureHandler) {
            return new jab((g) gestureHandler);
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.a
        public final String c() {
            return "PinchGestureHandler";
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.a
        public final Class<g> d() {
            return g.class;
        }
    }

    public static final class b implements j.a {
        public b() {
        }

        @Override // com.swmansion.gesturehandler.core.j.a
        public final void a(j jVar) {
            jVar.getClass();
        }

        @Override // com.swmansion.gesturehandler.core.j.a
        public final void b(j jVar) {
            jVar.getClass();
            g gVar = g.this;
            double d = gVar.M;
            float f = 1.0f;
            if (jVar.a()) {
                boolean z = jVar.q;
                boolean z2 = (z && jVar.f < jVar.g) || (!z && jVar.f > jVar.g);
                float fAbs = Math.abs(1.0f - (jVar.f / jVar.g)) * 0.5f;
                if (jVar.g > jVar.l) {
                    f = z2 ? 1.0f + fAbs : 1.0f - fAbs;
                }
            } else {
                float f2 = jVar.g;
                if (f2 > 0.0f) {
                    f = jVar.f / f2;
                }
            }
            double d2 = ((double) f) * d;
            gVar.M = d2;
            double d3 = (jVar.i - jVar.j) / 1000.0d;
            if (d3 > 0.0d) {
                gVar.N = (d2 - d) / d3;
            }
            if (Math.abs(gVar.R - jVar.f) < gVar.S || gVar.f != 2) {
                return;
            }
            gVar.a(false);
        }

        @Override // com.swmansion.gesturehandler.core.j.a
        public final void c(j jVar) {
            jVar.getClass();
            g.this.R = jVar.f;
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final void a(boolean z) {
        if (this.f != 4) {
            z();
        }
        super.a(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0  */
    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(android.view.MotionEvent r21, android.view.MotionEvent r22) {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.core.g.t(android.view.MotionEvent, android.view.MotionEvent):void");
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final void w() {
        this.Q = null;
        this.O = Float.NaN;
        this.P = Float.NaN;
        z();
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final void z() {
        this.N = 0.0d;
        this.M = 1.0d;
    }
}
