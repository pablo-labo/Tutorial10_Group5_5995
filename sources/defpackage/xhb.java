package defpackage;

import defpackage.whb;

/* JADX INFO: loaded from: classes2.dex */
public final class xhb implements Runnable {
    public final /* synthetic */ whb.a a;

    public xhb(whb.a aVar) {
        this.a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n82<l82> n82Var;
        int i;
        boolean zM;
        synchronized (this.a) {
            whb.a aVar = this.a;
            n82Var = aVar.g;
            i = aVar.h;
            aVar.g = null;
            aVar.i = false;
        }
        if (n82.W(n82Var)) {
            try {
                whb.a.i(this.a, n82Var, i);
                n82Var.close();
            } catch (Throwable th) {
                n82.G(n82Var);
                throw th;
            }
        }
        whb.a aVar2 = this.a;
        synchronized (aVar2) {
            aVar2.j = false;
            zM = aVar2.m();
        }
        if (zM) {
            whb.this.c.execute(new xhb(aVar2));
        }
    }
}
