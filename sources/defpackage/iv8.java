package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class iv8 {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;
    public static final List<vd2> d;
    public static final List<vd2> e;

    static {
        mb3 mb3Var = wg7.a;
        mb3Var.getClass();
        zr4 zr4Var = zr4.a;
        List<vd2> listG = u40.g("collectionTimestamp", mb3Var, zr4Var, zr4Var, zr4Var);
        a = listG;
        mb3 mb3Var2 = nc6.a;
        mb3Var2.getClass();
        List<vd2> listA0 = u63.a0(new pd2("address", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("address2", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("admin1", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("city", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("country", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("formattedLocation", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("location", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("postalCode", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("state", mb3Var2, zr4Var, zr4Var, zr4Var));
        b = listA0;
        List<vd2> listA02 = u63.a0(new pd2("label", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("suid", mb3Var2, zr4Var, zr4Var, zr4Var));
        c = listA02;
        pd2 pd2Var = new pd2("__typename", new ud2(mb3Var2), zr4Var, zr4Var, zr4Var);
        List listZ = u63.Z("JobSeekerProfileDateRange");
        List<vd2> list = mg3.c;
        List<vd2> listA03 = u63.a0(pd2Var, s40.b(list, "JobSeekerProfileDateRange", listZ, list));
        d = listA03;
        pd2 pd2Var2 = new pd2("title", mb3Var2, zr4Var, zr4Var, zr4Var);
        pd2 pd2Var3 = new pd2("endorsements", new ud2(new sd2(new ud2(mb3Var2))), zr4Var, zr4Var, zr4Var);
        sna snaVar = q18.a;
        snaVar.getClass();
        pd2 pd2Var4 = new pd2("metadata", snaVar, zr4Var, zr4Var, listG);
        sna snaVar2 = o38.a;
        snaVar2.getClass();
        pd2 pd2Var5 = new pd2("location", snaVar2, zr4Var, zr4Var, listA0);
        sna snaVar3 = o68.a;
        snaVar3.getClass();
        pd2 pd2Var6 = new pd2("taxonomyConceptTitle", snaVar3, zr4Var, zr4Var, listA02);
        k38.a.getClass();
        bw4 bw4Var = k38.b;
        bw4Var.getClass();
        pd2 pd2Var7 = new pd2("type", bw4Var, zr4Var, zr4Var, zr4Var);
        sna snaVar4 = z08.a;
        snaVar4.getClass();
        e = u63.a0(pd2Var2, pd2Var3, pd2Var4, pd2Var5, pd2Var6, pd2Var7, new pd2("dateRange", snaVar4, zr4Var, zr4Var, listA03), new pd2("id", rd2.a(fc6.a), zr4Var, zr4Var, zr4Var));
    }
}
