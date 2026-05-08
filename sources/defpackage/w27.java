package defpackage;

import android.content.Context;
import defpackage.q55;
import defpackage.qkg;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class w27 {
    public final Context a;
    public final Object b;
    public final z9f c;
    public final d d;
    public final Map<String, String> e;
    public final pa5 f;
    public final v03 g;
    public final v03 h;
    public final v03 i;
    public final ut1 j;
    public final ut1 k;
    public final ut1 l;
    public final Function1<w27, k07> m;
    public final Function1<w27, k07> n;
    public final Function1<w27, k07> o;
    public final rie p;
    public final umd q;
    public final dib r;
    public final q55 s;
    public final c t;
    public final b u;

    public static final class b {
        public static final b o;
        public final pa5 a;
        public final v03 b;
        public final v03 c;
        public final v03 d;
        public final ut1 e;
        public final ut1 f;
        public final ut1 g;
        public final Function1<w27, k07> h;
        public final Function1<w27, k07> i;
        public final Function1<w27, k07> j;
        public final rie k;
        public final umd l;
        public final dib m;
        public final q55 n;

        static {
            qd8 qd8Var = pa5.a;
            eq3 eq3Var = a74.a;
            no3 no3Var = no3.c;
            rrc rrcVar = rie.a;
            dib dibVar = dib.a;
            q55 q55Var = q55.b;
            vr4 vr4Var = vr4.a;
            ut1 ut1Var = ut1.a;
            qkg.a aVar = qkg.a.a;
            o = new b(qd8Var, vr4Var, no3Var, no3Var, ut1Var, ut1Var, ut1Var, aVar, aVar, aVar, rrcVar, umd.b, dibVar, q55Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(pa5 pa5Var, v03 v03Var, v03 v03Var2, v03 v03Var3, ut1 ut1Var, ut1 ut1Var2, ut1 ut1Var3, Function1<? super w27, ? extends k07> function1, Function1<? super w27, ? extends k07> function12, Function1<? super w27, ? extends k07> function13, rie rieVar, umd umdVar, dib dibVar, q55 q55Var) {
            this.a = pa5Var;
            this.b = v03Var;
            this.c = v03Var2;
            this.d = v03Var3;
            this.e = ut1Var;
            this.f = ut1Var2;
            this.g = ut1Var3;
            this.h = function1;
            this.i = function12;
            this.j = function13;
            this.k = rieVar;
            this.l = umdVar;
            this.m = dibVar;
            this.n = q55Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return wl7.b(this.a, bVar.a) && wl7.b(this.b, bVar.b) && wl7.b(this.c, bVar.c) && wl7.b(this.d, bVar.d) && this.e == bVar.e && this.f == bVar.f && this.g == bVar.g && wl7.b(this.h, bVar.h) && wl7.b(this.i, bVar.i) && wl7.b(this.j, bVar.j) && wl7.b(this.k, bVar.k) && this.l == bVar.l && this.m == bVar.m && wl7.b(this.n, bVar.n);
        }

        public final int hashCode() {
            return this.n.a.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Defaults(fileSystem=" + this.a + ", interceptorCoroutineContext=" + this.b + ", fetcherCoroutineContext=" + this.c + ", decoderCoroutineContext=" + this.d + ", memoryCachePolicy=" + this.e + ", diskCachePolicy=" + this.f + ", networkCachePolicy=" + this.g + ", placeholderFactory=" + this.h + ", errorFactory=" + this.i + ", fallbackFactory=" + this.j + ", sizeResolver=" + this.k + ", scale=" + this.l + ", precision=" + this.m + ", extras=" + this.n + ')';
        }
    }

    public static final class c {
        public final v03 a;
        public final v03 b;
        public final v03 c;
        public final Function1<w27, k07> d;
        public final Function1<w27, k07> e;
        public final Function1<w27, k07> f;
        public final rie g;
        public final umd h;
        public final dib i;

        public c(v03 v03Var, v03 v03Var2, v03 v03Var3, Function1 function1, Function1 function12, Function1 function13, rie rieVar, umd umdVar, dib dibVar) {
            this.a = v03Var;
            this.b = v03Var2;
            this.c = v03Var3;
            this.d = function1;
            this.e = function12;
            this.f = function13;
            this.g = rieVar;
            this.h = umdVar;
            this.i = dibVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return wl7.b(this.a, cVar.a) && wl7.b(this.b, cVar.b) && wl7.b(this.c, cVar.c) && wl7.b(this.d, cVar.d) && wl7.b(this.e, cVar.e) && wl7.b(this.f, cVar.f) && wl7.b(this.g, cVar.g) && this.h == cVar.h && this.i == cVar.i;
        }

        public final int hashCode() {
            v03 v03Var = this.a;
            int iHashCode = (v03Var == null ? 0 : v03Var.hashCode()) * 31;
            v03 v03Var2 = this.b;
            int iHashCode2 = (iHashCode + (v03Var2 == null ? 0 : v03Var2.hashCode())) * 31;
            v03 v03Var3 = this.c;
            int iHashCode3 = (iHashCode2 + (v03Var3 == null ? 0 : v03Var3.hashCode())) * 923521;
            Function1<w27, k07> function1 = this.d;
            int iHashCode4 = (iHashCode3 + (function1 == null ? 0 : function1.hashCode())) * 31;
            Function1<w27, k07> function12 = this.e;
            int iHashCode5 = (iHashCode4 + (function12 == null ? 0 : function12.hashCode())) * 31;
            Function1<w27, k07> function13 = this.f;
            int iHashCode6 = (iHashCode5 + (function13 == null ? 0 : function13.hashCode())) * 31;
            rie rieVar = this.g;
            int iHashCode7 = (iHashCode6 + (rieVar == null ? 0 : rieVar.hashCode())) * 31;
            umd umdVar = this.h;
            int iHashCode8 = (iHashCode7 + (umdVar == null ? 0 : umdVar.hashCode())) * 31;
            dib dibVar = this.i;
            return iHashCode8 + (dibVar != null ? dibVar.hashCode() : 0);
        }

        public final String toString() {
            return "Defined(fileSystem=null, interceptorCoroutineContext=" + this.a + ", fetcherCoroutineContext=" + this.b + ", decoderCoroutineContext=" + this.c + ", memoryCachePolicy=null, diskCachePolicy=null, networkCachePolicy=null, placeholderFactory=" + this.d + ", errorFactory=" + this.e + ", fallbackFactory=" + this.f + ", sizeResolver=" + this.g + ", scale=" + this.h + ", precision=" + this.i + ')';
        }
    }

    public interface d {
        default void a(uw4 uw4Var) {
        }

        default void onCancel() {
        }
    }

    public w27() {
        throw null;
    }

    public w27(Context context, Object obj, z9f z9fVar, d dVar, Map map, pa5 pa5Var, v03 v03Var, v03 v03Var2, v03 v03Var3, ut1 ut1Var, ut1 ut1Var2, ut1 ut1Var3, Function1 function1, Function1 function12, Function1 function13, rie rieVar, umd umdVar, dib dibVar, q55 q55Var, c cVar, b bVar) {
        this.a = context;
        this.b = obj;
        this.c = z9fVar;
        this.d = dVar;
        this.e = map;
        this.f = pa5Var;
        this.g = v03Var;
        this.h = v03Var2;
        this.i = v03Var3;
        this.j = ut1Var;
        this.k = ut1Var2;
        this.l = ut1Var3;
        this.m = function1;
        this.n = function12;
        this.o = function13;
        this.p = rieVar;
        this.q = umdVar;
        this.r = dibVar;
        this.s = q55Var;
        this.t = cVar;
        this.u = bVar;
    }

    public static a a(w27 w27Var) {
        Context context = w27Var.a;
        w27Var.getClass();
        return new a(w27Var, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w27)) {
            return false;
        }
        w27 w27Var = (w27) obj;
        return wl7.b(this.a, w27Var.a) && wl7.b(this.b, w27Var.b) && wl7.b(this.c, w27Var.c) && wl7.b(this.d, w27Var.d) && wl7.b(this.e, w27Var.e) && wl7.b(this.f, w27Var.f) && wl7.b(this.g, w27Var.g) && wl7.b(this.h, w27Var.h) && wl7.b(this.i, w27Var.i) && this.j == w27Var.j && this.k == w27Var.k && this.l == w27Var.l && wl7.b(this.m, w27Var.m) && wl7.b(this.n, w27Var.n) && wl7.b(this.o, w27Var.o) && wl7.b(this.p, w27Var.p) && this.q == w27Var.q && this.r == w27Var.r && wl7.b(this.s, w27Var.s) && wl7.b(this.t, w27Var.t) && wl7.b(this.u, w27Var.u);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        z9f z9fVar = this.c;
        int iHashCode2 = (iHashCode + (z9fVar == null ? 0 : z9fVar.hashCode())) * 31;
        d dVar = this.d;
        return this.u.hashCode() + ((this.t.hashCode() + k20.b(this.s.a, (this.r.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + k20.b(this.e, (iHashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 961, 961)) * 29791)) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "ImageRequest(context=" + this.a + ", data=" + this.b + ", target=" + this.c + ", listener=" + this.d + ", memoryCacheKey=null, memoryCacheKeyExtras=" + this.e + ", diskCacheKey=null, fileSystem=" + this.f + ", fetcherFactory=null, decoderFactory=null, interceptorCoroutineContext=" + this.g + ", fetcherCoroutineContext=" + this.h + ", decoderCoroutineContext=" + this.i + ", memoryCachePolicy=" + this.j + ", diskCachePolicy=" + this.k + ", networkCachePolicy=" + this.l + ", placeholderMemoryCacheKey=null, placeholderFactory=" + this.m + ", errorFactory=" + this.n + ", fallbackFactory=" + this.o + ", sizeResolver=" + this.p + ", scale=" + this.q + ", precision=" + this.r + ", extras=" + this.s + ", defined=" + this.t + ", defaults=" + this.u + ')';
    }

    public static final class a {
        public final Context a;
        public b b;
        public Object c;
        public z9f d;
        public d e;
        public final Map f;
        public v03 g;
        public v03 h;
        public v03 i;
        public final Function1<? super w27, ? extends k07> j;
        public final Function1<? super w27, ? extends k07> k;
        public final Function1<? super w27, ? extends k07> l;
        public rie m;
        public umd n;
        public dib o;
        public Object p;

        public a(w27 w27Var, Context context) {
            this.a = context;
            this.b = w27Var.u;
            this.c = w27Var.b;
            this.d = w27Var.c;
            this.e = w27Var.d;
            this.f = w27Var.e;
            c cVar = w27Var.t;
            cVar.getClass();
            this.g = cVar.a;
            this.h = cVar.b;
            this.i = cVar.c;
            this.j = cVar.d;
            this.k = cVar.e;
            this.l = cVar.f;
            this.m = cVar.g;
            this.n = cVar.h;
            this.o = cVar.i;
            this.p = w27Var.s;
        }

        public final w27 a() {
            Map mapB;
            q55 q55Var;
            Object obj = this.c;
            if (obj == null) {
                obj = ima.a;
            }
            Object obj2 = obj;
            z9f z9fVar = this.d;
            d dVar = this.e;
            Boolean bool = Boolean.FALSE;
            Map map = this.f;
            if (wl7.b(map, bool)) {
                map.getClass();
                mapB = aa2.b(pxf.b(map));
            } else {
                if (!(map instanceof Map)) {
                    b0.t();
                    return null;
                }
                mapB = map;
            }
            Map map2 = mapB;
            map2.getClass();
            b bVar = this.b;
            pa5 pa5Var = bVar.a;
            ut1 ut1Var = bVar.e;
            ut1 ut1Var2 = bVar.f;
            ut1 ut1Var3 = bVar.g;
            v03 v03Var = this.g;
            if (v03Var == null) {
                v03Var = bVar.b;
            }
            v03 v03Var2 = v03Var;
            v03 v03Var3 = this.h;
            if (v03Var3 == null) {
                v03Var3 = bVar.c;
            }
            v03 v03Var4 = v03Var3;
            v03 v03Var5 = this.i;
            if (v03Var5 == null) {
                v03Var5 = bVar.d;
            }
            v03 v03Var6 = v03Var5;
            Function1 function1 = this.j;
            if (function1 == null) {
                function1 = bVar.h;
            }
            Function1 function12 = function1;
            Function1 function13 = this.k;
            if (function13 == null) {
                function13 = bVar.i;
            }
            Function1 function14 = function13;
            Function1 function15 = this.l;
            if (function15 == null) {
                function15 = bVar.j;
            }
            Function1 function16 = function15;
            rie rieVar = this.m;
            if (rieVar == null) {
                rieVar = bVar.k;
            }
            rie rieVar2 = rieVar;
            umd umdVar = this.n;
            if (umdVar == null) {
                umdVar = bVar.l;
            }
            umd umdVar2 = umdVar;
            dib dibVar = this.o;
            if (dibVar == null) {
                dibVar = bVar.m;
            }
            dib dibVar2 = dibVar;
            Object obj3 = this.p;
            if (obj3 instanceof q55.a) {
                q55Var = new q55(aa2.b(((q55.a) obj3).a));
            } else {
                if (!(obj3 instanceof q55)) {
                    b0.t();
                    return null;
                }
                q55Var = (q55) obj3;
            }
            return new w27(this.a, obj2, z9fVar, dVar, map2, pa5Var, v03Var2, v03Var4, v03Var6, ut1Var, ut1Var2, ut1Var3, function12, function14, function16, rieVar2, umdVar2, dibVar2, q55Var, new c(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o), this.b);
        }

        public a(Context context) {
            this.a = context;
            this.b = b.o;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = bs4.a;
            this.g = null;
            this.h = null;
            this.i = null;
            qkg.a aVar = qkg.a.a;
            this.j = aVar;
            this.k = aVar;
            this.l = aVar;
            this.m = null;
            this.n = null;
            this.o = null;
            this.p = q55.b;
        }
    }
}
