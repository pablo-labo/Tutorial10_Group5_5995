package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class wc5 {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;
    public static final List<vd2> d;

    static {
        mb3 mb3Var = pc6.a;
        ud2 ud2VarA = rd2.a(mb3Var);
        zr4 zr4Var = zr4.a;
        pd2 pd2Var = new pd2("__typename", ud2VarA, zr4Var, zr4Var, zr4Var);
        List listZ = u63.Z("Conversation");
        List<vd2> list = ew2.j;
        List<vd2> listA0 = u63.a0(pd2Var, s40.b(list, "Conversation", listZ, list), new pd2("id", rd2.a(hc6.a), zr4Var, zr4Var, zr4Var));
        a = listA0;
        pd2 pd2Var2 = new pd2("endCursor", mb3Var, zr4Var, zr4Var, zr4Var);
        pd2 pd2Var3 = new pd2("startCursor", mb3Var, zr4Var, zr4Var, zr4Var);
        mb3 mb3Var2 = zb6.a;
        List<vd2> listA02 = u63.a0(pd2Var2, pd2Var3, new pd2("hasPreviousPage", rd2.a(mb3Var2), zr4Var, zr4Var, zr4Var), new pd2("hasNextPage", new ud2(mb3Var2), zr4Var, zr4Var, zr4Var));
        b = listA02;
        List<vd2> listA03 = u63.a0(new pd2("conversations", new ud2(new sd2(rd2.a(wu2.f))), zr4Var, zr4Var, listA0), new pd2("pageInfo", rd2.a(j0b.a), zr4Var, zr4Var, listA02));
        c = listA03;
        sna snaVar = sc5.a;
        snaVar.getClass();
        md2 md2Var = d9c.e;
        hva.a aVar = hva.a.a;
        d = ia.n("findConversations", snaVar, zr4Var, u63.a0(new ld2(md2Var, new hva.c(new wd2("after"))), new ld2(d9c.g, new hva.c(new wd2("before"))), new ld2(d9c.d, new hva.c(new wd2("first"))), new ld2(d9c.c, new hva.c(new wd2("input"))), new ld2(d9c.f, new hva.c(new wd2("last")))), listA03);
    }
}
