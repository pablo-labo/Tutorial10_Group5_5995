package defpackage;

import defpackage.grg;

/* JADX INFO: loaded from: classes2.dex */
public final class q9d extends grg.d {
    public final g7b b;
    public final qq2 c;

    public q9d(g7b g7bVar, qq2 qq2Var) {
        this.b = g7bVar;
        this.c = qq2Var;
    }

    @Override // grg.d, grg.c
    public final <T extends brg> T c(Class<T> cls) {
        return new p9d(this.b, this.c);
    }
}
