package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class o1d {
    public static final List<vd2> a;
    public static final List<vd2> b;

    static {
        sd2 sd2Var = new sd2(rd2.a(gc6.a));
        zr4 zr4Var = zr4.a;
        List<vd2> listZ = u63.Z(new pd2("positivePreferenceAttributeIds", sd2Var, zr4Var, zr4Var, zr4Var));
        a = listZ;
        sna snaVar = kx3.a;
        snaVar.getClass();
        md2 md2Var = t4a.g;
        hva.a aVar = hva.a.a;
        b = ia.n("deleteJobSeekerProfileStructuredDataPreferenceAttributes", snaVar, zr4Var, bg.f(md2Var, new hva.c(new wd2("input"))), listZ);
    }
}
