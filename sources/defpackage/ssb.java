package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ssb implements jr7 {
    public final g3a<jz2<j6g>> a;
    public final g3a b;

    public ssb() {
        g3a<jz2<j6g>> g3aVar = new g3a<>();
        this.a = g3aVar;
        this.b = g3aVar;
    }

    @Override // defpackage.jr7
    public final j6g a() {
        j6g j6gVar = j6g.a;
        this.a.k(new jz2<>(j6gVar));
        return j6gVar;
    }

    @Override // defpackage.jr7
    public final Object b(c9f c9fVar) {
        e94.a.clear();
        ((kq7) cr8.p(kq7.class)).e("Profile", "IsNativeProfileInitialized", false);
        return j6g.a;
    }
}
