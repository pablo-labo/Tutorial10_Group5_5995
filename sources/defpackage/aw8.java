package defpackage;

import android.os.Looper;
import defpackage.kv8;
import defpackage.ljd;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class aw8 extends kv8 {
    public final boolean b;
    public f75<yv8, a> c = new f75<>();
    public kv8.b d;
    public final WeakReference<zv8> e;
    public int f;
    public boolean g;
    public boolean h;
    public final ArrayList<kv8.b> i;
    public final gse j;

    public static final class a {
        public kv8.b a;
        public uv8 b;

        public final void a(zv8 zv8Var, kv8.a aVar) {
            kv8.b bVarA = aVar.a();
            kv8.b bVar = this.a;
            bVar.getClass();
            if (bVarA.compareTo(bVar) < 0) {
                bVar = bVarA;
            }
            this.a = bVar;
            this.b.G(zv8Var, aVar);
            this.a = bVarA;
        }
    }

    public aw8(zv8 zv8Var, boolean z) {
        this.b = z;
        kv8.b bVar = kv8.b.b;
        this.d = bVar;
        this.i = new ArrayList<>();
        this.e = new WeakReference<>(zv8Var);
        this.j = hh2.e(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.kv8
    public final void a(yv8 yv8Var) {
        uv8 nwcVar;
        a aVar;
        zv8 zv8Var;
        yv8Var.getClass();
        e("addObserver");
        kv8.b bVar = this.d;
        kv8.b bVar2 = kv8.b.a;
        if (bVar != bVar2) {
            bVar2 = kv8.b.b;
        }
        a aVar2 = new a();
        HashMap map = lw8.a;
        boolean z = yv8Var instanceof uv8;
        boolean z2 = yv8Var instanceof qo3;
        if (z && z2) {
            nwcVar = new ro3((qo3) yv8Var, (uv8) yv8Var);
        } else if (z2) {
            nwcVar = new ro3((qo3) yv8Var, null);
        } else if (z) {
            nwcVar = (uv8) yv8Var;
        } else {
            Class<?> cls = yv8Var.getClass();
            if (lw8.b(cls) == 2) {
                Object obj = lw8.b.get(cls);
                obj.getClass();
                List list = (List) obj;
                if (list.size() == 1) {
                    nwcVar = new uge(lw8.a((Constructor) list.get(0), yv8Var));
                } else {
                    int size = list.size();
                    pw5[] pw5VarArr = new pw5[size];
                    for (int i = 0; i < size; i++) {
                        pw5VarArr[i] = lw8.a((Constructor) list.get(i), yv8Var);
                    }
                    nwcVar = new wl2(pw5VarArr);
                }
            } else {
                nwcVar = new nwc(yv8Var);
            }
        }
        aVar2.b = nwcVar;
        aVar2.a = bVar2;
        f75<yv8, a> f75Var = this.c;
        ljd.c<yv8, a> cVarA = f75Var.a(yv8Var);
        if (cVarA != null) {
            aVar = cVarA.b;
        } else {
            HashMap<K, ljd.c<K, V>> map2 = f75Var.e;
            ljd.c<K, V> cVar = new ljd.c<>(yv8Var, aVar2);
            f75Var.d++;
            ljd.c<K, V> cVar2 = f75Var.b;
            if (cVar2 == 0) {
                f75Var.a = cVar;
                f75Var.b = cVar;
            } else {
                cVar2.c = cVar;
                cVar.d = cVar2;
                f75Var.b = cVar;
            }
            map2.put((K) yv8Var, cVar);
            aVar = null;
        }
        if (aVar == null && (zv8Var = this.e.get()) != null) {
            boolean z3 = this.f != 0 || this.g;
            kv8.b bVarD = d(yv8Var);
            this.f++;
            while (aVar2.a.compareTo(bVarD) < 0 && this.c.e.containsKey(yv8Var)) {
                kv8.b bVar3 = aVar2.a;
                ArrayList<kv8.b> arrayList = this.i;
                arrayList.add(bVar3);
                kv8.a.C0302a c0302a = kv8.a.Companion;
                kv8.b bVar4 = aVar2.a;
                c0302a.getClass();
                bVar4.getClass();
                int iOrdinal = bVar4.ordinal();
                kv8.a aVar3 = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : kv8.a.ON_RESUME : kv8.a.ON_START : kv8.a.ON_CREATE;
                if (aVar3 == null) {
                    o6.k(aVar2.a, "no event up from ");
                    return;
                } else {
                    aVar2.a(zv8Var, aVar3);
                    arrayList.remove(arrayList.size() - 1);
                    bVarD = d(yv8Var);
                }
            }
            if (!z3) {
                i();
            }
            this.f--;
        }
    }

    @Override // defpackage.kv8
    public final kv8.b b() {
        return this.d;
    }

    @Override // defpackage.kv8
    public final void c(yv8 yv8Var) {
        yv8Var.getClass();
        e("removeObserver");
        this.c.b(yv8Var);
    }

    public final kv8.b d(yv8 yv8Var) {
        HashMap<yv8, ljd.c<yv8, a>> map = this.c.e;
        ljd.c<yv8, a> cVar = map.containsKey(yv8Var) ? map.get(yv8Var).d : null;
        kv8.b bVar = cVar != null ? cVar.b.a : null;
        ArrayList<kv8.b> arrayList = this.i;
        kv8.b bVar2 = arrayList.isEmpty() ? null : (kv8.b) ia.k(1, arrayList);
        kv8.b bVar3 = this.d;
        bVar3.getClass();
        if (bVar == null || bVar.compareTo(bVar3) >= 0) {
            bVar = bVar3;
        }
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    public final void e(String str) {
        if (this.b) {
            yr0.J1().d.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            akb.n(l5.m("Method ", str, " must be called on the main thread"));
        }
    }

    public final void f(kv8.a aVar) {
        aVar.getClass();
        e("handleLifecycleEvent");
        g(aVar.a());
    }

    public final void g(kv8.b bVar) {
        if (this.d == bVar) {
            return;
        }
        zv8 zv8Var = this.e.get();
        kv8.b bVar2 = this.d;
        bVar2.getClass();
        bVar.getClass();
        kv8.b bVar3 = kv8.b.b;
        kv8.b bVar4 = kv8.b.a;
        if (bVar2 == bVar3 && bVar == bVar4) {
            throw new IllegalStateException(("State must be at least '" + kv8.b.c + "' to be moved to '" + bVar + "' in component " + zv8Var).toString());
        }
        if (bVar2 == bVar4 && bVar2 != bVar) {
            throw new IllegalStateException(("State is '" + bVar4 + "' and cannot be moved to `" + bVar + "` in component " + zv8Var).toString());
        }
        this.d = bVar;
        if (this.g || this.f != 0) {
            this.h = true;
            return;
        }
        this.g = true;
        i();
        this.g = false;
        if (this.d == bVar4) {
            this.c = new f75<>();
        }
    }

    public final void h(kv8.b bVar) {
        bVar.getClass();
        e("setCurrentState");
        g(bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r11.h = false;
        r11.j.setValue(r11.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aw8.i():void");
    }
}
