package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gqb {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;
    public static final List<vd2> d;
    public static final List<vd2> e;
    public static final List<vd2> f;
    public static final List<vd2> g;
    public static final List<vd2> h;

    static {
        mb3 mb3Var = oc6.a;
        mb3Var.getClass();
        zr4 zr4Var = zr4.a;
        List<vd2> listG = u40.g("formattedLocation", mb3Var, zr4Var, zr4Var, zr4Var);
        a = listG;
        sna snaVar = n38.a;
        snaVar.getClass();
        List<vd2> listI = v40.i("location", snaVar, zr4Var, zr4Var, listG);
        b = listI;
        sna snaVar2 = v08.a;
        snaVar2.getClass();
        List<vd2> listI2 = v40.i("contactInformation", snaVar2, zr4Var, zr4Var, listI);
        c = listI2;
        List<vd2> listA0 = u63.a0(new pd2("formattedLocation", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("unknownLocation", mb3Var, zr4Var, zr4Var, zr4Var));
        d = listA0;
        List<vd2> listI3 = v40.i("location", snaVar, zr4Var, zr4Var, listA0);
        e = listI3;
        sna snaVar3 = f18.a;
        snaVar3.getClass();
        List<vd2> listA02 = u63.a0(new pd2("defaultInfo", snaVar3, zr4Var, zr4Var, listI2), new pd2("resume", new ud2(new sd2(rd2.a(d48.a))), zr4Var, zr4Var, listI3));
        f = listA02;
        sna snaVar4 = p08.a;
        snaVar4.getClass();
        List<vd2> listI4 = v40.i("profile", snaVar4, zr4Var, zr4Var, listA02);
        g = listI4;
        sna snaVar5 = z38.a;
        snaVar5.getClass();
        h = v40.i("jobSeekerProfile", snaVar5, zr4Var, zr4Var, listI4);
    }
}
