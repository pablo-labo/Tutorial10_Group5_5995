package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class iaf implements Runnable {
    public final /* synthetic */ qq2 a;
    public final /* synthetic */ mu2 b;
    public final /* synthetic */ oaf c;

    public iaf(qq2 qq2Var, mu2 mu2Var, oaf oafVar) {
        this.a = qq2Var;
        this.b = mu2Var;
        this.c = oafVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qq2 qq2Var = this.a;
        oaf oafVar = (oaf) qq2Var.a;
        try {
            this.b.a(this.c);
            if (oafVar.g(null)) {
            } else {
                throw new IllegalStateException("Cannot set the result of a completed task.");
            }
        } catch (CancellationException unused) {
            if (oafVar.f()) {
                return;
            }
            r6.g("Cannot cancel a completed task.");
        } catch (Exception e) {
            qq2Var.e(e);
        }
    }
}
