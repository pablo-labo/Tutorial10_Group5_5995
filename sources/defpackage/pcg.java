package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pcg {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;

    static {
        ud2 ud2VarA = rd2.a(nc6.a);
        zr4 zr4Var = zr4.a;
        pd2 pd2Var = new pd2("__typename", ud2VarA, zr4Var, zr4Var, zr4Var);
        List listZ = u63.Z("JobSeekerProfileLicense");
        List<vd2> list = iv8.e;
        List<vd2> listA0 = u63.a0(pd2Var, s40.b(list, "JobSeekerProfileLicense", listZ, list));
        a = listA0;
        List<vd2> listL = w20.l("licenses", new ud2(new sd2(rd2.a(j38.a))), zr4Var, zr4Var, listA0);
        b = listL;
        sna snaVar = tcg.a;
        snaVar.getClass();
        md2 md2Var = s4a.g;
        hva.a aVar = hva.a.a;
        c = ia.n("updateJobSeekerProfileResumeLicenses", snaVar, zr4Var, bg.f(md2Var, new hva.c(new wd2("input"))), listL);
    }
}
