package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a1b implements cq8 {
    public final e2b a;

    public a1b(e2b e2bVar) {
        this.a = e2bVar;
    }

    @Override // defpackage.cq8
    public final int a() {
        return this.a.o();
    }

    @Override // defpackage.cq8
    public final int b() {
        int i;
        e2b e2bVar = this.a;
        if (e2bVar.n().g().size() == 0) {
            return 0;
        }
        o1b o1bVarN = e2bVar.n();
        int iB = (int) (o1bVarN.a() == dwa.a ? o1bVarN.b() & 4294967295L : o1bVarN.b() >> 32);
        int iH = e2bVar.n().h() + e2bVar.n().f();
        if (iH != 0 && (i = iB / iH) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.cq8
    public final boolean c() {
        return !this.a.n().g().isEmpty();
    }

    @Override // defpackage.cq8
    public final int d() {
        return Math.max(0, this.a.e);
    }

    @Override // defpackage.cq8
    public final int e() {
        return Math.min(r1.o() - 1, ((k0b) z92.Y0(this.a.n().g())).getIndex());
    }
}
