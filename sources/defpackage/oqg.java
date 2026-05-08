package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import defpackage.ax1;
import defpackage.zc6;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class oqg extends View {
    public static final a c0 = new a();
    public iy3 V;
    public vl8 W;
    public final cb4 a;
    public Function1<? super gb4, j6g> a0;
    public final cx1 b;
    public xc6 b0;
    public final ax1 c;
    public boolean d;
    public Outline e;
    public boolean f;

    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            Outline outline2;
            if (!(view instanceof oqg) || (outline2 = ((oqg) view).e) == null) {
                return;
            }
            outline.set(outline2);
        }
    }

    public oqg(cb4 cb4Var, cx1 cx1Var, ax1 ax1Var) {
        super(cb4Var.getContext());
        this.a = cb4Var;
        this.b = cx1Var;
        this.c = ax1Var;
        setOutlineProvider(c0);
        this.f = true;
        this.V = pyd.X;
        this.W = vl8.a;
        zc6.a.getClass();
        this.a0 = zc6.a.b;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        cx1 cx1Var = this.b;
        y40 y40Var = cx1Var.a;
        Canvas canvas2 = y40Var.a;
        y40Var.a = canvas;
        iy3 iy3Var = this.V;
        vl8 vl8Var = this.W;
        float width = getWidth();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        xc6 xc6Var = this.b0;
        Function1<? super gb4, j6g> function1 = this.a0;
        ax1 ax1Var = this.c;
        iy3 iy3VarB = ax1Var.b.b();
        ax1.b bVar = ax1Var.b;
        vl8 vl8VarC = bVar.c();
        ww1 ww1VarA = bVar.a();
        long jD = bVar.d();
        xc6 xc6Var2 = bVar.b;
        bVar.f(iy3Var);
        bVar.g(vl8Var);
        bVar.e(y40Var);
        bVar.h(jFloatToRawIntBits);
        bVar.b = xc6Var;
        y40Var.o();
        try {
            function1.invoke(ax1Var);
            y40Var.h();
            bVar.f(iy3VarB);
            bVar.g(vl8VarC);
            bVar.e(ww1VarA);
            bVar.h(jD);
            bVar.b = xc6Var2;
            cx1Var.a.a = canvas2;
            this.d = false;
        } catch (Throwable th) {
            y40Var.h();
            bVar.f(iy3VarB);
            bVar.g(vl8VarC);
            bVar.e(ww1VarA);
            bVar.h(jD);
            bVar.b = xc6Var2;
            throw th;
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.f;
    }

    public final cx1 getCanvasHolder() {
        return this.b;
    }

    public final View getOwnerView() {
        return this.a;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.d) {
            return;
        }
        this.d = true;
        super.invalidate();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z) {
        if (this.f != z) {
            this.f = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.d = z;
    }
}
