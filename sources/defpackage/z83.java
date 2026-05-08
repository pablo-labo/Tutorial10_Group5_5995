package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class z83 {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;

    static {
        mb3 mb3Var = bc6.a;
        mb3Var.getClass();
        zr4 zr4Var = zr4.a;
        pd2 pd2Var = new pd2("messagingResponseRate", mb3Var, zr4Var, zr4Var, zr4Var);
        mb3 mb3Var2 = jc6.a;
        List<vd2> listA0 = u63.a0(pd2Var, new pd2("outreachesReceivedCount", rd2.a(mb3Var2), zr4Var, zr4Var, zr4Var), new pd2("outreachesRespondedCount", new ud2(mb3Var2), zr4Var, zr4Var, zr4Var));
        a = listA0;
        sna snaVar = v68.a;
        snaVar.getClass();
        List<vd2> listI = v40.i("responsiveness", snaVar, zr4Var, zr4Var, listA0);
        b = listI;
        sna snaVar2 = w68.a;
        snaVar2.getClass();
        md2 md2Var = g9c.a;
        hva.a aVar = hva.a.a;
        c = ia.n("currentJobSeekerResponsiveness", snaVar2, zr4Var, bg.f(md2Var, new hva.c(new wd2("input"))), listI);
    }
}
