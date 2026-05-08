package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class x1h {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;
    public static final List<vd2> d;

    static {
        mb3 mb3Var = fc6.a;
        ud2 ud2VarA = rd2.a(mb3Var);
        zr4 zr4Var = zr4.a;
        List<vd2> listM = k20.m("leverId", ud2VarA, zr4Var, zr4Var, zr4Var);
        a = listM;
        pd2 pd2Var = new pd2("id", new ud2(mb3Var), zr4Var, zr4Var, zr4Var);
        mb3 mb3Var2 = nc6.a;
        List<vd2> listA0 = u63.a0(pd2Var, new pd2("label", rd2.a(mb3Var2), zr4Var, zr4Var, zr4Var));
        b = listA0;
        List<vd2> listA02 = u63.a0(new pd2("label", new ud2(mb3Var2), zr4Var, zr4Var, zr4Var), new pd2("selectionLimit", rd2.a(ic6.a), zr4Var, zr4Var, zr4Var), new pd2("workAreas", new ud2(new sd2(rd2.a(ryd.a))), zr4Var, zr4Var, listA0));
        c = listA02;
        d = u63.a0(new pd2("lever", rd2.a(xyd.a), zr4Var, zr4Var, listM), new pd2("workAreaSelection", rd2.a(syd.a), zr4Var, zr4Var, listA02));
    }
}
