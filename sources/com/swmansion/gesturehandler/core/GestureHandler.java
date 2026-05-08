package com.swmansion.gesturehandler.core;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import defpackage.cdc;
import defpackage.k6;
import defpackage.l5;
import defpackage.lra;
import defpackage.nn2;
import defpackage.pyd;
import defpackage.pz5;
import defpackage.rz5;
import defpackage.v7;
import defpackage.ycc;
import defpackage.z92;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
public class GestureHandler {
    public static MotionEvent.PointerProperties[] J;
    public static MotionEvent.PointerCoords[] K;
    public static short L;
    public rz5 A;
    public lra B;
    public ycc C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final int[] a = new int[12];
    public int b;
    public final int[] c;
    public int d;
    public View e;
    public int f;
    public float g;
    public float h;
    public boolean i;
    public boolean j;
    public int k;
    public WritableArray l;
    public WritableArray m;
    public int n;
    public int o;
    public final b[] p;
    public boolean q;
    public float[] r;
    public short s;
    public float t;
    public float u;
    public boolean v;
    public float w;
    public float x;
    public int y;
    public boolean z;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/swmansion/gesturehandler/core/GestureHandler$AdaptEventException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "react-native-gesture-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AdaptEventException extends Exception {
    }

    public static abstract class a<T extends GestureHandler> {
        public abstract GestureHandler a(ReactApplicationContext reactApplicationContext);

        public abstract pz5<T> b(T t);

        public abstract String c();

        public abstract Class<T> d();

        public void e(T t, ReadableMap readableMap) {
            t.y();
            if (readableMap.hasKey("shouldCancelWhenOutside")) {
                t.z = readableMap.getBoolean("shouldCancelWhenOutside");
            }
            if (readableMap.hasKey("enabled")) {
                boolean z = readableMap.getBoolean("enabled");
                if (t.e != null && t.j != z) {
                    UiThreadUtil.runOnUiThread(new v7(t, 3));
                }
                t.j = z;
            }
            if (readableMap.hasKey("hitSlop")) {
                if (readableMap.getType("hitSlop") == ReadableType.Number) {
                    float fG = nn2.G((float) readableMap.getDouble("hitSlop"));
                    t.A(fG, fG, fG, fG, Float.NaN, Float.NaN);
                } else {
                    ReadableMap map = readableMap.getMap("hitSlop");
                    map.getClass();
                    float fG2 = map.hasKey("horizontal") ? nn2.G((float) map.getDouble("horizontal")) : Float.NaN;
                    float fG3 = fG2;
                    float fG4 = map.hasKey("vertical") ? nn2.G((float) map.getDouble("vertical")) : Float.NaN;
                    float fG5 = fG4;
                    if (map.hasKey(GesturesListener.SCROLL_DIRECTION_LEFT)) {
                        fG2 = nn2.G((float) map.getDouble(GesturesListener.SCROLL_DIRECTION_LEFT));
                    }
                    if (map.hasKey("top")) {
                        fG4 = nn2.G((float) map.getDouble("top"));
                    }
                    if (map.hasKey(GesturesListener.SCROLL_DIRECTION_RIGHT)) {
                        fG3 = nn2.G((float) map.getDouble(GesturesListener.SCROLL_DIRECTION_RIGHT));
                    }
                    if (map.hasKey("bottom")) {
                        fG5 = nn2.G((float) map.getDouble("bottom"));
                    }
                    float fG6 = map.hasKey("width") ? nn2.G((float) map.getDouble("width")) : Float.NaN;
                    t.A(fG2, fG4, fG3, fG5, fG6, map.hasKey("height") ? nn2.G((float) map.getDouble("height")) : Float.NaN);
                }
            }
            if (readableMap.hasKey("needsPointerData")) {
                t.q = readableMap.getBoolean("needsPointerData");
            }
            if (readableMap.hasKey("manualActivation")) {
                t.v = readableMap.getBoolean("manualActivation");
            }
            if (readableMap.hasKey("mouseButton")) {
                t.E = readableMap.getInt("mouseButton");
            }
        }
    }

    public static final class b {
        public final int a;
        public float b;
        public float c;
        public float d;
        public float e;

        public b(float f, float f2, float f3, float f4, int i) {
            this.a = i;
            this.b = f;
            this.c = f2;
            this.d = f3;
            this.e = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && Float.compare(this.b, bVar.b) == 0 && Float.compare(this.c, bVar.c) == 0 && Float.compare(this.d, bVar.d) == 0 && Float.compare(this.e, bVar.e) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.e) + k6.c(k6.c(k6.c(Integer.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31);
        }

        public final String toString() {
            return "PointerData(pointerId=" + this.a + ", x=" + this.b + ", y=" + this.c + ", absoluteX=" + this.d + ", absoluteY=" + this.e + ")";
        }
    }

    public GestureHandler() {
        int[] iArr = new int[2];
        for (int i = 0; i < 2; i++) {
            iArr[i] = 0;
        }
        this.c = iArr;
        this.j = true;
        b[] bVarArr = new b[12];
        for (int i2 = 0; i2 < 12; i2++) {
            bVarArr[i2] = null;
        }
        this.p = bVarArr;
        this.D = 3;
    }

    public static WritableMap f(b bVar) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("id", bVar.a);
        writableMapCreateMap.putDouble("x", nn2.C(bVar.b));
        writableMapCreateMap.putDouble("y", nn2.C(bVar.c));
        writableMapCreateMap.putDouble("absoluteX", nn2.C(bVar.d));
        writableMapCreateMap.putDouble("absoluteY", nn2.C(bVar.e));
        return writableMapCreateMap;
    }

    public static Activity m(Context context) {
        if (context instanceof ReactContext) {
            return ((ReactContext) context).getCurrentActivity();
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final void A(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.r == null) {
            this.r = new float[6];
        }
        float[] fArr = this.r;
        fArr.getClass();
        fArr[0] = f;
        float[] fArr2 = this.r;
        fArr2.getClass();
        fArr2[1] = f2;
        float[] fArr3 = this.r;
        fArr3.getClass();
        fArr3[2] = f3;
        float[] fArr4 = this.r;
        fArr4.getClass();
        fArr4[3] = f4;
        float[] fArr5 = this.r;
        fArr5.getClass();
        fArr5[4] = f5;
        float[] fArr6 = this.r;
        fArr6.getClass();
        fArr6[5] = f6;
        if (!Float.isNaN(f5) && !Float.isNaN(f) && !Float.isNaN(f3)) {
            l5.q("Cannot have all of left, right and width defined");
            return;
        }
        if (!Float.isNaN(f5) && Float.isNaN(f) && Float.isNaN(f3)) {
            l5.q("When width is set one of left or right pads need to be defined");
            return;
        }
        if (!Float.isNaN(f6) && !Float.isNaN(f4) && !Float.isNaN(f2)) {
            l5.q("Cannot have all of top, bottom and height defined");
        } else if (!Float.isNaN(f6) && Float.isNaN(f4) && Float.isNaN(f2)) {
            l5.q("When height is set one of top or bottom pads need to be defined");
        }
    }

    public final boolean B(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (motionEvent.getToolType(0) == 3) {
            if (motionEvent.getAction() != 0 && motionEvent.getAction() != 1 && motionEvent.getAction() != 6 && motionEvent.getAction() != 5) {
                if (motionEvent.getAction() != 2) {
                    int actionButton = motionEvent.getActionButton();
                    int i = this.E;
                    if (i != 0 ? (actionButton & i) != 0 : actionButton == 1) {
                    }
                }
                if (motionEvent.getAction() == 2) {
                    int buttonState = motionEvent.getButtonState();
                    int i2 = this.E;
                    if (i2 != 0 ? (i2 & buttonState) == 0 : buttonState != 1) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public boolean C(GestureHandler gestureHandler) {
        if (gestureHandler != this && this.C != null) {
            if (gestureHandler instanceof e) {
                return ((e) gestureHandler).N;
            }
            if (gestureHandler instanceof cdc.a) {
                return true;
            }
        }
        return false;
    }

    public boolean D(GestureHandler gestureHandler) {
        int[] iArr;
        gestureHandler.getClass();
        if (gestureHandler == this) {
            return true;
        }
        ycc yccVar = this.C;
        if (yccVar != null && (iArr = yccVar.b.get(this.d)) != null) {
            for (int i : iArr) {
                if (i == gestureHandler.d) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean E(GestureHandler gestureHandler) {
        ycc yccVar;
        int[] iArr;
        gestureHandler.getClass();
        if (gestureHandler != this && (yccVar = this.C) != null && (iArr = yccVar.c.get(this.d)) != null) {
            for (int i : iArr) {
                if (i == gestureHandler.d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void F(int i) {
        int[] iArr = this.a;
        if (iArr[i] != -1) {
            return;
        }
        int i2 = 0;
        while (i2 < this.b) {
            int i3 = 0;
            while (i3 < iArr.length && iArr[i3] != i2) {
                i3++;
            }
            if (i3 == iArr.length) {
                break;
            } else {
                i2++;
            }
        }
        iArr[i] = i2;
        this.b++;
    }

    public final void G(MotionEvent motionEvent, MotionEvent motionEvent2) {
        lra lraVar;
        lra lraVar2;
        int actionMasked = motionEvent.getActionMasked();
        int[] iArr = this.c;
        b[] bVarArr = this.p;
        if (actionMasked == 0 || motionEvent.getActionMasked() == 5) {
            this.l = null;
            this.n = 1;
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            b bVar = new b(motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex()), (motionEvent2.getX(motionEvent.getActionIndex()) + (motionEvent2.getRawX() - motionEvent2.getX())) - iArr[0], (motionEvent2.getY(motionEvent.getActionIndex()) + (motionEvent2.getRawY() - motionEvent2.getY())) - iArr[1], pointerId);
            bVarArr[pointerId] = bVar;
            this.o++;
            c(bVar);
            k();
            if (this.l != null && (lraVar = this.B) != null) {
                lraVar.b(this);
            }
            i(motionEvent, motionEvent2);
            return;
        }
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 6) {
            if (motionEvent.getActionMasked() == 2) {
                i(motionEvent, motionEvent2);
                return;
            }
            return;
        }
        i(motionEvent, motionEvent2);
        k();
        this.l = null;
        this.n = 3;
        int pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
        b bVar2 = new b(motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex()), (motionEvent2.getX(motionEvent.getActionIndex()) + (motionEvent2.getRawX() - motionEvent2.getX())) - iArr[0], (motionEvent2.getY(motionEvent.getActionIndex()) + (motionEvent2.getRawY() - motionEvent2.getY())) - iArr[1], pointerId2);
        bVarArr[pointerId2] = bVar2;
        c(bVar2);
        bVarArr[pointerId2] = null;
        this.o--;
        if (this.l == null || (lraVar2 = this.B) == null) {
            return;
        }
        lraVar2.b(this);
    }

    public void a(boolean z) {
        if (!this.v || z) {
            int i = this.f;
            if (i == 0 || i == 2) {
                q(4);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.MotionEvent b(android.view.MotionEvent r30) throws com.swmansion.gesturehandler.core.GestureHandler.AdaptEventException {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.core.GestureHandler.b(android.view.MotionEvent):android.view.MotionEvent");
    }

    public final void c(b bVar) {
        if (this.l == null) {
            this.l = Arguments.createArray();
        }
        WritableArray writableArray = this.l;
        writableArray.getClass();
        writableArray.pushMap(f(bVar));
    }

    public final void d() {
        if (this.f == 0) {
            q(2);
        }
    }

    public final void e() {
        int i = this.f;
        if (i == 4 || i == 0 || i == 2 || this.H) {
            r();
            q(3);
        }
    }

    public void g(MotionEvent motionEvent) {
        lra lraVar = this.B;
        if (lraVar != null) {
            lraVar.c(this, motionEvent);
        }
    }

    public void h(int i, int i2) {
        lra lraVar = this.B;
        if (lraVar != null) {
            lraVar.a(this, i, i2);
        }
    }

    public final void i(MotionEvent motionEvent, MotionEvent motionEvent2) {
        lra lraVar;
        this.l = null;
        this.n = 2;
        float rawX = motionEvent2.getRawX() - motionEvent2.getX();
        float rawY = motionEvent2.getRawY() - motionEvent2.getY();
        int pointerCount = motionEvent.getPointerCount();
        int i = 0;
        for (int i2 = 0; i2 < pointerCount; i2++) {
            b bVar = this.p[motionEvent.getPointerId(i2)];
            if (bVar != null && (bVar.b != motionEvent.getX(i2) || bVar.c != motionEvent.getY(i2))) {
                bVar.b = motionEvent.getX(i2);
                bVar.c = motionEvent.getY(i2);
                float x = motionEvent2.getX(i2) + rawX;
                int[] iArr = this.c;
                bVar.d = x - iArr[0];
                bVar.e = (motionEvent2.getY(i2) + rawY) - iArr[1];
                c(bVar);
                i++;
            }
        }
        if (i > 0) {
            k();
            if (this.l == null || (lraVar = this.B) == null) {
                return;
            }
            lraVar.b(this);
        }
    }

    public final void j() {
        int i = this.f;
        if (i == 2 || i == 4) {
            q(5);
        }
    }

    public final void k() {
        this.m = null;
        for (b bVar : this.p) {
            if (bVar != null) {
                if (this.m == null) {
                    this.m = Arguments.createArray();
                }
                WritableArray writableArray = this.m;
                writableArray.getClass();
                writableArray.pushMap(f(bVar));
            }
        }
    }

    public final void l() {
        int i = this.f;
        if (i == 4 || i == 0 || i == 2) {
            s();
            q(1);
        }
    }

    public final float n() {
        return (this.t + this.w) - this.c[0];
    }

    public final float o() {
        return (this.u + this.x) - this.c[1];
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0149 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x014a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p(android.view.View r12, float r13, float r14) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.core.GestureHandler.p(android.view.View, float, float):boolean");
    }

    public final void q(int i) {
        lra lraVar;
        UiThreadUtil.assertOnUiThread();
        if (this.f == i) {
            return;
        }
        if (this.o > 0 && (i == 5 || i == 3 || i == 1)) {
            this.n = 4;
            this.l = null;
            k();
            b[] bVarArr = this.p;
            for (b bVar : bVarArr) {
                if (bVar != null) {
                    c(bVar);
                }
            }
            this.o = 0;
            pyd.q(null, 0, bVarArr, bVarArr.length);
            if (this.l != null && (lraVar = this.B) != null) {
                lraVar.b(this);
            }
        }
        int i2 = this.f;
        this.f = i;
        if (i == 4) {
            short s = L;
            L = (short) (s + 1);
            this.s = s;
        }
        rz5 rz5Var = this.A;
        rz5Var.getClass();
        rz5Var.j++;
        PointF pointF = rz5.m;
        if (rz5.a.a(i)) {
            for (GestureHandler gestureHandler : z92.z1(rz5Var.f)) {
                if (rz5.a.c(gestureHandler, this) && rz5Var.h.contains(Integer.valueOf(gestureHandler.d))) {
                    if (i == 5) {
                        gestureHandler.e();
                        if (gestureHandler.f == 5) {
                            gestureHandler.h(3, 2);
                        }
                        gestureHandler.H = false;
                    } else {
                        rz5Var.i(gestureHandler);
                    }
                }
            }
            rz5Var.a();
        }
        if (i == 4) {
            rz5Var.i(this);
        } else if (i2 == 4 || i2 == 5) {
            if (this.G) {
                h(i, i2);
            } else if (i2 == 4 && (i == 3 || i == 1)) {
                h(i, 2);
            }
        } else if (i2 != 0 || i != 3) {
            h(i, i2);
        }
        int i3 = rz5Var.j - 1;
        rz5Var.j = i3;
        if (rz5Var.i || i3 != 0) {
            rz5Var.k = true;
        } else {
            rz5Var.b();
        }
        x();
    }

    public void r() {
    }

    public void s() {
    }

    public void t(MotionEvent motionEvent, MotionEvent motionEvent2) {
        motionEvent2.getClass();
        q(1);
    }

    public final String toString() {
        String simpleName;
        View view = this.e;
        if (view == null) {
            simpleName = null;
        } else {
            view.getClass();
            simpleName = view.getClass().getSimpleName();
        }
        return getClass().getSimpleName() + "@[" + this.d + "]:" + simpleName;
    }

    public void u(MotionEvent motionEvent, MotionEvent motionEvent2) {
        motionEvent2.getClass();
    }

    public void v() {
    }

    public void w() {
    }

    public void x() {
    }

    public void y() {
        this.q = false;
        this.v = false;
        this.z = false;
        if (this.e != null && !this.j) {
            UiThreadUtil.runOnUiThread(new v7(this, 3));
        }
        this.j = true;
        this.r = null;
        this.E = 0;
    }

    public void z() {
    }
}
