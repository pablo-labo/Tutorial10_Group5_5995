package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class so4 {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;
    public static final List<vd2> d;
    public static final List<vd2> e;
    public static final List<vd2> f;
    public static final List<vd2> g;
    public static final List<vd2> h;

    static {
        mb3 mb3Var = nc6.a;
        mb3Var.getClass();
        zr4 zr4Var = zr4.a;
        List<vd2> listG = u40.g("sectionId", mb3Var, zr4Var, zr4Var, zr4Var);
        a = listG;
        pd2 pd2Var = new pd2("label", mb3Var, zr4Var, zr4Var, zr4Var);
        sna snaVar = n48.a;
        List<vd2> listA0 = u63.a0(pd2Var, new pd2("sectionIds", new ud2(new sd2(rd2.a(snaVar))), zr4Var, zr4Var, listG), new pd2("suid", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("taxonomyConceptId", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("type", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("uuid", mb3Var, zr4Var, zr4Var, zr4Var));
        b = listA0;
        List<vd2> listG2 = u40.g("sectionId", mb3Var, zr4Var, zr4Var, zr4Var);
        c = listG2;
        List<vd2> listA02 = u63.a0(new pd2("label", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("sectionIds", new ud2(new sd2(new ud2(snaVar))), zr4Var, zr4Var, listG2), new pd2("suid", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("taxonomyConceptId", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("type", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("uuid", mb3Var, zr4Var, zr4Var, zr4Var));
        d = listA02;
        pd2 pd2Var2 = new pd2("degreeName", mb3Var, zr4Var, zr4Var, zr4Var);
        pd2 pd2Var3 = new pd2("field", mb3Var, zr4Var, zr4Var, zr4Var);
        mb3 mb3Var2 = fc6.a;
        pd2 pd2Var4 = new pd2("id", rd2.a(mb3Var2), zr4Var, zr4Var, zr4Var);
        sna snaVar2 = o68.a;
        snaVar2.getClass();
        List<vd2> listA03 = u63.a0(pd2Var2, pd2Var3, pd2Var4, new pd2("taxonomyConceptDegree", snaVar2, zr4Var, zr4Var, listA0), new pd2("taxonomyConceptField", snaVar2, zr4Var, zr4Var, listA02));
        e = listA03;
        List<vd2> listA04 = u63.a0(new pd2("country", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("formattedLocation", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("unknownLocation", mb3Var, zr4Var, zr4Var, zr4Var));
        f = listA04;
        pd2 pd2Var5 = new pd2("__typename", new ud2(mb3Var), zr4Var, zr4Var, zr4Var);
        List listZ = u63.Z("JobSeekerProfileDateRange");
        List<vd2> list = mg3.c;
        List<vd2> listA05 = u63.a0(pd2Var5, s40.b(list, "JobSeekerProfileDateRange", listZ, list));
        g = listA05;
        pd2 pd2Var6 = new pd2("id", new ud2(mb3Var2), zr4Var, zr4Var, zr4Var);
        pd2 pd2Var7 = new pd2("school", mb3Var, zr4Var, zr4Var, zr4Var);
        pd2 pd2Var8 = new pd2("degree", new ud2(new sd2(rd2.a(h18.a))), zr4Var, zr4Var, listA03);
        sna snaVar3 = o38.a;
        snaVar3.getClass();
        pd2 pd2Var9 = new pd2("location", snaVar3, zr4Var, zr4Var, listA04);
        sna snaVar4 = z08.a;
        snaVar4.getClass();
        h = u63.a0(pd2Var6, pd2Var7, pd2Var8, pd2Var9, new pd2("dateRange", snaVar4, zr4Var, zr4Var, listA05), new pd2("additionalDetails", mb3Var, zr4Var, zr4Var, zr4Var));
    }
}
