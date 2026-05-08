package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class k6e {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;

    static {
        ud2 ud2VarA = rd2.a(pc6.a);
        zr4 zr4Var = zr4.a;
        pd2 pd2Var = new pd2("__typename", ud2VarA, zr4Var, zr4Var, zr4Var);
        List listZ = u63.Z("ConversationEvent");
        List<vd2> list = nk8.c;
        qd2 qd2VarB = s40.b(list, "ConversationEvent", listZ, list);
        mb3 mb3Var = hc6.a;
        List<vd2> listA0 = u63.a0(pd2Var, qd2VarB, new pd2("id", rd2.a(mb3Var), zr4Var, zr4Var, zr4Var));
        a = listA0;
        List<vd2> listA02 = u63.a0(new pd2("conversationId", new ud2(mb3Var), zr4Var, zr4Var, zr4Var), new pd2("event", rd2.a(fw2.b), zr4Var, zr4Var, listA0));
        b = listA02;
        sna snaVar = o6e.a;
        snaVar.getClass();
        md2 md2Var = q4a.a;
        hva.a aVar = hva.a.a;
        c = ia.n("sendConversationEvent", snaVar, zr4Var, bg.f(md2Var, new hva.c(new wd2("input"))), listA02);
    }
}
