package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class p8i implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ c8i b;

    public p8i(c8i c8iVar, long j) {
        this.b = c8iVar;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c8i c8iVar = this.b;
        c8iVar.a.p().k(this.a);
        c8iVar.e = null;
    }
}
