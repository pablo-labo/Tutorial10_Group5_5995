package defpackage;

import defpackage.f37;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class r95 extends f37 {
    public final w5b a;
    public final pa5 b;
    public final String c;
    public final Closeable d;
    public boolean e;
    public uqc f;

    public r95(w5b w5bVar, pa5 pa5Var, String str, Closeable closeable) {
        this.a = w5bVar;
        this.b = pa5Var;
        this.c = str;
        this.d = closeable;
    }

    @Override // defpackage.f37
    public final synchronized to1 K1() {
        if (this.e) {
            throw new IllegalStateException("closed");
        }
        uqc uqcVar = this.f;
        if (uqcVar != null) {
            return uqcVar;
        }
        uqc uqcVarK = c0h.k(this.b.m(this.a));
        this.f = uqcVarK;
        return uqcVarK;
    }

    @Override // defpackage.f37
    public final f37.a a() {
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.e = true;
            uqc uqcVar = this.f;
            if (uqcVar != null) {
                m.a(uqcVar);
            }
            Closeable closeable = this.d;
            if (closeable != null) {
                m.a(closeable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
