package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import defpackage.ax1;
import defpackage.xc6;

/* JADX INFO: loaded from: classes.dex */
public final class fd6 implements zc6 {
    public final cx1 b;
    public final ax1 c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public float i;
    public int j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public long p;
    public long q;
    public float r;
    public float s;
    public boolean t;
    public boolean u;
    public boolean v;
    public int w;

    public fd6() {
        cx1 cx1Var = new cx1();
        ax1 ax1Var = new ax1();
        this.b = cx1Var;
        this.c = ax1Var;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.d = renderNode;
        this.e = 0L;
        renderNode.setClipToBounds(false);
        d(renderNode, 0);
        this.i = 1.0f;
        this.j = 3;
        this.k = 1.0f;
        this.l = 1.0f;
        long j = da2.b;
        this.p = j;
        this.q = j;
        this.s = 8.0f;
        this.w = 0;
    }

    @Override // defpackage.zc6
    public final void A(int i, int i2, long j) {
        this.d.setPosition(i, i2, ((int) (j >> 32)) + i, ((int) (4294967295L & j)) + i2);
        this.e = hh1.Y(j);
    }

    @Override // defpackage.zc6
    public final float B() {
        return 0.0f;
    }

    @Override // defpackage.zc6
    public final boolean C() {
        return this.d.hasDisplayList();
    }

    @Override // defpackage.zc6
    public final float D() {
        return this.r;
    }

    @Override // defpackage.zc6
    public final long E() {
        return this.p;
    }

    @Override // defpackage.zc6
    public final long F() {
        return this.q;
    }

    @Override // defpackage.zc6
    public final float G() {
        return this.s;
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
        return this.j;
    }

    @Override // defpackage.zc6
    public final float J() {
        return this.k;
    }

    @Override // defpackage.zc6
    public final void K(Outline outline, long j) {
        this.d.setOutline(outline);
        this.h = outline != null;
        c();
    }

    @Override // defpackage.zc6
    public final void L(ww1 ww1Var) {
        Canvas canvas = z40.a;
        ((y40) ww1Var).a.drawRenderNode(this.d);
    }

    @Override // defpackage.zc6
    public final void M(long j) {
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.d;
        if (j2 == 9205357640488583168L) {
            renderNode.resetPivot();
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // defpackage.zc6
    public final float N() {
        return this.n;
    }

    @Override // defpackage.zc6
    public final void O(iy3 iy3Var, vl8 vl8Var, xc6 xc6Var, xc6.a aVar) {
        ax1 ax1Var = this.c;
        RecordingCanvas recordingCanvasBeginRecording = this.d.beginRecording();
        try {
            cx1 cx1Var = this.b;
            y40 y40Var = cx1Var.a;
            Canvas canvas = y40Var.a;
            y40Var.a = recordingCanvasBeginRecording;
            ax1.b bVar = ax1Var.b;
            bVar.f(iy3Var);
            bVar.g(vl8Var);
            bVar.b = xc6Var;
            bVar.h(this.e);
            bVar.e(y40Var);
            aVar.invoke(ax1Var);
            cx1Var.a.a = canvas;
        } finally {
            this.d.endRecording();
        }
    }

    @Override // defpackage.zc6
    public final float P() {
        return this.m;
    }

    @Override // defpackage.zc6
    public final float Q() {
        return 0.0f;
    }

    @Override // defpackage.zc6
    public final void R(int i) {
        this.w = i;
        k();
    }

    @Override // defpackage.zc6
    public final float S() {
        return this.o;
    }

    @Override // defpackage.zc6
    public final float T() {
        return this.l;
    }

    @Override // defpackage.zc6
    public final float a() {
        return this.i;
    }

    @Override // defpackage.zc6
    public final void b(float f) {
        this.i = f;
        this.d.setAlpha(f);
    }

    public final void c() {
        boolean z = this.t;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.u) {
            this.u = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.v) {
            this.v = z2;
            this.d.setClipToOutline(z2);
        }
    }

    public final void d(RenderNode renderNode, int i) {
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, this.f);
            renderNode.setHasOverlappingRendering(true);
            return;
        }
        Paint paint = this.f;
        if (i == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // defpackage.zc6
    public final void e(float f) {
        this.n = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.zc6
    public final void f(int i) {
        this.j = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setBlendMode(x40.a(i));
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
        this.p = j;
        this.d.setAmbientShadowColor(pnb.P(j));
    }

    public final void k() {
        int i = this.w;
        if (i != 1 && this.j == 3) {
            d(this.d, i);
        } else {
            d(this.d, 1);
        }
    }

    @Override // defpackage.zc6
    public final void l() {
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setColorFilter(null);
        k();
    }

    @Override // defpackage.zc6
    public final void m(float f) {
        this.k = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.zc6
    public final void n(boolean z) {
        this.t = z;
        c();
    }

    @Override // defpackage.zc6
    public final void o(long j) {
        this.q = j;
        this.d.setSpotShadowColor(pnb.P(j));
    }

    @Override // defpackage.zc6
    public final void q(float f) {
        this.s = f;
        this.d.setCameraDistance(f);
    }

    @Override // defpackage.zc6
    public final void s(float f) {
        this.o = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.zc6
    public final void t(float f) {
        this.r = f;
        this.d.setRotationZ(f);
    }

    @Override // defpackage.zc6
    public final void u(float f) {
        this.l = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.zc6
    public final void x(float f) {
        this.m = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.zc6
    public final void y() {
        this.d.discardDisplayList();
    }

    @Override // defpackage.zc6
    public final int z() {
        return this.w;
    }
}
