package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class n33 implements Runnable {
    public final /* synthetic */ nbe a;
    public final /* synthetic */ q33 b;

    public n33(q33 q33Var, nbe nbeVar) {
        this.b = q33Var;
        this.a = nbeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q33.a(this.b, this.a);
    }
}
