package androidx.media3.session;

import androidx.media3.common.PlaybackException;
import androidx.media3.session.r;
import androidx.media3.session.s;
import defpackage.bh5;
import defpackage.e47;
import defpackage.gdb;
import defpackage.ht0;
import defpackage.hz8;
import defpackage.i47;
import defpackage.ka2;
import defpackage.ph1;
import defpackage.v8e;
import defpackage.vjg;
import defpackage.w8e;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class b<T> {
    public final WeakReference<s> d;
    public final ht0<T, r.d> b = new ht0<>();
    public final ht0<r.d, C0057b<T>> c = new ht0<>();
    public final Object a = new Object();

    public interface a {
        hz8<Void> run();
    }

    /* JADX INFO: renamed from: androidx.media3.session.b$b, reason: collision with other inner class name */
    public static final class C0057b<T> {
        public final T a;
        public final a0 b;
        public w8e d;
        public gdb.a e;
        public boolean f;
        public final ArrayDeque c = new ArrayDeque();
        public gdb.a g = gdb.a.b;

        public C0057b(T t, a0 a0Var, w8e w8eVar, gdb.a aVar) {
            this.a = t;
            this.b = a0Var;
            this.d = w8eVar;
            this.e = aVar;
        }
    }

    public b(s sVar) {
        this.d = new WeakReference<>(sVar);
    }

    public final void a(T t, r.d dVar, w8e w8eVar, gdb.a aVar) {
        synchronized (this.a) {
            try {
                r.d dVarG = g(t);
                if (dVarG == null) {
                    this.b.put(t, dVar);
                    this.c.put(dVar, new C0057b<>(t, new a0(), w8eVar, aVar));
                } else {
                    C0057b<T> c0057b = this.c.get(dVarG);
                    ka2.r(c0057b);
                    c0057b.d = w8eVar;
                    c0057b.e = aVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(r.d dVar, int i, a aVar) {
        synchronized (this.a) {
            try {
                C0057b<T> c0057b = this.c.get(dVar);
                if (c0057b != null) {
                    gdb.a aVar2 = c0057b.g;
                    aVar2.getClass();
                    bh5.a aVar3 = new bh5.a();
                    aVar3.b(aVar2.a);
                    aVar3.a(i);
                    c0057b.g = new gdb.a(aVar3.d());
                    c0057b.c.add(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(final C0057b<T> c0057b) {
        s sVar = this.d.get();
        if (sVar == null) {
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        while (atomicBoolean.get()) {
            atomicBoolean.set(false);
            final a aVar = (a) c0057b.c.poll();
            if (aVar == null) {
                c0057b.f = false;
                return;
            }
            final AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
            final b<T> bVar = this;
            vjg.T(sVar.l, new ph1(sVar, this.g(c0057b.a), new Runnable() { // from class: mo2
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.run().a(new no2(this.a, atomicBoolean2, c0057b, atomicBoolean), h54.a);
                }
            }));
            atomicBoolean2.set(false);
            this = bVar;
        }
    }

    public final void d(final r.d dVar) {
        synchronized (this.a) {
            try {
                C0057b<T> c0057b = this.c.get(dVar);
                if (c0057b == null) {
                    return;
                }
                final gdb.a aVar = c0057b.g;
                c0057b.g = gdb.a.b;
                c0057b.c.add(new a(dVar, aVar) { // from class: lo2
                    public final /* synthetic */ r.d b;

                    @Override // androidx.media3.session.b.a
                    public final hz8 run() {
                        s sVar = this.a.d.get();
                        if (sVar != null) {
                            sVar.s(this.b);
                        }
                        return u37.b;
                    }
                });
                if (c0057b.f) {
                    return;
                }
                c0057b.f = true;
                c(c0057b);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final gdb.a e(r.d dVar) {
        synchronized (this.a) {
            try {
                C0057b<T> c0057b = this.c.get(dVar);
                if (c0057b == null) {
                    return null;
                }
                return c0057b.e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final e47<r.d> f() {
        e47<r.d> e47VarJ;
        synchronized (this.a) {
            e47VarJ = e47.j(this.b.values());
        }
        return e47VarJ;
    }

    public final r.d g(T t) {
        r.d dVar;
        synchronized (this.a) {
            dVar = this.b.get(t);
        }
        return dVar;
    }

    public final PlaybackException h(r.d dVar) {
        synchronized (this.a) {
            try {
                return this.c.get(dVar) != null ? null : null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final z i(r.d dVar) {
        synchronized (this.a) {
            try {
                return this.c.get(dVar) != null ? null : null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final a0 j(r.d dVar) {
        C0057b<T> c0057b;
        synchronized (this.a) {
            c0057b = this.c.get(dVar);
        }
        if (c0057b != null) {
            return c0057b.b;
        }
        return null;
    }

    public final boolean k(r.d dVar) {
        boolean z;
        synchronized (this.a) {
            z = this.c.get(dVar) != null;
        }
        return z;
    }

    public final boolean l(r.d dVar, int i) {
        C0057b<T> c0057b;
        synchronized (this.a) {
            c0057b = this.c.get(dVar);
        }
        s sVar = this.d.get();
        return c0057b != null && c0057b.e.a(i) && sVar != null && sVar.t.V().a(i);
    }

    public final boolean m(r.d dVar, int i) {
        C0057b<T> c0057b;
        boolean z;
        synchronized (this.a) {
            c0057b = this.c.get(dVar);
        }
        if (c0057b != null) {
            w8e w8eVar = c0057b.d;
            w8eVar.getClass();
            ka2.k("Use contains(Command) for custom command", i != 0);
            Iterator<v8e> it = w8eVar.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (it.next().a == i) {
                    z = true;
                    break;
                }
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean n(r.d dVar, v8e v8eVar) {
        C0057b<T> c0057b;
        synchronized (this.a) {
            c0057b = this.c.get(dVar);
        }
        if (c0057b == null) {
            return false;
        }
        i47<v8e> i47Var = c0057b.d.a;
        v8eVar.getClass();
        return i47Var.contains(v8eVar);
    }

    public final void o(r.d dVar) {
        synchronized (this.a) {
            try {
                C0057b<T> c0057bRemove = this.c.remove(dVar);
                if (c0057bRemove == null) {
                    return;
                }
                this.b.remove(c0057bRemove.a);
                c0057bRemove.b.c();
                s sVar = this.d.get();
                if (sVar == null || sVar.k()) {
                    return;
                }
                vjg.T(sVar.l, new ph1(1, sVar, dVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
