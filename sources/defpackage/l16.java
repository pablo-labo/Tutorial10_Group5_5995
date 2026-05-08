package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class l16 {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;
    public static final List<vd2> d;

    static {
        ud2 ud2VarA = rd2.a(gc6.a);
        zr4 zr4Var = zr4.a;
        pd2 pd2Var = new pd2("id", ud2VarA, zr4Var, zr4Var, zr4Var);
        mb3 mb3Var = oc6.a;
        mb3Var.getClass();
        pd2 pd2Var2 = new pd2("fileName", mb3Var, zr4Var, zr4Var, zr4Var);
        u18.a.getClass();
        bw4 bw4Var = u18.b;
        bw4Var.getClass();
        pd2 pd2Var3 = new pd2("fileType", bw4Var, zr4Var, zr4Var, zr4Var);
        mb3 mb3Var2 = vg7.a;
        mb3Var2.getClass();
        List<vd2> listA0 = u63.a0(pd2Var, pd2Var2, pd2Var3, new pd2("uploadTimestamp", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("mediaType", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("fileDescription", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("extension", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("clientApp", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("standardHashCode", mb3Var, zr4Var, zr4Var, zr4Var));
        a = listA0;
        List<vd2> listL = w20.l("fileInformation", new ud2(new sd2(rd2.a(r18.a))), zr4Var, zr4Var, listA0);
        b = listL;
        sna snaVar = p08.a;
        snaVar.getClass();
        List<vd2> listI = v40.i("profile", snaVar, zr4Var, zr4Var, listL);
        c = listI;
        sna snaVar2 = z38.a;
        snaVar2.getClass();
        d = v40.i("jobSeekerProfile", snaVar2, zr4Var, zr4Var, listI);
    }
}
