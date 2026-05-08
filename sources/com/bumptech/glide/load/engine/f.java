package com.bumptech.glide.load.engine;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.engine.a;
import com.bumptech.glide.load.engine.e;
import com.bumptech.glide.load.engine.h;
import defpackage.d64;
import defpackage.f5d;
import defpackage.f65;
import defpackage.f89;
import defpackage.h5;
import defpackage.hh1;
import defpackage.hu1;
import defpackage.ie7;
import defpackage.k96;
import defpackage.kg8;
import defpackage.knb;
import defpackage.l5;
import defpackage.n39;
import defpackage.o64;
import defpackage.ova;
import defpackage.p64;
import defpackage.qhe;
import defpackage.ux0;
import defpackage.w15;
import defpackage.xe3;
import defpackage.yt4;
import defpackage.z54;
import defpackage.z5d;
import defpackage.z79;
import defpackage.zt4;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class f implements yt4, h.a {
    public static final boolean h = Log.isLoggable("Engine", 2);
    public final ux0 a;
    public final hh1 b;
    public final f89 c;
    public final b d;
    public final z5d e;
    public final a f;
    public final com.bumptech.glide.load.engine.a g;

    public static class a {
        public final c a;
        public final f65.c b = f65.a(150, new C0118a());
        public int c;

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.f$a$a, reason: collision with other inner class name */
        public class C0118a implements f65.b<e<?>> {
            public C0118a() {
            }

            @Override // f65.b
            public final e<?> create() {
                a aVar = a.this;
                return new e<>(aVar.a, aVar.b);
            }
        }

        public a(c cVar) {
            this.a = cVar;
        }
    }

    public static class b {
        public final k96 a;
        public final k96 b;
        public final k96 c;
        public final k96 d;
        public final f e;
        public final f f;
        public final f65.c g = f65.a(150, new a());

        public class a implements f65.b<g<?>> {
            public a() {
            }

            @Override // f65.b
            public final g<?> create() {
                b bVar = b.this;
                return new g<>(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e, bVar.f, bVar.g);
            }
        }

        public b(k96 k96Var, k96 k96Var2, k96 k96Var3, k96 k96Var4, f fVar, f fVar2) {
            this.a = k96Var;
            this.b = k96Var2;
            this.c = k96Var3;
            this.d = k96Var4;
            this.e = fVar;
            this.f = fVar2;
        }
    }

    public static class c implements e.c {
        public final z54.a a;
        public volatile z54 b;

        public c(z54.a aVar) {
            this.a = aVar;
        }

        public final z54 a() {
            if (this.b == null) {
                synchronized (this) {
                    try {
                        if (this.b == null) {
                            File cacheDir = ((Context) ((o64) this.a).a.a).getCacheDir();
                            p64 p64Var = null;
                            File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                            if (file != null && (file.isDirectory() || file.mkdirs())) {
                                p64Var = new p64(file);
                            }
                            this.b = p64Var;
                        }
                        if (this.b == null) {
                            this.b = new ie7(18);
                        }
                    } finally {
                    }
                }
            }
            return this.b;
        }
    }

    public class d {
        public final g<?> a;
        public final qhe b;

        public d(qhe qheVar, g gVar) {
            this.b = qheVar;
            this.a = gVar;
        }
    }

    public f(f89 f89Var, z54.a aVar, k96 k96Var, k96 k96Var2, k96 k96Var3, k96 k96Var4) throws Throwable {
        this.c = f89Var;
        c cVar = new c(aVar);
        com.bumptech.glide.load.engine.a aVar2 = new com.bumptech.glide.load.engine.a();
        this.g = aVar2;
        synchronized (this) {
            try {
                synchronized (aVar2) {
                    try {
                        try {
                            aVar2.d = this;
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                }
                this.b = new hh1(17);
                this.a = new ux0();
                this.d = new b(k96Var, k96Var2, k96Var3, k96Var4, this, this);
                this.f = new a(cVar);
                this.e = new z5d();
                f89Var.d = this;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public static void d(String str, long j, zt4 zt4Var) {
        StringBuilder sbG = h5.g(str, " in ");
        sbG.append(n39.a(j));
        sbG.append("ms, key: ");
        sbG.append(zt4Var);
        Log.v("Engine", sbG.toString());
    }

    public static void f(f5d f5dVar) {
        if (f5dVar instanceof h) {
            ((h) f5dVar).d();
        } else {
            l5.q("Cannot release anything but an EngineResource");
        }
    }

    @Override // com.bumptech.glide.load.engine.h.a
    public final void a(kg8 kg8Var, h<?> hVar) {
        com.bumptech.glide.load.engine.a aVar = this.g;
        synchronized (aVar) {
            a.C0116a c0116a = (a.C0116a) aVar.b.remove(kg8Var);
            if (c0116a != null) {
                c0116a.c = null;
                c0116a.clear();
            }
        }
        if (hVar.a) {
            this.c.d(kg8Var, hVar);
        } else {
            this.e.a(hVar, false);
        }
    }

    public final d b(com.bumptech.glide.c cVar, Object obj, kg8 kg8Var, int i, int i2, Class cls, Class cls2, knb knbVar, d64 d64Var, hu1 hu1Var, boolean z, boolean z2, ova ovaVar, boolean z3, boolean z4, qhe qheVar, w15.a aVar) {
        long jElapsedRealtimeNanos;
        if (h) {
            int i3 = n39.b;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        this.b.getClass();
        zt4 zt4Var = new zt4(obj, kg8Var, i, i2, hu1Var, cls, cls2, ovaVar);
        synchronized (this) {
            try {
                h<?> hVarC = c(zt4Var, z3, jElapsedRealtimeNanos);
                if (hVarC == null) {
                    return g(cVar, obj, kg8Var, i, i2, cls, cls2, knbVar, d64Var, hu1Var, z, z2, ovaVar, z3, z4, qheVar, aVar, zt4Var, jElapsedRealtimeNanos);
                }
                qheVar.j(hVarC, xe3.e, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final h<?> c(zt4 zt4Var, boolean z, long j) {
        h<?> hVar;
        Object obj;
        f fVar;
        zt4 zt4Var2;
        h<?> hVar2;
        if (z) {
            com.bumptech.glide.load.engine.a aVar = this.g;
            synchronized (aVar) {
                a.C0116a c0116a = (a.C0116a) aVar.b.get(zt4Var);
                if (c0116a == null) {
                    hVar = null;
                } else {
                    hVar = c0116a.get();
                    if (hVar == null) {
                        aVar.b(c0116a);
                    }
                }
            }
            if (hVar != null) {
                hVar.c();
            }
            if (hVar != null) {
                if (h) {
                    d("Loaded resource from active resources", j, zt4Var);
                }
                return hVar;
            }
            f89 f89Var = this.c;
            synchronized (f89Var) {
                z79.a aVar2 = (z79.a) f89Var.a.remove(zt4Var);
                if (aVar2 == null) {
                    obj = null;
                } else {
                    f89Var.c -= (long) aVar2.b;
                    obj = aVar2.a;
                }
            }
            f5d f5dVar = (f5d) obj;
            if (f5dVar == null) {
                fVar = this;
                zt4Var2 = zt4Var;
                hVar2 = null;
            } else if (f5dVar instanceof h) {
                hVar2 = (h) f5dVar;
                fVar = this;
                zt4Var2 = zt4Var;
            } else {
                fVar = this;
                zt4Var2 = zt4Var;
                hVar2 = new h<>(f5dVar, true, true, zt4Var2, fVar);
            }
            if (hVar2 != null) {
                hVar2.c();
                fVar.g.a(zt4Var2, hVar2);
            }
            if (hVar2 != null) {
                if (h) {
                    d("Loaded resource from cache", j, zt4Var2);
                }
                return hVar2;
            }
        }
        return null;
    }

    public final synchronized void e(g<?> gVar, kg8 kg8Var, h<?> hVar) {
        if (hVar != null) {
            try {
                if (hVar.a) {
                    this.g.a(kg8Var, hVar);
                }
            } finally {
            }
        }
        ux0 ux0Var = this.a;
        ux0Var.getClass();
        gVar.getClass();
        HashMap map = (HashMap) ux0Var.b;
        if (gVar == map.get(kg8Var)) {
            map.remove(kg8Var);
        }
    }

    public final d g(com.bumptech.glide.c cVar, Object obj, kg8 kg8Var, int i, int i2, Class cls, Class cls2, knb knbVar, d64 d64Var, Map map, boolean z, boolean z2, ova ovaVar, boolean z3, boolean z4, qhe qheVar, Executor executor, zt4 zt4Var, long j) {
        g gVar = (g) ((HashMap) this.a.b).get(zt4Var);
        if (gVar != null) {
            gVar.a(qheVar, executor);
            if (h) {
                d("Added to existing load", j, zt4Var);
            }
            return new d(qheVar, gVar);
        }
        g gVar2 = (g) this.d.g.acquire();
        synchronized (gVar2) {
            gVar2.Z = zt4Var;
            gVar2.a0 = z3;
            gVar2.b0 = z4;
        }
        a aVar = this.f;
        e<R> eVar = (e) aVar.b.acquire();
        int i3 = aVar.c;
        aVar.c = i3 + 1;
        com.bumptech.glide.load.engine.d<R> dVar = eVar.a;
        e.c cVar2 = eVar.d;
        dVar.c = cVar;
        dVar.d = obj;
        dVar.n = kg8Var;
        dVar.e = i;
        dVar.f = i2;
        dVar.p = d64Var;
        dVar.g = cls;
        dVar.h = cVar2;
        dVar.k = cls2;
        dVar.o = knbVar;
        dVar.i = ovaVar;
        dVar.j = map;
        dVar.q = z;
        dVar.r = z2;
        eVar.W = cVar;
        eVar.X = kg8Var;
        eVar.Y = knbVar;
        eVar.Z = zt4Var;
        eVar.a0 = i;
        eVar.b0 = i2;
        eVar.c0 = d64Var;
        eVar.d0 = ovaVar;
        eVar.e0 = gVar2;
        eVar.f0 = i3;
        eVar.h0 = e.EnumC0117e.a;
        eVar.j0 = obj;
        ux0 ux0Var = this.a;
        ux0Var.getClass();
        ((HashMap) ux0Var.b).put(zt4Var, gVar2);
        gVar2.a(qheVar, executor);
        synchronized (gVar2) {
            gVar2.i0 = eVar;
            e.f fVarO = eVar.o(e.f.a);
            ((fVarO == e.f.b || fVarO == e.f.c) ? gVar2.V : gVar2.b0 ? gVar2.X : gVar2.W).execute(eVar);
        }
        if (h) {
            d("Started new load", j, zt4Var);
        }
        return new d(qheVar, gVar2);
    }
}
