package defpackage;

import defpackage.cze;
import defpackage.d04;
import defpackage.in9;
import defpackage.lf0;
import defpackage.rv5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hv5 extends x0 {
    public static final a62 a0 = new a62(ere.l, n8a.h("Function"));
    public static final a62 b0 = new a62(ere.i, n8a.h("KFunction"));
    public final rv5 V;
    public final int W;
    public final a X;
    public final jv5 Y;
    public final List<rxf> Z;
    public final j29 e;
    public final lya f;

    public final class a extends y0 {
        public a() {
            super(hv5.this.e);
        }

        @Override // defpackage.y0, defpackage.kwf
        public final v62 d() {
            return hv5.this;
        }

        @Override // defpackage.kwf
        public final boolean e() {
            return true;
        }

        @Override // defpackage.a5
        public final Collection<ui8> g() {
            List listA0;
            hv5 hv5Var = hv5.this;
            int i = hv5Var.W;
            rv5 rv5Var = hv5Var.V;
            rv5.a aVar = rv5.a.c;
            if (wl7.b(rv5Var, aVar)) {
                listA0 = u63.Z(hv5.a0);
            } else if (wl7.b(rv5Var, rv5.b.c)) {
                listA0 = u63.a0(hv5.b0, new a62(ere.l, aVar.a(i)));
            } else {
                rv5.d dVar = rv5.d.c;
                if (wl7.b(rv5Var, dVar)) {
                    listA0 = u63.Z(hv5.a0);
                } else {
                    if (!wl7.b(rv5Var, rv5.c.c)) {
                        int i2 = qx.a;
                        r6.g("should not be called");
                        return null;
                    }
                    listA0 = u63.a0(hv5.b0, new a62(ere.f, dVar.a(i)));
                }
            }
            xx9 xx9VarD = hv5Var.f.d();
            List<a62> list = listA0;
            ArrayList arrayList = new ArrayList(t92.r0(list, 10));
            for (a62 a62Var : list) {
                t52 t52VarA = rc5.a(xx9VarD, a62Var);
                if (t52VarA == null) {
                    n6.c("Built-in class ", a62Var, " not found");
                    return null;
                }
                List listR1 = z92.r1(t52VarA.j().getParameters().size(), hv5Var.Z);
                ArrayList arrayList2 = new ArrayList(t92.r0(listR1, 10));
                Iterator it = listR1.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new yxf(((rxf) it.next()).o()));
                }
                gwf.b.getClass();
                arrayList.add(yi8.b(gwf.c, t52VarA, arrayList2));
            }
            return z92.z1(arrayList);
        }

        @Override // defpackage.kwf
        public final List<rxf> getParameters() {
            return hv5.this.Z;
        }

        @Override // defpackage.a5
        public final cze j() {
            return cze.a.a;
        }

        @Override // defpackage.y0
        /* JADX INFO: renamed from: p */
        public final t52 d() {
            return hv5.this;
        }

        public final String toString() {
            return hv5.this.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv5(j29 j29Var, ip1 ip1Var, rv5 rv5Var, int i) {
        super(j29Var, rv5Var.a(i));
        ip1Var.getClass();
        this.e = j29Var;
        this.f = ip1Var;
        this.V = rv5Var;
        this.W = i;
        this.X = new a();
        this.Y = new jv5(j29Var, this);
        ArrayList arrayList = new ArrayList();
        oh7 oh7Var = new oh7(1, i, 1);
        ArrayList arrayList2 = new ArrayList(t92.r0(oh7Var, 10));
        Iterator<Integer> it = oh7Var.iterator();
        while (((nh7) it).c) {
            arrayList.add(sxf.P0(this, ylg.IN_VARIANCE, n8a.h("P" + ((fh7) it).nextInt()), arrayList.size(), this.e));
            arrayList2.add(j6g.a);
        }
        arrayList.add(sxf.P0(this, ylg.OUT_VARIANCE, n8a.h("R"), arrayList.size(), this.e));
        this.Z = z92.z1(arrayList);
        rv5 rv5Var2 = this.V;
        iv5.a.getClass();
        rv5Var2.getClass();
        if (rv5Var2.equals(rv5.a.c) || rv5Var2.equals(rv5.d.c) || rv5Var2.equals(rv5.b.c)) {
            return;
        }
        rv5Var2.equals(rv5.c.c);
    }

    @Override // defpackage.t52
    public final /* bridge */ /* synthetic */ m52 C() {
        return null;
    }

    @Override // defpackage.t52
    public final boolean H0() {
        return false;
    }

    @Override // defpackage.tx9
    public final in9 K(bj8 bj8Var) {
        bj8Var.getClass();
        return this.Y;
    }

    @Override // defpackage.t52
    public final hlg<mge> U() {
        return null;
    }

    @Override // defpackage.zm9
    public final boolean X() {
        return false;
    }

    @Override // defpackage.t52
    public final boolean a0() {
        return false;
    }

    @Override // defpackage.aj3
    public final aj3 d() {
        return this.f;
    }

    @Override // defpackage.t52
    public final boolean e0() {
        return false;
    }

    @Override // defpackage.t52
    public final c62 f() {
        return c62.INTERFACE;
    }

    @Override // defpackage.cj3
    public final qne g() {
        return qne.p;
    }

    @Override // defpackage.ie0
    public final lf0 getAnnotations() {
        return lf0.a.a;
    }

    @Override // defpackage.t52, defpackage.zm9, defpackage.fj3
    public final e04 getVisibility() {
        d04.h hVar = d04.e;
        hVar.getClass();
        return hVar;
    }

    @Override // defpackage.zm9
    public final boolean i0() {
        return false;
    }

    @Override // defpackage.zm9
    public final boolean isExternal() {
        return false;
    }

    @Override // defpackage.t52
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.v62
    public final kwf j() {
        return this.X;
    }

    @Override // defpackage.t52
    public final /* bridge */ /* synthetic */ Collection k() {
        return zr4.a;
    }

    @Override // defpackage.t52
    public final in9 l0() {
        return in9.b.b;
    }

    @Override // defpackage.t52
    public final /* bridge */ /* synthetic */ t52 m0() {
        return null;
    }

    @Override // defpackage.t52, defpackage.w62
    public final List<rxf> p() {
        return this.Z;
    }

    @Override // defpackage.t52, defpackage.zm9
    public final ax9 r() {
        return ax9.e;
    }

    @Override // defpackage.t52
    public final boolean s() {
        return false;
    }

    public final String toString() {
        String strC = getName().c();
        strC.getClass();
        return strC;
    }

    @Override // defpackage.t52
    public final /* bridge */ /* synthetic */ Collection x() {
        return zr4.a;
    }

    @Override // defpackage.w62
    public final boolean y() {
        return false;
    }
}
