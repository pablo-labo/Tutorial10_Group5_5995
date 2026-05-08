package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import defpackage.bs3;
import defpackage.hc4;
import defpackage.uu2;
import defpackage.wna;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z1<T, INFO> implements gc4, bs3.a {
    public static final Map<String, Object> q = g47.d("component_tag", "drawee");
    public static final Map<String, Object> r = g47.f("origin", "memory_bitmap", "origin_sub", "shortcut");
    public static final Class<?> s = z1.class;
    public final hc4 a;
    public final bs3 b;
    public final Executor c;
    public vu2<INFO> d;
    public final qp5<INFO> e;
    public dbe f;
    public gh3 g;
    public String h;
    public Object i;
    public boolean j;
    public boolean k;
    public boolean l;
    public ye3<T> m;
    public T n;
    public boolean o;
    public Drawable p;

    public final class a extends b91<Object> {
        public final /* synthetic */ String a;
        public final /* synthetic */ boolean b;

        public a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        @Override // defpackage.b91, defpackage.lf3
        public final void c(ye3<Object> ye3Var) {
            boolean zD = ye3Var.d();
            float fB = ye3Var.b();
            String str = this.a;
            z1 z1Var = z1.this;
            if (!z1Var.o(str, ye3Var)) {
                z1Var.p("ignore_old_datasource @ onProgress", null);
                ye3Var.close();
            } else {
                if (zD) {
                    return;
                }
                z1Var.f.a(fB, false);
            }
        }

        @Override // defpackage.b91
        public final void d(ye3<Object> ye3Var) {
            z1.this.t(this.a, ye3Var, ye3Var.e(), true);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // defpackage.b91
        public final void e(ye3<Object> ye3Var) {
            boolean zD = ye3Var.d();
            float fB = ye3Var.b();
            Object result = ye3Var.getResult();
            z1 z1Var = z1.this;
            if (result != null) {
                z1Var.v(this.a, ye3Var, result, fB, zD, this.b, false);
            } else if (zD) {
                z1Var.t(this.a, ye3Var, new NullPointerException(), true);
            }
        }
    }

    public static class b<INFO> extends rp5<INFO> {
    }

    public z1(bs3 bs3Var, Executor executor) {
        this.a = hc4.c ? new hc4() : hc4.b;
        this.e = new qp5<>();
        this.o = true;
        this.b = bs3Var;
        this.c = executor;
        n(null, null);
    }

    @Override // defpackage.gc4
    public final boolean a(MotionEvent motionEvent) {
        s55.a.getClass();
        if (!wab.p(2)) {
            return false;
        }
        s55.k(s, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.h, motionEvent);
        return false;
    }

    @Override // defpackage.gc4
    public void b(ic4 ic4Var) {
        s55.a.getClass();
        if (wab.p(2)) {
            s55.k(s, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.h, ic4Var);
        }
        this.a.a(ic4Var != null ? hc4.a.a : hc4.a.b);
        if (this.k) {
            this.b.a(this);
            release();
        }
        dbe dbeVar = this.f;
        if (dbeVar != null) {
            dbeVar.c(null);
            this.f = null;
        }
        if (ic4Var != null) {
            web.e(Boolean.valueOf(ic4Var instanceof dbe));
            dbe dbeVar2 = (dbe) ic4Var;
            this.f = dbeVar2;
            dbeVar2.c(this.g);
        }
    }

    @Override // defpackage.gc4
    public final void c() {
        it5.a();
        s55.a.getClass();
        boolean zP = wab.p(2);
        Class<?> cls = s;
        if (zP) {
            s55.k(cls, "controller %x %s: onAttach: %s", Integer.valueOf(System.identityHashCode(this)), this.h, this.k ? "request already submitted" : "request needs submit");
        }
        hc4.a aVar = hc4.a.V;
        hc4 hc4Var = this.a;
        hc4Var.a(aVar);
        this.f.getClass();
        this.b.a(this);
        this.j = true;
        if (!this.k) {
            it5.a();
            T tH = h();
            qp5<INFO> qp5Var = this.e;
            if (tH != null) {
                it5.a();
                this.m = null;
                this.k = true;
                this.l = false;
                hc4Var.a(hc4.a.h0);
                ye3<T> ye3Var = this.m;
                b17 b17VarL = l(tH);
                i().l(this.i, this.h);
                qp5Var.f(this.h, this.i, r(ye3Var != null ? ye3Var.getExtras() : null, s(b17VarL)));
                u(tH);
                v(this.h, this.m, tH, 1.0f, true, true, true);
                it5.a();
                it5.a();
            } else {
                hc4Var.a(hc4.a.Y);
                this.f.a(0.0f, true);
                this.k = true;
                this.l = false;
                ye3<T> ye3VarJ = j();
                this.m = ye3VarJ;
                i().l(this.i, this.h);
                qp5Var.f(this.h, this.i, r(ye3VarJ == null ? null : ye3VarJ.getExtras(), s(null)));
                s55.a.getClass();
                if (wab.p(2)) {
                    s55.k(cls, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.h, Integer.valueOf(System.identityHashCode(this.m)));
                }
                this.m.f(new a(this.h, this.m.c()), this.c);
                it5.a();
            }
        }
        it5.a();
    }

    @Override // defpackage.gc4
    public final void d() {
        it5.a();
        s55.a.getClass();
        if (wab.p(2)) {
            s55.j(s, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(this)), this.h);
        }
        this.a.a(hc4.a.W);
        this.j = false;
        this.b.b(this);
        it5.a();
    }

    @Override // defpackage.gc4
    public final dbe e() {
        return this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(vu2<? super INFO> vu2Var) {
        vu2Var.getClass();
        vu2<INFO> vu2Var2 = this.d;
        if (vu2Var2 instanceof b) {
            ((b) vu2Var2).b(vu2Var);
            return;
        }
        if (vu2Var2 == null) {
            this.d = vu2Var;
            return;
        }
        it5.a();
        b bVar = new b();
        bVar.b(vu2Var2);
        bVar.b(vu2Var);
        it5.a();
        this.d = bVar;
    }

    public abstract Drawable g(T t);

    public T h() {
        return null;
    }

    public final vu2<INFO> i() {
        vu2<INFO> vu2Var = this.d;
        return vu2Var == null ? z81.a : vu2Var;
    }

    public abstract ye3<T> j();

    public int k(T t) {
        return System.identityHashCode(t);
    }

    public abstract b17 l(Object obj);

    public final dbe m() {
        dbe dbeVar = this.f;
        if (dbeVar != null) {
            return dbeVar;
        }
        o6.k(this.i, "mSettableDraweeHierarchy is null; Caller context: ");
        return null;
    }

    public final synchronized void n(Object obj, String str) {
        bs3 bs3Var;
        try {
            it5.a();
            this.a.a(hc4.a.f);
            if (!this.o && (bs3Var = this.b) != null) {
                bs3Var.a(this);
            }
            this.j = false;
            x();
            vu2<INFO> vu2Var = this.d;
            if (vu2Var instanceof b) {
                b bVar = (b) vu2Var;
                synchronized (bVar) {
                    bVar.a.clear();
                }
            } else {
                this.d = null;
            }
            dbe dbeVar = this.f;
            if (dbeVar != null) {
                dbeVar.reset();
                this.f.c(null);
                this.f = null;
            }
            this.g = null;
            s55.a.getClass();
            if (wab.p(2)) {
                s55.k(s, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.h, str);
            }
            this.h = str;
            this.i = obj;
            it5.a();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean o(String str, ye3<T> ye3Var) {
        if (ye3Var == null && this.m == null) {
            return true;
        }
        return str.equals(this.h) && ye3Var == this.m && this.k;
    }

    public final void p(String str, Throwable th) {
        boolean zP = wab.p(2);
        wab wabVar = s55.a;
        wabVar.getClass();
        if (zP) {
            Integer numValueOf = Integer.valueOf(System.identityHashCode(this));
            String str2 = this.h;
            wabVar.getClass();
            if (zP) {
                wab.t(2, s.getSimpleName(), String.format(null, "controller %x %s: %s: failure: %s", numValueOf, str2, str, th));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q(Object obj, String str) {
        boolean zP = wab.p(2);
        s55.a.getClass();
        if (zP) {
            Object[] objArr = {Integer.valueOf(System.identityHashCode(this)), this.h, str, obj != 0 ? obj.getClass().getSimpleName() : "<null>", Integer.valueOf(k(obj))};
            if (zP) {
                wab.t(2, s.getSimpleName(), String.format(null, "controller %x %s: %s: image: %s %x", objArr));
            }
        }
    }

    public final uu2.a r(Map map, Map map2) {
        dbe dbeVar = this.f;
        if (dbeVar instanceof hx5) {
            hx5 hx5Var = (hx5) dbeVar;
            String.valueOf(!(hx5Var.j(2) instanceof zmd) ? null : hx5Var.k(2).d);
            if (hx5Var.j(2) instanceof zmd) {
                hx5Var.k(2);
            }
        }
        dbe dbeVar2 = this.f;
        Rect bounds = dbeVar2 != null ? dbeVar2.getBounds() : null;
        Object obj = this.i;
        Map<String, ? extends Object> map3 = q;
        map3.getClass();
        Map<String, ? extends Object> map4 = r;
        map4.getClass();
        uu2.a aVar = new uu2.a();
        if (bounds != null) {
            bounds.width();
            bounds.height();
        }
        aVar.e = obj;
        aVar.c = map;
        aVar.d = map2;
        aVar.b = map4;
        aVar.a = map3;
        return aVar;
    }

    @Override // bs3.a
    public final void release() {
        this.a.a(hc4.a.X);
        dbe dbeVar = this.f;
        if (dbeVar != null) {
            dbeVar.reset();
        }
        x();
    }

    public abstract Map<String, Object> s(INFO info);

    public final void t(String str, ye3<T> ye3Var, Throwable th, boolean z) {
        it5.a();
        if (!o(str, ye3Var)) {
            p("ignore_old_datasource @ onFailure", th);
            ye3Var.close();
            it5.a();
            return;
        }
        this.a.a(z ? hc4.a.b0 : hc4.a.c0);
        qp5<INFO> qp5Var = this.e;
        if (z) {
            p("final_failed @ onFailure", th);
            this.m = null;
            this.l = true;
            dbe dbeVar = this.f;
            if (dbeVar != null) {
                dbeVar.e();
            }
            uu2.a aVarR = r(ye3Var == null ? null : ye3Var.getExtras(), s(null));
            i().c(this.h, th);
            qp5Var.e(this.h, th, aVarR);
        } else {
            p("intermediate_failed @ onFailure", th);
            i().p(this.h, th);
            qp5Var.b(this.h);
        }
        it5.a();
    }

    public String toString() {
        wna.a aVarB = wna.b(this);
        aVarB.a("isAttached", this.j);
        aVarB.a("isRequestSubmitted", this.k);
        aVarB.a("hasFetchFailed", this.l);
        aVarB.b(String.valueOf(k(this.n)), "fetchedImage");
        aVarB.b(this.a.a.toString(), "events");
        return aVarB.toString();
    }

    public void u(Object obj) {
    }

    public final void v(String str, ye3<T> ye3Var, T t, float f, boolean z, boolean z2, boolean z3) {
        try {
            it5.a();
            if (!o(str, ye3Var)) {
                q(t, "ignore_old_datasource @ onNewResult");
                y(t);
                ye3Var.close();
                it5.a();
                return;
            }
            this.a.a(z ? hc4.a.Z : hc4.a.a0);
            try {
                Drawable drawableG = g(t);
                T t2 = this.n;
                Drawable drawable = this.p;
                this.n = t;
                this.p = drawableG;
                try {
                    if (z) {
                        q(t, "set_final_result @ onNewResult");
                        this.m = null;
                        m().d(drawableG, 1.0f, z2);
                        z(str, t, ye3Var);
                    } else if (z3) {
                        q(t, "set_temporary_result @ onNewResult");
                        m().d(drawableG, 1.0f, z2);
                        z(str, t, ye3Var);
                    } else {
                        q(t, "set_intermediate_result @ onNewResult");
                        m().d(drawableG, f, z2);
                        b17 b17VarL = l(t);
                        i().a(b17VarL, str);
                        this.e.a(b17VarL, str);
                    }
                    if (drawable != null && drawable != drawableG) {
                        w(drawable);
                    }
                    if (t2 != null && t2 != t) {
                        q(t2, "release_previous_result @ onNewResult");
                        y(t2);
                    }
                    it5.a();
                } catch (Throwable th) {
                    if (drawable != null && drawable != drawableG) {
                        w(drawable);
                    }
                    if (t2 != null && t2 != t) {
                        q(t2, "release_previous_result @ onNewResult");
                        y(t2);
                    }
                    throw th;
                }
            } catch (Exception e) {
                q(t, "drawable_failed @ onNewResult");
                y(t);
                t(str, ye3Var, e, z);
                it5.a();
            }
        } catch (Throwable th2) {
            it5.a();
            throw th2;
        }
    }

    public abstract void w(Drawable drawable);

    public final void x() {
        Map<String, Object> extras;
        boolean z = this.k;
        this.k = false;
        this.l = false;
        ye3<T> ye3Var = this.m;
        Map<String, Object> map = null;
        if (ye3Var != null) {
            extras = ye3Var.getExtras();
            this.m.close();
            this.m = null;
        } else {
            extras = null;
        }
        Drawable drawable = this.p;
        if (drawable != null) {
            w(drawable);
        }
        this.p = null;
        T t = this.n;
        if (t != null) {
            Map<String, Object> mapS = s(l(t));
            q(this.n, "release");
            y(this.n);
            this.n = null;
            map = mapS;
        }
        if (z) {
            i().d(this.h);
            this.e.d(this.h, r(extras, map));
        }
    }

    public abstract void y(T t);

    public final void z(String str, T t, ye3<T> ye3Var) {
        b17 b17VarL = l(t);
        vu2<INFO> vu2VarI = i();
        Object obj = this.p;
        vu2VarI.j(str, b17VarL, obj instanceof Animatable ? (Animatable) obj : null);
        this.e.c(str, b17VarL, r(ye3Var != null ? ye3Var.getExtras() : null, s(b17VarL)));
    }
}
