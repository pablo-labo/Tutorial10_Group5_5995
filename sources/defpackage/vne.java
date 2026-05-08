package defpackage;

import defpackage.f37;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class vne extends f37 {
    public final f37.a a;
    public boolean b;
    public final to1 c;

    public vne(to1 to1Var, File file, f37.a aVar) {
        this.a = aVar;
        this.c = to1Var;
        if (file.isDirectory()) {
            return;
        }
        l5.q("cacheDirectory must be a directory.");
        throw null;
    }

    @Override // defpackage.f37
    public final synchronized to1 K1() {
        to1 to1Var;
        try {
            if (this.b) {
                throw new IllegalStateException("closed");
            }
            to1Var = this.c;
            if (to1Var == null) {
                qd8 qd8Var = pa5.a;
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return to1Var;
    }

    @Override // defpackage.f37
    public final f37.a a() {
        return this.a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.b = true;
        to1 to1Var = this.c;
        if (to1Var != null) {
            m.a(to1Var);
        }
    }
}
