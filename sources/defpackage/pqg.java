package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public final class pqg extends View implements qxa {
    public static Method c;
    public static Field d;
    public static boolean e;
    public static boolean f;
    public boolean a;
    public float b;

    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            view.getClass();
            Method method = pqg.c;
            throw null;
        }
    }

    public static final class b {
    }

    static {
        new a();
    }

    private final v5b getManualClipPath() {
        if (getClipToOutline()) {
            throw null;
        }
        return null;
    }

    private final void setInvalidated(boolean z) {
        if (z == this.a) {
            return;
        }
        this.a = z;
        throw null;
    }

    @Override // defpackage.qxa
    public final void a(float[] fArr) {
        throw null;
    }

    @Override // defpackage.qxa
    public final void b(y3a y3aVar, boolean z) {
        if (!z) {
            throw null;
        }
        throw null;
    }

    @Override // defpackage.qxa
    public final void c(pad padVar) {
        int i = padVar.a;
        throw null;
    }

    @Override // defpackage.qxa
    public final long d(long j, boolean z) {
        if (z) {
            throw null;
        }
        throw null;
    }

    @Override // defpackage.qxa
    public final void destroy() {
        setInvalidated(false);
        throw null;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        throw null;
    }

    @Override // defpackage.qxa
    public final void e(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (i == getWidth() && i2 == getHeight()) {
            return;
        }
        int i3 = mrf.c;
        setPivotX(Float.intBitsToFloat(0) * i);
        setPivotY(Float.intBitsToFloat(0) * i2);
        throw null;
    }

    @Override // defpackage.qxa
    public final void f(ww1 ww1Var, xc6 xc6Var) {
        if (getElevation() > 0.0f) {
            ww1Var.j();
        }
        getDrawingTime();
        throw null;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // defpackage.qxa
    public final boolean g(long j) {
        Float.intBitsToFloat((int) (j >> 32));
        Float.intBitsToFloat((int) (j & 4294967295L));
        if (getClipToOutline()) {
            throw null;
        }
        return true;
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final bb4 getContainer() {
        return null;
    }

    public float getFrameRate() {
        return this.b;
    }

    public long getLayerId() {
        return 0L;
    }

    public final AndroidComposeView getOwnerView() {
        return null;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT < 29) {
            return -1L;
        }
        throw null;
    }

    @Override // defpackage.qxa
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo14getUnderlyingMatrixsQKQjiQ() {
        throw null;
    }

    @Override // defpackage.qxa
    public final void h(float[] fArr) {
        throw null;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // defpackage.qxa
    public final void i(Function2<? super ww1, ? super xc6, j6g> function2, gu5<j6g> gu5Var) {
        throw null;
    }

    @Override // android.view.View, defpackage.qxa
    public final void invalidate() {
        if (this.a) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        throw null;
    }

    @Override // defpackage.qxa
    public final void j(long j) {
        int i = (int) (j >> 32);
        if (i != getLeft()) {
            offsetLeftAndRight(i - getLeft());
            throw null;
        }
        int i2 = (int) (j & 4294967295L);
        if (i2 == getTop()) {
            return;
        }
        offsetTopAndBottom(i2 - getTop());
        throw null;
    }

    @Override // defpackage.qxa
    public final void k() {
        if (!this.a || f) {
            return;
        }
        try {
            if (!e) {
                e = true;
                if (Build.VERSION.SDK_INT < 28) {
                    c = View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                    d = View.class.getDeclaredField("mRecreateDisplayList");
                } else {
                    c = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                    d = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                }
                Method method = c;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field = d;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            Field field2 = d;
            if (field2 != null) {
                field2.setBoolean(this, true);
            }
            Method method2 = c;
            if (method2 != null) {
                method2.invoke(this, null);
            }
        } catch (Throwable unused) {
            f = true;
        }
        setInvalidated(false);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public final void setCameraDistancePx(float f2) {
        setCameraDistance(f2 * getResources().getDisplayMetrics().densityDpi);
    }

    public void setFrameRate(float f2) {
        this.b = f2;
    }

    public void setFrameRateFromParent(boolean z) {
    }
}
