package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import defpackage.xc6;

/* JADX INFO: loaded from: classes.dex */
public final class gd6 implements zc6 {
    public static final a z = new a();
    public final cb4 b;
    public final cx1 c;
    public final oqg d;
    public final Resources e;
    public final Rect f;
    public Paint g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public float p;
    public boolean q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public long w;
    public long x;
    public float y;

    public static final class a extends Canvas {
        @Override // android.graphics.Canvas
        public final boolean isHardwareAccelerated() {
            return true;
        }
    }

    public gd6(cb4 cb4Var) {
        cx1 cx1Var = new cx1();
        ax1 ax1Var = new ax1();
        this.b = cb4Var;
        this.c = cx1Var;
        oqg oqgVar = new oqg(cb4Var, cx1Var, ax1Var);
        this.d = oqgVar;
        this.e = cb4Var.getResources();
        this.f = new Rect();
        cb4Var.addView(oqgVar);
        oqgVar.setClipBounds(null);
        this.j = 0L;
        View.generateViewId();
        this.n = 3;
        this.o = 0;
        this.p = 1.0f;
        this.r = 1.0f;
        this.s = 1.0f;
        long j = da2.b;
        this.w = j;
        this.x = j;
    }

    @Override // defpackage.zc6
    public final void A(int i, int i2, long j) {
        boolean zB = th7.b(this.j, j);
        oqg oqgVar = this.d;
        if (zB) {
            int i3 = this.h;
            if (i3 != i) {
                oqgVar.offsetLeftAndRight(i - i3);
            }
            int i4 = this.i;
            if (i4 != i2) {
                oqgVar.offsetTopAndBottom(i2 - i4);
            }
        } else {
            if (this.m || oqgVar.getClipToOutline()) {
                this.k = true;
            }
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            oqgVar.layout(i, i2, i + i5, i2 + i6);
            this.j = j;
            if (this.q) {
                oqgVar.setPivotX(i5 / 2.0f);
                oqgVar.setPivotY(i6 / 2.0f);
            }
        }
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.zc6
    public final float B() {
        return 0.0f;
    }

    @Override // defpackage.zc6
    public final float D() {
        return this.y;
    }

    @Override // defpackage.zc6
    public final long E() {
        return this.w;
    }

    @Override // defpackage.zc6
    public final long F() {
        return this.x;
    }

    @Override // defpackage.zc6
    public final float G() {
        return this.d.getCameraDistance() / this.e.getDisplayMetrics().densityDpi;
    }

    @Override // defpackage.zc6
    public final Matrix H() {
        return this.d.getMatrix();
    }

    @Override // defpackage.zc6
    public final int I() {
        return this.n;
    }

    @Override // defpackage.zc6
    public final float J() {
        return this.r;
    }

    @Override // defpackage.zc6
    public final void K(Outline outline, long j) {
        oqg oqgVar = this.d;
        oqgVar.e = outline;
        oqgVar.invalidateOutline();
        if ((this.m || oqgVar.getClipToOutline()) && outline != null) {
            oqgVar.setClipToOutline(true);
            if (this.m) {
                this.m = false;
                this.k = true;
            }
        }
        this.l = outline != null;
    }

    @Override // defpackage.zc6
    public final void L(ww1 ww1Var) {
        Rect rect;
        boolean z2 = this.k;
        oqg oqgVar = this.d;
        if (z2) {
            if ((this.m || oqgVar.getClipToOutline()) && !this.l) {
                rect = this.f;
                rect.left = 0;
                rect.top = 0;
                rect.right = oqgVar.getWidth();
                rect.bottom = oqgVar.getHeight();
            } else {
                rect = null;
            }
            oqgVar.setClipBounds(rect);
        }
        Canvas canvas = z40.a;
        if (((y40) ww1Var).a.isHardwareAccelerated()) {
            this.b.a(ww1Var, oqgVar, oqgVar.getDrawingTime());
        }
    }

    @Override // defpackage.zc6
    public final void M(long j) {
        long j2 = 9223372034707292159L & j;
        oqg oqgVar = this.d;
        if (j2 != 9205357640488583168L) {
            this.q = false;
            oqgVar.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            oqgVar.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                ppg.a(oqgVar);
                return;
            }
            this.q = true;
            oqgVar.setPivotX(((int) (this.j >> 32)) / 2.0f);
            oqgVar.setPivotY(((int) (this.j & 4294967295L)) / 2.0f);
        }
    }

    @Override // defpackage.zc6
    public final float N() {
        return this.u;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.zc6
    public final void O(iy3 iy3Var, vl8 vl8Var, xc6 xc6Var, xc6.a aVar) {
        oqg oqgVar = this.d;
        ViewParent parent = oqgVar.getParent();
        cb4 cb4Var = this.b;
        if (parent == null) {
            cb4Var.addView(oqgVar);
        }
        oqgVar.V = iy3Var;
        oqgVar.W = vl8Var;
        oqgVar.a0 = aVar;
        oqgVar.b0 = xc6Var;
        if (oqgVar.isAttachedToWindow()) {
            oqgVar.setVisibility(4);
            oqgVar.setVisibility(0);
            try {
                cx1 cx1Var = this.c;
                a aVar2 = z;
                y40 y40Var = cx1Var.a;
                Canvas canvas = y40Var.a;
                y40Var.a = aVar2;
                cb4Var.a(y40Var, oqgVar, oqgVar.getDrawingTime());
                cx1Var.a.a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // defpackage.zc6
    public final float P() {
        return this.t;
    }

    @Override // defpackage.zc6
    public final float Q() {
        return 0.0f;
    }

    @Override // defpackage.zc6
    public final void R(int i) {
        this.o = i;
        d();
    }

    @Override // defpackage.zc6
    public final float S() {
        return this.v;
    }

    @Override // defpackage.zc6
    public final float T() {
        return this.s;
    }

    @Override // defpackage.zc6
    public final float a() {
        return this.p;
    }

    @Override // defpackage.zc6
    public final void b(float f) {
        this.p = f;
        this.d.setAlpha(f);
    }

    public final void c(int i) {
        oqg oqgVar = this.d;
        boolean z2 = true;
        if (i == 1) {
            oqgVar.setLayerType(2, this.g);
        } else {
            Paint paint = this.g;
            if (i == 2) {
                oqgVar.setLayerType(0, paint);
                z2 = false;
            } else {
                oqgVar.setLayerType(0, paint);
            }
        }
        oqgVar.setCanUseCompositingLayer$ui_graphics_release(z2);
    }

    public final void d() {
        int i = this.o;
        if (i != 1 && this.n == 3) {
            c(i);
        } else {
            c(1);
        }
    }

    @Override // defpackage.zc6
    public final void e(float f) {
        this.u = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.zc6
    public final void f(int i) {
        this.n = i;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(x40.b(i)));
        d();
    }

    @Override // defpackage.zc6
    public final ga2 g() {
        return null;
    }

    @Override // defpackage.zc6
    public final void h() {
        this.d.setRotationX(0.0f);
    }

    @Override // defpackage.zc6
    public final void i() {
        this.d.setRotationY(0.0f);
    }

    @Override // defpackage.zc6
    public final void j(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.w = j;
            ppg.b(this.d, pnb.P(j));
        }
    }

    @Override // defpackage.zc6
    public final void l() {
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setColorFilter(null);
        d();
    }

    @Override // defpackage.zc6
    public final void m(float f) {
        this.r = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.zc6
    public final void n(boolean z2) {
        boolean z3 = false;
        this.m = z2 && !this.l;
        this.k = true;
        if (z2 && this.l) {
            z3 = true;
        }
        this.d.setClipToOutline(z3);
    }

    @Override // defpackage.zc6
    public final void o(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.x = j;
            ppg.c(this.d, pnb.P(j));
        }
    }

    @Override // defpackage.zc6
    public final void q(float f) {
        this.d.setCameraDistance(f * this.e.getDisplayMetrics().densityDpi);
    }

    @Override // defpackage.zc6
    public final void s(float f) {
        this.v = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.zc6
    public final void t(float f) {
        this.y = f;
        this.d.setRotation(f);
    }

    @Override // defpackage.zc6
    public final void u(float f) {
        this.s = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.zc6
    public final void x(float f) {
        this.t = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.zc6
    public final void y() {
        this.b.removeViewInLayout(this.d);
    }

    @Override // defpackage.zc6
    public final int z() {
        return this.o;
    }
}
