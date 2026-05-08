package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class nk {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;
    public static final List<vd2> d;

    static {
        mb3 mb3Var = fc6.a;
        mb3Var.getClass();
        zr4 zr4Var = zr4.a;
        pd2 pd2Var = new pd2("id", mb3Var, zr4Var, zr4Var, zr4Var);
        mb3 mb3Var2 = nc6.a;
        mb3Var2.getClass();
        pd2 pd2Var2 = new pd2("jobTitle", mb3Var2, zr4Var, zr4Var, zr4Var);
        h68.a.getClass();
        List<vd2> listA0 = u63.a0(pd2Var, pd2Var2, new pd2("sentiment", rd2.a(h68.b), zr4Var, zr4Var, zr4Var), new pd2("normalizedValue", mb3Var2, zr4Var, zr4Var, zr4Var));
        a = listA0;
        List<vd2> listA02 = u63.a0(new pd2("id", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("jobTitles", new ud2(new sd2(rd2.a(g58.a))), zr4Var, zr4Var, listA0));
        b = listA02;
        sna snaVar = t58.a;
        snaVar.getClass();
        List<vd2> listI = v40.i("preference", snaVar, zr4Var, zr4Var, listA02);
        c = listI;
        sna snaVar2 = hq.a;
        snaVar2.getClass();
        md2 md2Var = s4a.O;
        hva.a aVar = hva.a.a;
        d = ia.n("addJobSeekerProfileStructuredDataPreference", snaVar2, zr4Var, bg.f(md2Var, new hva.c(new wd2("input"))), listI);
    }
}
