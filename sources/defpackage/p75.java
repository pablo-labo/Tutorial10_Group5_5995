package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class p75 {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;
    public static final List<vd2> d;
    public static final List<vd2> e;
    public static final List<vd2> f;
    public static final List<vd2> g;
    public static final List<vd2> h;
    public static final List<vd2> i;
    public static final List<vd2> j;
    public static final List<vd2> k;

    static {
        mb3 mb3Var = hc6.a;
        mb3Var.getClass();
        zr4 zr4Var = zr4.a;
        pd2 pd2Var = new pd2("accountKey", mb3Var, zr4Var, zr4Var, zr4Var);
        gy2.a.getClass();
        bw4 bw4Var = gy2.b;
        bw4Var.getClass();
        List<vd2> listA0 = u63.a0(pd2Var, new pd2("role", bw4Var, zr4Var, zr4Var, zr4Var));
        a = listA0;
        mb3 mb3Var2 = pc6.a;
        List<vd2> listA02 = u63.a0(new pd2("contentHash", rd2.a(mb3Var2), zr4Var, zr4Var, zr4Var), new pd2("fileName", new ud2(mb3Var2), zr4Var, zr4Var, zr4Var), new pd2("fileExtension", new ud2(mb3Var2), zr4Var, zr4Var, zr4Var));
        b = listA02;
        List<vd2> listA03 = u63.a0(new pd2("iflColorReference", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("iflIconName", new ud2(mb3Var2), zr4Var, zr4Var, zr4Var));
        c = listA03;
        pd2 pd2Var2 = new pd2("message", mb3Var2, zr4Var, zr4Var, zr4Var);
        pd2 pd2Var3 = new pd2("sender", mb3Var2, zr4Var, zr4Var, zr4Var);
        sna snaVar = xq6.a;
        snaVar.getClass();
        List<vd2> listA04 = u63.a0(pd2Var2, pd2Var3, new pd2("icon", snaVar, zr4Var, zr4Var, listA03));
        d = listA04;
        pd2 pd2Var4 = new pd2("telContent", mb3Var2, zr4Var, zr4Var, zr4Var);
        pd2 pd2Var5 = new pd2("timelineModuleType", mb3Var2, zr4Var, zr4Var, zr4Var);
        sna snaVar2 = vp9.a;
        snaVar2.getClass();
        List<vd2> listA05 = u63.a0(pd2Var4, pd2Var5, new pd2("overrides", snaVar2, zr4Var, zr4Var, listA04), new pd2("data", mb3Var2, zr4Var, zr4Var, zr4Var));
        e = listA05;
        List<vd2> listA06 = u63.a0(new pd2("__typename", new ud2(mb3Var2), zr4Var, zr4Var, zr4Var), new qd2("TimelineModule", u63.Z("TimelineModule"), listA05));
        f = listA06;
        pd2 pd2Var6 = new pd2("id", new ud2(mb3Var), zr4Var, zr4Var, zr4Var);
        pd2 pd2Var7 = new pd2("author", rd2.a(gw2.a), zr4Var, zr4Var, listA0);
        sw2.a.getClass();
        pd2 pd2Var8 = new pd2("type", rd2.a(sw2.b), zr4Var, zr4Var, zr4Var);
        qw2.a.getClass();
        bw4 bw4Var2 = qw2.b;
        bw4Var2.getClass();
        pd2 pd2Var9 = new pd2("subType", bw4Var2, zr4Var, zr4Var, zr4Var);
        pd2 pd2Var10 = new pd2("messageBody", mb3Var2, zr4Var, zr4Var, zr4Var);
        jw2.a.getClass();
        bw4 bw4Var3 = jw2.b;
        bw4Var3.getClass();
        pd2 pd2Var11 = new pd2("messageContentFormat", bw4Var3, zr4Var, zr4Var, zr4Var);
        pd2 pd2Var12 = new pd2("cleanedMessageBody", mb3Var2, zr4Var, zr4Var, zr4Var);
        pd2 pd2Var13 = new pd2("publicationDateTime", rd2.a(qg3.a), zr4Var, zr4Var, zr4Var);
        pd2 pd2Var14 = new pd2("attachments", new ud2(new sd2(rd2.a(xu2.a))), zr4Var, zr4Var, listA02);
        h6g h6gVar = imf.a;
        h6gVar.getClass();
        md2 md2Var = fw2.a;
        hva.a aVar = hva.a.a;
        List<vd2> listA07 = u63.a0(pd2Var6, pd2Var7, pd2Var8, pd2Var9, pd2Var10, pd2Var11, pd2Var12, pd2Var13, pd2Var14, new pd2("timelineModuleResult", h6gVar, zr4Var, bg.f(md2Var, new hva.c(new wd2("timelineModuleResultInput"))), listA06), new pd2("__typename", new ud2(mb3Var2), zr4Var, zr4Var, zr4Var));
        g = listA07;
        mb3 mb3Var3 = zb6.a;
        List<vd2> listA08 = u63.a0(new pd2("hasNextPage", rd2.a(mb3Var3), zr4Var, zr4Var, zr4Var), new pd2("hasPreviousPage", new ud2(mb3Var3), zr4Var, zr4Var, zr4Var), new pd2("endCursor", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("startCursor", mb3Var2, zr4Var, zr4Var, zr4Var));
        h = listA08;
        List<vd2> listA09 = u63.a0(new pd2("events", new ud2(new sd2(rd2.a(fw2.b))), zr4Var, zr4Var, listA07), new pd2("pageInfo", rd2.a(j0b.a), zr4Var, zr4Var, listA08));
        i = listA09;
        pd2 pd2Var15 = new pd2("__typename", new ud2(mb3Var2), zr4Var, zr4Var, zr4Var);
        List listZ = u63.Z("Conversation");
        List<vd2> list = ew2.j;
        qd2 qd2VarB = s40.b(list, "Conversation", listZ, list);
        sna snaVar3 = tw2.a;
        snaVar3.getClass();
        List<vd2> listA010 = u63.a0(pd2Var15, qd2VarB, new pd2("eventsConnection", snaVar3, zr4Var, u63.a0(new ld2(wu2.c, new hva.c(new wd2("after"))), new ld2(wu2.e, new hva.c(new wd2("before"))), new ld2(wu2.b, new hva.c(new wd2("first"))), new ld2(wu2.d, new hva.c(new wd2("last")))), listA09), new pd2("id", new ud2(mb3Var), zr4Var, zr4Var, zr4Var));
        j = listA010;
        sna snaVar4 = wu2.f;
        snaVar4.getClass();
        k = ia.n("conversation", snaVar4, zr4Var, bg.f(d9c.b, new hva.c(new wd2("input"))), listA010);
    }
}
