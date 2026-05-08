package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class sme<T> {
    public final AtomicReference<ykf> a = new AtomicReference<>(cr8.e);
    public final Object b = new Object();
    public T c;

    public final T a() {
        long jU = hh1.u();
        if (jU == elf.a) {
            return this.c;
        }
        ykf ykfVar = this.a.get();
        int iA = ykfVar.a(jU);
        if (iA >= 0) {
            return (T) ykfVar.c[iA];
        }
        return null;
    }

    public final void b(T t) {
        long jU = hh1.u();
        if (jU == elf.a) {
            this.c = t;
            return;
        }
        synchronized (this.b) {
            ykf ykfVar = this.a.get();
            int iA = ykfVar.a(jU);
            if (iA >= 0) {
                ykfVar.c[iA] = t;
            } else {
                this.a.set(ykfVar.b(t, jU));
                j6g j6gVar = j6g.a;
            }
        }
    }
}
