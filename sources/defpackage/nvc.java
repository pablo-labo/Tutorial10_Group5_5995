package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nvc extends yuc implements av7 {
    public final Enum<?> b;

    public nvc(n8a n8aVar, Enum<?> r2) {
        super(n8aVar);
        this.b = r2;
    }

    @Override // defpackage.av7
    public final a62 a() {
        Class<?> enclosingClass = this.b.getClass();
        if (!enclosingClass.isEnum()) {
            enclosingClass = enclosingClass.getEnclosingClass();
        }
        enclosingClass.getClass();
        return wuc.a(enclosingClass);
    }

    @Override // defpackage.av7
    public final n8a b() {
        return n8a.h(this.b.name());
    }
}
