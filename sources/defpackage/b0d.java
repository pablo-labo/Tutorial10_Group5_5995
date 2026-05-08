package defpackage;

import android.os.Trace;
import androidx.compose.runtime.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b0d {
    public Set<k0d> a;
    public hm2 b;
    public final j4a<l0d> c;
    public a4a<l0d> d;
    public j4a<l0d> e;
    public final j4a<Object> f;
    public final j4a<gu5<j6g>> g;
    public a4a<wk2> h;
    public z3a<i, t6b> i;
    public ArrayList j;
    public mnd<l0d> k;

    public b0d() {
        j4a<l0d> j4aVar = new j4a<>(new l0d[16]);
        this.c = j4aVar;
        this.d = nnd.a();
        this.e = j4aVar;
        this.f = new j4a<>(new Object[16]);
        this.g = new j4a<>(new gu5[16]);
    }

    public static final boolean f(l0d l0dVar, j4a<l0d> j4aVar) {
        l0d[] l0dVarArr = j4aVar.a;
        int i = j4aVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            k0d k0dVar = l0dVarArr[i2].a;
            if (k0dVar instanceof t6b) {
                j4a<l0d> j4aVar2 = ((t6b) k0dVar).b;
                if (j4aVar2.j(l0dVar) || f(l0dVar, j4aVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a() {
        this.a = null;
        this.b = null;
        j4a<l0d> j4aVar = this.c;
        j4aVar.g();
        this.d.e();
        this.e = j4aVar;
        this.f.g();
        this.g.g();
        this.h = null;
        this.i = null;
        this.j = null;
    }

    public final void b() {
        Set<k0d> set = this.a;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator<k0d> it = set.iterator();
            while (it.hasNext()) {
                k0d next = it.next();
                it.remove();
                next.d();
            }
            j6g j6gVar = j6g.a;
        } finally {
            Trace.endSection();
        }
    }

    public final void c() {
        Set<k0d> set = this.a;
        if (set == null) {
            return;
        }
        this.k = null;
        j4a<Object> j4aVar = this.f;
        if (j4aVar.c != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                a4a<wk2> a4aVar = this.h;
                int i = j4aVar.c;
                while (true) {
                    i--;
                    if (-1 >= i) {
                        break;
                    }
                    Object obj = j4aVar.a[i];
                    try {
                        if (obj instanceof l0d) {
                            k0d k0dVar = ((l0d) obj).a;
                            set.remove(k0dVar);
                            k0dVar.e();
                        }
                        if (obj instanceof wk2) {
                            if (a4aVar == null || !a4aVar.a((wk2) obj)) {
                                ((wk2) obj).c();
                            } else {
                                ((wk2) obj).a();
                            }
                        }
                        j6g j6gVar = j6g.a;
                    } catch (Throwable th) {
                        hm2 hm2Var = this.b;
                        if (hm2Var != null) {
                            hm2Var.c(obj, th);
                        }
                        throw th;
                    }
                }
                j6g j6gVar2 = j6g.a;
            } finally {
            }
        }
        j4a<l0d> j4aVar2 = this.c;
        if (j4aVar2.c != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set<k0d> set2 = this.a;
                if (set2 != null) {
                    l0d[] l0dVarArr = j4aVar2.a;
                    int i2 = j4aVar2.c;
                    for (int i3 = 0; i3 < i2; i3++) {
                        l0d l0dVar = l0dVarArr[i3];
                        k0d k0dVar2 = l0dVar.a;
                        set2.remove(k0dVar2);
                        try {
                            k0dVar2.b();
                            j6g j6gVar3 = j6g.a;
                        } catch (Throwable th2) {
                            hm2 hm2Var2 = this.b;
                            if (hm2Var2 != null) {
                                hm2Var2.c(l0dVar, th2);
                            }
                            throw th2;
                        }
                    }
                }
                j6g j6gVar4 = j6g.a;
            } finally {
            }
        }
    }

    public final void d() {
        j4a<gu5<j6g>> j4aVar = this.g;
        if (j4aVar.c != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                gu5<j6g>[] gu5VarArr = j4aVar.a;
                int i = j4aVar.c;
                for (int i2 = 0; i2 < i; i2++) {
                    gu5VarArr[i2].invoke();
                }
                j4aVar.g();
                j6g j6gVar = j6g.a;
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void e(l0d l0dVar) {
        if (this.d.a(l0dVar)) {
            this.d.l(l0dVar);
            if (!this.e.j(l0dVar)) {
                j4a<l0d> j4aVar = this.c;
                if (!j4aVar.j(l0dVar)) {
                    f(l0dVar, j4aVar);
                }
            }
            Set<k0d> set = this.a;
            if (set == null) {
                return;
            } else {
                set.add(l0dVar.a);
            }
        }
        mnd<l0d> mndVar = this.k;
        if (mndVar == null || !mndVar.a(l0dVar)) {
            this.f.b(l0dVar);
        }
    }

    public final void g(Set set, im2 im2Var) {
        a();
        this.a = set;
        this.b = im2Var;
    }

    public final void h(l0d l0dVar) {
        this.e.b(l0dVar);
        this.d.d(l0dVar);
    }
}
