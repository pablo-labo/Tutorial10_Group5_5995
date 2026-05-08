package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.abh;
import defpackage.fib;
import defpackage.mch;
import defpackage.nch;
import defpackage.och;
import defpackage.p6;
import defpackage.p7d;
import defpackage.pa6;
import defpackage.q7d;
import defpackage.v7b;
import defpackage.xyc;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
@KeepName
public abstract class BasePendingResult<R extends p7d> extends v7b<R> {
    public static final mch j = new mch();
    public p7d e;
    public Status f;
    public volatile boolean g;
    public boolean h;

    @KeepName
    private nch resultGuardian;
    public final Object a = new Object();
    public final CountDownLatch b = new CountDownLatch(1);
    public final ArrayList c = new ArrayList();
    public final AtomicReference d = new AtomicReference();
    public boolean i = false;

    public static class a<R extends p7d> extends och {
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    Log.wtf("BasePendingResult", p6.c(i, "Don't know how to handle message: "), new Exception());
                    return;
                } else {
                    ((BasePendingResult) message.obj).d(Status.W);
                    return;
                }
            }
            Pair pair = (Pair) message.obj;
            q7d q7dVar = (q7d) pair.first;
            p7d p7dVar = (p7d) pair.second;
            try {
                q7dVar.a();
            } catch (RuntimeException e) {
                BasePendingResult.h(p7dVar);
                throw e;
            }
        }
    }

    public BasePendingResult(pa6 pa6Var) {
        new a(pa6Var != null ? pa6Var.a() : Looper.getMainLooper());
        new WeakReference(pa6Var);
    }

    public static void h(p7d p7dVar) {
        if (p7dVar instanceof xyc) {
            try {
                ((xyc) p7dVar).release();
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(p7dVar)), e);
            }
        }
    }

    @Override // defpackage.v7b
    @ResultIgnorabilityUnspecified
    public final p7d a() {
        p7d p7dVar;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        fib.k("Result has already been consumed.", !this.g);
        try {
            if (!this.b.await(0L, timeUnit)) {
                d(Status.W);
            }
        } catch (InterruptedException unused) {
            d(Status.f);
        }
        fib.k("Result is not ready.", e());
        synchronized (this.a) {
            fib.k("Result has already been consumed.", !this.g);
            fib.k("Result is not ready.", e());
            p7dVar = this.e;
            this.e = null;
            this.g = true;
        }
        if (((abh) this.d.getAndSet(null)) != null) {
            throw null;
        }
        fib.i(p7dVar);
        return p7dVar;
    }

    public final void b(v7b.a aVar) {
        synchronized (this.a) {
            try {
                if (e()) {
                    aVar.a(this.f);
                } else {
                    this.c.add(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract R c(Status status);

    @Deprecated
    public final void d(Status status) {
        synchronized (this.a) {
            try {
                if (!e()) {
                    f(c(status));
                    this.h = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e() {
        return this.b.getCount() == 0;
    }

    public final void f(R r) {
        synchronized (this.a) {
            try {
                if (this.h) {
                    h(r);
                    return;
                }
                e();
                fib.k("Results have already been set", !e());
                fib.k("Result has already been consumed", !this.g);
                g(r);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(p7d p7dVar) {
        this.e = p7dVar;
        this.f = p7dVar.a();
        this.b.countDown();
        if (this.e instanceof xyc) {
            this.resultGuardian = new nch(this);
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((v7b.a) arrayList.get(i)).a(this.f);
        }
        arrayList.clear();
    }

    @Deprecated
    public BasePendingResult() {
        new a(Looper.getMainLooper());
        new WeakReference(null);
    }
}
