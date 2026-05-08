package defpackage;

import defpackage.grg;

/* JADX INFO: loaded from: classes3.dex */
public final class n2c extends grg.d {
    public final o8d b;
    public final zcd c;

    public n2c(o8d o8dVar, zcd zcdVar) {
        o8dVar.getClass();
        zcdVar.getClass();
        this.b = o8dVar;
        this.c = zcdVar;
    }

    @Override // grg.d, grg.c
    public final <T extends brg> T c(Class<T> cls) {
        return new x1c(this.b, this.c);
    }
}
