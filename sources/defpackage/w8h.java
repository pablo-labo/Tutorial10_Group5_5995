package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class w8h extends t8h {
    public final /* synthetic */ h7h V;

    public w8h(h7h h7hVar) {
        this.V = h7hVar;
    }

    @Override // defpackage.t8h
    public final void b() {
        synchronized (this.V.f) {
            try {
                if (this.V.l.get() > 0 && this.V.l.decrementAndGet() > 0) {
                    this.V.b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                h7h h7hVar = this.V;
                if (h7hVar.n != null) {
                    h7hVar.b.b("Unbind from service.", new Object[0]);
                    h7h h7hVar2 = this.V;
                    h7hVar2.a.unbindService(h7hVar2.m);
                    h7h h7hVar3 = this.V;
                    h7hVar3.g = false;
                    h7hVar3.n = null;
                    h7hVar3.m = null;
                }
                this.V.e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
