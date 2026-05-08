package defpackage;

import defpackage.cd4;
import defpackage.xh8;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class dd4 implements xh8 {
    public static final dd4 a;
    public static final Lazy b;

    public static final class a extends mj8 implements gu5<ed4> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(dd4 dd4Var) {
            super(0);
            this.$this_inject = dd4Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [ed4, java.lang.Object] */
        @Override // defpackage.gu5
        public final ed4 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(ed4.class), a9cVar);
        }
    }

    static {
        dd4 dd4Var = new dd4();
        a = dd4Var;
        b = boa.E(qt8.a, new a(dd4Var));
    }

    public static boolean b() {
        ad4 ad4Var = n().a;
        ad4Var.getClass();
        return ad4Var.e(cd4.a.u0) == cd4.k0.a.getValue();
    }

    public static boolean c() {
        ad4 ad4Var = n().a;
        ad4Var.getClass();
        return ad4Var.e(cd4.a.x0) == cd4.m0.a.getValue();
    }

    public static boolean e() {
        ad4 ad4Var = n().a;
        ad4Var.getClass();
        cd4.a aVar = cd4.a.M0;
        if (ad4Var.e(aVar) == cd4.l5.b.getValue()) {
            return true;
        }
        ad4 ad4Var2 = n().a;
        ad4Var2.getClass();
        if (ad4Var2.e(aVar) == cd4.l5.c.getValue()) {
            return true;
        }
        ad4 ad4Var3 = n().a;
        ad4Var3.getClass();
        return ad4Var3.e(aVar) == cd4.l5.d.getValue();
    }

    public static boolean f() {
        ad4 ad4Var = n().a;
        ad4Var.getClass();
        cd4.a aVar = cd4.a.M0;
        if (ad4Var.e(aVar) == cd4.l5.a.getValue()) {
            return true;
        }
        ad4 ad4Var2 = n().a;
        ad4Var2.getClass();
        if (ad4Var2.e(aVar) == cd4.l5.b.getValue()) {
            return true;
        }
        ad4 ad4Var3 = n().a;
        ad4Var3.getClass();
        if (ad4Var3.e(aVar) == cd4.l5.c.getValue()) {
            return true;
        }
        ad4 ad4Var4 = n().a;
        ad4Var4.getClass();
        return ad4Var4.e(aVar) == cd4.l5.d.getValue();
    }

    public static boolean g() {
        ad4 ad4Var = n().a;
        ad4Var.getClass();
        return ad4Var.e(cd4.a.M0) == cd4.l5.d.getValue();
    }

    public static boolean h() {
        ad4 ad4Var = n().a;
        ad4Var.getClass();
        return ad4Var.e(cd4.a.X0) == cd4.p0.a.getValue();
    }

    public static boolean i() {
        ad4 ad4Var = n().a;
        ad4Var.getClass();
        return ad4Var.e(cd4.a.n0) == cd4.w0.b.getValue();
    }

    public static boolean j() {
        ad4 ad4Var = n().a;
        ad4Var.getClass();
        cd4.a aVar = cd4.a.r0;
        if (ad4Var.e(aVar) == cd4.x1.a.getValue()) {
            return true;
        }
        ad4 ad4Var2 = n().a;
        ad4Var2.getClass();
        if (ad4Var2.e(aVar) == cd4.x1.b.getValue()) {
            return true;
        }
        ad4 ad4Var3 = n().a;
        ad4Var3.getClass();
        if (ad4Var3.e(aVar) == cd4.x1.c.getValue()) {
            return true;
        }
        ad4 ad4Var4 = n().a;
        ad4Var4.getClass();
        return ad4Var4.e(aVar) == cd4.x1.d.getValue();
    }

    public static boolean k() {
        if (!pyd.h0) {
            return false;
        }
        ad4 ad4Var = n().a;
        ad4Var.getClass();
        return ad4Var.e(cd4.a.k1) >= 2;
    }

    public static boolean l() {
        ad4 ad4Var = n().a;
        ad4Var.getClass();
        return ad4Var.e(cd4.a.d1) == cd4.q2.a.getValue();
    }

    public static boolean m() {
        ad4 ad4Var = n().a;
        ad4Var.getClass();
        return ad4Var.e(cd4.a.E0) == cd4.r2.a.getValue();
    }

    public static ed4 n() {
        return (ed4) b.getValue();
    }

    public final String a() {
        String str = n().a.e;
        if (str != null && str.length() != 0) {
            String str2 = n().a.e;
            str2.getClass();
            return str2;
        }
        bu8 bu8Var = bu8.a;
        bu8Var.getClass();
        cu8 cu8Var = bu8.r0;
        qf8<Object>[] qf8VarArr = bu8.b;
        return ((String) cu8Var.a(qf8VarArr[29], bu8Var)).length() > 0 ? z92.W0(z92.g1("cached1", zve.k0((String) cu8Var.a(qf8VarArr[29], bu8Var), new String[]{","})), ",", null, null, null, 62) : "";
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
