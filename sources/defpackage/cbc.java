package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cbc implements jr7 {
    public final g3a<jz2<Boolean>> a;
    public final g3a b;

    public cbc() {
        g3a<jz2<Boolean>> g3aVar = new g3a<>();
        this.a = g3aVar;
        this.b = g3aVar;
    }

    @Override // defpackage.jr7
    public final j6g a() {
        this.a.k(new jz2<>(Boolean.TRUE));
        return j6g.a;
    }

    @Override // defpackage.jr7
    public final Object b(c9f c9fVar) {
        this.a.k(new jz2<>(Boolean.FALSE));
        return j6g.a;
    }
}
