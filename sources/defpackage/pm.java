package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pm {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;
    public static final List<vd2> d;
    public static final List<vd2> e;
    public static final List<vd2> f;
    public static final List<vd2> g;

    static {
        mb3 mb3Var = gc6.a;
        ud2 ud2VarA = rd2.a(mb3Var);
        zr4 zr4Var = zr4.a;
        List<vd2> listM = k20.m("id", ud2VarA, zr4Var, zr4Var, zr4Var);
        a = listM;
        List<vd2> listM2 = k20.m("id", new ud2(mb3Var), zr4Var, zr4Var, zr4Var);
        b = listM2;
        List<vd2> listM3 = k20.m("id", new ud2(mb3Var), zr4Var, zr4Var, zr4Var);
        c = listM3;
        List<vd2> listM4 = k20.m("id", new ud2(mb3Var), zr4Var, zr4Var, zr4Var);
        d = listM4;
        List<vd2> listM5 = k20.m("id", new ud2(mb3Var), zr4Var, zr4Var, zr4Var);
        e = listM5;
        sna snaVar = d48.a;
        snaVar.getClass();
        pd2 pd2Var = new pd2("jobSeekerProfileResume", snaVar, zr4Var, zr4Var, listM);
        sna snaVar2 = r18.a;
        snaVar2.getClass();
        List<vd2> listA0 = u63.a0(pd2Var, new pd2("originalResumeFile", snaVar2, zr4Var, zr4Var, listM2), new pd2("pdfResumeFile", snaVar2, zr4Var, zr4Var, listM3), new pd2("nameEmailPhoneRedactedPdfResumeFile", snaVar2, zr4Var, zr4Var, listM4), new pd2("emailPhoneRedactedPdfResumeFile", snaVar2, zr4Var, zr4Var, listM5));
        f = listA0;
        sna snaVar3 = xm.a;
        snaVar3.getClass();
        md2 md2Var = t4a.c;
        hva.a aVar = hva.a.a;
        g = ia.n("addJobSeekerProfileResumeFile", snaVar3, zr4Var, bg.f(md2Var, new hva.c(new wd2("input"))), listA0);
    }
}
