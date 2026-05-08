package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
public final class q79<T> {
    public static final Executor e;
    public final LinkedHashSet a;
    public final LinkedHashSet b;
    public final Handler c;
    public volatile p79<T> d;

    public static class a<T> extends FutureTask<p79<T>> {
        public q79<T> a;

        @Override // java.util.concurrent.FutureTask
        public final void done() {
            try {
                if (isCancelled()) {
                    return;
                }
                try {
                    this.a.d(get());
                } catch (InterruptedException | ExecutionException e) {
                    this.a.d(new p79<>(e));
                }
            } finally {
                this.a = null;
            }
        }
    }

    static {
        if ("true".equals(System.getProperty("lottie.testing.directExecutor"))) {
            e = new xr0(1);
        } else {
            e = Executors.newCachedThreadPool(new s79());
        }
    }

    public q79() {
        throw null;
    }

    public q79(Callable<p79<T>> callable) {
        this.a = new LinkedHashSet(1);
        this.b = new LinkedHashSet(1);
        this.c = new Handler(Looper.getMainLooper());
        this.d = null;
        Executor executor = e;
        a aVar = new a(callable);
        aVar.a = this;
        executor.execute(aVar);
    }

    public final synchronized void a(o79 o79Var) {
        Throwable th;
        try {
            p79<T> p79Var = this.d;
            if (p79Var != null && (th = p79Var.b) != null) {
                o79Var.onResult(th);
            }
            this.b.add(o79Var);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(o79 o79Var) {
        s69 s69Var;
        try {
            p79<T> p79Var = this.d;
            if (p79Var != null && (s69Var = p79Var.a) != null) {
                o79Var.onResult(s69Var);
            }
            this.a.add(o79Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c() {
        p79<T> p79Var = this.d;
        if (p79Var == null) {
            return;
        }
        s69 s69Var = p79Var.a;
        if (s69Var != null) {
            synchronized (this) {
                Iterator it = new ArrayList(this.a).iterator();
                while (it.hasNext()) {
                    ((o79) it.next()).onResult(s69Var);
                }
            }
            return;
        }
        Throwable th = p79Var.b;
        synchronized (this) {
            ArrayList arrayList = new ArrayList(this.b);
            if (arrayList.isEmpty()) {
                a49.c("Lottie encountered an error but no failure listener was added:", th);
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((o79) it2.next()).onResult(th);
            }
        }
    }

    public final void d(p79<T> p79Var) {
        if (this.d != null) {
            r6.g("A task may only be set once.");
            return;
        }
        this.d = p79Var;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            c();
        } else {
            this.c.post(new qb0(this, 5));
        }
    }

    public q79(s69 s69Var) {
        this.a = new LinkedHashSet(1);
        this.b = new LinkedHashSet(1);
        this.c = new Handler(Looper.getMainLooper());
        this.d = null;
        d(new p79<>(s69Var));
    }
}
