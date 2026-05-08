package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hm {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;

    static {
        ud2 ud2VarA = rd2.a(nc6.a);
        zr4 zr4Var = zr4.a;
        pd2 pd2Var = new pd2("__typename", ud2VarA, zr4Var, zr4Var, zr4Var);
        List listZ = u63.Z("JobSeekerProfileEducation");
        List<vd2> list = so4.h;
        List<vd2> listA0 = u63.a0(pd2Var, s40.b(list, "JobSeekerProfileEducation", listZ, list));
        a = listA0;
        List<vd2> listL = w20.l("educations", new ud2(new sd2(rd2.a(j18.a))), zr4Var, zr4Var, listA0);
        b = listL;
        sna snaVar = lm.a;
        snaVar.getClass();
        md2 md2Var = s4a.p;
        hva.a aVar = hva.a.a;
        c = ia.n("addJobSeekerProfileResumeEducations", snaVar, zr4Var, bg.f(md2Var, new hva.c(new wd2("input"))), listL);
    }
}
