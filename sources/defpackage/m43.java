package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class m43 {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;

    static {
        ud2 ud2VarA = rd2.a(qwg.a);
        zr4 zr4Var = zr4.a;
        List<vd2> listA0 = u63.a0(new pd2("url", ud2VarA, zr4Var, zr4Var, zr4Var), new pd2("iaUid", rd2.a(hc6.a), zr4Var, zr4Var, zr4Var));
        a = listA0;
        sna snaVar = u43.a;
        snaVar.getClass();
        md2 md2Var = sr0.a;
        hva.a aVar = hva.a.a;
        List<vd2> listN = ia.n("createApplyUrlFullParams", snaVar, zr4Var, bg.f(md2Var, new hva.c(new wd2("input"))), listA0);
        b = listN;
        c = w20.l("applyUrl", rd2.a(sr0.b), zr4Var, zr4Var, listN);
    }
}
