package defpackage;

import defpackage.qn9;

/* JADX INFO: loaded from: classes.dex */
public final class nrc implements qn9 {
    public final dwe a;
    public final nug b;
    public final Object c = new Object();

    public nrc(dwe dweVar, nug nugVar) {
        this.a = dweVar;
        this.b = nugVar;
    }

    @Override // defpackage.qn9
    public final long a() {
        long jA;
        synchronized (this.c) {
            jA = this.a.a();
        }
        return jA;
    }

    @Override // defpackage.qn9
    public final qn9.c b(qn9.b bVar) {
        qn9.c cVarB;
        synchronized (this.c) {
            try {
                cVarB = this.a.b(bVar);
                if (cVarB == null) {
                    cVarB = this.b.b(bVar);
                }
                if (cVarB != null && !cVarB.a.b()) {
                    synchronized (this.c) {
                        this.a.e(bVar);
                        this.b.e(bVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVarB;
    }

    @Override // defpackage.qn9
    public final void clear() {
        synchronized (this.c) {
            this.a.clear();
            this.b.clear();
            j6g j6gVar = j6g.a;
        }
    }

    @Override // defpackage.qn9
    public final void d(long j) {
        synchronized (this.c) {
            this.a.d(j);
            j6g j6gVar = j6g.a;
        }
    }

    @Override // defpackage.qn9
    public final void e(qn9.b bVar, qn9.c cVar) {
        synchronized (this.c) {
            long jA = cVar.a.a();
            if (jA < 0) {
                throw new IllegalStateException(("Image size must be non-negative: " + jA).toString());
            }
            this.a.c(bVar, cVar.a, cVar.b, jA);
            j6g j6gVar = j6g.a;
        }
    }
}
