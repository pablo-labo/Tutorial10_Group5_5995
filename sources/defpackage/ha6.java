package defpackage;

import android.graphics.Canvas;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes.dex */
public final class ha6 extends zs3 implements eb4 {
    public final i70 f0;
    public final ff4 g0;
    public final gza h0;

    public ha6(k1f k1fVar, i70 i70Var, ff4 ff4Var, gza gzaVar) {
        this.f0 = i70Var;
        this.g0 = ff4Var;
        this.h0 = gzaVar;
        c2(k1fVar);
    }

    public static boolean f2(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // defpackage.eb4
    public final void y(sm8 sm8Var) {
        boolean zF2;
        char c;
        long j;
        ax1 ax1Var = sm8Var.a;
        long jC = ax1Var.c();
        i70 i70Var = this.f0;
        i70Var.l(jC);
        if (kie.e(ax1Var.c())) {
            sm8Var.N1();
            return;
        }
        sm8Var.N1();
        ((gme) i70Var.d).getValue();
        Canvas canvasA = z40.a(ax1Var.b.a());
        ff4 ff4Var = this.g0;
        boolean zF = ff4.f(ff4Var.f);
        gza gzaVar = this.h0;
        if (zF) {
            zF2 = f2(270.0f, (((long) Float.floatToRawIntBits(sm8Var.t1(gzaVar.b(sm8Var.getLayoutDirection())))) & 4294967295L) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (ax1Var.c() & 4294967295L)))) << 32), ff4Var.c(), canvasA);
        } else {
            zF2 = false;
        }
        if (ff4.f(ff4Var.d)) {
            c = ' ';
            j = 4294967295L;
            zF2 = f2(0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(sm8Var.t1(gzaVar.d()))) & 4294967295L), ff4Var.e(), canvasA) || zF2;
        } else {
            c = ' ';
            j = 4294967295L;
        }
        if (ff4.f(ff4Var.g)) {
            zF2 = f2(90.0f, (((long) Float.floatToRawIntBits(sm8Var.t1(gzaVar.c(sm8Var.getLayoutDirection())) + (-((float) gf9.b(Float.intBitsToFloat((int) (ax1Var.c() >> c))))))) & j) | (((long) Float.floatToRawIntBits(0.0f)) << c), ff4Var.d(), canvasA) || zF2;
        }
        if (ff4.f(ff4Var.e)) {
            EdgeEffect edgeEffectB = ff4Var.b();
            zF2 = f2(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (ax1Var.c() >> c)))) << c) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (ax1Var.c() & j))) + sm8Var.t1(gzaVar.a()))) & j), edgeEffectB, canvasA) || zF2;
        }
        if (zF2) {
            i70Var.f();
        }
    }
}
