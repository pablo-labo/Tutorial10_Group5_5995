package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class guh implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ lfh b;

    public guh(lfh lfhVar, long j) {
        this.b = lfhVar;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.o(this.a);
    }
}
