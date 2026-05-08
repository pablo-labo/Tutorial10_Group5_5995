package defpackage;

import android.graphics.Color;
import android.graphics.Matrix;
import defpackage.z91;

/* JADX INFO: loaded from: classes.dex */
public final class kd4 implements z91.a {
    public final ba1 a;
    public final ba1 b;
    public final ia2 c;
    public final di5 d;
    public final di5 e;
    public final di5 f;
    public final di5 g;
    public Matrix h;

    public kd4(ba1 ba1Var, ba1 ba1Var2, id4 id4Var) {
        this.b = ba1Var;
        this.a = ba1Var2;
        z91<?, ?> z91VarT = id4Var.a.t();
        this.c = (ia2) z91VarT;
        z91VarT.a(this);
        ba1Var2.f(z91VarT);
        di5 di5VarT = id4Var.b.t();
        this.d = di5VarT;
        di5VarT.a(this);
        ba1Var2.f(di5VarT);
        di5 di5VarT2 = id4Var.c.t();
        this.e = di5VarT2;
        di5VarT2.a(this);
        ba1Var2.f(di5VarT2);
        di5 di5VarT3 = id4Var.d.t();
        this.f = di5VarT3;
        di5VarT3.a(this);
        ba1Var2.f(di5VarT3);
        di5 di5VarT4 = id4Var.e.t();
        this.g = di5VarT4;
        di5VarT4.a(this);
        ba1Var2.f(di5VarT4);
    }

    @Override // z91.a
    public final void a() {
        this.b.a();
    }

    public final hd4 b(Matrix matrix, int i) {
        float fJ = this.e.j() * 0.017453292f;
        float fFloatValue = this.f.e().floatValue();
        double d = fJ;
        float fSin = ((float) Math.sin(d)) * fFloatValue;
        float fCos = ((float) Math.cos(d + 3.141592653589793d)) * fFloatValue;
        float fFloatValue2 = this.g.e().floatValue();
        int iIntValue = this.c.e().intValue();
        int iArgb = Color.argb(Math.round((this.d.e().floatValue() * i) / 255.0f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue));
        hd4 hd4Var = new hd4();
        hd4Var.a = fFloatValue2 * 0.33f;
        hd4Var.b = fSin;
        hd4Var.c = fCos;
        hd4Var.d = iArgb;
        hd4Var.e = null;
        hd4Var.c(matrix);
        if (this.h == null) {
            this.h = new Matrix();
        }
        this.a.w.d().invert(this.h);
        hd4Var.c(this.h);
        return hd4Var;
    }
}
