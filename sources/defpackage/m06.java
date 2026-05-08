package defpackage;

import defpackage.hva;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class m06 {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;
    public static final List<vd2> d;
    public static final List<vd2> e;
    public static final List<vd2> f;

    static {
        mb3 mb3Var = pc6.a;
        ud2 ud2VarA = rd2.a(mb3Var);
        zr4 zr4Var = zr4.a;
        List<vd2> listA0 = u63.a0(new pd2("strippedHtml", ud2VarA, zr4Var, zr4Var, zr4Var), new pd2("subject", new ud2(mb3Var), zr4Var, zr4Var, zr4Var));
        a = listA0;
        sna snaVar = q47.a;
        snaVar.getClass();
        pd2 pd2Var = new pd2("inboundEmailData", snaVar, zr4Var, zr4Var, listA0);
        mb3 mb3Var2 = hc6.a;
        List<vd2> listA02 = u63.a0(pd2Var, new pd2("id", rd2.a(mb3Var2), zr4Var, zr4Var, zr4Var), new pd2("__typename", new ud2(mb3Var), zr4Var, zr4Var, zr4Var));
        b = listA02;
        List<vd2> listL = w20.l("node", rd2.a(fw2.b), zr4Var, zr4Var, listA02);
        c = listL;
        List<vd2> listL2 = w20.l("edges", new ud2(new sd2(rd2.a(uw2.a))), zr4Var, zr4Var, listL);
        d = listL2;
        pd2 pd2Var2 = new pd2("id", new ud2(mb3Var2), zr4Var, zr4Var, zr4Var);
        sna snaVar2 = tw2.a;
        snaVar2.getClass();
        md2 md2Var = wu2.a;
        hva.a aVar = hva.a.a;
        List<vd2> listA03 = u63.a0(pd2Var2, new pd2("eventsConnection", snaVar2, zr4Var, bg.f(md2Var, new hva.c(kc9.W(new Pair("filter", kc9.W(new Pair("eventIds", u63.Z(new wd2("eventId")))))))), listL2), new pd2("__typename", new ud2(mb3Var), zr4Var, zr4Var, zr4Var));
        e = listA03;
        sna snaVar3 = wu2.f;
        snaVar3.getClass();
        f = ia.n("conversation", snaVar3, zr4Var, bg.f(d9c.b, new hva.c(kc9.W(new Pair("conversationId", new wd2("conversationId"))))), listA03);
    }
}
