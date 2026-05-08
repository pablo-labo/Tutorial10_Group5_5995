package defpackage;

import defpackage.hva;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class z46 {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;
    public static final List<vd2> d;
    public static final List<vd2> e;
    public static final List<vd2> f;
    public static final List<vd2> g;
    public static final List<vd2> h;

    static {
        mb3 mb3Var = fc6.a;
        mb3Var.getClass();
        zr4 zr4Var = zr4.a;
        pd2 pd2Var = new pd2("id", mb3Var, zr4Var, zr4Var, zr4Var);
        mb3 mb3Var2 = ac6.a;
        mb3Var2.getClass();
        pd2 pd2Var2 = new pd2("amount", mb3Var2, zr4Var, zr4Var, zr4Var);
        f68.a.getClass();
        bw4 bw4Var = f68.b;
        bw4Var.getClass();
        pd2 pd2Var3 = new pd2("salaryType", bw4Var, zr4Var, zr4Var, zr4Var);
        mb3 mb3Var3 = nc6.a;
        mb3Var3.getClass();
        pd2 pd2Var4 = new pd2("currency", mb3Var3, zr4Var, zr4Var, zr4Var);
        mb3 mb3Var4 = wb6.a;
        mb3Var4.getClass();
        List<vd2> listA0 = u63.a0(pd2Var, pd2Var2, pd2Var3, pd2Var4, new pd2("amountExists", mb3Var4, zr4Var, zr4Var, zr4Var));
        a = listA0;
        pd2 pd2Var5 = new pd2("id", mb3Var, zr4Var, zr4Var, zr4Var);
        pd2 pd2Var6 = new pd2("jobTitle", mb3Var3, zr4Var, zr4Var, zr4Var);
        pd2 pd2Var7 = new pd2("normalizedValue", mb3Var3, zr4Var, zr4Var, zr4Var);
        h68.a.getClass();
        List<vd2> listA02 = u63.a0(pd2Var5, pd2Var6, pd2Var7, new pd2("sentiment", rd2.a(h68.b), zr4Var, zr4Var, zr4Var));
        b = listA02;
        pd2 pd2Var8 = new pd2("ableToRelocate", mb3Var4, zr4Var, zr4Var, zr4Var);
        c58.a.getClass();
        bw4 bw4Var2 = c58.b;
        bw4Var2.getClass();
        List<vd2> listA03 = u63.a0(pd2Var8, new pd2("source", bw4Var2, zr4Var, zr4Var, zr4Var));
        c = listA03;
        List<vd2> listA04 = u63.a0(new pd2("id", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("formattedLocationFull", mb3Var3, zr4Var, zr4Var, zr4Var), new pd2("formattedLocationShort", mb3Var3, zr4Var, zr4Var, zr4Var), new pd2("raw", mb3Var3, zr4Var, zr4Var, zr4Var));
        d = listA04;
        mb3 mb3Var5 = ic6.a;
        mb3Var5.getClass();
        List<vd2> listG = u40.g("timeMinutes", mb3Var5, zr4Var, zr4Var, zr4Var);
        e = listG;
        pd2 pd2Var9 = new pd2("uuid", mb3Var3, zr4Var, zr4Var, zr4Var);
        pd2 pd2Var10 = new pd2("id", mb3Var, zr4Var, zr4Var, zr4Var);
        sna snaVar = c68.a;
        snaVar.getClass();
        pd2 pd2Var11 = new pd2("minimumPay", snaVar, zr4Var, zr4Var, listA0);
        pd2 pd2Var12 = new pd2("jobTitles", new ud2(new sd2(rd2.a(g58.a))), zr4Var, zr4Var, listA02);
        sna snaVar2 = x58.a;
        snaVar2.getClass();
        pd2 pd2Var13 = new pd2("relocation", snaVar2, zr4Var, zr4Var, listA03);
        pd2 pd2Var14 = new pd2("locations", new ud2(new sd2(rd2.a(n58.a))), zr4Var, zr4Var, listA04);
        sna snaVar3 = v48.a;
        snaVar3.getClass();
        List<vd2> listA05 = u63.a0(pd2Var9, pd2Var10, pd2Var11, pd2Var12, pd2Var13, pd2Var14, new pd2("maximumCommute", snaVar3, zr4Var, zr4Var, listG));
        f = listA05;
        List<vd2> listL = w20.l("preferences", new ud2(new sd2(rd2.a(t58.a))), zr4Var, zr4Var, listA05);
        g = listL;
        sna snaVar4 = s58.a;
        snaVar4.getClass();
        md2 md2Var = f9c.d;
        hva.a aVar = hva.a.a;
        h = ia.n("jobSeekerProfileStructuredData", snaVar4, zr4Var, bg.f(md2Var, new hva.c(kc9.W(new Pair("queryFilter", kc9.W(new Pair("dataCategories", u63.Z("CONFIRMED_BY_USER"))))))), listL);
    }
}
