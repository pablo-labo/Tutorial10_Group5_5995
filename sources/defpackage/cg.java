package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class cg {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;

    static {
        ud2 ud2VarA = rd2.a(hc6.a);
        zr4 zr4Var = zr4.a;
        List<vd2> listA0 = u63.a0(new pd2("id", ud2VarA, zr4Var, zr4Var, zr4Var), new pd2("__typename", rd2.a(pc6.a), zr4Var, zr4Var, zr4Var));
        a = listA0;
        List<vd2> listL = w20.l("conversation", rd2.a(wu2.f), zr4Var, zr4Var, listA0);
        b = listL;
        sna snaVar = gg.a;
        snaVar.getClass();
        md2 md2Var = q4a.c;
        hva.a aVar = hva.a.a;
        c = ia.n("addConversationLabels", snaVar, zr4Var, bg.f(md2Var, new hva.c(new wd2("input"))), listL);
    }
}
