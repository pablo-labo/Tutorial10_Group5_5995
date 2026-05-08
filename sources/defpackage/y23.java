package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class y23 implements Runnable {
    public final /* synthetic */ a33 a;

    public y23(a33 a33Var) {
        this.a = a33Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d.set(Boolean.TRUE);
    }
}
