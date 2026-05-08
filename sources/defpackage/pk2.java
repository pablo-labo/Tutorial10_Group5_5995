package defpackage;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import defpackage.ax1;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class pk2 extends View.DragShadowBuilder {
    public final jy3 a;
    public final long b;
    public final Function1<gb4, j6g> c;

    public pk2(jy3 jy3Var, long j, Function1 function1) {
        this.a = jy3Var;
        this.b = j;
        this.c = function1;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        ax1 ax1Var = new ax1();
        Canvas canvas2 = z40.a;
        y40 y40Var = new y40();
        y40Var.a = canvas;
        ax1.a aVar = ax1Var.a;
        iy3 iy3Var = aVar.a;
        vl8 vl8Var = aVar.b;
        ww1 ww1Var = aVar.c;
        long j = aVar.d;
        aVar.a = this.a;
        aVar.b = vl8.a;
        aVar.c = y40Var;
        aVar.d = this.b;
        y40Var.o();
        this.c.invoke(ax1Var);
        y40Var.h();
        aVar.a = iy3Var;
        aVar.b = vl8Var;
        aVar.c = ww1Var;
        aVar.d = j;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j = this.b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        jy3 jy3Var = this.a;
        point.set(jy3Var.x0(fIntBitsToFloat / jy3Var.getDensity()), jy3Var.x0(Float.intBitsToFloat((int) (j & 4294967295L)) / jy3Var.getDensity()));
        point2.set(point.x / 2, point.y / 2);
    }
}
