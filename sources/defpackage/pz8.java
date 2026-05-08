package defpackage;

import android.os.Looper;
import defpackage.kv8;
import defpackage.ljd;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class pz8<T> {
    public static final Object k = new Object();
    public final Object a;
    public final ljd<goa<? super T>, pz8<T>.d> b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final a j;

    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            synchronized (pz8.this.a) {
                obj = pz8.this.f;
                pz8.this.f = pz8.k;
            }
            pz8.this.j(obj);
        }
    }

    public class b extends pz8<T>.d {
        @Override // pz8.d
        public final boolean d() {
            return true;
        }
    }

    public class c extends pz8<T>.d implements uv8 {
        public final zv8 e;

        public c(zv8 zv8Var, goa<? super T> goaVar) {
            super(goaVar);
            this.e = zv8Var;
        }

        @Override // defpackage.uv8
        public final void G(zv8 zv8Var, kv8.a aVar) {
            zv8 zv8Var2 = this.e;
            kv8.b bVarB = zv8Var2.getLifecycle().b();
            if (bVarB == kv8.b.a) {
                pz8.this.i(this.a);
                return;
            }
            kv8.b bVar = null;
            while (bVar != bVarB) {
                a(d());
                bVar = bVarB;
                bVarB = zv8Var2.getLifecycle().b();
            }
        }

        @Override // pz8.d
        public final void b() {
            this.e.getLifecycle().c(this);
        }

        @Override // pz8.d
        public final boolean c(zv8 zv8Var) {
            return this.e == zv8Var;
        }

        @Override // pz8.d
        public final boolean d() {
            return this.e.getLifecycle().b().compareTo(kv8.b.d) >= 0;
        }
    }

    public abstract class d {
        public final goa<? super T> a;
        public boolean b;
        public int c = -1;

        public d(goa<? super T> goaVar) {
            this.a = goaVar;
        }

        public final void a(boolean z) {
            if (z == this.b) {
                return;
            }
            this.b = z;
            int i = z ? 1 : -1;
            pz8 pz8Var = pz8.this;
            int i2 = pz8Var.c;
            pz8Var.c = i + i2;
            if (!pz8Var.d) {
                pz8Var.d = true;
                while (true) {
                    try {
                        int i3 = pz8Var.c;
                        if (i2 == i3) {
                            break;
                        }
                        boolean z2 = i2 == 0 && i3 > 0;
                        boolean z3 = i2 > 0 && i3 == 0;
                        if (z2) {
                            pz8Var.g();
                        } else if (z3) {
                            pz8Var.h();
                        }
                        i2 = i3;
                    } catch (Throwable th) {
                        pz8Var.d = false;
                        throw th;
                    }
                }
                pz8Var.d = false;
            }
            if (this.b) {
                pz8Var.c(this);
            }
        }

        public void b() {
        }

        public boolean c(zv8 zv8Var) {
            return false;
        }

        public abstract boolean d();
    }

    public pz8() {
        this.a = new Object();
        this.b = new ljd<>();
        this.c = 0;
        Object obj = k;
        this.f = obj;
        this.j = new a();
        this.e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        yr0.J1().d.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        r6.g(l5.m("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(pz8<T>.d dVar) {
        if (dVar.b) {
            if (!dVar.d()) {
                dVar.a(false);
                return;
            }
            int i = dVar.c;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            dVar.c = i2;
            dVar.a.d((Object) this.e);
        }
    }

    public final void c(pz8<T>.d dVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (dVar != null) {
                b(dVar);
                dVar = null;
            } else {
                ljd<goa<? super T>, pz8<T>.d> ljdVar = this.b;
                ljdVar.getClass();
                ljd.d dVar2 = new ljd.d();
                ljdVar.c.put(dVar2, Boolean.FALSE);
                while (dVar2.hasNext()) {
                    b((d) ((Map.Entry) dVar2.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final T d() {
        T t = (T) this.e;
        if (t != k) {
            return t;
        }
        return null;
    }

    public final void e(zv8 zv8Var, goa<? super T> goaVar) {
        pz8<T>.d dVar;
        a("observe");
        if (zv8Var.getLifecycle().b() == kv8.b.a) {
            return;
        }
        c cVar = new c(zv8Var, goaVar);
        ljd<goa<? super T>, pz8<T>.d> ljdVar = this.b;
        ljd.c<goa<? super T>, pz8<T>.d> cVarA = ljdVar.a(goaVar);
        if (cVarA != null) {
            dVar = cVarA.b;
        } else {
            ljd.c<K, V> cVar2 = new ljd.c<>(goaVar, cVar);
            ljdVar.d++;
            ljd.c<goa<? super T>, pz8<T>.d> cVar3 = ljdVar.b;
            if (cVar3 == 0) {
                ljdVar.a = cVar2;
                ljdVar.b = cVar2;
            } else {
                cVar3.c = cVar2;
                cVar2.d = cVar3;
                ljdVar.b = cVar2;
            }
            dVar = null;
        }
        pz8<T>.d dVar2 = dVar;
        if (dVar2 != null && !dVar2.c(zv8Var)) {
            l5.q("Cannot add the same observer with different lifecycles");
        } else {
            if (dVar2 != null) {
                return;
            }
            zv8Var.getLifecycle().a(cVar);
        }
    }

    public final void f(goa<? super T> goaVar) {
        pz8<T>.d dVar;
        a("observeForever");
        b bVar = new b(goaVar);
        ljd<goa<? super T>, pz8<T>.d> ljdVar = this.b;
        ljd.c<goa<? super T>, pz8<T>.d> cVarA = ljdVar.a(goaVar);
        if (cVarA != null) {
            dVar = cVarA.b;
        } else {
            ljd.c<K, V> cVar = new ljd.c<>(goaVar, bVar);
            ljdVar.d++;
            ljd.c<goa<? super T>, pz8<T>.d> cVar2 = ljdVar.b;
            if (cVar2 == 0) {
                ljdVar.a = cVar;
                ljdVar.b = cVar;
            } else {
                cVar2.c = cVar;
                cVar.d = cVar2;
                ljdVar.b = cVar;
            }
            dVar = null;
        }
        pz8<T>.d dVar2 = dVar;
        if (dVar2 instanceof c) {
            l5.q("Cannot add the same observer with different lifecycles");
        } else {
            if (dVar2 != null) {
                return;
            }
            bVar.a(true);
        }
    }

    public void g() {
    }

    public void h() {
    }

    public void i(goa<? super T> goaVar) {
        a("removeObserver");
        pz8<T>.d dVarB = this.b.b(goaVar);
        if (dVarB == null) {
            return;
        }
        dVarB.b();
        dVarB.a(false);
    }

    public void j(T t) {
        a("setValue");
        this.g++;
        this.e = t;
        c(null);
    }

    public pz8(T t) {
        this.a = new Object();
        this.b = new ljd<>();
        this.c = 0;
        this.f = k;
        this.j = new a();
        this.e = t;
        this.g = 0;
    }
}
