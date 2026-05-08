package defpackage;

import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class mb6 implements ct2 {
    public final sb6 a;
    public final Path.FillType b;
    public final ec0 c;
    public final fc0 d;
    public final jc0 e;
    public final jc0 f;
    public final String g;
    public final boolean h;

    public mb6(String str, sb6 sb6Var, Path.FillType fillType, ec0 ec0Var, fc0 fc0Var, jc0 jc0Var, jc0 jc0Var2, boolean z) {
        this.a = sb6Var;
        this.b = fillType;
        this.c = ec0Var;
        this.d = fc0Var;
        this.e = jc0Var;
        this.f = jc0Var2;
        this.g = str;
        this.h = z;
    }

    @Override // defpackage.ct2
    public final ks2 a(j79 j79Var, s69 s69Var, ba1 ba1Var) {
        return new nb6(j79Var, s69Var, ba1Var, this);
    }
}
