package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tfg {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;
    public static final List<vd2> d;
    public static final List<vd2> e;

    static {
        mb3 mb3Var = nc6.a;
        mb3Var.getClass();
        zr4 zr4Var = zr4.a;
        List<vd2> listA0 = u63.a0(new pd2("address", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("address2", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("admin1", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("city", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("country", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("formattedLocation", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("location", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("postalCode", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("state", mb3Var, zr4Var, zr4Var, zr4Var));
        a = listA0;
        mb3 mb3Var2 = fc6.a;
        pd2 pd2Var = new pd2("id", rd2.a(mb3Var2), zr4Var, zr4Var, zr4Var);
        o18.a.getClass();
        bw4 bw4Var = o18.b;
        bw4Var.getClass();
        List<vd2> listA02 = u63.a0(pd2Var, new pd2("employmentEligibility", bw4Var, zr4Var, zr4Var, zr4Var));
        b = listA02;
        pd2 pd2Var2 = new pd2("id", new ud2(mb3Var2), zr4Var, zr4Var, zr4Var);
        pd2 pd2Var3 = new pd2("firstName", mb3Var, zr4Var, zr4Var, zr4Var);
        pd2 pd2Var4 = new pd2("lastName", mb3Var, zr4Var, zr4Var, zr4Var);
        pd2 pd2Var5 = new pd2("headline", mb3Var, zr4Var, zr4Var, zr4Var);
        pd2 pd2Var6 = new pd2("phoneNumber", mb3Var, zr4Var, zr4Var, zr4Var);
        mb3 mb3Var3 = wb6.a;
        mb3Var3.getClass();
        pd2 pd2Var7 = new pd2("showPhoneNumber", mb3Var3, zr4Var, zr4Var, zr4Var);
        sna snaVar = o38.a;
        snaVar.getClass();
        List<vd2> listA03 = u63.a0(pd2Var2, pd2Var3, pd2Var4, pd2Var5, pd2Var6, pd2Var7, new pd2("location", snaVar, zr4Var, zr4Var, listA0), new pd2("employmentEligibilities", new ud2(new sd2(rd2.a(l18.a))), zr4Var, zr4Var, listA02));
        c = listA03;
        sna snaVar2 = e48.a;
        snaVar2.getClass();
        List<vd2> listI = v40.i("resume", snaVar2, zr4Var, zr4Var, listA03);
        d = listI;
        sna snaVar3 = rdg.a;
        snaVar3.getClass();
        md2 md2Var = s4a.c;
        hva.a aVar = hva.a.a;
        e = ia.n("updateJobSeekerProfileResume", snaVar3, zr4Var, bg.f(md2Var, new hva.c(new wd2("input"))), listI);
    }
}
