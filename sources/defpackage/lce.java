package defpackage;

import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class lce implements ct2 {
    public final boolean a;
    public final Path.FillType b;
    public final String c;
    public final cc0 d;
    public final fc0 e;
    public final boolean f;

    public lce(String str, boolean z, Path.FillType fillType, cc0 cc0Var, fc0 fc0Var, boolean z2) {
        this.c = str;
        this.a = z;
        this.b = fillType;
        this.d = cc0Var;
        this.e = fc0Var;
        this.f = z2;
    }

    @Override // defpackage.ct2
    public final ks2 a(j79 j79Var, s69 s69Var, ba1 ba1Var) {
        return new jb5(j79Var, ba1Var, this);
    }

    public final String toString() {
        return m6.i(new StringBuilder("ShapeFill{color=, fillEnabled="), this.a, '}');
    }
}
