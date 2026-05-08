package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class q56 {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;
    public static final List<vd2> d;
    public static final List<vd2> e;

    static {
        mb3 mb3Var = gc6.a;
        ud2 ud2VarA = rd2.a(mb3Var);
        zr4 zr4Var = zr4.a;
        List<vd2> listM = k20.m("key", ud2VarA, zr4Var, zr4Var, zr4Var);
        a = listM;
        pd2 pd2Var = new pd2("uuid", new ud2(mb3Var), zr4Var, zr4Var, zr4Var);
        pd2 pd2Var2 = new pd2("key", new ud2(mb3Var), zr4Var, zr4Var, zr4Var);
        mb3 mb3Var2 = oc6.a;
        List<vd2> listA0 = u63.a0(pd2Var, pd2Var2, new pd2("label", rd2.a(mb3Var2), zr4Var, zr4Var, zr4Var), new pd2("customClasses", new ud2(new sd2(rd2.a(xb3.a))), zr4Var, zr4Var, listM));
        b = listA0;
        pd2 pd2Var3 = new pd2("errorMessage", mb3Var2, zr4Var, zr4Var, zr4Var);
        sf9.a.getClass();
        List<vd2> listA02 = u63.a0(pd2Var3, new pd2("responseCode", rd2.a(sf9.b), zr4Var, zr4Var, zr4Var));
        c = listA02;
        List<vd2> listA03 = u63.a0(new pd2("taxonomyConcepts", new sd2(rd2.a(yaf.a)), zr4Var, zr4Var, listA0), new pd2("responseStatus", rd2.a(tf9.a), zr4Var, zr4Var, listA02));
        d = listA03;
        sna snaVar = mbf.a;
        snaVar.getClass();
        md2 md2Var = h9c.g;
        hva.a aVar = hva.a.a;
        e = ia.n("taxonomyConcepts", snaVar, zr4Var, bg.f(md2Var, new hva.c(new wd2("customClassInput"))), listA03);
    }
}
