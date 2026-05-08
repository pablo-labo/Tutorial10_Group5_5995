package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class n36 {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;
    public static final List<vd2> d;

    static {
        ud2 ud2VarA = rd2.a(fc6.a);
        zr4 zr4Var = zr4.a;
        List<vd2> listA0 = u63.a0(new pd2("id", ud2VarA, zr4Var, zr4Var, zr4Var), new pd2("tags", new ud2(new sd2(rd2.a(nc6.a))), zr4Var, zr4Var, zr4Var));
        a = listA0;
        List<vd2> listL = w20.l("resume", new ud2(new sd2(rd2.a(e48.a))), zr4Var, zr4Var, listA0);
        b = listL;
        sna snaVar = q08.a;
        snaVar.getClass();
        List<vd2> listI = v40.i("profile", snaVar, zr4Var, zr4Var, listL);
        c = listI;
        sna snaVar2 = a48.a;
        snaVar2.getClass();
        d = v40.i("jobSeekerProfile", snaVar2, zr4Var, zr4Var, listI);
    }
}
