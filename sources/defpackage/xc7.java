package defpackage;

import defpackage.hva;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class xc7 {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;
    public static final List<vd2> d;
    public static final List<vd2> e;
    public static final List<vd2> f;
    public static final List<vd2> g;
    public static final List<vd2> h;
    public static final List<vd2> i;

    static {
        mb3 mb3Var = oc6.a;
        mb3Var.getClass();
        zr4 zr4Var = zr4.a;
        List<vd2> listA0 = u63.a0(new pd2("firstName", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("lastName", mb3Var, zr4Var, zr4Var, zr4Var));
        a = listA0;
        pd2 pd2Var = new pd2("emailAddress", rd2.a(bq4.a), zr4Var, zr4Var, zr4Var);
        mb3 mb3Var2 = yb6.a;
        List<vd2> listA02 = u63.a0(pd2Var, new pd2("isVerified", rd2.a(mb3Var2), zr4Var, zr4Var, zr4Var));
        b = listA02;
        sna snaVar = a7.a;
        snaVar.getClass();
        pd2 pd2Var2 = new pd2("accountName", snaVar, zr4Var, zr4Var, listA0);
        sna snaVar2 = aq4.a;
        snaVar2.getClass();
        List<vd2> listA03 = u63.a0(pd2Var2, new pd2("email", snaVar2, zr4Var, zr4Var, listA02));
        c = listA03;
        sna snaVar3 = b7.a;
        snaVar3.getClass();
        List<vd2> listA04 = u63.a0(new pd2("accountProfile", snaVar3, zr4Var, zr4Var, listA03), new pd2("id", rd2.a(gc6.a), zr4Var, zr4Var, zr4Var), new pd2("accountId", rd2.a(vg7.a), zr4Var, zr4Var, zr4Var), new pd2("emailAddress", new ud2(mb3Var), zr4Var, zr4Var, zr4Var), new pd2("isConfirmed", new ud2(mb3Var2), zr4Var, zr4Var, zr4Var), new pd2("isSignedIn", new ud2(mb3Var2), zr4Var, zr4Var, zr4Var), new pd2("creationDate", rd2.a(omf.a), zr4Var, zr4Var, zr4Var));
        d = listA04;
        List<vd2> listA05 = u63.a0(new pd2("__typename", new ud2(mb3Var), zr4Var, zr4Var, zr4Var), new qd2("PassportAccount", u63.Z("PassportAccount"), listA04));
        e = listA05;
        ji7 ji7Var = z6.a;
        ji7Var.getClass();
        List<vd2> listZ = u63.Z(new pd2("account", ji7Var, zr4Var, zr4Var, listA05));
        f = listZ;
        mb3 mb3Var3 = kc6.a;
        List<vd2> listM = k20.m("globalUnreadEventCount", rd2.a(mb3Var3), zr4Var, zr4Var, zr4Var);
        g = listM;
        List<vd2> listM2 = k20.m("unreadConversationCount", new ud2(mb3Var3), zr4Var, zr4Var, zr4Var);
        h = listM2;
        sna snaVar4 = e93.a;
        snaVar4.getClass();
        pd2 pd2Var3 = new pd2("currentUser", snaVar4, zr4Var, zr4Var, listZ);
        sna snaVar5 = i06.a;
        snaVar5.getClass();
        md2 md2Var = h9c.e;
        hva.a aVar = hva.a.a;
        pd2 pd2Var4 = new pd2("getGlobalUnreadEventCount", snaVar5, zr4Var, bg.f(md2Var, new hva.c(kc9.W(new Pair("conversationFilter", kc9.W(new Pair("excludedLabels", u63.a0("JS_MSG_FOLDER/ARCHIVE", "JS_MSG_FOLDER/SPAM"))))))), listM);
        sna snaVar6 = f66.a;
        snaVar6.getClass();
        i = u63.a0(pd2Var3, pd2Var4, new pd2("getUnreadConversationCount", snaVar6, zr4Var, bg.f(h9c.f, new hva.c(kc9.W(new Pair("conversationFilter", kc9.W(new Pair("excludedLabels", u63.a0("JS_MSG_FOLDER/ARCHIVE", "JS_MSG_FOLDER/SPAM"))))))), listM2));
    }
}
