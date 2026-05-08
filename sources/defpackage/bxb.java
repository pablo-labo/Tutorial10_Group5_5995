package defpackage;

import defpackage.grg;

/* JADX INFO: loaded from: classes3.dex */
public final class bxb extends grg.d {
    public final zcd b;

    public bxb(zcd zcdVar) {
        zcdVar.getClass();
        this.b = zcdVar;
    }

    @Override // grg.d, grg.c
    public final <T extends brg> T c(Class<T> cls) {
        return new yvb(this.b);
    }
}
