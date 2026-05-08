package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class s1 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ lf3 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ u1 d;

    public s1(u1 u1Var, boolean z, lf3 lf3Var, boolean z2) {
        this.d = u1Var;
        this.a = z;
        this.b = lf3Var;
        this.c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.a;
        lf3 lf3Var = this.b;
        u1 u1Var = this.d;
        if (z) {
            lf3Var.a(u1Var);
        } else if (this.c) {
            lf3Var.getClass();
        } else {
            lf3Var.b(u1Var);
        }
    }
}
