package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rz7 implements Runnable {
    public final /* synthetic */ sz7 a;

    public rz7(sz7 sz7Var) {
        this.a = sz7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sz7 sz7Var = this.a;
        sz7Var.a.execute(sz7Var.c);
    }
}
