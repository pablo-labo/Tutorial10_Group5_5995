package com.facebook.react.views.scroll;

import android.os.SystemClock;
import com.datadog.android.ndk.internal.NdkCrashLog;
import com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.views.scroll.g;
import defpackage.hh1;
import defpackage.nn2;
import defpackage.ox4;
import defpackage.pgb;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends ox4<f> {
    public static final pgb<f> k = new pgb<>(3);
    public float a;
    public float b;
    public float c;
    public float d;
    public int e;
    public int f;
    public int g;
    public int h;
    public g i;
    public long j;

    public static final class a {
        public static f a(int i, int i2, g gVar, float f, float f2, float f3, float f4, int i3, int i4, int i5, int i6) {
            f fVarAcquire = f.k.acquire();
            if (fVarAcquire == null) {
                fVarAcquire = new f();
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            fVarAcquire.init(i, i2, jUptimeMillis);
            fVarAcquire.i = gVar;
            fVarAcquire.a = f;
            fVarAcquire.b = f2;
            fVarAcquire.c = f3;
            fVarAcquire.d = f4;
            fVarAcquire.e = i3;
            fVarAcquire.f = i4;
            fVarAcquire.g = i5;
            fVarAcquire.h = i6;
            fVarAcquire.j = jUptimeMillis;
            return fVarAcquire;
        }
    }

    @Override // defpackage.ox4
    public final boolean canCoalesce() {
        return this.i == g.d;
    }

    @Override // defpackage.ox4
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put("top", 0.0d);
        readableMapBuilder.put("bottom", 0.0d);
        readableMapBuilder.put(GesturesListener.SCROLL_DIRECTION_LEFT, 0.0d);
        readableMapBuilder.put(GesturesListener.SCROLL_DIRECTION_RIGHT, 0.0d);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.getClass();
        ReadableMapBuilder readableMapBuilder2 = new ReadableMapBuilder(writableMapCreateMap2);
        readableMapBuilder2.put("x", nn2.C(this.a));
        readableMapBuilder2.put("y", nn2.C(this.b));
        WritableMap writableMapCreateMap3 = Arguments.createMap();
        writableMapCreateMap3.getClass();
        ReadableMapBuilder readableMapBuilder3 = new ReadableMapBuilder(writableMapCreateMap3);
        readableMapBuilder3.put("width", nn2.C(this.e));
        readableMapBuilder3.put("height", nn2.C(this.f));
        WritableMap writableMapCreateMap4 = Arguments.createMap();
        writableMapCreateMap4.getClass();
        ReadableMapBuilder readableMapBuilder4 = new ReadableMapBuilder(writableMapCreateMap4);
        readableMapBuilder4.put("width", nn2.C(this.g));
        readableMapBuilder4.put("height", nn2.C(this.h));
        WritableMap writableMapCreateMap5 = Arguments.createMap();
        writableMapCreateMap5.getClass();
        ReadableMapBuilder readableMapBuilder5 = new ReadableMapBuilder(writableMapCreateMap5);
        readableMapBuilder5.put("x", nn2.C(this.c));
        readableMapBuilder5.put("y", nn2.C(this.d));
        WritableMap writableMapCreateMap6 = Arguments.createMap();
        writableMapCreateMap6.getClass();
        writableMapCreateMap6.putMap("contentInset", writableMapCreateMap);
        writableMapCreateMap6.putMap("contentOffset", writableMapCreateMap2);
        writableMapCreateMap6.putMap("contentSize", writableMapCreateMap3);
        writableMapCreateMap6.putMap("layoutMeasurement", writableMapCreateMap4);
        writableMapCreateMap6.putMap("velocity", writableMapCreateMap5);
        writableMapCreateMap6.putInt("target", getViewTag());
        writableMapCreateMap6.putDouble(NdkCrashLog.TIMESTAMP_KEY_NAME, this.j);
        writableMapCreateMap6.putBoolean("responderIgnoreScroll", true);
        return writableMapCreateMap6;
    }

    @Override // defpackage.ox4
    public final String getEventName() {
        g gVar = this.i;
        hh1.n(gVar);
        g.a.getClass();
        return g.a.a(gVar);
    }

    @Override // defpackage.ox4
    public final void onDispose() {
        try {
            k.a(this);
        } catch (IllegalStateException e) {
            ReactSoftExceptionLogger.logSoftException("f", e);
        }
    }
}
