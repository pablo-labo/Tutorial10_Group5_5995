package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class k56 {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;
    public static final List<vd2> d;

    static {
        mb3 mb3Var = pc6.a;
        ud2 ud2VarA = rd2.a(mb3Var);
        zr4 zr4Var = zr4.a;
        List<vd2> listA0 = u63.a0(new pd2("messageBody", ud2VarA, zr4Var, zr4Var, zr4Var), new pd2("label", mb3Var, zr4Var, zr4Var, zr4Var));
        a = listA0;
        List<vd2> listA02 = u63.a0(new pd2("suggestedMessages", new ud2(new sd2(rd2.a(oye.a))), zr4Var, zr4Var, listA0), new pd2("trackingKey", mb3Var, zr4Var, zr4Var, zr4Var));
        b = listA02;
        sna snaVar = vye.a;
        snaVar.getClass();
        md2 md2Var = u00.a;
        hva.a aVar = hva.a.a;
        List<vd2> listN = ia.n("suggestedMessages", snaVar, zr4Var, bg.f(md2Var, new hva.c(new wd2("input"))), listA02);
        c = listN;
        sna snaVar2 = u00.b;
        snaVar2.getClass();
        d = v40.i("AiMessaging", snaVar2, zr4Var, zr4Var, listN);
    }
}
