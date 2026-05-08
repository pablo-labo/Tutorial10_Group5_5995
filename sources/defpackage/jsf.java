package defpackage;

import defpackage.csf;

/* JADX INFO: loaded from: classes.dex */
public final class jsf implements l74 {
    public final /* synthetic */ csf a;
    public final /* synthetic */ csf.d b;

    public jsf(csf csfVar, csf.d dVar) {
        this.a = csfVar;
        this.b = dVar;
    }

    @Override // defpackage.l74
    public final void dispose() {
        this.a.i.remove(this.b);
    }
}
