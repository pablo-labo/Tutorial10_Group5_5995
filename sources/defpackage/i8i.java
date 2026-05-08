package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class i8i implements Runnable {
    public final /* synthetic */ f8i a;
    public final /* synthetic */ f8i b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ c8i e;

    public i8i(c8i c8iVar, f8i f8iVar, f8i f8iVar2, long j, boolean z) {
        this.e = c8iVar;
        this.a = f8iVar;
        this.b = f8iVar2;
        this.c = j;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.s(this.a, this.b, this.c, this.d, null);
    }
}
