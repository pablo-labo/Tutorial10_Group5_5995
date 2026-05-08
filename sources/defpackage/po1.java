package defpackage;

import com.facebook.common.memory.PooledByteBuffer;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class po1 {
    public final h95 a;
    public final yn9 b;
    public final cgb c;
    public final Executor d;
    public final Executor e;
    public final jia f;
    public final sqe g;

    public po1(h95 h95Var, yn9 yn9Var, cgb cgbVar, Executor executor, Executor executor2, jia jiaVar) {
        h95Var.getClass();
        jiaVar.getClass();
        this.a = h95Var;
        this.b = yn9Var;
        this.c = cgbVar;
        this.d = executor;
        this.e = executor2;
        this.f = jiaVar;
        this.g = new sqe();
    }

    public final void a() {
        this.g.a();
        try {
            oaf.a(this.e, new Callable() { // from class: mo1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    po1 po1Var = this.a;
                    po1Var.g.a();
                    po1Var.a.a();
                    return null;
                }
            });
        } catch (Exception e) {
            s55.m(e, "Failed to schedule disk-cache clear", new Object[0]);
            oaf.b(e);
        }
    }

    public final boolean b(ot1 ot1Var) {
        sqe sqeVar = this.g;
        synchronized (sqeVar) {
            if (sqeVar.a.containsKey(ot1Var)) {
                vs4 vs4Var = (vs4) sqeVar.a.get(ot1Var);
                synchronized (vs4Var) {
                    if (vs4.W(vs4Var)) {
                        return true;
                    }
                    sqeVar.a.remove(ot1Var);
                    s55.l(sqe.class, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(vs4Var)), ot1Var.a(), Integer.valueOf(System.identityHashCode(ot1Var)));
                }
            }
            if (this.a.f(ot1Var)) {
                return true;
            }
            jia jiaVar = this.f;
            vs4 vs4VarB = this.g.b(ot1Var);
            if (vs4VarB != null) {
                vs4VarB.close();
                s55.i(po1.class, ot1Var.a(), "Found image for %s in staging area");
                jiaVar.getClass();
                return true;
            }
            s55.i(po1.class, ot1Var.a(), "Did not find image for %s in staging area");
            jiaVar.getClass();
            try {
                return this.a.b(ot1Var);
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public final PooledByteBuffer c(ot1 ot1Var) throws IOException {
        jia jiaVar = this.f;
        try {
            s55.i(po1.class, ot1Var.a(), "Disk cache read for %s");
            g95 g95VarD = this.a.d(ot1Var);
            if (g95VarD == null) {
                s55.i(po1.class, ot1Var.a(), "Disk cache miss for %s");
                jiaVar.getClass();
                return null;
            }
            s55.i(po1.class, ot1Var.a(), "Found entry in disk cache for %s");
            jiaVar.getClass();
            FileInputStream fileInputStream = new FileInputStream(g95VarD.a);
            try {
                xn9 xn9VarB = this.b.b(fileInputStream, (int) g95VarD.a.length());
                fileInputStream.close();
                s55.i(po1.class, ot1Var.a(), "Successful read from disk cache for %s");
                return xn9VarB;
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
        } catch (IOException e) {
            s55.m(e, "Exception reading from cache for %s", ot1Var.a());
            jiaVar.getClass();
            throw e;
        }
    }

    public final void d(final ot1 ot1Var) {
        ot1Var.getClass();
        this.g.d(ot1Var);
        try {
            oaf.a(this.e, new Callable() { // from class: lo1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ot1 ot1Var2 = ot1Var;
                    ot1Var2.getClass();
                    po1 po1Var = this.a;
                    po1Var.g.d(ot1Var2);
                    po1Var.a.c(ot1Var2);
                    return null;
                }
            });
        } catch (Exception e) {
            s55.m(e, "Failed to schedule disk-cache remove for %s", ot1Var.a());
            oaf.b(e);
        }
    }

    public final void e(ot1 ot1Var, vs4 vs4Var) {
        s55.i(po1.class, ot1Var.a(), "About to write to disk-cache for key %s");
        try {
            this.a.e(ot1Var, new oo1(vs4Var, this));
            this.f.getClass();
            s55.i(po1.class, ot1Var.a(), "Successful disk-cache write for key %s");
        } catch (IOException e) {
            s55.m(e, "Failed to write to disk-cache for key %s", ot1Var.a());
        }
    }
}
