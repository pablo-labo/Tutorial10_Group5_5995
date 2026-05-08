package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wag {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;
    public static final List<vd2> d;
    public static final List<vd2> e;

    static {
        mb3 mb3Var = wb6.a;
        mb3Var.getClass();
        zr4 zr4Var = zr4.a;
        pd2 pd2Var = new pd2("ableToRelocate", mb3Var, zr4Var, zr4Var, zr4Var);
        c58.a.getClass();
        bw4 bw4Var = c58.b;
        bw4Var.getClass();
        List<vd2> listA0 = u63.a0(pd2Var, new pd2("source", bw4Var, zr4Var, zr4Var, zr4Var));
        a = listA0;
        mb3 mb3Var2 = fc6.a;
        mb3Var2.getClass();
        pd2 pd2Var2 = new pd2("id", mb3Var2, zr4Var, zr4Var, zr4Var);
        mb3 mb3Var3 = nc6.a;
        mb3Var3.getClass();
        List<vd2> listA02 = u63.a0(pd2Var2, new pd2("formattedLocationFull", mb3Var3, zr4Var, zr4Var, zr4Var), new pd2("formattedLocationShort", mb3Var3, zr4Var, zr4Var, zr4Var), new pd2("raw", mb3Var3, zr4Var, zr4Var, zr4Var));
        b = listA02;
        pd2 pd2Var3 = new pd2("id", mb3Var2, zr4Var, zr4Var, zr4Var);
        sna snaVar = x58.a;
        snaVar.getClass();
        List<vd2> listA03 = u63.a0(pd2Var3, new pd2("relocation", snaVar, zr4Var, zr4Var, listA0), new pd2("locations", new ud2(new sd2(rd2.a(n58.a))), zr4Var, zr4Var, listA02));
        c = listA03;
        sna snaVar2 = t58.a;
        snaVar2.getClass();
        List<vd2> listI = v40.i("preference", snaVar2, zr4Var, zr4Var, listA03);
        d = listI;
        sna snaVar3 = weg.a;
        snaVar3.getClass();
        md2 md2Var = s4a.P;
        hva.a aVar = hva.a.a;
        e = ia.n("updateJobSeekerProfileStructuredDataPreference", snaVar3, zr4Var, bg.f(md2Var, new hva.c(new wd2("input"))), listI);
    }
}
