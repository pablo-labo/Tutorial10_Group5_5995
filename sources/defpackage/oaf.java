package defpackage;

import bolts.ExecutorException;
import defpackage.gi1;
import defpackage.k70;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class oaf<TResult> {
    public static final ExecutorService g;
    public static final gi1.a h;
    public static final oaf<Boolean> i;
    public static final oaf<Boolean> j;
    public boolean b;
    public boolean c;
    public TResult d;
    public Exception e;
    public final Object a = new Object();
    public ArrayList f = new ArrayList();

    static {
        gi1 gi1Var = gi1.d;
        g = gi1Var.a;
        h = gi1Var.c;
        k70.a aVar = k70.b.a;
        new oaf((Boolean) null);
        i = new oaf<>(Boolean.TRUE);
        j = new oaf<>(Boolean.FALSE);
        new oaf(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public oaf(Boolean bool) {
        g(bool);
    }

    public static oaf a(Executor executor, Callable callable) {
        qq2 qq2Var = new qq2(6);
        try {
            executor.execute(new jaf(qq2Var, callable));
        } catch (Exception e) {
            qq2Var.e(new ExecutorException(e));
        }
        return (oaf) qq2Var.a;
    }

    public static <TResult> oaf<TResult> b(Exception exc) {
        oaf<TResult> oafVar = new oaf<>();
        synchronized (oafVar.a) {
            try {
                if (oafVar.b) {
                    r6.g("Cannot set the error on a completed task.");
                    return null;
                }
                oafVar.b = true;
                oafVar.e = exc;
                oafVar.a.notifyAll();
                oafVar.e();
                return oafVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Exception c() {
        Exception exc;
        synchronized (this.a) {
            exc = this.e;
        }
        return exc;
    }

    public final boolean d() {
        boolean z;
        synchronized (this.a) {
            z = c() != null;
        }
        return z;
    }

    public final void e() {
        synchronized (this.a) {
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                try {
                    ((mu2) it.next()).a(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.f = null;
        }
    }

    public final boolean f() {
        synchronized (this.a) {
            try {
                if (this.b) {
                    return false;
                }
                this.b = true;
                this.c = true;
                this.a.notifyAll();
                e();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean g(TResult tresult) {
        synchronized (this.a) {
            try {
                if (this.b) {
                    return false;
                }
                this.b = true;
                this.d = tresult;
                this.a.notifyAll();
                e();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public oaf() {
    }

    public oaf(int i2) {
        f();
    }
}
