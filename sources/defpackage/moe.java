package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class moe extends fh7 {
    public int a;
    public final /* synthetic */ loe<Object> b;

    public moe(loe<Object> loeVar) {
        this.b = loeVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.h();
    }

    @Override // defpackage.fh7
    public final int nextInt() {
        int i = this.a;
        this.a = i + 1;
        return this.b.f(i);
    }
}
