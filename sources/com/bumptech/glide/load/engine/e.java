package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.engine.c;
import com.bumptech.glide.load.engine.f;
import com.bumptech.glide.load.engine.g;
import com.bumptech.glide.load.engine.h;
import defpackage.akb;
import defpackage.d64;
import defpackage.f5d;
import defpackage.f65;
import defpackage.fva;
import defpackage.h5;
import defpackage.h94;
import defpackage.hu1;
import defpackage.ia;
import defpackage.ja;
import defpackage.kd7;
import defpackage.ke3;
import defpackage.kg8;
import defpackage.knb;
import defpackage.n39;
import defpackage.n5d;
import defpackage.ngb;
import defpackage.o6;
import defpackage.ova;
import defpackage.t29;
import defpackage.use;
import defpackage.vz8;
import defpackage.xe3;
import defpackage.yd3;
import defpackage.zt4;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class e<R> implements c.a, Runnable, Comparable<e<?>>, f65.d {
    public com.bumptech.glide.c W;
    public kg8 X;
    public knb Y;
    public zt4 Z;
    public int a0;
    public int b0;
    public d64 c0;
    public final c d;
    public ova d0;
    public final ngb<e<?>> e;
    public g e0;
    public int f0;
    public f g0;
    public EnumC0117e h0;
    public long i0;
    public Object j0;
    public Thread k0;
    public kg8 l0;
    public kg8 m0;
    public Object n0;
    public xe3 o0;
    public ke3<?> p0;
    public volatile com.bumptech.glide.load.engine.c q0;
    public volatile boolean r0;
    public volatile boolean s0;
    public boolean t0;
    public final com.bumptech.glide.load.engine.d<R> a = new com.bumptech.glide.load.engine.d<>();
    public final ArrayList b = new ArrayList();
    public final use.a c = new use.a();
    public final b<?> f = new b<>();
    public final d V = new d();

    public final class a<Z> {
        public final xe3 a;

        public a(xe3 xe3Var) {
            this.a = xe3Var;
        }
    }

    public static class b<Z> {
        public kg8 a;
        public n5d<Z> b;
        public t29<Z> c;
    }

    public interface c {
    }

    public static class d {
        public boolean a;
        public boolean b;
        public boolean c;

        public final boolean a() {
            return (this.c || this.b) && this.a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.e$e, reason: collision with other inner class name */
    public static final class EnumC0117e {
        public static final EnumC0117e a;
        public static final EnumC0117e b;
        public static final EnumC0117e c;
        public static final /* synthetic */ EnumC0117e[] d;

        static {
            EnumC0117e enumC0117e = new EnumC0117e("INITIALIZE", 0);
            a = enumC0117e;
            EnumC0117e enumC0117e2 = new EnumC0117e("SWITCH_TO_SOURCE_SERVICE", 1);
            b = enumC0117e2;
            EnumC0117e enumC0117e3 = new EnumC0117e("DECODE_DATA", 2);
            c = enumC0117e3;
            d = new EnumC0117e[]{enumC0117e, enumC0117e2, enumC0117e3};
        }

        public EnumC0117e() {
            throw null;
        }

        public static EnumC0117e valueOf(String str) {
            return (EnumC0117e) Enum.valueOf(EnumC0117e.class, str);
        }

        public static EnumC0117e[] values() {
            return (EnumC0117e[]) d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class f {
        public static final /* synthetic */ f[] V;
        public static final f a;
        public static final f b;
        public static final f c;
        public static final f d;
        public static final f e;
        public static final f f;

        static {
            f fVar = new f("INITIALIZE", 0);
            a = fVar;
            f fVar2 = new f("RESOURCE_CACHE", 1);
            b = fVar2;
            f fVar3 = new f("DATA_CACHE", 2);
            c = fVar3;
            f fVar4 = new f("SOURCE", 3);
            d = fVar4;
            f fVar5 = new f("ENCODE", 4);
            e = fVar5;
            f fVar6 = new f("FINISHED", 5);
            f = fVar6;
            V = new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6};
        }

        public f() {
            throw null;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) V.clone();
        }
    }

    public e(f.c cVar, f65.c cVar2) {
        this.d = cVar;
        this.e = cVar2;
    }

    public final <Data> f5d<R> a(ke3<?> ke3Var, Data data, xe3 xe3Var) {
        if (data == null) {
            return null;
        }
        try {
            int i = n39.b;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            f5d<R> f5dVarH = h(data, xe3Var);
            if (Log.isLoggable("DecodeJob", 2)) {
                p(jElapsedRealtimeNanos, "Decoded result " + f5dVarH, null);
            }
            return f5dVarH;
        } finally {
            ke3Var.b();
        }
    }

    @Override // f65.d
    public final use.a c() {
        return this.c;
    }

    @Override // java.lang.Comparable
    public final int compareTo(e<?> eVar) {
        e<?> eVar2 = eVar;
        int iOrdinal = this.Y.ordinal() - eVar2.Y.ordinal();
        return iOrdinal == 0 ? this.f0 - eVar2.f0 : iOrdinal;
    }

    @Override // com.bumptech.glide.load.engine.c.a
    public final void e(kg8 kg8Var, Exception exc, ke3<?> ke3Var, xe3 xe3Var) {
        ke3Var.b();
        GlideException glideException = new GlideException("Fetching data failed", Collections.singletonList(exc));
        glideException.f(kg8Var, xe3Var, ke3Var.a());
        this.b.add(glideException);
        if (Thread.currentThread() != this.k0) {
            t(EnumC0117e.b);
        } else {
            u();
        }
    }

    @Override // com.bumptech.glide.load.engine.c.a
    public final void f(kg8 kg8Var, Object obj, ke3<?> ke3Var, xe3 xe3Var, kg8 kg8Var2) {
        this.l0 = kg8Var;
        this.n0 = obj;
        this.p0 = ke3Var;
        this.o0 = xe3Var;
        this.m0 = kg8Var2;
        this.t0 = kg8Var != this.a.a().get(0);
        if (Thread.currentThread() != this.k0) {
            t(EnumC0117e.c);
        } else {
            m();
        }
    }

    public final <Data> f5d<R> h(Data data, xe3 xe3Var) {
        Class<?> cls = data.getClass();
        com.bumptech.glide.load.engine.d<R> dVar = this.a;
        vz8<Data, ?, R> vz8VarC = dVar.c(cls);
        ova ovaVar = this.d0;
        boolean z = xe3Var == xe3.d || dVar.r;
        fva<Boolean> fvaVar = h94.i;
        Boolean bool = (Boolean) ovaVar.c(fvaVar);
        if (bool == null || (bool.booleanValue() && !z)) {
            ovaVar = new ova();
            hu1 hu1Var = this.d0.b;
            hu1 hu1Var2 = ovaVar.b;
            hu1Var2.i(hu1Var);
            hu1Var2.put(fvaVar, Boolean.valueOf(z));
        }
        ova ovaVar2 = ovaVar;
        com.bumptech.glide.load.data.a aVarG = this.W.a().g(data);
        try {
            return vz8VarC.a(this.a0, this.b0, ovaVar2, aVarG, new a(xe3Var));
        } finally {
            aVarG.b();
        }
    }

    public final void m() {
        t29 t29VarA;
        boolean zA;
        if (Log.isLoggable("DecodeJob", 2)) {
            p(this.i0, "Retrieved data", "data: " + this.n0 + ", cache key: " + this.l0 + ", fetcher: " + this.p0);
        }
        t29 t29Var = null;
        try {
            t29VarA = a(this.p0, this.n0, this.o0);
        } catch (GlideException e) {
            e.f(this.m0, this.o0, null);
            this.b.add(e);
            t29VarA = null;
        }
        if (t29VarA == null) {
            u();
            return;
        }
        xe3 xe3Var = this.o0;
        boolean z = this.t0;
        if (t29VarA instanceof kd7) {
            ((kd7) t29VarA).initialize();
        }
        if (this.f.c != null) {
            t29Var = (t29) t29.e.acquire();
            t29Var.d = false;
            t29Var.c = true;
            t29Var.b = t29VarA;
            t29VarA = t29Var;
        }
        w();
        g<?> gVar = this.e0;
        synchronized (gVar) {
            gVar.c0 = t29VarA;
            gVar.d0 = xe3Var;
            gVar.k0 = z;
        }
        synchronized (gVar) {
            try {
                gVar.b.a();
                if (gVar.j0) {
                    gVar.c0.recycle();
                    gVar.g();
                } else {
                    if (gVar.a.a.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (gVar.e0) {
                        throw new IllegalStateException("Already have resource");
                    }
                    g.c cVar = gVar.e;
                    f5d<?> f5dVar = gVar.c0;
                    boolean z2 = gVar.a0;
                    zt4 zt4Var = gVar.Z;
                    h.a aVar = gVar.c;
                    cVar.getClass();
                    gVar.h0 = new h<>(f5dVar, z2, true, zt4Var, aVar);
                    gVar.e0 = true;
                    g.e eVar = gVar.a;
                    eVar.getClass();
                    ArrayList<g.d> arrayList = new ArrayList(eVar.a);
                    gVar.e(arrayList.size() + 1);
                    ((com.bumptech.glide.load.engine.f) gVar.f).e(gVar, gVar.Z, gVar.h0);
                    for (g.d dVar : arrayList) {
                        dVar.b.execute(new g.b(dVar.a));
                    }
                    gVar.d();
                }
            } finally {
            }
        }
        this.g0 = f.e;
        try {
            b<?> bVar = this.f;
            if (bVar.c != null) {
                c cVar2 = this.d;
                ova ovaVar = this.d0;
                bVar.getClass();
                try {
                    ((f.c) cVar2).a().b(bVar.a, new yd3(bVar.b, bVar.c, ovaVar));
                    bVar.c.d();
                } catch (Throwable th) {
                    bVar.c.d();
                    throw th;
                }
            }
            if (t29Var != null) {
                t29Var.d();
            }
            d dVar2 = this.V;
            synchronized (dVar2) {
                dVar2.b = true;
                zA = dVar2.a();
            }
            if (zA) {
                s();
            }
        } finally {
        }
    }

    public final com.bumptech.glide.load.engine.c n() {
        int iOrdinal = this.g0.ordinal();
        com.bumptech.glide.load.engine.d<R> dVar = this.a;
        if (iOrdinal == 1) {
            return new i(dVar, this);
        }
        if (iOrdinal == 2) {
            return new com.bumptech.glide.load.engine.b(dVar.a(), dVar, this);
        }
        if (iOrdinal == 3) {
            return new j(dVar, this);
        }
        if (iOrdinal == 5) {
            return null;
        }
        o6.k(this.g0, "Unrecognized stage: ");
        return null;
    }

    public final f o(f fVar) {
        int iOrdinal = fVar.ordinal();
        if (iOrdinal == 0) {
            boolean zB = this.c0.b();
            f fVar2 = f.b;
            return zB ? fVar2 : o(fVar2);
        }
        if (iOrdinal == 1) {
            boolean zA = this.c0.a();
            f fVar3 = f.c;
            return zA ? fVar3 : o(fVar3);
        }
        if (iOrdinal == 2) {
            return f.d;
        }
        if (iOrdinal == 3 || iOrdinal == 5) {
            return f.f;
        }
        akb.o(fVar, "Unrecognized stage: ");
        return null;
    }

    public final void p(long j, String str, String str2) {
        StringBuilder sbG = h5.g(str, " in ");
        sbG.append(n39.a(j));
        sbG.append(", load key: ");
        sbG.append(this.Z);
        sbG.append(str2 != null ? ", ".concat(str2) : "");
        sbG.append(", thread: ");
        sbG.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sbG.toString());
    }

    public final void r() {
        boolean zA;
        w();
        GlideException glideException = new GlideException("Failed to load resource", new ArrayList(this.b));
        g<?> gVar = this.e0;
        synchronized (gVar) {
            gVar.f0 = glideException;
        }
        synchronized (gVar) {
            try {
                gVar.b.a();
                if (gVar.j0) {
                    gVar.g();
                } else {
                    if (gVar.a.a.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (gVar.g0) {
                        throw new IllegalStateException("Already failed once");
                    }
                    gVar.g0 = true;
                    zt4 zt4Var = gVar.Z;
                    g.e eVar = gVar.a;
                    eVar.getClass();
                    ArrayList<g.d> arrayList = new ArrayList(eVar.a);
                    gVar.e(arrayList.size() + 1);
                    ((com.bumptech.glide.load.engine.f) gVar.f).e(gVar, zt4Var, null);
                    for (g.d dVar : arrayList) {
                        dVar.b.execute(new g.a(dVar.a));
                    }
                    gVar.d();
                }
            } finally {
            }
        }
        d dVar2 = this.V;
        synchronized (dVar2) {
            dVar2.c = true;
            zA = dVar2.a();
        }
        if (zA) {
            s();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ke3<?> ke3Var = this.p0;
        try {
            try {
                try {
                    if (this.s0) {
                        r();
                        if (ke3Var != null) {
                            ke3Var.b();
                            return;
                        }
                        return;
                    }
                    v();
                    if (ke3Var != null) {
                        ke3Var.b();
                    }
                } catch (CallbackException e) {
                    throw e;
                }
            } catch (Throwable th) {
                if (Log.isLoggable("DecodeJob", 3)) {
                    Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.s0 + ", stage: " + this.g0, th);
                }
                if (this.g0 != f.e) {
                    this.b.add(th);
                    r();
                }
                if (!this.s0) {
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (ke3Var != null) {
                ke3Var.b();
            }
            throw th2;
        }
    }

    public final void s() {
        d dVar = this.V;
        synchronized (dVar) {
            dVar.b = false;
            dVar.a = false;
            dVar.c = false;
        }
        b<?> bVar = this.f;
        bVar.a = null;
        bVar.b = null;
        bVar.c = null;
        com.bumptech.glide.load.engine.d<R> dVar2 = this.a;
        dVar2.c = null;
        dVar2.d = null;
        dVar2.n = null;
        dVar2.g = null;
        dVar2.k = null;
        dVar2.i = null;
        dVar2.o = null;
        dVar2.j = null;
        dVar2.p = null;
        dVar2.a.clear();
        dVar2.l = false;
        dVar2.b.clear();
        dVar2.m = false;
        this.r0 = false;
        this.W = null;
        this.X = null;
        this.d0 = null;
        this.Y = null;
        this.Z = null;
        this.e0 = null;
        this.g0 = null;
        this.q0 = null;
        this.k0 = null;
        this.l0 = null;
        this.n0 = null;
        this.o0 = null;
        this.p0 = null;
        this.i0 = 0L;
        this.s0 = false;
        this.j0 = null;
        this.b.clear();
        this.e.a(this);
    }

    public final void t(EnumC0117e enumC0117e) {
        this.h0 = enumC0117e;
        g gVar = this.e0;
        (gVar.b0 ? gVar.X : gVar.W).execute(this);
    }

    public final void u() {
        this.k0 = Thread.currentThread();
        int i = n39.b;
        this.i0 = SystemClock.elapsedRealtimeNanos();
        boolean zA = false;
        while (!this.s0 && this.q0 != null && !(zA = this.q0.a())) {
            this.g0 = o(this.g0);
            this.q0 = n();
            if (this.g0 == f.d) {
                t(EnumC0117e.b);
                return;
            }
        }
        if ((this.g0 == f.f || this.s0) && !zA) {
            r();
        }
    }

    public final void v() {
        int iOrdinal = this.h0.ordinal();
        if (iOrdinal == 0) {
            this.g0 = o(f.a);
            this.q0 = n();
            u();
        } else if (iOrdinal == 1) {
            u();
        } else if (iOrdinal == 2) {
            m();
        } else {
            o6.k(this.h0, "Unrecognized run reason: ");
        }
    }

    public final void w() {
        this.c.a();
        if (this.r0) {
            ja.m("Already notified", this.b.isEmpty() ? null : (Throwable) ia.k(1, this.b));
        } else {
            this.r0 = true;
        }
    }
}
