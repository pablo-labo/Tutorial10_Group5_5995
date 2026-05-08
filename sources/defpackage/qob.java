package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qob {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;

    static {
        mb3 mb3Var = oc6.a;
        ud2 ud2VarA = rd2.a(mb3Var);
        zr4 zr4Var = zr4.a;
        pd2 pd2Var = new pd2("value", ud2VarA, zr4Var, zr4Var, zr4Var);
        uu9.a.getClass();
        bw4 bw4Var = uu9.b;
        bw4Var.getClass();
        List<vd2> listA0 = u63.a0(pd2Var, new pd2("type", bw4Var, zr4Var, zr4Var, zr4Var));
        a = listA0;
        pd2 pd2Var2 = new pd2("value", rd2.a(kc6.a), zr4Var, zr4Var, zr4Var);
        pd2 pd2Var3 = new pd2("description", mb3Var, zr4Var, zr4Var, zr4Var);
        sna snaVar = tu9.a;
        snaVar.getClass();
        List<vd2> listA02 = u63.a0(pd2Var2, pd2Var3, new pd2("payload", snaVar, zr4Var, zr4Var, listA0));
        b = listA02;
        c = u63.a0(new pd2("testName", new ud2(mb3Var), zr4Var, zr4Var, zr4Var), new pd2("bucket", rd2.a(su9.a), zr4Var, zr4Var, listA02));
    }
}
