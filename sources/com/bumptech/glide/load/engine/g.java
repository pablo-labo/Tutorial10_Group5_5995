package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.e;
import com.bumptech.glide.load.engine.h;
import defpackage.beb;
import defpackage.f5d;
import defpackage.f65;
import defpackage.k96;
import defpackage.ngb;
import defpackage.qhe;
import defpackage.use;
import defpackage.ux0;
import defpackage.w15;
import defpackage.xe3;
import defpackage.yt4;
import defpackage.zt4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class g<R> implements f65.d {
    public static final c l0 = new c();
    public final k96 V;
    public final k96 W;
    public final k96 X;
    public final AtomicInteger Y;
    public zt4 Z;
    public final e a;
    public boolean a0;
    public final use.a b;
    public boolean b0;
    public final h.a c;
    public f5d<?> c0;
    public final ngb<g<?>> d;
    public xe3 d0;
    public final c e;
    public boolean e0;
    public final yt4 f;
    public GlideException f0;
    public boolean g0;
    public h<?> h0;
    public com.bumptech.glide.load.engine.e<R> i0;
    public volatile boolean j0;
    public boolean k0;

    public class a implements Runnable {
        public final qhe a;

        public a(qhe qheVar) {
            this.a = qheVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            qhe qheVar = this.a;
            qheVar.b.a();
            synchronized (qheVar.c) {
                synchronized (g.this) {
                    try {
                        if (g.this.a.a.contains(new d(this.a, w15.b))) {
                            g gVar = g.this;
                            qhe qheVar2 = this.a;
                            gVar.getClass();
                            try {
                                qheVar2.i(gVar.f0, 5);
                            } catch (Throwable th) {
                                throw new CallbackException(th);
                            }
                        }
                        g.this.d();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    public class b implements Runnable {
        public final qhe a;

        public b(qhe qheVar) {
            this.a = qheVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            qhe qheVar = this.a;
            qheVar.b.a();
            synchronized (qheVar.c) {
                synchronized (g.this) {
                    try {
                        if (g.this.a.a.contains(new d(this.a, w15.b))) {
                            g.this.h0.c();
                            g gVar = g.this;
                            qhe qheVar2 = this.a;
                            gVar.getClass();
                            try {
                                qheVar2.j(gVar.h0, gVar.d0, gVar.k0);
                                g.this.h(this.a);
                            } catch (Throwable th) {
                                throw new CallbackException(th);
                            }
                        }
                        g.this.d();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    public static class c {
    }

    public static final class d {
        public final qhe a;
        public final Executor b;

        public d(qhe qheVar, Executor executor) {
            this.a = qheVar;
            this.b = executor;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    public static final class e implements Iterable<d> {
        public final ArrayList a;

        public e(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // java.lang.Iterable
        public final Iterator<d> iterator() {
            return this.a.iterator();
        }
    }

    public g() {
        throw null;
    }

    public g(k96 k96Var, k96 k96Var2, k96 k96Var3, k96 k96Var4, f fVar, f fVar2, f65.c cVar) {
        this.a = new e(new ArrayList(2));
        this.b = new use.a();
        this.Y = new AtomicInteger();
        this.V = k96Var;
        this.W = k96Var2;
        this.X = k96Var4;
        this.f = fVar;
        this.c = fVar2;
        this.d = cVar;
        this.e = l0;
    }

    public final synchronized void a(qhe qheVar, Executor executor) {
        try {
            this.b.a();
            this.a.a.add(new d(qheVar, executor));
            if (this.e0) {
                e(1);
                executor.execute(new b(qheVar));
            } else if (this.g0) {
                e(1);
                executor.execute(new a(qheVar));
            } else {
                beb.c("Cannot add callbacks to a cancelled EngineJob", !this.j0);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b() {
        if (f()) {
            return;
        }
        this.j0 = true;
        com.bumptech.glide.load.engine.e<R> eVar = this.i0;
        eVar.s0 = true;
        com.bumptech.glide.load.engine.c cVar = eVar.q0;
        if (cVar != null) {
            cVar.cancel();
        }
        yt4 yt4Var = this.f;
        zt4 zt4Var = this.Z;
        f fVar = (f) yt4Var;
        synchronized (fVar) {
            ux0 ux0Var = fVar.a;
            ux0Var.getClass();
            HashMap map = (HashMap) ux0Var.b;
            if (this == map.get(zt4Var)) {
                map.remove(zt4Var);
            }
        }
    }

    @Override // f65.d
    public final use.a c() {
        return this.b;
    }

    public final void d() {
        h<?> hVar;
        synchronized (this) {
            try {
                this.b.a();
                beb.c("Not yet complete!", f());
                int iDecrementAndGet = this.Y.decrementAndGet();
                beb.c("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    hVar = this.h0;
                    g();
                } else {
                    hVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (hVar != null) {
            hVar.d();
        }
    }

    public final synchronized void e(int i) {
        h<?> hVar;
        beb.c("Not yet complete!", f());
        if (this.Y.getAndAdd(i) == 0 && (hVar = this.h0) != null) {
            hVar.c();
        }
    }

    public final boolean f() {
        return this.g0 || this.e0 || this.j0;
    }

    public final synchronized void g() {
        boolean zA;
        if (this.Z == null) {
            throw new IllegalArgumentException();
        }
        this.a.a.clear();
        this.Z = null;
        this.h0 = null;
        this.c0 = null;
        this.g0 = false;
        this.j0 = false;
        this.e0 = false;
        this.k0 = false;
        com.bumptech.glide.load.engine.e<R> eVar = this.i0;
        e.d dVar = eVar.V;
        synchronized (dVar) {
            dVar.a = true;
            zA = dVar.a();
        }
        if (zA) {
            eVar.s();
        }
        this.i0 = null;
        this.f0 = null;
        this.d0 = null;
        this.d.a(this);
    }

    public final synchronized void h(qhe qheVar) {
        try {
            this.b.a();
            this.a.a.remove(new d(qheVar, w15.b));
            if (this.a.a.isEmpty()) {
                b();
                if (this.e0 || this.g0) {
                    if (this.Y.get() == 0) {
                        g();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
