package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class f8g {
    public static final List<vd2> a;
    public static final List<vd2> b;

    static {
        ud2 ud2VarA = rd2.a(qg3.a);
        zr4 zr4Var = zr4.a;
        List<vd2> listM = k20.m("readCursor", ud2VarA, zr4Var, zr4Var, zr4Var);
        a = listM;
        sna snaVar = i8g.a;
        snaVar.getClass();
        md2 md2Var = q4a.b;
        hva.a aVar = hva.a.a;
        b = ia.n("updateConversationReadCursor", snaVar, zr4Var, bg.f(md2Var, new hva.c(new wd2("input"))), listM);
    }
}
