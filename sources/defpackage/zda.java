package defpackage;

import defpackage.hva;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class zda {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;
    public static final List<vd2> d;
    public static final List<vd2> e;
    public static final List<vd2> f;
    public static final List<vd2> g;
    public static final List<vd2> h;
    public static final List<vd2> i;
    public static final List<vd2> j;

    static {
        vca.a.getClass();
        bw4 bw4Var = vca.b;
        ud2 ud2VarA = rd2.a(bw4Var);
        zr4 zr4Var = zr4.a;
        pd2 pd2Var = new pd2("id", ud2VarA, zr4Var, zr4Var, zr4Var);
        mb3 mb3Var = pwg.a;
        pd2 pd2Var2 = new pd2("destinationUrl", rd2.a(mb3Var), zr4Var, zr4Var, zr4Var);
        mb3 mb3Var2 = oc6.a;
        mb3Var2.getClass();
        List<vd2> listA0 = u63.a0(pd2Var, pd2Var2, new pd2("logoUrl", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("label", new ud2(mb3Var2), zr4Var, zr4Var, zr4Var));
        a = listA0;
        List<vd2> listA02 = u63.a0(new pd2("id", new ud2(bw4Var), zr4Var, zr4Var, zr4Var), new pd2("destinationUrl", new ud2(mb3Var), zr4Var, zr4Var, zr4Var), new pd2("label", new ud2(mb3Var2), zr4Var, zr4Var, zr4Var));
        b = listA02;
        sna snaVar = tq1.a;
        List<vd2> listA03 = u63.a0(new pd2("leftItems", new ud2(new sd2(rd2.a(snaVar))), zr4Var, zr4Var, listA0), new pd2("rightItems", new ud2(new sd2(new ud2(snaVar))), zr4Var, zr4Var, listA02));
        c = listA03;
        List<vd2> listA04 = u63.a0(new pd2("id", new ud2(bw4Var), zr4Var, zr4Var, zr4Var), new pd2("destinationUrl", new ud2(mb3Var), zr4Var, zr4Var, zr4Var), new pd2("label", new ud2(mb3Var2), zr4Var, zr4Var, zr4Var), new pd2("subtitle", mb3Var2, zr4Var, zr4Var, zr4Var));
        d = listA04;
        List<vd2> listA05 = u63.a0(new pd2("id", new ud2(bw4Var), zr4Var, zr4Var, zr4Var), new pd2("destinationUrl", new ud2(mb3Var), zr4Var, zr4Var, zr4Var), new pd2("label", new ud2(mb3Var2), zr4Var, zr4Var, zr4Var), new pd2("subtitle", mb3Var2, zr4Var, zr4Var, zr4Var));
        e = listA05;
        tca.a.getClass();
        pd2 pd2Var3 = new pd2("id", rd2.a(tca.b), zr4Var, zr4Var, zr4Var);
        pd2 pd2Var4 = new pd2("label", mb3Var2, zr4Var, zr4Var, zr4Var);
        sna snaVar2 = go9.a;
        List<vd2> listA06 = u63.a0(pd2Var3, pd2Var4, new pd2("items", new ud2(new sd2(rd2.a(snaVar2))), zr4Var, zr4Var, listA05));
        f = listA06;
        List<vd2> listA07 = u63.a0(new pd2("navigationBar", rd2.a(nca.a), zr4Var, zr4Var, listA03), new pd2("hamburgerMenu", new ud2(new sd2(new ud2(snaVar2))), zr4Var, zr4Var, listA04), new pd2("categorizedHamburgerMenu", new ud2(new sd2(rd2.a(sca.a))), zr4Var, zr4Var, listA06));
        g = listA07;
        List<vd2> listA08 = u63.a0(new pd2("countryCode", rd2.a(c23.a), zr4Var, zr4Var, zr4Var), new pd2("countryName", new ud2(mb3Var2), zr4Var, zr4Var, zr4Var), new pd2("baseIndeedUrl", new ud2(mb3Var2), zr4Var, zr4Var, zr4Var), new pd2("supportedLanguages", new ud2(new sd2(rd2.a(oj8.a))), zr4Var, zr4Var, zr4Var));
        h = listA08;
        List<vd2> listL = w20.l("results", new ud2(new sd2(rd2.a(n23.a))), zr4Var, zr4Var, listA08);
        i = listL;
        sna snaVar3 = xda.a;
        snaVar3.getClass();
        md2 md2Var = h9c.b;
        hva.a aVar = hva.a.a;
        pd2 pd2Var5 = new pd2("navigationMenu", snaVar3, zr4Var, bg.f(md2Var, new hva.c(lc9.a0(new Pair("variant", "JOBSEEKER_MOBILE_APP"), new Pair("from", "android-nav-menu"), new Pair("continueUrl", new wd2("continueUrl")), new Pair("appName", "jsma-jobsearch-android")))), listA07);
        sna snaVar4 = t51.a;
        snaVar4.getClass();
        j = u63.a0(pd2Var5, new pd2("availableCountrySites", snaVar4, zr4Var, zr4Var, listL));
    }
}
