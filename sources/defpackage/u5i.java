package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class u5i implements Runnable {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ m4i b;

    public u5i(m4i m4iVar, AtomicReference atomicReference) {
        this.b = m4iVar;
        this.a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a) {
            try {
                try {
                    AtomicReference atomicReference = this.a;
                    i0i i0iVar = this.b.a;
                    wmi wmiVar = i0iVar.V;
                    zvh zvhVarO = i0iVar.o();
                    zvhVarO.k();
                    String str = zvhVarO.c;
                    wmiVar.getClass();
                    svh<String> svhVar = djh.L;
                    atomicReference.set(str == null ? svhVar.a(null) : svhVar.a(wmiVar.c.c(str, svhVar.a)));
                } finally {
                    this.a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
