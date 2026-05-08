package defpackage;

import com.facebook.react.runtime.internal.bolts.ExecutorException;
import defpackage.maf;
import defpackage.x15;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class maf<TResult> {
    public static final maf<Void> g = new maf<>((Boolean) null);
    public static final maf<Boolean> h = new maf<>(Boolean.TRUE);
    public static final maf<Boolean> i = new maf<>(Boolean.FALSE);
    public static final maf<Object> j = new maf<>(0);
    public boolean b;
    public boolean c;
    public TResult d;
    public Exception e;
    public final Object a = new Object();
    public final ArrayList f = new ArrayList();

    public static final class a {
        public static final void a(hzh hzhVar, ku2 ku2Var, maf mafVar, Executor executor) {
            maf<Void> mafVar2 = maf.g;
            try {
                executor.execute(new ta0(4, ku2Var, mafVar, hzhVar));
            } catch (Exception e) {
                hzhVar.u(new ExecutorException(e));
            }
        }

        public static maf b(Executor executor, Callable callable) {
            executor.getClass();
            hzh hzhVar = new hzh();
            try {
                executor.execute(new z24(4, callable, hzhVar));
            } catch (Exception e) {
                hzhVar.u(new ExecutorException(e));
            }
            return (maf) hzhVar.a;
        }

        public static maf c(Exception exc) {
            maf mafVar = new maf();
            synchronized (mafVar.a) {
                if (mafVar.b) {
                    r6.g("Cannot set the error on a completed task.");
                    return null;
                }
                mafVar.b = true;
                mafVar.e = exc;
                mafVar.a.notifyAll();
                mafVar.h();
                return mafVar;
            }
        }

        public static maf d(Object obj) {
            if (obj == null) {
                maf<Void> mafVar = maf.g;
                mafVar.getClass();
                return mafVar;
            }
            if (obj instanceof Boolean) {
                maf<Boolean> mafVar2 = ((Boolean) obj).booleanValue() ? maf.h : maf.i;
                mafVar2.getClass();
                return mafVar2;
            }
            maf mafVar3 = new maf();
            if (mafVar3.j(obj)) {
                return mafVar3;
            }
            r6.g("Cannot set the result of a completed task.");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public maf(Boolean bool) {
        j(bool);
    }

    public static maf a(maf mafVar, final ku2 ku2Var) {
        boolean z;
        final x15.a aVar = x15.b;
        mafVar.getClass();
        final hzh hzhVar = new hzh();
        synchronized (mafVar.a) {
            try {
                synchronized (mafVar.a) {
                    z = mafVar.b;
                }
                if (!z) {
                    mafVar.f.add(new ku2() { // from class: faf
                        @Override // defpackage.ku2
                        public final Object a(maf mafVar2) {
                            hzh hzhVar2 = hzhVar;
                            ku2 ku2Var2 = ku2Var;
                            Executor executor = aVar;
                            mafVar2.getClass();
                            maf<Void> mafVar3 = maf.g;
                            try {
                                executor.execute(new ghc(1, ku2Var2, mafVar2, hzhVar2));
                            } catch (Exception e) {
                                hzhVar2.u(new ExecutorException(e));
                            }
                            return j6g.a;
                        }
                    });
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            try {
                aVar.execute(new ghc(1, ku2Var, mafVar, hzhVar));
            } catch (Exception e) {
                hzhVar.u(new ExecutorException(e));
            }
        }
        return (maf) hzhVar.a;
    }

    public final <TContinuationResult> maf<TContinuationResult> b(final ku2<TResult, maf<TContinuationResult>> ku2Var, final Executor executor) {
        boolean z;
        executor.getClass();
        final hzh hzhVar = new hzh();
        synchronized (this.a) {
            try {
                synchronized (this.a) {
                    z = this.b;
                }
                if (!z) {
                    this.f.add(new ku2() { // from class: eaf
                        @Override // defpackage.ku2
                        public final Object a(maf mafVar) {
                            mafVar.getClass();
                            maf<Void> mafVar2 = maf.g;
                            maf.a.a(hzhVar, ku2Var, mafVar, executor);
                            return j6g.a;
                        }
                    });
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            a.a(hzhVar, ku2Var, this, executor);
        }
        return (maf) hzhVar.a;
    }

    public final Exception c() {
        Exception exc;
        synchronized (this.a) {
            exc = this.e;
        }
        return exc;
    }

    public final TResult d() {
        TResult tresult;
        synchronized (this.a) {
            tresult = this.d;
        }
        return tresult;
    }

    public final boolean e() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    public final boolean f() {
        boolean z;
        synchronized (this.a) {
            z = c() != null;
        }
        return z;
    }

    public final <TContinuationResult> maf<TContinuationResult> g(ku2<TResult, TContinuationResult> ku2Var, Executor executor) {
        executor.getClass();
        return b(new hlc(ku2Var, 1), executor);
    }

    public final void h() {
        synchronized (this.a) {
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                try {
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.f.clear();
            j6g j6gVar = j6g.a;
        }
    }

    public final boolean i() {
        synchronized (this.a) {
            if (this.b) {
                return false;
            }
            this.b = true;
            this.c = true;
            this.a.notifyAll();
            h();
            return true;
        }
    }

    public final boolean j(TResult tresult) {
        synchronized (this.a) {
            if (this.b) {
                return false;
            }
            this.b = true;
            this.d = tresult;
            this.a.notifyAll();
            h();
            return true;
        }
    }

    public maf() {
    }

    public maf(int i2) {
        i();
    }
}
