package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class n2h {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;

    static {
        mb3 mb3Var = nc6.a;
        mb3Var.getClass();
        zr4 zr4Var = zr4.a;
        List<vd2> listA0 = u63.a0(new pd2("country", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("formattedLocation", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("unknownLocation", mb3Var, zr4Var, zr4Var, zr4Var));
        a = listA0;
        pd2 pd2Var = new pd2("__typename", new ud2(mb3Var), zr4Var, zr4Var, zr4Var);
        List listZ = u63.Z("JobSeekerProfileDateRange");
        List<vd2> list = mg3.c;
        List<vd2> listA02 = u63.a0(pd2Var, s40.b(list, "JobSeekerProfileDateRange", listZ, list));
        b = listA02;
        pd2 pd2Var2 = new pd2("id", rd2.a(fc6.a), zr4Var, zr4Var, zr4Var);
        pd2 pd2Var3 = new pd2("title", mb3Var, zr4Var, zr4Var, zr4Var);
        pd2 pd2Var4 = new pd2("company", mb3Var, zr4Var, zr4Var, zr4Var);
        sna snaVar = o38.a;
        snaVar.getClass();
        pd2 pd2Var5 = new pd2("location", snaVar, zr4Var, zr4Var, listA0);
        sna snaVar2 = z08.a;
        snaVar2.getClass();
        c = u63.a0(pd2Var2, pd2Var3, pd2Var4, pd2Var5, new pd2("dateRange", snaVar2, zr4Var, zr4Var, listA02), new pd2("description", mb3Var, zr4Var, zr4Var, zr4Var));
    }
}
