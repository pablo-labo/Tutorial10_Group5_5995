package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class eyc {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;
    public static final List<vd2> d;
    public static final List<vd2> e;
    public static final List<vd2> f;
    public static final List<vd2> g;
    public static final List<vd2> h;

    static {
        mb3 mb3Var = lc6.a;
        mb3Var.getClass();
        zr4 zr4Var = zr4.a;
        pd2 pd2Var = new pd2("offlineSeconds", mb3Var, zr4Var, zr4Var, zr4Var);
        mb3 mb3Var2 = pc6.a;
        List<vd2> listA0 = u63.a0(pd2Var, new pd2("status", rd2.a(mb3Var2), zr4Var, zr4Var, zr4Var));
        a = listA0;
        sna snaVar = vsa.a;
        snaVar.getClass();
        List<vd2> listI = v40.i("onlineStatus", snaVar, zr4Var, zr4Var, listA0);
        b = listI;
        List<vd2> listA02 = u63.a0(new pd2("offlineSeconds", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("status", new ud2(mb3Var2), zr4Var, zr4Var, zr4Var));
        c = listA02;
        List<vd2> listI2 = v40.i("onlineStatus", snaVar, zr4Var, zr4Var, listA02);
        d = listI2;
        List<vd2> listA03 = u63.a0(new pd2("__typename", new ud2(mb3Var2), zr4Var, zr4Var, zr4Var), new qd2("EmployerUser", u63.Z("EmployerUser"), listI), new qd2("JobSeekerOnlineStatusAccount", u63.Z("JobSeekerOnlineStatusAccount"), listI2));
        e = listA03;
        h6g h6gVar = wsa.a;
        h6gVar.getClass();
        List<vd2> listL = w20.l("accounts", new ud2(new sd2(h6gVar)), zr4Var, zr4Var, listA03);
        f = listL;
        sna snaVar2 = cyc.a;
        snaVar2.getClass();
        md2 md2Var = dta.a;
        hva.a aVar = hva.a.a;
        List<vd2> listN = ia.n("registerListeners", snaVar2, zr4Var, bg.f(md2Var, new hva.c(new wd2("input"))), listL);
        g = listN;
        h = w20.l("onlineStatus", rd2.a(dta.b), zr4Var, zr4Var, listN);
    }
}
