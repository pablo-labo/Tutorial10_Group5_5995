package defpackage;

import defpackage.csf;

/* JADX INFO: loaded from: classes.dex */
public final class isf implements l74 {
    public final /* synthetic */ csf a;
    public final /* synthetic */ csf.a b;

    public isf(csf csfVar, csf.a aVar) {
        this.a = csfVar;
        this.b = aVar;
    }

    @Override // defpackage.l74
    public final void dispose() {
        csf csfVar = this.a;
        csfVar.getClass();
        csf.a.C0199a c0199a = (csf.a.C0199a) ((gme) this.b.b).getValue();
        if (c0199a != null) {
            csfVar.i.remove(c0199a.a);
        }
    }
}
