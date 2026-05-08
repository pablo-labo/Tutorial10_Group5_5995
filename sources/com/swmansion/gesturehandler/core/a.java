package com.swmansion.gesturehandler.core;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.swmansion.gesturehandler.core.GestureHandler;
import defpackage.cmg;
import defpackage.my1;
import defpackage.pz5;
import defpackage.qh5;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends GestureHandler {
    public static final double U = Math.cos(Math.toRadians(30.0d / 2.0d));
    public static final double V = Math.cos(Math.toRadians(60.0d / 2.0d));
    public Handler Q;
    public int R;
    public VelocityTracker T;
    public int M = 1;
    public int N = 1;
    public final long O = 800;
    public final long P = 2000;
    public final my1 S = new my1(this, 7);

    /* JADX INFO: renamed from: com.swmansion.gesturehandler.core.a$a, reason: collision with other inner class name */
    public static final class C0192a extends GestureHandler.a<a> {
        @Override // com.swmansion.gesturehandler.core.GestureHandler.a
        public final GestureHandler a(ReactApplicationContext reactApplicationContext) {
            return new a();
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.a
        public final pz5 b(GestureHandler gestureHandler) {
            return new qh5((a) gestureHandler);
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.a
        public final String c() {
            return "FlingGestureHandler";
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.a
        public final Class<a> d() {
            return a.class;
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.a
        public final void e(GestureHandler gestureHandler, ReadableMap readableMap) {
            a aVar = (a) gestureHandler;
            super.e(aVar, readableMap);
            if (readableMap.hasKey("numberOfPointers")) {
                aVar.M = readableMap.getInt("numberOfPointers");
            }
            if (readableMap.hasKey("direction")) {
                aVar.N = readableMap.getInt("direction");
            }
        }
    }

    public static final boolean I(a aVar, cmg cmgVar, int i, double d) {
        cmg cmgVar2;
        if ((aVar.N & i) != i) {
            return false;
        }
        cmg cmgVar3 = cmg.d;
        switch (i) {
            case 1:
                cmgVar2 = cmg.e;
                break;
            case 2:
                cmgVar2 = cmg.d;
                break;
            case 3:
            case 7:
            default:
                cmgVar2 = cmg.l;
                break;
            case 4:
                cmgVar2 = cmg.f;
                break;
            case 5:
                cmgVar2 = cmg.h;
                break;
            case 6:
                cmgVar2 = cmg.j;
                break;
            case 8:
                cmgVar2 = cmg.g;
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                cmgVar2 = cmg.i;
                break;
            case 10:
                cmgVar2 = cmg.k;
                break;
        }
        cmgVar2.getClass();
        return (cmgVar.b * cmgVar2.b) + (cmgVar.a * cmgVar2.a) > d;
    }

    public final boolean H(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        VelocityTracker velocityTracker = this.T;
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        motionEvent.offsetLocation(rawX, rawY);
        velocityTracker.getClass();
        velocityTracker.addMovement(motionEvent);
        motionEvent.offsetLocation(-rawX, -rawY);
        cmg cmgVar = cmg.d;
        VelocityTracker velocityTracker2 = this.T;
        velocityTracker2.getClass();
        velocityTracker2.computeCurrentVelocity(1000);
        cmg cmgVar2 = new cmg(velocityTracker2.getXVelocity(), velocityTracker2.getYVelocity());
        Integer[] numArr = {2, 1, 4, 8};
        ArrayList arrayList = new ArrayList(4);
        for (int i = 0; i < 4; i++) {
            arrayList.add(Boolean.valueOf(I(this, cmgVar2, numArr[i].intValue(), U)));
        }
        Integer[] numArr2 = {5, 9, 6, 10};
        ArrayList arrayList2 = new ArrayList(4);
        for (int i2 = 0; i2 < 4; i2++) {
            arrayList2.add(Boolean.valueOf(I(this, cmgVar2, numArr2[i2].intValue(), V)));
        }
        if (arrayList.isEmpty()) {
            z = false;
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((Boolean) it.next()).booleanValue()) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (arrayList2.isEmpty()) {
            z2 = false;
        } else {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (((Boolean) it2.next()).booleanValue()) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        }
        boolean z3 = z | z2;
        boolean z4 = cmgVar2.c > ((double) this.P);
        if (this.R != this.M || !z3 || !z4) {
            return false;
        }
        Handler handler = this.Q;
        handler.getClass();
        handler.removeCallbacksAndMessages(null);
        a(false);
        return true;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final void a(boolean z) {
        super.a(z);
        j();
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final void r() {
        Handler handler = this.Q;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final void t(MotionEvent motionEvent, MotionEvent motionEvent2) {
        motionEvent2.getClass();
        if (B(motionEvent2)) {
            int i = this.f;
            if (i == 0) {
                this.T = VelocityTracker.obtain();
                d();
                this.R = 1;
                Handler handler = this.Q;
                if (handler == null) {
                    this.Q = new Handler(Looper.getMainLooper());
                } else {
                    handler.removeCallbacksAndMessages(null);
                }
                Handler handler2 = this.Q;
                handler2.getClass();
                handler2.postDelayed(this.S, this.O);
            }
            if (i == 2) {
                H(motionEvent2);
                if (motionEvent2.getPointerCount() > this.R) {
                    this.R = motionEvent2.getPointerCount();
                }
                if (motionEvent2.getActionMasked() != 1 || H(motionEvent2)) {
                    return;
                }
                l();
            }
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final void w() {
        VelocityTracker velocityTracker = this.T;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.T = null;
        Handler handler = this.Q;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final void y() {
        super.y();
        this.M = 1;
        this.N = 1;
    }
}
