package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xt {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;
    public static final List<vd2> d;

    static {
        mb3 mb3Var = nc6.a;
        ud2 ud2VarA = rd2.a(mb3Var);
        zr4 zr4Var = zr4.a;
        pd2 pd2Var = new pd2("resumeFileId", ud2VarA, zr4Var, zr4Var, zr4Var);
        pd2 pd2Var2 = new pd2("clientName", new ud2(mb3Var), zr4Var, zr4Var, zr4Var);
        u8d.a.getClass();
        List<vd2> listA0 = u63.a0(pd2Var, pd2Var2, new pd2("status", rd2.a(u8d.b), zr4Var, zr4Var, zr4Var));
        a = listA0;
        List<vd2> listL = w20.l("resumeFileSuggestion", rd2.a(q8d.a), zr4Var, zr4Var, listA0);
        b = listL;
        sna snaVar = s8d.a;
        snaVar.getClass();
        md2 md2Var = r8d.a;
        hva.a aVar = hva.a.a;
        List<vd2> listN = ia.n("addOrUpdateResumeFileSuggestion", snaVar, zr4Var, bg.f(md2Var, new hva.c(new wd2("input"))), listL);
        c = listN;
        sna snaVar2 = r8d.b;
        snaVar2.getClass();
        d = v40.i("resumeFileSuggestionMutations", snaVar2, zr4Var, zr4Var, listN);
    }
}
