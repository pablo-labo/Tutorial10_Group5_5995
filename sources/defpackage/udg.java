package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class udg {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;

    static {
        ud2 ud2VarA = rd2.a(nc6.a);
        zr4 zr4Var = zr4.a;
        pd2 pd2Var = new pd2("__typename", ud2VarA, zr4Var, zr4Var, zr4Var);
        List listZ = u63.Z("JobSeekerProfilePublication");
        List<vd2> list = u6c.b;
        List<vd2> listA0 = u63.a0(pd2Var, s40.b(list, "JobSeekerProfilePublication", listZ, list));
        a = listA0;
        List<vd2> listL = w20.l("publications", new ud2(new sd2(rd2.a(c48.a))), zr4Var, zr4Var, listA0);
        b = listL;
        sna snaVar = ydg.a;
        snaVar.getClass();
        md2 md2Var = s4a.H;
        hva.a aVar = hva.a.a;
        c = ia.n("updateJobSeekerProfileResumePublications", snaVar, zr4Var, bg.f(md2Var, new hva.c(new wd2("input"))), listL);
    }
}
