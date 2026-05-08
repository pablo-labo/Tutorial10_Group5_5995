package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class u06 {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;
    public static final List<vd2> d;
    public static final List<vd2> e;
    public static final List<vd2> f;

    static {
        ud2 ud2VarA = rd2.a(mc6.a);
        zr4 zr4Var = zr4.a;
        List<vd2> listM = k20.m("url", ud2VarA, zr4Var, zr4Var, zr4Var);
        a = listM;
        sna snaVar = pr0.a;
        snaVar.getClass();
        md2 md2Var = sy7.a;
        hva.a aVar = hva.a.a;
        List<vd2> listN = ia.n("applyLink", snaVar, zr4Var, bg.f(md2Var, new hva.c(new wd2("property"))), listM);
        b = listN;
        List<vd2> listL = w20.l("indeedApply", rd2.a(sy7.b), zr4Var, zr4Var, listN);
        c = listL;
        List<vd2> listL2 = w20.l("job", rd2.a(cx7.a), zr4Var, zr4Var, listL);
        d = listL2;
        List<vd2> listL3 = w20.l("results", new ud2(new sd2(rd2.a(jy7.a))), zr4Var, zr4Var, listL2);
        e = listL3;
        f = u63.Z(new pd2("jobData", rd2.a(hy7.a), zr4Var, bg.f(e9c.a, new hva.c(new wd2("jobKeys"))), listL3));
    }
}
