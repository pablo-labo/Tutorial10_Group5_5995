package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wzc {
    public static final List<vd2> a;
    public static final List<vd2> b;

    static {
        ud2 ud2VarA = rd2.a(kc6.a);
        zr4 zr4Var = zr4.a;
        pd2 pd2Var = new pd2("amount", ud2VarA, zr4Var, zr4Var, zr4Var);
        mb3 mb3Var = vg7.a;
        mb3Var.getClass();
        List<vd2> listA0 = u63.a0(pd2Var, new pd2("nextAvailableTimestamp", mb3Var, zr4Var, zr4Var, zr4Var));
        a = listA0;
        sna snaVar = uzc.a;
        snaVar.getClass();
        b = v40.i("remainingTopChoices", snaVar, zr4Var, zr4Var, listA0);
    }
}
