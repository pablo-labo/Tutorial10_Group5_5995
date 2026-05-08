package defpackage;

import com.datadog.android.rum.internal.RumFeature;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ly7 {
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
    public static final List<vd2> k;
    public static final List<vd2> l;

    static {
        mb3 mb3Var = pc6.a;
        ud2 ud2VarA = rd2.a(mb3Var);
        zr4 zr4Var = zr4.a;
        List<vd2> listA0 = u63.a0(new pd2("short", ud2VarA, zr4Var, zr4Var, zr4Var), new pd2("long", new ud2(mb3Var), zr4Var, zr4Var, zr4Var));
        a = listA0;
        List<vd2> listL = w20.l("formatted", rd2.a(pp5.a), zr4Var, zr4Var, listA0);
        b = listL;
        List<vd2> listA02 = u63.a0(new pd2("url64", new ud2(mb3Var), zr4Var, zr4Var, zr4Var), new pd2("url128", new ud2(mb3Var), zr4Var, zr4Var, zr4Var));
        c = listA02;
        sna snaVar = gqe.a;
        snaVar.getClass();
        List<vd2> listI = v40.i("squareLogoUrls", snaVar, zr4Var, zr4Var, listA02);
        d = listI;
        sna snaVar2 = p07.a;
        snaVar2.getClass();
        List<vd2> listI2 = v40.i("images", snaVar2, zr4Var, zr4Var, listI);
        e = listI2;
        mb3 mb3Var2 = dc6.a;
        mb3Var2.getClass();
        List<vd2> listG = u40.g("value", mb3Var2, zr4Var, zr4Var, zr4Var);
        f = listG;
        sna snaVar3 = z51.a;
        snaVar3.getClass();
        List<vd2> listI3 = v40.i("overallRating", snaVar3, zr4Var, zr4Var, listG);
        g = listI3;
        sna snaVar4 = sic.a;
        snaVar4.getClass();
        List<vd2> listI4 = v40.i("ratings", snaVar4, zr4Var, zr4Var, listI3);
        h = listI4;
        sna snaVar5 = fr4.a;
        snaVar5.getClass();
        pd2 pd2Var = new pd2("dossier", snaVar5, zr4Var, zr4Var, listI2);
        sna snaVar6 = u88.a;
        snaVar6.getClass();
        List<vd2> listA03 = u63.a0(pd2Var, new pd2("ugcStats", snaVar6, zr4Var, zr4Var, listI4));
        i = listA03;
        List<vd2> listG2 = u40.g("formattedText", mb3Var, zr4Var, zr4Var, zr4Var);
        j = listG2;
        mb3 mb3Var3 = hc6.a;
        List<vd2> listA04 = u63.a0(new pd2("key", rd2.a(mb3Var3), zr4Var, zr4Var, zr4Var), new pd2("label", new ud2(mb3Var), zr4Var, zr4Var, zr4Var));
        k = listA04;
        pd2 pd2Var2 = new pd2("key", new ud2(mb3Var3), zr4Var, zr4Var, zr4Var);
        pd2 pd2Var3 = new pd2("url", new ud2(mb3Var), zr4Var, zr4Var, zr4Var);
        pd2 pd2Var4 = new pd2("title", new ud2(mb3Var), zr4Var, zr4Var, zr4Var);
        pd2 pd2Var5 = new pd2("location", rd2.a(az7.a), zr4Var, zr4Var, listL);
        pd2 pd2Var6 = new pd2("sourceEmployerName", new ud2(mb3Var), zr4Var, zr4Var, zr4Var);
        sna snaVar7 = dr4.a;
        snaVar7.getClass();
        pd2 pd2Var7 = new pd2("employer", snaVar7, zr4Var, zr4Var, listA03);
        sna snaVar8 = qx7.a;
        snaVar8.getClass();
        l = u63.a0(pd2Var2, pd2Var3, pd2Var4, pd2Var5, pd2Var6, pd2Var7, new pd2("compensation", snaVar8, zr4Var, zr4Var, listG2), new pd2(RumFeature.EVENT_ATTRIBUTES_PROPERTY, new ud2(new sd2(rd2.a(gx7.a))), zr4Var, zr4Var, listA04));
    }
}
