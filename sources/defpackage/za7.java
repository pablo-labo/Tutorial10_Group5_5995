package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class za7 {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;
    public static final List<vd2> d;

    static {
        ud2 ud2VarA = rd2.a(ec6.a);
        zr4 zr4Var = zr4.a;
        List<vd2> listM = k20.m("key", ud2VarA, zr4Var, zr4Var, zr4Var);
        a = listM;
        sna snaVar = cx7.a;
        snaVar.getClass();
        pd2 pd2Var = new pd2("job", snaVar, zr4Var, zr4Var, listM);
        mb3 mb3Var = mc6.a;
        List<vd2> listA0 = u63.a0(pd2Var, new pd2("replyLikelihoodAdjusted", rd2.a(mb3Var), zr4Var, zr4Var, zr4Var), new pd2("applicationInsights", new sd2(new ud2(mb3Var)), zr4Var, zr4Var, zr4Var));
        b = listA0;
        List<vd2> listL = w20.l("inferredApplicationStatus", new ud2(new sd2(rd2.a(xa7.a))), zr4Var, zr4Var, listA0);
        c = listL;
        sna snaVar2 = xb7.a;
        snaVar2.getClass();
        md2 md2Var = e9c.b;
        hva.a aVar = hva.a.a;
        d = ia.n("inferredApplicationStatusForJobs", snaVar2, zr4Var, bg.f(md2Var, new hva.c(new wd2("input"))), listL);
    }
}
