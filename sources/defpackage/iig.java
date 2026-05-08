package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class iig {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;

    static {
        ud2 ud2VarA = rd2.a(pwg.a);
        zr4 zr4Var = zr4.a;
        pd2 pd2Var = new pd2("destinationUrl", ud2VarA, zr4Var, zr4Var, zr4Var);
        vca.a.getClass();
        pd2 pd2Var2 = new pd2("id", rd2.a(vca.b), zr4Var, zr4Var, zr4Var);
        mb3 mb3Var = oc6.a;
        mb3Var.getClass();
        List<vd2> listA0 = u63.a0(pd2Var, pd2Var2, new pd2("label", mb3Var, zr4Var, zr4Var, zr4Var));
        a = listA0;
        List<vd2> listL = w20.l("urlRegistry", new ud2(new sd2(rd2.a(age.a))), zr4Var, zr4Var, listA0);
        b = listL;
        sna snaVar = gig.a;
        snaVar.getClass();
        md2 md2Var = h9c.c;
        hva.a aVar = hva.a.a;
        c = ia.n("urlRegistry", snaVar, zr4Var, bg.f(md2Var, new hva.c(new wd2("urlRegistryInput"))), listL);
    }
}
