package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mg3 {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;

    static {
        mb3 mb3Var = wb6.a;
        mb3Var.getClass();
        zr4 zr4Var = zr4.a;
        pd2 pd2Var = new pd2("isCurrent", mb3Var, zr4Var, zr4Var, zr4Var);
        s38.a.getClass();
        bw4 bw4Var = s38.b;
        bw4Var.getClass();
        pd2 pd2Var2 = new pd2("month", bw4Var, zr4Var, zr4Var, zr4Var);
        mb3 mb3Var2 = ic6.a;
        mb3Var2.getClass();
        List<vd2> listA0 = u63.a0(pd2Var, pd2Var2, new pd2("year", mb3Var2, zr4Var, zr4Var, zr4Var));
        a = listA0;
        List<vd2> listA02 = u63.a0(new pd2("isCurrent", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("month", bw4Var, zr4Var, zr4Var, zr4Var), new pd2("year", mb3Var2, zr4Var, zr4Var, zr4Var));
        b = listA02;
        sna snaVar = c18.a;
        snaVar.getClass();
        c = u63.a0(new pd2("fromDate", snaVar, zr4Var, zr4Var, listA0), new pd2("isCurrent", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("toDate", snaVar, zr4Var, zr4Var, listA02));
    }
}
