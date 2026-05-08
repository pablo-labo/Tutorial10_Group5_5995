package defpackage;

import defpackage.xce;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class pb6 implements ct2 {
    public final String a;
    public final sb6 b;
    public final ec0 c;
    public final fc0 d;
    public final jc0 e;
    public final jc0 f;
    public final dc0 g;
    public final xce.a h;
    public final xce.b i;
    public final float j;
    public final ArrayList k;
    public final dc0 l;
    public final boolean m;

    public pb6(String str, sb6 sb6Var, ec0 ec0Var, fc0 fc0Var, jc0 jc0Var, jc0 jc0Var2, dc0 dc0Var, xce.a aVar, xce.b bVar, float f, ArrayList arrayList, dc0 dc0Var2, boolean z) {
        this.a = str;
        this.b = sb6Var;
        this.c = ec0Var;
        this.d = fc0Var;
        this.e = jc0Var;
        this.f = jc0Var2;
        this.g = dc0Var;
        this.h = aVar;
        this.i = bVar;
        this.j = f;
        this.k = arrayList;
        this.l = dc0Var2;
        this.m = z;
    }

    @Override // defpackage.ct2
    public final ks2 a(j79 j79Var, s69 s69Var, ba1 ba1Var) {
        return new qb6(j79Var, ba1Var, this);
    }
}
