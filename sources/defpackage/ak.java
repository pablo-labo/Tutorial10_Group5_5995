package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ak {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;
    public static final List<vd2> d;

    static {
        mb3 mb3Var = ic6.a;
        mb3Var.getClass();
        zr4 zr4Var = zr4.a;
        List<vd2> listG = u40.g("timeMinutes", mb3Var, zr4Var, zr4Var, zr4Var);
        a = listG;
        mb3 mb3Var2 = fc6.a;
        mb3Var2.getClass();
        pd2 pd2Var = new pd2("id", mb3Var2, zr4Var, zr4Var, zr4Var);
        sna snaVar = v48.a;
        snaVar.getClass();
        List<vd2> listA0 = u63.a0(pd2Var, new pd2("maximumCommute", snaVar, zr4Var, zr4Var, listG));
        b = listA0;
        sna snaVar2 = t58.a;
        snaVar2.getClass();
        List<vd2> listI = v40.i("preference", snaVar2, zr4Var, zr4Var, listA0);
        c = listI;
        sna snaVar3 = hq.a;
        snaVar3.getClass();
        md2 md2Var = s4a.O;
        hva.a aVar = hva.a.a;
        d = ia.n("addJobSeekerProfileStructuredDataPreference", snaVar3, zr4Var, bg.f(md2Var, new hva.c(new wd2("input"))), listI);
    }
}
