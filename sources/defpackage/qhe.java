package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.c;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.f;
import defpackage.nia;
import defpackage.use;
import defpackage.w15;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qhe<R> implements n3d {
    public static final boolean B = Log.isLoggable("GlideRequest", 2);
    public final RuntimeException A;
    public final String a;
    public final use.a b;
    public final Object c;
    public final w3d d;
    public final c e;
    public final Object f;
    public final Class<R> g;
    public final wa1<?> h;
    public final int i;
    public final int j;
    public final knb k;
    public final y9f<R> l;
    public final List<i4d<R>> m;
    public final nia.a n;
    public final w15.a o;
    public f5d<R> p;
    public f.d q;
    public long r;
    public volatile f s;
    public a t;
    public Drawable u;
    public Drawable v;
    public Drawable w;
    public int x;
    public int y;
    public boolean z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final /* synthetic */ a[] V;
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;

        static {
            a aVar = new a("PENDING", 0);
            a = aVar;
            a aVar2 = new a("RUNNING", 1);
            b = aVar2;
            a aVar3 = new a("WAITING_FOR_SIZE", 2);
            c = aVar3;
            a aVar4 = new a("COMPLETE", 3);
            d = aVar4;
            a aVar5 = new a("FAILED", 4);
            e = aVar5;
            a aVar6 = new a("CLEARED", 5);
            f = aVar6;
            V = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) V.clone();
        }
    }

    public qhe(Context context, c cVar, Object obj, Object obj2, Class cls, wa1 wa1Var, int i, int i2, knb knbVar, y9f y9fVar, ArrayList arrayList, w3d w3dVar, f fVar) {
        nia.a aVar = nia.a;
        w15.a aVar2 = w15.a;
        this.a = B ? String.valueOf(hashCode()) : null;
        this.b = new use.a();
        this.c = obj;
        this.e = cVar;
        this.f = obj2;
        this.g = cls;
        this.h = wa1Var;
        this.i = i;
        this.j = i2;
        this.k = knbVar;
        this.l = y9fVar;
        this.m = arrayList;
        this.d = w3dVar;
        this.s = fVar;
        this.n = aVar;
        this.o = aVar2;
        this.t = a.a;
        if (this.A == null && cVar.g.a.containsKey(j96.class)) {
            this.A = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // defpackage.n3d
    public final boolean a() {
        boolean z;
        synchronized (this.c) {
            z = this.t == a.d;
        }
        return z;
    }

    @Override // defpackage.n3d
    public final boolean b() {
        boolean z;
        synchronized (this.c) {
            z = this.t == a.d;
        }
        return z;
    }

    @Override // defpackage.n3d
    public final void c() {
        synchronized (this.c) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.n3d
    public final void clear() {
        synchronized (this.c) {
            try {
                if (this.z) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.b.a();
                a aVar = this.t;
                a aVar2 = a.f;
                if (aVar == aVar2) {
                    return;
                }
                d();
                f5d<R> f5dVar = this.p;
                if (f5dVar != null) {
                    this.p = null;
                } else {
                    f5dVar = null;
                }
                w3d w3dVar = this.d;
                if (w3dVar == null || w3dVar.e(this)) {
                    y9f<R> y9fVar = this.l;
                    e();
                    y9fVar.g();
                }
                this.t = aVar2;
                if (f5dVar != null) {
                    this.s.getClass();
                    f.f(f5dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        if (this.z) {
            r6.g("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            return;
        }
        this.b.a();
        this.l.getClass();
        f.d dVar = this.q;
        if (dVar != null) {
            synchronized (f.this) {
                dVar.a.h(dVar.b);
            }
            this.q = null;
        }
    }

    public final Drawable e() {
        if (this.v == null) {
            this.h.getClass();
            this.v = null;
        }
        return this.v;
    }

    @Override // defpackage.n3d
    public final boolean f(n3d n3dVar) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        wa1<?> wa1Var;
        knb knbVar;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class<R> cls2;
        wa1<?> wa1Var2;
        knb knbVar2;
        int size2;
        if (n3dVar instanceof qhe) {
            synchronized (this.c) {
                try {
                    i = this.i;
                    i2 = this.j;
                    obj = this.f;
                    cls = this.g;
                    wa1Var = this.h;
                    knbVar = this.k;
                    List<i4d<R>> list = this.m;
                    size = list != null ? list.size() : 0;
                } finally {
                }
            }
            qhe qheVar = (qhe) n3dVar;
            synchronized (qheVar.c) {
                try {
                    i3 = qheVar.i;
                    i4 = qheVar.j;
                    obj2 = qheVar.f;
                    cls2 = qheVar.g;
                    wa1Var2 = qheVar.h;
                    knbVar2 = qheVar.k;
                    List<i4d<R>> list2 = qheVar.m;
                    size2 = list2 != null ? list2.size() : 0;
                } finally {
                }
            }
            if (i == i3 && i2 == i4) {
                char[] cArr = xjg.a;
                if ((obj == null ? obj2 == null : obj instanceof cx9 ? ((cx9) obj).a() : obj.equals(obj2)) && cls.equals(cls2)) {
                    if ((wa1Var == null ? wa1Var2 == null : wa1Var.g(wa1Var2)) && knbVar == knbVar2 && size == size2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.n3d
    public final boolean g() {
        boolean z;
        synchronized (this.c) {
            z = this.t == a.f;
        }
        return z;
    }

    public final void h(String str) {
        StringBuilder sbG = h5.g(str, " this: ");
        sbG.append(this.a);
        Log.v("GlideRequest", sbG.toString());
    }

    public final void i(GlideException glideException, int i) {
        boolean zB;
        Drawable drawable;
        this.b.a();
        synchronized (this.c) {
            try {
                glideException.g(this.A);
                int i2 = this.e.h;
                if (i2 <= i) {
                    Log.w("Glide", "Load failed for [" + this.f + "] with dimensions [" + this.x + "x" + this.y + "]", glideException);
                    if (i2 <= 4) {
                        glideException.d();
                    }
                }
                this.q = null;
                this.t = a.e;
                w3d w3dVar = this.d;
                if (w3dVar != null) {
                    w3dVar.h(this);
                }
                boolean z = true;
                this.z = true;
                try {
                    List<i4d<R>> list = this.m;
                    if (list != null) {
                        zB = false;
                        for (i4d<R> i4dVar : list) {
                            w3d w3dVar2 = this.d;
                            if (w3dVar2 != null) {
                                w3dVar2.getRoot().a();
                            }
                            zB |= i4dVar.b();
                        }
                    } else {
                        zB = false;
                    }
                    if (!zB) {
                        w3d w3dVar3 = this.d;
                        if (w3dVar3 != null && !w3dVar3.i(this)) {
                            z = false;
                        }
                        if (z) {
                            if (this.f == null) {
                                if (this.w == null) {
                                    this.h.getClass();
                                    this.w = null;
                                }
                                drawable = this.w;
                            } else {
                                drawable = null;
                            }
                            if (drawable == null) {
                                if (this.u == null) {
                                    this.h.getClass();
                                    this.u = null;
                                }
                                drawable = this.u;
                            }
                            if (drawable == null) {
                                e();
                            }
                            this.l.b();
                        }
                    }
                } finally {
                    this.z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.n3d
    public final boolean isRunning() {
        boolean z;
        synchronized (this.c) {
            try {
                a aVar = this.t;
                z = aVar == a.b || aVar == a.c;
            } finally {
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(f5d<?> f5dVar, xe3 xe3Var, boolean z) {
        this.b.a();
        f5d<?> f5dVar2 = null;
        try {
            synchronized (this.c) {
                try {
                    this.q = null;
                    if (f5dVar == null) {
                        i(new GlideException("Expected to receive a Resource<R> with an object of " + this.g + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = f5dVar.get();
                    try {
                        if (obj == null || !this.g.isAssignableFrom(obj.getClass())) {
                            this.p = null;
                            StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                            sb.append(this.g);
                            sb.append(" but instead got ");
                            sb.append(obj != null ? obj.getClass() : "");
                            sb.append("{");
                            sb.append(obj);
                            sb.append("} inside Resource{");
                            sb.append(f5dVar);
                            sb.append("}.");
                            sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            i(new GlideException(sb.toString()), 5);
                        } else {
                            w3d w3dVar = this.d;
                            if (w3dVar == null || w3dVar.d(this)) {
                                l(f5dVar, obj, xe3Var, z);
                                return;
                            } else {
                                this.p = null;
                                this.t = a.d;
                            }
                        }
                        this.s.getClass();
                        f.f(f5dVar);
                    } catch (Throwable th) {
                        f5dVar2 = f5dVar;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (f5dVar2 != null) {
                this.s.getClass();
                f.f(f5dVar2);
            }
            throw th3;
        }
    }

    @Override // defpackage.n3d
    public final void k() {
        synchronized (this.c) {
            try {
                if (this.z) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.b.a();
                int i = n39.b;
                this.r = SystemClock.elapsedRealtimeNanos();
                if (this.f == null) {
                    if (xjg.i(this.i, this.j)) {
                        this.x = this.i;
                        this.y = this.j;
                    }
                    if (this.w == null) {
                        this.h.getClass();
                        this.w = null;
                    }
                    i(new GlideException("Received null model"), this.w == null ? 5 : 3);
                    return;
                }
                a aVar = this.t;
                if (aVar == a.b) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (aVar == a.d) {
                    j(this.p, xe3.e, false);
                    return;
                }
                List<i4d<R>> list = this.m;
                if (list != null) {
                    for (i4d<R> i4dVar : list) {
                    }
                }
                a aVar2 = a.c;
                this.t = aVar2;
                if (xjg.i(this.i, this.j)) {
                    m(this.i, this.j);
                } else {
                    this.l.e(this);
                }
                a aVar3 = this.t;
                if (aVar3 == a.b || aVar3 == aVar2) {
                    w3d w3dVar = this.d;
                    if (w3dVar == null || w3dVar.i(this)) {
                        y9f<R> y9fVar = this.l;
                        e();
                        y9fVar.getClass();
                    }
                }
                if (B) {
                    h("finished run method in " + n39.a(this.r));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(f5d<R> f5dVar, R r, xe3 xe3Var, boolean z) {
        boolean zC;
        w3d w3dVar = this.d;
        if (w3dVar != null) {
            w3dVar.getRoot().a();
        }
        this.t = a.d;
        this.p = f5dVar;
        if (this.e.h <= 3) {
            Log.d("Glide", "Finished loading " + r.getClass().getSimpleName() + " from " + xe3Var + " for " + this.f + " with size [" + this.x + "x" + this.y + "] in " + n39.a(this.r) + " ms");
        }
        if (w3dVar != null) {
            w3dVar.j(this);
        }
        this.z = true;
        try {
            List<i4d<R>> list = this.m;
            if (list != null) {
                zC = false;
                for (i4d<R> i4dVar : list) {
                    zC |= i4dVar.c();
                    if (i4dVar instanceof v35) {
                        zC |= ((v35) i4dVar).a();
                    }
                }
            } else {
                zC = false;
            }
            if (!zC) {
                this.n.getClass();
                this.l.d(r);
            }
            this.z = false;
        } catch (Throwable th) {
            this.z = false;
            throw th;
        }
    }

    public final void m(int i, int i2) throws Throwable {
        Object obj;
        int iRound = i;
        this.b.a();
        Object obj2 = this.c;
        synchronized (obj2) {
            try {
                try {
                    boolean z = B;
                    if (z) {
                        h("Got onSizeReady in " + n39.a(this.r));
                    }
                    if (this.t != a.c) {
                        return;
                    }
                    a aVar = a.b;
                    this.t = aVar;
                    this.h.getClass();
                    if (iRound != Integer.MIN_VALUE) {
                        iRound = Math.round(iRound * 1.0f);
                    }
                    this.x = iRound;
                    this.y = i2 == Integer.MIN_VALUE ? i2 : Math.round(1.0f * i2);
                    if (z) {
                        h("finished setup for calling load in " + n39.a(this.r));
                    }
                    f fVar = this.s;
                    c cVar = this.e;
                    Object obj3 = this.f;
                    wa1<?> wa1Var = this.h;
                    try {
                        try {
                            try {
                            } catch (Throwable th) {
                                th = th;
                                obj = obj2;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            obj = obj2;
                        }
                        try {
                            this.q = fVar.b(cVar, obj3, wa1Var.V, this.x, this.y, wa1Var.a0, this.g, this.k, wa1Var.b, wa1Var.Z, wa1Var.W, wa1Var.d0, wa1Var.Y, wa1Var.d, wa1Var.e0, this, this.o);
                            if (this.t != aVar) {
                                this.q = null;
                            }
                            if (z) {
                                h("finished onSizeReady in " + n39.a(this.r));
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            obj = obj2;
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        obj = obj2;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    obj = obj2;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        }
    }

    public final String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.c) {
            obj = this.f;
            cls = this.g;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
