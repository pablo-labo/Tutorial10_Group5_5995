package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mae {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;
    public static final List<vd2> d;

    static {
        ud2 ud2VarA = rd2.a(zb6.a);
        zr4 zr4Var = zr4.a;
        List<vd2> listM = k20.m("isEnabled", ud2VarA, zr4Var, zr4Var, zr4Var);
        a = listM;
        sna snaVar = fta.a;
        snaVar.getClass();
        List<vd2> listI = v40.i("onlineStatusPreference", snaVar, zr4Var, zr4Var, listM);
        b = listI;
        sna snaVar2 = rae.a;
        snaVar2.getClass();
        md2 md2Var = gta.a;
        hva.a aVar = hva.a.a;
        List<vd2> listN = ia.n("setOnlineStatusPreference", snaVar2, zr4Var, bg.f(md2Var, new hva.c(new wd2("input"))), listI);
        c = listN;
        d = w20.l("onlineStatusPreference", rd2.a(gta.b), zr4Var, zr4Var, listN);
    }
}
