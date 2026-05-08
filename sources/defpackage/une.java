package defpackage;

import defpackage.g37;

/* JADX INFO: loaded from: classes.dex */
public final class une implements g37 {
    public final pa5 a;
    public final g37.a b;
    public final Object c = new Object();
    public boolean d;
    public final to1 e;

    public une(to1 to1Var, pa5 pa5Var, g37.a aVar) {
        this.a = pa5Var;
        this.b = aVar;
        this.e = to1Var;
    }

    @Override // defpackage.g37
    public final w5b C1() {
        synchronized (this.c) {
            if (this.d) {
                throw new IllegalStateException("closed");
            }
        }
        return null;
    }

    @Override // defpackage.g37
    public final to1 K1() {
        to1 to1Var;
        synchronized (this.c) {
            try {
                if (this.d) {
                    throw new IllegalStateException("closed");
                }
                to1Var = this.e;
                if (to1Var == null) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return to1Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.c) {
            this.d = true;
            to1 to1Var = this.e;
            if (to1Var != null) {
                try {
                    to1Var.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            }
            j6g j6gVar = j6g.a;
        }
    }

    @Override // defpackage.g37
    public final pa5 getFileSystem() {
        return this.a;
    }

    @Override // defpackage.g37
    public final g37.a getMetadata() {
        return this.b;
    }
}
