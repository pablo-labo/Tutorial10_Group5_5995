package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import defpackage.u3b;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import okhttp3.Headers;

/* JADX INFO: loaded from: classes.dex */
public final class v27 {
    public final Context a;
    public final Object b;
    public final Bitmap.Config c;
    public final eib d;
    public final List<qrf> e;
    public final oka f;
    public final Headers g;
    public final d8f h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final vt1 m;
    public final vt1 n;
    public final vt1 o;
    public final y03 p;
    public final y03 q;
    public final y03 r;
    public final y03 s;
    public final kv8 t;
    public final h74 u;
    public final tmd v;
    public final u3b w;
    public final es3 x;
    public final zp3 y;

    public v27() {
        throw null;
    }

    public v27(Context context, Object obj, Bitmap.Config config, eib eibVar, List list, oka okaVar, Headers headers, d8f d8fVar, boolean z, boolean z2, boolean z3, boolean z4, vt1 vt1Var, vt1 vt1Var2, vt1 vt1Var3, y03 y03Var, y03 y03Var2, y03 y03Var3, y03 y03Var4, kv8 kv8Var, h74 h74Var, tmd tmdVar, u3b u3bVar, es3 es3Var, zp3 zp3Var) {
        this.a = context;
        this.b = obj;
        this.c = config;
        this.d = eibVar;
        this.e = list;
        this.f = okaVar;
        this.g = headers;
        this.h = d8fVar;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = vt1Var;
        this.n = vt1Var2;
        this.o = vt1Var3;
        this.p = y03Var;
        this.q = y03Var2;
        this.r = y03Var3;
        this.s = y03Var4;
        this.t = kv8Var;
        this.u = h74Var;
        this.v = tmdVar;
        this.w = u3bVar;
        this.x = es3Var;
        this.y = zp3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v27)) {
            return false;
        }
        v27 v27Var = (v27) obj;
        return wl7.b(this.a, v27Var.a) && wl7.b(this.b, v27Var.b) && this.c == v27Var.c && this.d == v27Var.d && wl7.b(this.e, v27Var.e) && wl7.b(this.f, v27Var.f) && wl7.b(this.g, v27Var.g) && wl7.b(this.h, v27Var.h) && this.i == v27Var.i && this.j == v27Var.j && this.k == v27Var.k && this.l == v27Var.l && this.m == v27Var.m && this.n == v27Var.n && this.o == v27Var.o && wl7.b(this.p, v27Var.p) && wl7.b(this.q, v27Var.q) && wl7.b(this.r, v27Var.r) && wl7.b(this.s, v27Var.s) && wl7.b(this.t, v27Var.t) && wl7.b(this.u, v27Var.u) && this.v == v27Var.v && wl7.b(this.w, v27Var.w) && wl7.b(this.x, v27Var.x) && wl7.b(this.y, v27Var.y);
    }

    public final int hashCode() {
        int iHashCode = this.w.a.hashCode() + ((this.v.hashCode() + ((this.u.hashCode() + ((this.t.hashCode() + ((this.s.hashCode() + ((this.r.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ia.f(ia.f(ia.f(ia.f(k20.b(this.h.a, (((this.f.hashCode() + ia.g(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 28629151)) * 961)) * 29791, 31)) * 31) + Arrays.hashCode(this.g.a)) * 31, 31), 31, this.i), 31, this.j), 31, this.k), 31, this.l)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        this.x.getClass();
        return this.y.hashCode() + (iHashCode * (-196513505));
    }

    public static final class a {
        public final Context a;
        public zp3 b;
        public Object c;
        public final List<? extends qrf> d;
        public final Headers.Builder e;
        public final LinkedHashMap f;
        public final boolean g;
        public final boolean h;
        public final u3b.a i;
        public final kv8 j;
        public final h74 k;
        public tmd l;

        public a(v27 v27Var, Context context) {
            this.a = context;
            this.b = v27Var.y;
            this.c = v27Var.b;
            v27Var.x.getClass();
            this.d = v27Var.e;
            this.e = v27Var.g.d();
            this.f = lc9.i0(v27Var.h.a);
            this.g = v27Var.i;
            this.h = v27Var.l;
            u3b u3bVar = v27Var.w;
            u3bVar.getClass();
            this.i = new u3b.a(u3bVar);
            if (v27Var.a == context) {
                this.j = v27Var.t;
                this.k = v27Var.u;
                this.l = v27Var.v;
            } else {
                this.j = null;
                this.k = null;
                this.l = null;
            }
        }

        public final v27 a() {
            Object obj = this.c;
            if (obj == null) {
                obj = boa.Y;
            }
            Object obj2 = obj;
            zp3 zp3Var = this.b;
            Bitmap.Config config = zp3Var.g;
            eib eibVar = zp3Var.f;
            oka okaVar = zp3Var.e;
            Headers.Builder builder = this.e;
            Headers headersE = builder != null ? builder.e() : null;
            if (headersE == null) {
                headersE = m.c;
            } else {
                Bitmap.Config[] configArr = m.a;
            }
            Headers headers = headersE;
            LinkedHashMap linkedHashMap = this.f;
            d8f d8fVar = linkedHashMap != null ? new d8f(q92.H(linkedHashMap)) : null;
            if (d8fVar == null) {
                d8fVar = d8f.b;
            }
            d8f d8fVar2 = d8fVar;
            zp3 zp3Var2 = this.b;
            boolean z = zp3Var2.h;
            zp3Var2.getClass();
            zp3 zp3Var3 = this.b;
            vt1 vt1Var = zp3Var3.i;
            vt1 vt1Var2 = zp3Var3.j;
            vt1 vt1Var3 = zp3Var3.k;
            k89 k89Var = zp3Var3.a;
            y03 y03Var = zp3Var3.b;
            y03 y03Var2 = zp3Var3.c;
            y03 y03Var3 = zp3Var3.d;
            Context context = this.a;
            kv8 lifecycle = this.j;
            if (lifecycle == null) {
                Object baseContext = context;
                while (true) {
                    if (baseContext instanceof zv8) {
                        lifecycle = ((zv8) baseContext).getLifecycle();
                        break;
                    }
                    if (!(baseContext instanceof ContextWrapper)) {
                        lifecycle = null;
                        break;
                    }
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                }
                if (lifecycle == null) {
                    lifecycle = x96.b;
                }
            }
            kv8 kv8Var = lifecycle;
            h74 h74Var = this.k;
            if (h74Var == null) {
                h74Var = new h74(context);
            }
            h74 h74Var2 = h74Var;
            tmd tmdVar = this.l;
            if (tmdVar == null) {
                tmdVar = tmd.a;
            }
            tmd tmdVar2 = tmdVar;
            u3b.a aVar = this.i;
            u3b u3bVar = aVar != null ? new u3b(q92.H(aVar.a)) : null;
            if (u3bVar == null) {
                u3bVar = u3b.b;
            }
            return new v27(context, obj2, config, eibVar, this.d, okaVar, headers, d8fVar2, this.g, z, false, this.h, vt1Var, vt1Var2, vt1Var3, k89Var, y03Var, y03Var2, y03Var3, kv8Var, h74Var2, tmdVar2, u3bVar, new es3(), this.b);
        }

        public a(Context context) {
            this.a = context;
            this.b = j.a;
            this.c = null;
            this.d = zr4.a;
            this.e = null;
            this.f = null;
            this.g = true;
            this.h = true;
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = null;
        }
    }
}
