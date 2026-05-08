package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.platform.AndroidComposeView;
import defpackage.ax1;
import defpackage.xc6;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class ed6 implements zc6 {
    public static final AtomicBoolean z = new AtomicBoolean(true);
    public final cx1 b;
    public final ax1 c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public float l;
    public boolean m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public long s;
    public long t;
    public float u;
    public float v;
    public boolean w;
    public boolean x;
    public boolean y;

    public ed6(AndroidComposeView androidComposeView, cx1 cx1Var, ax1 ax1Var) {
        this.b = cx1Var;
        this.c = ax1Var;
        RenderNode renderNodeCreate = RenderNode.create("Compose", androidComposeView);
        this.d = renderNodeCreate;
        this.e = 0L;
        this.i = 0L;
        if (z.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                u1d.c(renderNodeCreate, u1d.a(renderNodeCreate));
                u1d.d(renderNodeCreate, u1d.b(renderNodeCreate));
            }
            t1d.a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        d(0);
        this.j = 0;
        this.k = 3;
        this.l = 1.0f;
        this.n = 1.0f;
        this.o = 1.0f;
        long j = da2.b;
        this.s = j;
        this.t = j;
        this.v = 8.0f;
    }

    @Override // defpackage.zc6
    public final void A(int i, int i2, long j) {
        int i3 = (int) (j >> 32);
        int i4 = (int) (4294967295L & j);
        this.d.setLeftTopRightBottom(i, i2, i + i3, i2 + i4);
        if (th7.b(this.e, j)) {
            return;
        }
        if (this.m) {
            this.d.setPivotX(i3 / 2.0f);
            this.d.setPivotY(i4 / 2.0f);
        }
        this.e = j;
    }

    @Override // defpackage.zc6
    public final float B() {
        return 0.0f;
    }

    @Override // defpackage.zc6
    public final boolean C() {
        return this.d.isValid();
    }

    @Override // defpackage.zc6
    public final float D() {
        return this.u;
    }

    @Override // defpackage.zc6
    public final long E() {
        return this.s;
    }

    @Override // defpackage.zc6
    public final long F() {
        return this.t;
    }

    @Override // defpackage.zc6
    public final float G() {
        return this.v;
    }

    @Override // defpackage.zc6
    public final Matrix H() {
        Matrix matrix = this.g;
        if (matrix == null) {
            matrix = new Matrix();
            this.g = matrix;
        }
        this.d.getMatrix(matrix);
        return matrix;
    }

    @Override // defpackage.zc6
    public final int I() {
        return this.k;
    }

    @Override // defpackage.zc6
    public final float J() {
        return this.n;
    }

    @Override // defpackage.zc6
    public final void K(Outline outline, long j) {
        this.i = j;
        this.d.setOutline(outline);
        this.h = outline != null;
        c();
    }

    @Override // defpackage.zc6
    public final void L(ww1 ww1Var) {
        Canvas canvas = z40.a;
        DisplayListCanvas displayListCanvas = ((y40) ww1Var).a;
        displayListCanvas.getClass();
        displayListCanvas.drawRenderNode(this.d);
    }

    @Override // defpackage.zc6
    public final void M(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.m = true;
            this.d.setPivotX(((int) (this.e >> 32)) / 2.0f);
            this.d.setPivotY(((int) (4294967295L & this.e)) / 2.0f);
        } else {
            this.m = false;
            this.d.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // defpackage.zc6
    public final float N() {
        return this.q;
    }

    @Override // defpackage.zc6
    public final void O(iy3 iy3Var, vl8 vl8Var, xc6 xc6Var, xc6.a aVar) {
        Canvas canvasStart = this.d.start(Math.max((int) (this.e >> 32), (int) (this.i >> 32)), Math.max((int) (this.e & 4294967295L), (int) (this.i & 4294967295L)));
        try {
            y40 y40Var = this.b.a;
            Canvas canvas = y40Var.a;
            y40Var.a = canvasStart;
            ax1 ax1Var = this.c;
            ax1.b bVar = ax1Var.b;
            long jY = hh1.Y(this.e);
            iy3 iy3VarB = bVar.b();
            vl8 vl8VarC = bVar.c();
            ww1 ww1VarA = bVar.a();
            long jD = bVar.d();
            xc6 xc6Var2 = bVar.b;
            bVar.f(iy3Var);
            bVar.g(vl8Var);
            bVar.e(y40Var);
            bVar.h(jY);
            bVar.b = xc6Var;
            y40Var.o();
            try {
                aVar.invoke(ax1Var);
                y40Var.h();
                bVar.f(iy3VarB);
                bVar.g(vl8VarC);
                bVar.e(ww1VarA);
                bVar.h(jD);
                bVar.b = xc6Var2;
                y40Var.a = canvas;
            } catch (Throwable th) {
                y40Var.h();
                ax1.b bVar2 = ax1Var.b;
                bVar2.f(iy3VarB);
                bVar2.g(vl8VarC);
                bVar2.e(ww1VarA);
                bVar2.h(jD);
                bVar2.b = xc6Var2;
                throw th;
            }
        } finally {
            this.d.end(canvasStart);
        }
    }

    @Override // defpackage.zc6
    public final float P() {
        return this.p;
    }

    @Override // defpackage.zc6
    public final float Q() {
        return 0.0f;
    }

    @Override // defpackage.zc6
    public final void R(int i) {
        this.j = i;
        k();
    }

    @Override // defpackage.zc6
    public final float S() {
        return this.r;
    }

    @Override // defpackage.zc6
    public final float T() {
        return this.o;
    }

    @Override // defpackage.zc6
    public final float a() {
        return this.l;
    }

    @Override // defpackage.zc6
    public final void b(float f) {
        this.l = f;
        this.d.setAlpha(f);
    }

    public final void c() {
        boolean z2 = this.w;
        boolean z3 = false;
        boolean z4 = z2 && !this.h;
        if (z2 && this.h) {
            z3 = true;
        }
        if (z4 != this.x) {
            this.x = z4;
            this.d.setClipToBounds(z4);
        }
        if (z3 != this.y) {
            this.y = z3;
            this.d.setClipToOutline(z3);
        }
    }

    public final void d(int i) {
        RenderNode renderNode = this.d;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // defpackage.zc6
    public final void e(float f) {
        this.q = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.zc6
    public final void f(int i) {
        if (this.k == i) {
            return;
        }
        this.k = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(x40.b(i)));
        k();
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
            this.s = j;
            u1d.c(this.d, pnb.P(j));
        }
    }

    public final void k() {
        int i = this.j;
        if (i != 1 && this.k == 3) {
            d(i);
        } else {
            d(1);
        }
    }

    @Override // defpackage.zc6
    public final void l() {
        k();
    }

    @Override // defpackage.zc6
    public final void m(float f) {
        this.n = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.zc6
    public final void n(boolean z2) {
        this.w = z2;
        c();
    }

    @Override // defpackage.zc6
    public final void o(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.t = j;
            u1d.d(this.d, pnb.P(j));
        }
    }

    @Override // defpackage.zc6
    public final void q(float f) {
        this.v = f;
        this.d.setCameraDistance(-f);
    }

    @Override // defpackage.zc6
    public final void s(float f) {
        this.r = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.zc6
    public final void t(float f) {
        this.u = f;
        this.d.setRotation(f);
    }

    @Override // defpackage.zc6
    public final void u(float f) {
        this.o = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.zc6
    public final void x(float f) {
        this.p = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.zc6
    public final void y() {
        t1d.a(this.d);
    }

    @Override // defpackage.zc6
    public final int z() {
        return this.j;
    }
}
