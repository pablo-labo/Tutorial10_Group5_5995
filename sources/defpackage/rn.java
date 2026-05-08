package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class rn {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;

    static {
        ud2 ud2VarA = rd2.a(fc6.a);
        zr4 zr4Var = zr4.a;
        pd2 pd2Var = new pd2("id", ud2VarA, zr4Var, zr4Var, zr4Var);
        mb3 mb3Var = nc6.a;
        mb3Var.getClass();
        List<vd2> listA0 = u63.a0(pd2Var, new pd2("link", mb3Var, zr4Var, zr4Var, zr4Var));
        a = listA0;
        List<vd2> listL = w20.l("links", new ud2(new sd2(rd2.a(m38.a))), zr4Var, zr4Var, listA0);
        b = listL;
        sna snaVar = vn.a;
        snaVar.getClass();
        md2 md2Var = s4a.C;
        hva.a aVar = hva.a.a;
        c = ia.n("addJobSeekerProfileResumeLinks", snaVar, zr4Var, bg.f(md2Var, new hva.c(new wd2("input"))), listL);
    }
}
