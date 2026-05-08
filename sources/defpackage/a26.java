package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a26 {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;
    public static final List<vd2> d;

    static {
        ud2 ud2VarA = rd2.a(pc6.a);
        zr4 zr4Var = zr4.a;
        pd2 pd2Var = new pd2("__typename", ud2VarA, zr4Var, zr4Var, zr4Var);
        List listZ = u63.Z("Job");
        List<vd2> list = ly7.l;
        List<vd2> listA0 = u63.a0(pd2Var, s40.b(list, "Job", listZ, list));
        a = listA0;
        List<vd2> listL = w20.l("job", rd2.a(fx7.a), zr4Var, zr4Var, listA0);
        b = listL;
        List<vd2> listL2 = w20.l("results", new ud2(new sd2(rd2.a(ky7.a))), zr4Var, zr4Var, listL);
        c = listL2;
        ud2 ud2VarA2 = rd2.a(iy7.a);
        md2 md2Var = d9c.a;
        hva.a aVar = hva.a.a;
        d = u63.Z(new pd2("jobData", ud2VarA2, zr4Var, bg.f(md2Var, new hva.c(new wd2("jobDataInput"))), listL2));
    }
}
