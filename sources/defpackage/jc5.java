package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jc5 {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;
    public static final List<vd2> d;
    public static final List<vd2> e;
    public static final List<vd2> f;
    public static final List<vd2> g;

    static {
        mb3 mb3Var = fc6.a;
        ud2 ud2VarA = rd2.a(mb3Var);
        zr4 zr4Var = zr4.a;
        pd2 pd2Var = new pd2("id", ud2VarA, zr4Var, zr4Var, zr4Var);
        mb3 mb3Var2 = nc6.a;
        List<vd2> listA0 = u63.a0(pd2Var, new pd2("label", rd2.a(mb3Var2), zr4Var, zr4Var, zr4Var));
        a = listA0;
        pd2 pd2Var2 = new pd2("id", new ud2(mb3Var), zr4Var, zr4Var, zr4Var);
        pd2 pd2Var3 = new pd2("label", new ud2(mb3Var2), zr4Var, zr4Var, zr4Var);
        sna snaVar = ry1.a;
        snaVar.getClass();
        List<vd2> listA02 = u63.a0(pd2Var2, pd2Var3, new pd2("tag", snaVar, zr4Var, zr4Var, listA0));
        b = listA02;
        List<vd2> listA03 = u63.a0(new pd2("id", new ud2(mb3Var), zr4Var, zr4Var, zr4Var), new pd2("label", new ud2(mb3Var2), zr4Var, zr4Var, zr4Var), new pd2("values", new ud2(new sd2(rd2.a(ty1.a))), zr4Var, zr4Var, listA02));
        c = listA03;
        pd2 pd2Var4 = new pd2("id", new ud2(mb3Var), zr4Var, zr4Var, zr4Var);
        pd2 pd2Var5 = new pd2("label", new ud2(mb3Var2), zr4Var, zr4Var, zr4Var);
        sna snaVar2 = qy1.a;
        snaVar2.getClass();
        List<vd2> listA04 = u63.a0(pd2Var4, pd2Var5, new pd2("question", snaVar2, zr4Var, zr4Var, listA03));
        d = listA04;
        ud2 ud2Var = new ud2(new sd2(rd2.a(ny1.a)));
        md2 md2Var = sy1.a;
        hva.a aVar = hva.a.a;
        List<vd2> listZ = u63.Z(new pd2("genericAttributes", ud2Var, zr4Var, bg.f(md2Var, new hva.c(new wd2("genericAttributesInput"))), listA04));
        e = listZ;
        List<vd2> listL = w20.l("taxonomies", new ud2(new sd2(rd2.a(sy1.b))), zr4Var, zr4Var, listZ);
        f = listL;
        sna snaVar3 = hc5.a;
        snaVar3.getClass();
        g = ia.n("findCategoricalOQVTTaxonomies", snaVar3, zr4Var, bg.f(f9c.c, new hva.c(new wd2("taxonomyInput"))), listL);
    }
}
