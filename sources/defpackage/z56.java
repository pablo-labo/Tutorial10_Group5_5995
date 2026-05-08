package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class z56 {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;
    public static final List<vd2> d;
    public static final List<vd2> e;

    static {
        mb3 mb3Var = nc6.a;
        ud2 ud2VarA = rd2.a(mb3Var);
        zr4 zr4Var = zr4.a;
        List<vd2> listA0 = u63.a0(new pd2("userInteractionType", ud2VarA, zr4Var, zr4Var, zr4Var), new pd2("userInteractionTarget", new ud2(mb3Var), zr4Var, zr4Var, zr4Var), new pd2("contextKey", new ud2(mb3Var), zr4Var, zr4Var, zr4Var));
        a = listA0;
        pd2 pd2Var = new pd2("userInteraction", rd2.a(d0g.a), zr4Var, zr4Var, listA0);
        pd2 pd2Var2 = new pd2("interactionCount", rd2.a(ic6.a), zr4Var, zr4Var, zr4Var);
        mb3 mb3Var2 = nmf.a;
        List<vd2> listA02 = u63.a0(pd2Var, pd2Var2, new pd2("firstInteractionTimestamp", rd2.a(mb3Var2), zr4Var, zr4Var, zr4Var), new pd2("lastInteractionTimestamp", new ud2(mb3Var2), zr4Var, zr4Var, zr4Var));
        b = listA02;
        List<vd2> listL = w20.l("interactions", new ud2(new sd2(rd2.a(g0g.a))), zr4Var, zr4Var, listA02);
        c = listL;
        List<vd2> listL2 = w20.l("userDisplayPreference", rd2.a(ejg.a), zr4Var, zr4Var, listL);
        d = listL2;
        sna snaVar = hf5.a;
        snaVar.getClass();
        e = v40.i("findUserDisplayPreference", snaVar, zr4Var, zr4Var, listL2);
    }
}
