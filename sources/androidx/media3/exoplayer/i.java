package androidx.media3.exoplayer;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.media3.exoplayer.i;
import androidx.media3.exoplayer.source.a;
import androidx.media3.exoplayer.source.h;
import defpackage.emf;
import defpackage.gj0;
import defpackage.grf;
import defpackage.im9;
import defpackage.jm9;
import defpackage.km9;
import defpackage.lm9;
import defpackage.m20;
import defpackage.nj9;
import defpackage.nm9;
import defpackage.o1;
import defpackage.sdb;
import defpackage.sf6;
import defpackage.tm1;
import defpackage.uz8;
import defpackage.vjg;
import defpackage.w71;
import defpackage.wee;
import defpackage.xdb;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final sdb a;
    public final e e;
    public final m20 h;
    public final sf6 i;
    public boolean k;
    public grf l;
    public wee j = new wee.a();
    public final IdentityHashMap<androidx.media3.exoplayer.source.g, c> c = new IdentityHashMap<>();
    public final HashMap d = new HashMap();
    public final ArrayList b = new ArrayList();
    public final HashMap<c, b> f = new HashMap<>();
    public final HashSet g = new HashSet();

    public final class a implements androidx.media3.exoplayer.source.i, androidx.media3.exoplayer.drm.a {
        public final c a;

        public a(c cVar) {
            this.a = cVar;
        }

        @Override // androidx.media3.exoplayer.source.i
        public final void C(int i, h.b bVar, nj9 nj9Var) {
            Pair<Integer, h.b> pairA = a(i, bVar);
            if (pairA != null) {
                i.this.i.i(new nm9(0, this, pairA, nj9Var));
            }
        }

        @Override // androidx.media3.exoplayer.drm.a
        public final void F(int i, h.b bVar) {
            Pair<Integer, h.b> pairA = a(i, bVar);
            if (pairA != null) {
                i.this.i.i(new gj0(3, this, pairA));
            }
        }

        @Override // androidx.media3.exoplayer.source.i
        public final void G(int i, h.b bVar, nj9 nj9Var) {
            Pair<Integer, h.b> pairA = a(i, bVar);
            if (pairA != null) {
                i.this.i.i(new km9(0, this, pairA, nj9Var));
            }
        }

        @Override // androidx.media3.exoplayer.drm.a
        public final void P(int i, h.b bVar, final int i2) {
            final Pair<Integer, h.b> pairA = a(i, bVar);
            if (pairA != null) {
                i.this.i.i(new Runnable() { // from class: pm9
                    @Override // java.lang.Runnable
                    public final void run() {
                        m20 m20Var = i.this.h;
                        Pair pair = pairA;
                        m20Var.P(((Integer) pair.first).intValue(), (h.b) pair.second, i2);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.a
        public final void R(int i, h.b bVar, final Exception exc) {
            final Pair<Integer, h.b> pairA = a(i, bVar);
            if (pairA != null) {
                i.this.i.i(new Runnable() { // from class: mm9
                    @Override // java.lang.Runnable
                    public final void run() {
                        m20 m20Var = i.this.h;
                        Pair pair = pairA;
                        m20Var.R(((Integer) pair.first).intValue(), (h.b) pair.second, exc);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.a
        public final void Z(int i, h.b bVar) {
            Pair<Integer, h.b> pairA = a(i, bVar);
            if (pairA != null) {
                i.this.i.i(new w71(3, this, pairA));
            }
        }

        public final Pair<Integer, h.b> a(int i, h.b bVar) {
            h.b bVarA;
            c cVar = this.a;
            h.b bVar2 = null;
            if (bVar != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= cVar.c.size()) {
                        bVarA = null;
                        break;
                    }
                    if (((h.b) cVar.c.get(i2)).d == bVar.d) {
                        Object obj = bVar.a;
                        Object obj2 = cVar.b;
                        int i3 = o1.g;
                        bVarA = bVar.a(Pair.create(obj2, obj));
                        break;
                    }
                    i2++;
                }
                if (bVarA == null) {
                    return null;
                }
                bVar2 = bVarA;
            }
            return Pair.create(Integer.valueOf(i + cVar.d), bVar2);
        }

        @Override // androidx.media3.exoplayer.source.i
        public final void e0(int i, h.b bVar, final uz8 uz8Var, final nj9 nj9Var, final int i2) {
            final Pair<Integer, h.b> pairA = a(i, bVar);
            if (pairA != null) {
                i.this.i.i(new Runnable() { // from class: qm9
                    @Override // java.lang.Runnable
                    public final void run() {
                        m20 m20Var = i.this.h;
                        Pair pair = pairA;
                        m20Var.e0(((Integer) pair.first).intValue(), (h.b) pair.second, uz8Var, nj9Var, i2);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.i
        public final void m0(int i, h.b bVar, final uz8 uz8Var, final nj9 nj9Var, final IOException iOException, final boolean z) {
            final Pair<Integer, h.b> pairA = a(i, bVar);
            if (pairA != null) {
                i.this.i.i(new Runnable() { // from class: rm9
                    @Override // java.lang.Runnable
                    public final void run() {
                        m20 m20Var = i.this.h;
                        Pair pair = pairA;
                        m20Var.m0(((Integer) pair.first).intValue(), (h.b) pair.second, uz8Var, nj9Var, iOException, z);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.a
        public final void s0(int i, h.b bVar) {
            Pair<Integer, h.b> pairA = a(i, bVar);
            if (pairA != null) {
                i.this.i.i(new tm1(6, this, pairA));
            }
        }

        @Override // androidx.media3.exoplayer.source.i
        public final void t0(int i, h.b bVar, final uz8 uz8Var, final nj9 nj9Var) {
            final Pair<Integer, h.b> pairA = a(i, bVar);
            if (pairA != null) {
                i.this.i.i(new Runnable() { // from class: om9
                    @Override // java.lang.Runnable
                    public final void run() {
                        m20 m20Var = i.this.h;
                        Pair pair = pairA;
                        m20Var.t0(((Integer) pair.first).intValue(), (h.b) pair.second, uz8Var, nj9Var);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.i
        public final void x(int i, h.b bVar, uz8 uz8Var, nj9 nj9Var) {
            Pair<Integer, h.b> pairA = a(i, bVar);
            if (pairA != null) {
                i.this.i.i(new lm9(this, pairA, uz8Var, nj9Var, 0));
            }
        }
    }

    public static final class b {
        public final androidx.media3.exoplayer.source.h a;
        public final jm9 b;
        public final a c;

        public b(androidx.media3.exoplayer.source.h hVar, jm9 jm9Var, a aVar) {
            this.a = hVar;
            this.b = jm9Var;
            this.c = aVar;
        }
    }

    public static final class c implements im9 {
        public final androidx.media3.exoplayer.source.f a;
        public int d;
        public boolean e;
        public final ArrayList c = new ArrayList();
        public final Object b = new Object();

        public c(androidx.media3.exoplayer.source.h hVar, boolean z) {
            this.a = new androidx.media3.exoplayer.source.f(hVar, z);
        }

        @Override // defpackage.im9
        public final Object a() {
            return this.b;
        }

        @Override // defpackage.im9
        public final emf b() {
            return this.a.o;
        }
    }

    public i(e eVar, m20 m20Var, sf6 sf6Var, sdb sdbVar) {
        this.a = sdbVar;
        this.e = eVar;
        this.h = m20Var;
        this.i = sf6Var;
    }

    public final emf a(int i, ArrayList arrayList, wee weeVar) {
        if (!arrayList.isEmpty()) {
            this.j = weeVar;
            for (int i2 = i; i2 < arrayList.size() + i; i2++) {
                c cVar = (c) arrayList.get(i2 - i);
                ArrayList arrayList2 = this.b;
                if (i2 > 0) {
                    c cVar2 = (c) arrayList2.get(i2 - 1);
                    cVar.d = cVar2.a.o.e.o() + cVar2.d;
                    cVar.e = false;
                    cVar.c.clear();
                } else {
                    cVar.d = 0;
                    cVar.e = false;
                    cVar.c.clear();
                }
                int iO = cVar.a.o.e.o();
                for (int i3 = i2; i3 < arrayList2.size(); i3++) {
                    ((c) arrayList2.get(i3)).d += iO;
                }
                arrayList2.add(i2, cVar);
                this.d.put(cVar.b, cVar);
                if (this.k) {
                    e(cVar);
                    if (this.c.isEmpty()) {
                        this.g.add(cVar);
                    } else {
                        b bVar = this.f.get(cVar);
                        if (bVar != null) {
                            bVar.a.l(bVar.b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final emf b() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return emf.a;
        }
        int iO = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            c cVar = (c) arrayList.get(i);
            cVar.d = iO;
            iO += cVar.a.o.e.o();
        }
        return new xdb(arrayList, this.j);
    }

    public final void c() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.c.isEmpty()) {
                b bVar = this.f.get(cVar);
                if (bVar != null) {
                    bVar.a.l(bVar.b);
                }
                it.remove();
            }
        }
    }

    public final void d(c cVar) {
        if (cVar.e && cVar.c.isEmpty()) {
            b bVarRemove = this.f.remove(cVar);
            bVarRemove.getClass();
            a aVar = bVarRemove.c;
            androidx.media3.exoplayer.source.h hVar = bVarRemove.a;
            hVar.k(bVarRemove.b);
            hVar.c(aVar);
            hVar.g(aVar);
            this.g.remove(cVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.media3.exoplayer.source.h$c, jm9] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void e(c cVar) {
        androidx.media3.exoplayer.source.f fVar = cVar.a;
        ?? r1 = new h.c() { // from class: jm9
            @Override // androidx.media3.exoplayer.source.h.c
            public final void a(a aVar, emf emfVar) {
                sf6 sf6Var = this.a.e.W;
                sf6Var.l(2);
                sf6Var.k(22);
            }
        };
        a aVar = new a(cVar);
        this.f.put(cVar, new b(fVar, r1, aVar));
        String str = vjg.a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        fVar.b(new Handler(looperMyLooper, null), aVar);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        fVar.e(new Handler(looperMyLooper2, null), aVar);
        fVar.j(r1, this.l, this.a);
    }

    public final void f(androidx.media3.exoplayer.source.g gVar) {
        IdentityHashMap<androidx.media3.exoplayer.source.g, c> identityHashMap = this.c;
        c cVarRemove = identityHashMap.remove(gVar);
        cVarRemove.getClass();
        cVarRemove.a.h(gVar);
        cVarRemove.c.remove(((androidx.media3.exoplayer.source.e) gVar).a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(cVarRemove);
    }

    public final void g(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            ArrayList arrayList = this.b;
            c cVar = (c) arrayList.remove(i3);
            this.d.remove(cVar.b);
            int i4 = -cVar.a.o.e.o();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((c) arrayList.get(i5)).d += i4;
            }
            cVar.e = true;
            if (this.k) {
                d(cVar);
            }
        }
    }
}
