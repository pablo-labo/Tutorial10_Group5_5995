package com.swmansion.gesturehandler.core;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.swmansion.gesturehandler.core.GestureHandler;
import defpackage.fh7;
import defpackage.gg2;
import defpackage.l59;
import defpackage.lra;
import defpackage.nh7;
import defpackage.nic;
import defpackage.nn2;
import defpackage.oh7;
import defpackage.pz5;
import defpackage.t92;
import defpackage.z92;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends GestureHandler {
    public long M;
    public final float N;
    public float O;
    public final int P;
    public float Q;
    public float R;
    public long S;
    public long T;
    public Handler U;
    public int V;

    public static final class a extends GestureHandler.a<c> {
        @Override // com.swmansion.gesturehandler.core.GestureHandler.a
        public final GestureHandler a(ReactApplicationContext reactApplicationContext) {
            reactApplicationContext.getClass();
            return new c(reactApplicationContext);
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.a
        public final pz5 b(GestureHandler gestureHandler) {
            return new l59((c) gestureHandler);
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.a
        public final String c() {
            return "LongPressGestureHandler";
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.a
        public final Class<c> d() {
            return c.class;
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.a
        public final void e(GestureHandler gestureHandler, ReadableMap readableMap) {
            c cVar = (c) gestureHandler;
            super.e(cVar, readableMap);
            if (readableMap.hasKey("minDurationMs")) {
                cVar.M = readableMap.getInt("minDurationMs");
            }
            if (readableMap.hasKey("maxDist")) {
                cVar.O = nn2.G((float) readableMap.getDouble("maxDist"));
            }
            if (readableMap.hasKey("numberOfPointers")) {
                cVar.y = readableMap.getInt("numberOfPointers");
            }
        }
    }

    public c(Context context) {
        context.getClass();
        this.M = 500L;
        this.z = true;
        float f = context.getResources().getDisplayMetrics().density * 10.0f;
        this.N = f;
        this.O = f;
        this.P = 1;
    }

    public static Pair H(MotionEvent motionEvent, boolean z) {
        if (z) {
            int pointerCount = motionEvent.getPointerCount();
            float f = 0.0f;
            float y = 0.0f;
            for (int i = 0; i < pointerCount; i++) {
                if (i != motionEvent.getActionIndex()) {
                    float x = motionEvent.getX(i) + f;
                    y = motionEvent.getY(i) + y;
                    f = x;
                }
            }
            return new Pair(Float.valueOf(f / (motionEvent.getPointerCount() - 1)), Float.valueOf(y / (motionEvent.getPointerCount() - 1)));
        }
        oh7 oh7VarH = nic.H(0, motionEvent.getPointerCount());
        ArrayList arrayList = new ArrayList(t92.r0(oh7VarH, 10));
        Iterator<Integer> it = oh7VarH.iterator();
        while (((nh7) it).c) {
            arrayList.add(Float.valueOf(motionEvent.getX(((fh7) it).nextInt())));
        }
        float fH0 = (float) z92.H0(arrayList);
        oh7 oh7VarH2 = nic.H(0, motionEvent.getPointerCount());
        ArrayList arrayList2 = new ArrayList(t92.r0(oh7VarH2, 10));
        Iterator<Integer> it2 = oh7VarH2.iterator();
        while (((nh7) it2).c) {
            arrayList2.add(Float.valueOf(motionEvent.getY(((fh7) it2).nextInt())));
        }
        return new Pair(Float.valueOf(fH0), Float.valueOf((float) z92.H0(arrayList2)));
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final void g(MotionEvent motionEvent) {
        this.T = SystemClock.uptimeMillis();
        lra lraVar = this.B;
        if (lraVar != null) {
            lraVar.c(this, motionEvent);
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final void h(int i, int i2) {
        this.T = SystemClock.uptimeMillis();
        super.h(i, i2);
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final void t(MotionEvent motionEvent, MotionEvent motionEvent2) {
        motionEvent2.getClass();
        if (B(motionEvent2)) {
            if (this.f == 0) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                this.T = jUptimeMillis;
                this.S = jUptimeMillis;
                d();
                Pair pairH = H(motionEvent2, false);
                float fFloatValue = ((Number) pairH.a()).floatValue();
                float fFloatValue2 = ((Number) pairH.b()).floatValue();
                this.Q = fFloatValue;
                this.R = fFloatValue2;
                this.V++;
            }
            int actionMasked = motionEvent2.getActionMasked();
            int i = this.P;
            if (actionMasked == 5) {
                this.V++;
                Pair pairH2 = H(motionEvent2, false);
                float fFloatValue3 = ((Number) pairH2.a()).floatValue();
                float fFloatValue4 = ((Number) pairH2.b()).floatValue();
                this.Q = fFloatValue3;
                this.R = fFloatValue4;
                if (this.V > i) {
                    l();
                    this.V = 0;
                }
            }
            if (this.f == 2 && this.V == i && (motionEvent2.getActionMasked() == 0 || motionEvent2.getActionMasked() == 5)) {
                Handler handler = new Handler(Looper.getMainLooper());
                this.U = handler;
                long j = this.M;
                if (j > 0) {
                    handler.postDelayed(new gg2(this, 6), j);
                } else if (j == 0) {
                    a(false);
                }
            }
            if (motionEvent2.getActionMasked() == 1 || motionEvent2.getActionMasked() == 12) {
                this.V--;
                Handler handler2 = this.U;
                if (handler2 != null) {
                    handler2.removeCallbacksAndMessages(null);
                    this.U = null;
                }
                if (this.f == 4) {
                    j();
                    return;
                } else {
                    l();
                    return;
                }
            }
            if (motionEvent2.getActionMasked() == 6) {
                int i2 = this.V - 1;
                this.V = i2;
                if (i2 < i && this.f != 4) {
                    l();
                    this.V = 0;
                    return;
                }
                Pair pairH3 = H(motionEvent2, true);
                float fFloatValue5 = ((Number) pairH3.a()).floatValue();
                float fFloatValue6 = ((Number) pairH3.b()).floatValue();
                this.Q = fFloatValue5;
                this.R = fFloatValue6;
                return;
            }
            Pair pairH4 = H(motionEvent2, false);
            float fFloatValue7 = ((Number) pairH4.a()).floatValue();
            float fFloatValue8 = ((Number) pairH4.b()).floatValue();
            float f = fFloatValue7 - this.Q;
            float f2 = fFloatValue8 - this.R;
            float f3 = (f2 * f2) + (f * f);
            float f4 = this.O;
            if (f3 > f4 * f4) {
                if (this.f == 4) {
                    e();
                } else {
                    l();
                }
            }
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final void w() {
        this.V = 0;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final void x() {
        Handler handler = this.U;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.U = null;
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final void y() {
        super.y();
        this.M = 500L;
        this.O = this.N;
        this.z = true;
    }
}
