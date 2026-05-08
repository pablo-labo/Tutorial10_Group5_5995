package com.swmansion.gesturehandler.core;

import android.graphics.PointF;
import android.view.MotionEvent;
import com.facebook.react.bridge.ReactApplicationContext;
import com.swmansion.gesturehandler.core.GestureHandler;
import com.swmansion.gesturehandler.core.h;
import defpackage.pz5;
import defpackage.rz5;
import defpackage.xfd;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends GestureHandler {
    public h M;
    public double N;
    public double O;
    public float P = Float.NaN;
    public float Q = Float.NaN;
    public final b R = new b();

    public static final class a extends GestureHandler.a<i> {
        @Override // com.swmansion.gesturehandler.core.GestureHandler.a
        public final GestureHandler a(ReactApplicationContext reactApplicationContext) {
            return new i();
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.a
        public final pz5 b(GestureHandler gestureHandler) {
            return new xfd((i) gestureHandler);
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.a
        public final String c() {
            return "RotationGestureHandler";
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.a
        public final Class<i> d() {
            return i.class;
        }
    }

    public static final class b implements h.a {
        public b() {
        }

        @Override // com.swmansion.gesturehandler.core.h.a
        public final void a(h hVar) {
            hVar.getClass();
            i iVar = i.this;
            double d = iVar.N;
            double d2 = hVar.e + d;
            iVar.N = d2;
            long j = hVar.b - hVar.c;
            if (j > 0) {
                iVar.O = (d2 - d) / j;
            }
            if (Math.abs(d2) < 0.08726646259971647d || iVar.f != 2) {
                return;
            }
            iVar.a(false);
        }

        @Override // com.swmansion.gesturehandler.core.h.a
        public final void b(h hVar) {
            hVar.getClass();
        }

        @Override // com.swmansion.gesturehandler.core.h.a
        public final void c(h hVar) {
            hVar.getClass();
            i.this.j();
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final void a(boolean z) {
        if (this.f != 4) {
            z();
        }
        super.a(z);
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final void t(MotionEvent motionEvent, MotionEvent motionEvent2) {
        motionEvent2.getClass();
        if (this.f == 0) {
            z();
            this.M = new h(this.R);
            this.P = motionEvent.getX();
            this.Q = motionEvent.getY();
            d();
        }
        h hVar = this.M;
        if (hVar != null) {
            h.a aVar = hVar.a;
            int[] iArr = hVar.i;
            int actionMasked = motionEvent2.getActionMasked();
            if (actionMasked == 0) {
                hVar.h = false;
                iArr[0] = motionEvent2.getPointerId(motionEvent2.getActionIndex());
                iArr[1] = -1;
            } else if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 5) {
                        if (!hVar.h || hVar.j) {
                            iArr[1] = motionEvent2.getPointerId(motionEvent2.getActionIndex());
                            hVar.a(motionEvent2);
                        }
                        if (!hVar.h) {
                            hVar.h = true;
                            hVar.c = motionEvent2.getEventTime();
                            hVar.d = Double.NaN;
                            if (aVar != null) {
                                aVar.b(hVar);
                            }
                        }
                    } else if (actionMasked == 6 && hVar.h) {
                        int pointerId = motionEvent2.getPointerId(motionEvent2.getActionIndex());
                        if (pointerId == iArr[0]) {
                            iArr[0] = iArr[1];
                            iArr[1] = -1;
                            if (!hVar.j) {
                                hVar.j = true;
                            }
                        } else if (pointerId == iArr[1]) {
                            iArr[1] = -1;
                            if (!hVar.j) {
                                hVar.j = true;
                            }
                        }
                    }
                } else if (hVar.h) {
                    hVar.a(motionEvent2);
                    if (!hVar.j && aVar != null) {
                        aVar.a(hVar);
                    }
                }
            } else if (hVar.h) {
                hVar.j = false;
                hVar.h = false;
                if (aVar != null) {
                    aVar.c(hVar);
                }
            }
        }
        h hVar2 = this.M;
        if (hVar2 != null) {
            PointF pointF = new PointF(hVar2.f, hVar2.g);
            rz5 rz5Var = this.A;
            if (rz5Var != null) {
                rz5Var.g(this.e, pointF);
            } else {
                pointF.x = Float.NaN;
                pointF.y = Float.NaN;
            }
            this.P = pointF.x;
            this.Q = pointF.y;
        }
        if (motionEvent2.getActionMasked() == 1) {
            if (this.f == 4) {
                j();
            } else {
                l();
            }
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final void w() {
        this.M = null;
        this.P = Float.NaN;
        this.Q = Float.NaN;
        z();
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final void z() {
        this.O = 0.0d;
        this.N = 0.0d;
    }
}
