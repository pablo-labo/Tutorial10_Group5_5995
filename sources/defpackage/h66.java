package defpackage;

import defpackage.hva;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class h66 {
    public static final List<vd2> a;
    public static final List<vd2> b;

    static {
        ud2 ud2VarA = rd2.a(kc6.a);
        zr4 zr4Var = zr4.a;
        List<vd2> listM = k20.m("unreadConversationCount", ud2VarA, zr4Var, zr4Var, zr4Var);
        a = listM;
        sna snaVar = f66.a;
        snaVar.getClass();
        md2 md2Var = h9c.f;
        hva.a aVar = hva.a.a;
        b = ia.n("getUnreadConversationCount", snaVar, zr4Var, bg.f(md2Var, new hva.c(kc9.W(new Pair("conversationFilter", kc9.W(new Pair("excludedLabels", u63.a0("JS_MSG_FOLDER/ARCHIVE", "JS_MSG_FOLDER/SPAM"))))))), listM);
    }
}
