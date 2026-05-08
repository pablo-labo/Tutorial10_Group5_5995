package defpackage;

import defpackage.emf;

/* JADX INFO: loaded from: classes.dex */
public final class wdb extends gq5 {
    public final emf.d f;

    public wdb(emf emfVar) {
        super(emfVar);
        this.f = new emf.d();
    }

    @Override // defpackage.gq5, defpackage.emf
    public final emf.b f(int i, emf.b bVar, boolean z) {
        emf emfVar = this.e;
        emf.b bVarF = emfVar.f(i, bVar, z);
        if (emfVar.m(bVarF.c, this.f, 0L).a()) {
            bVarF.i(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e, ba.f, true);
            return bVarF;
        }
        bVarF.f = true;
        return bVarF;
    }
}
