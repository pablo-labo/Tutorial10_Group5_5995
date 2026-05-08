package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class j08 {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;
    public static final List<vd2> d;

    static {
        h08.a.getClass();
        bw4 bw4Var = h08.b;
        bw4Var.getClass();
        zr4 zr4Var = zr4.a;
        List<vd2> listZ = u63.Z(new pd2("status", bw4Var, zr4Var, zr4Var, zr4Var));
        a = listZ;
        sna snaVar = g08.a;
        snaVar.getClass();
        List<vd2> listI = v40.i("jobSeekerPro", snaVar, zr4Var, zr4Var, listZ);
        b = listI;
        sna snaVar2 = p08.a;
        snaVar2.getClass();
        List<vd2> listI2 = v40.i("profile", snaVar2, zr4Var, zr4Var, listI);
        c = listI2;
        sna snaVar3 = z38.a;
        snaVar3.getClass();
        d = v40.i("jobSeekerProfile", snaVar3, zr4Var, zr4Var, listI2);
    }
}
