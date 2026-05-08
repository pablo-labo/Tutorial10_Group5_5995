package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ed5 {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;
    public static final List<vd2> d;
    public static final List<vd2> e;
    public static final List<vd2> f;
    public static final List<vd2> g;

    static {
        mb3 mb3Var = nc6.a;
        ud2 ud2VarA = rd2.a(mb3Var);
        zr4 zr4Var = zr4.a;
        List<vd2> listA0 = u63.a0(new pd2("url256", ud2VarA, zr4Var, zr4Var, zr4Var), new pd2("url128", new ud2(mb3Var), zr4Var, zr4Var, zr4Var), new pd2("url64", new ud2(mb3Var), zr4Var, zr4Var, zr4Var), new pd2("url96", new ud2(mb3Var), zr4Var, zr4Var, zr4Var));
        a = listA0;
        sna snaVar = fqe.a;
        snaVar.getClass();
        List<vd2> listI = v40.i("squareLogoUrls", snaVar, zr4Var, zr4Var, listA0);
        b = listI;
        sna snaVar2 = o07.a;
        snaVar2.getClass();
        List<vd2> listI2 = v40.i("images", snaVar2, zr4Var, zr4Var, listI);
        c = listI2;
        sna snaVar3 = er4.a;
        snaVar3.getClass();
        List<vd2> listA02 = u63.a0(new pd2("dossier", snaVar3, zr4Var, zr4Var, listI2), new pd2("name", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("key", rd2.a(fc6.a), zr4Var, zr4Var, zr4Var));
        d = listA02;
        pd2 pd2Var = new pd2("employer", rd2.a(br4.a), zr4Var, zr4Var, listA02);
        qd5.a.getClass();
        List<vd2> listA03 = u63.a0(pd2Var, new pd2("whatType", rd2.a(qd5.b), zr4Var, zr4Var, zr4Var));
        e = listA03;
        List<vd2> listL = w20.l("employers", new ud2(new sd2(rd2.a(pd5.a))), zr4Var, zr4Var, listA03);
        f = listL;
        sna snaVar4 = od5.a;
        snaVar4.getClass();
        md2 md2Var = f9c.a;
        hva.a aVar = hva.a.a;
        g = ia.n("findEmployers", snaVar4, zr4Var, bg.f(md2Var, new hva.c(new wd2("input"))), listL);
    }
}
