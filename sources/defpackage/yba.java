package defpackage;

import android.util.Log;
import defpackage.xh8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class yba implements j2g, xh8 {
    public List<taa> V;
    public List<aca> W;
    public final gse X;
    public final gse Y;
    public final gse Z;
    public final Lazy a;
    public final g3a<jz2<Boolean>> a0;
    public final Lazy b;
    public final gse b0;
    public volatile boolean c;
    public final gse c0;
    public List<zba> d;
    public final gse d0;
    public List<n97> e;
    public List<uaa> f;

    public yba(int i) {
        eq3 eq3Var = a74.a;
        no3 no3Var = no3.c;
        no3Var.getClass();
        wba wbaVar = new wba(this);
        qt8 qt8Var = qt8.a;
        this.a = boa.E(qt8Var, wbaVar);
        this.b = boa.E(qt8Var, new xba(this));
        zr4 zr4Var = zr4.a;
        this.d = zr4Var;
        this.e = zr4Var;
        this.W = zr4Var;
        gse gseVarE = hh2.e(zr4Var);
        this.X = gseVarE;
        gse gseVarE2 = hh2.e(zr4Var);
        this.Y = gseVarE2;
        gse gseVarE3 = hh2.e(zr4Var);
        this.Z = gseVarE3;
        this.a0 = new g3a<>();
        eu2 eu2VarA = f13.a(no3Var);
        u63.Y(eu2VarA, null, null, new rba(this, null), 3);
        k89 k89Var = m89.a;
        u63.Y(f13.a(k89Var), null, null, new sba(this, null), 3);
        u63.Y(f13.a(k89Var), null, null, new tba(this, null), 3);
        u63.Y(f13.a(k89Var), null, null, new uba(this, null), 3);
        u63.Y(f13.a(k89Var), null, null, new vba(null, eu2VarA, this), 3);
        this.b0 = gseVarE;
        this.c0 = gseVarE2;
        this.d0 = gseVarE3;
    }

    public static final void e(yba ybaVar, List list) {
        bca bcaVarValueOf;
        ybaVar.getClass();
        boolean zE = ((bp7) cr8.p(bp7.class)).e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (wl7.b(((we6) obj).a.d, r03.p(d93.f()))) {
                arrayList.add(obj);
            }
        }
        ArrayList<we6> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            we6 we6Var = (we6) next;
            if (zE) {
                z = we6Var.a.c;
            } else if (!we6Var.a.c) {
                z = true;
            }
            if (z) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(t92.r0(arrayList2, 10));
        for (we6 we6Var2 : arrayList2) {
            we6Var2.getClass();
            ve6 ve6Var = we6Var2.a;
            String str = ve6Var.a;
            String str2 = ve6Var.b;
            if (str2 == null) {
                str2 = "";
            }
            List<xy1> list2 = we6Var2.b;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : list2) {
                if (wl7.b(((xy1) obj2).d, ve6Var.d)) {
                    arrayList4.add(obj2);
                }
            }
            ArrayList<xy1> arrayList5 = new ArrayList();
            for (Object obj3 : arrayList4) {
                if (((xy1) obj3).c == ve6Var.c) {
                    arrayList5.add(obj3);
                }
            }
            ArrayList arrayList6 = new ArrayList(t92.r0(arrayList5, 10));
            for (xy1 xy1Var : arrayList5) {
                xy1Var.getClass();
                String str3 = xy1Var.a;
                str3.getClass();
                try {
                    bcaVarValueOf = bca.valueOf(str3);
                } catch (Exception e) {
                    ArrayList arrayList7 = lz2.a;
                    lz2.b("NavMenuUtils", "Unknown NavMenuItemId: ".concat(str3), false, e);
                    bcaVarValueOf = bca.q0;
                }
                arrayList6.add(new zba(bcaVarValueOf, xy1Var.e, xy1Var.f, xy1Var.g));
            }
            arrayList3.add(new aca(str, str2, arrayList6));
        }
        ybaVar.W = arrayList3;
        gse gseVar = ybaVar.Y;
        gseVar.getClass();
        gseVar.m(null, arrayList3);
    }

    public static final void f(yba ybaVar, List list) {
        bca bcaVarValueOf;
        ybaVar.getClass();
        boolean zE = ((bp7) cr8.p(bp7.class)).e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (wl7.b(((xe6) obj).c, r03.p(d93.f()))) {
                arrayList.add(obj);
            }
        }
        ArrayList<xe6> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            xe6 xe6Var = (xe6) next;
            if (zE) {
                z = xe6Var.b;
            } else if (!xe6Var.b) {
                z = true;
            }
            if (z) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(t92.r0(arrayList2, 10));
        for (xe6 xe6Var2 : arrayList2) {
            xe6Var2.getClass();
            String str = xe6Var2.a;
            str.getClass();
            try {
                bcaVarValueOf = bca.valueOf(str);
            } catch (Exception e) {
                ArrayList arrayList4 = lz2.a;
                lz2.b("NavMenuUtils", "Unknown NavMenuItemId: ".concat(str), false, e);
                bcaVarValueOf = bca.q0;
            }
            arrayList3.add(new zba(bcaVarValueOf, xe6Var2.d, xe6Var2.e, xe6Var2.f));
        }
        ybaVar.d = arrayList3;
        gse gseVar = ybaVar.X;
        gseVar.getClass();
        gseVar.m(null, arrayList3);
    }

    public static Object h(yba ybaVar, gu5 gu5Var, la laVar, c1f c1fVar, int i) {
        if ((i & 2) != 0) {
            laVar = null;
        }
        ybaVar.getClass();
        ArrayList arrayList = lz2.a;
        Log.d("NavMenuImpl", "NavMenuImpl.init", null);
        Object objG = ybaVar.g().g("https://www.indeed.com/m/", new cj2(11), ((bp7) cr8.p(bp7.class)).e(), new as(13, ybaVar, laVar), gu5Var, c1fVar);
        return objG == g13.a ? objG : j6g.a;
    }

    @Override // defpackage.j2g
    public final void a() {
        this.c = true;
        this.a0.k(new jz2<>(Boolean.TRUE));
    }

    @Override // defpackage.j2g
    public final boolean b() {
        return this.c;
    }

    @Override // defpackage.j2g
    public final void c() {
        this.c = false;
        this.a0.k(new jz2<>(Boolean.FALSE));
    }

    public final eca g() {
        return (eca) this.a.getValue();
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    public yba() {
        this(0);
    }
}
