package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sbi implements Runnable {
    public final /* synthetic */ pvh a;
    public final /* synthetic */ ibi b;

    public sbi(ibi ibiVar, pvh pvhVar) {
        this.b = ibiVar;
        this.a = pvhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b) {
            try {
                this.b.a = false;
                if (!this.b.c.r()) {
                    this.b.c.zzr().b0.b("Connected to remote service");
                    y8i y8iVar = this.b.c;
                    pvh pvhVar = this.a;
                    y8iVar.b();
                    y8iVar.d = pvhVar;
                    y8iVar.u();
                    y8iVar.w();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
