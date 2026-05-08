package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lt9 {
    public static final List<vd2> a;
    public static final List<vd2> b;

    static {
        mb3 mb3Var = nc6.a;
        ud2 ud2VarA = rd2.a(mb3Var);
        zr4 zr4Var = zr4.a;
        pd2 pd2Var = new pd2("__typename", ud2VarA, zr4Var, zr4Var, zr4Var);
        List listZ = u63.Z("JobSeekerProfileDateRange");
        List<vd2> list = mg3.c;
        List<vd2> listA0 = u63.a0(pd2Var, s40.b(list, "JobSeekerProfileDateRange", listZ, list));
        a = listA0;
        pd2 pd2Var2 = new pd2("id", rd2.a(fc6.a), zr4Var, zr4Var, zr4Var);
        pd2 pd2Var3 = new pd2("country", mb3Var, zr4Var, zr4Var, zr4Var);
        pd2 pd2Var4 = new pd2("branch", mb3Var, zr4Var, zr4Var, zr4Var);
        pd2 pd2Var5 = new pd2("rank", mb3Var, zr4Var, zr4Var, zr4Var);
        pd2 pd2Var6 = new pd2("description", mb3Var, zr4Var, zr4Var, zr4Var);
        pd2 pd2Var7 = new pd2("serviceCode", mb3Var, zr4Var, zr4Var, zr4Var);
        sna snaVar = z08.a;
        snaVar.getClass();
        b = u63.a0(pd2Var2, pd2Var3, pd2Var4, pd2Var5, pd2Var6, pd2Var7, new pd2("dateRange", snaVar, zr4Var, zr4Var, listA0));
    }
}
