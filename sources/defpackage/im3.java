package defpackage;

import defpackage.n82;

/* JADX INFO: loaded from: classes2.dex */
public final class im3<T> extends n82<T> {
    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.a) {
                    super.finalize();
                    return;
                }
                T tA = this.b.a();
                s55.p("DefaultCloseableReference", "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.b)), tA == null ? null : tA.getClass().getName());
                n82.c cVar = this.c;
                if (cVar != null) {
                    cVar.a(this.b, this.d);
                }
                close();
                super.finalize();
            }
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    @Override // defpackage.n82
    /* JADX INFO: renamed from: h */
    public final n82<T> clone() {
        web.i(Q());
        return new im3(this.b, this.c, this.d != null ? new Throwable() : null);
    }
}
