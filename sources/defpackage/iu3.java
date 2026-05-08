package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class iu3 {
    public static final List<vd2> a;
    public static final List<vd2> b;

    static {
        ud2 ud2Var = new ud2(new sd2(rd2.a(nc6.a)));
        zr4 zr4Var = zr4.a;
        List<vd2> listM = k20.m("associationIds", ud2Var, zr4Var, zr4Var, zr4Var);
        a = listM;
        sna snaVar = lu3.a;
        snaVar.getClass();
        md2 md2Var = s4a.M;
        hva.a aVar = hva.a.a;
        b = ia.n("deleteJobSeekerProfileResumeAssociations", snaVar, zr4Var, bg.f(md2Var, new hva.c(new wd2("input"))), listM);
    }
}
