package defpackage;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class u42 implements ct2 {
    public final String a;
    public final tc0<PointF, PointF> b;
    public final jc0 c;
    public final boolean d;
    public final boolean e;

    public u42(String str, tc0<PointF, PointF> tc0Var, jc0 jc0Var, boolean z, boolean z2) {
        this.a = str;
        this.b = tc0Var;
        this.c = jc0Var;
        this.d = z;
        this.e = z2;
    }

    @Override // defpackage.ct2
    public final ks2 a(j79 j79Var, s69 s69Var, ba1 ba1Var) {
        return new zp4(j79Var, ba1Var, this);
    }
}
