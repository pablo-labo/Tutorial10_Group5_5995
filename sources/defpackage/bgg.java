package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bgg {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;

    static {
        r48.a.getClass();
        ud2 ud2VarA = rd2.a(r48.b);
        zr4 zr4Var = zr4.a;
        List<vd2> listM = k20.m("sourcingElection", ud2VarA, zr4Var, zr4Var, zr4Var);
        a = listM;
        sna snaVar = fgg.a;
        snaVar.getClass();
        md2 md2Var = u38.a;
        hva.a aVar = hva.a.a;
        List<vd2> listN = ia.n("updateSourcingElection", snaVar, zr4Var, bg.f(md2Var, new hva.c(new wd2("input"))), listM);
        b = listN;
        sna snaVar2 = u38.b;
        snaVar2.getClass();
        c = v40.i("jobSeekerProfileMutations", snaVar2, zr4Var, zr4Var, listN);
    }
}
