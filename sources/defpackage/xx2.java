package defpackage;

import androidx.compose.runtime.b;
import com.indeed.android.messaging.data.conversations.ConversationWithDraft;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class xx2 implements xu5<xo8, Integer, b, Integer, j6g> {
    public final /* synthetic */ List a;
    public final /* synthetic */ List b;
    public final /* synthetic */ jta c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ wu5 e;
    public final /* synthetic */ Function1 f;

    public xx2(List list, List list2, jta jtaVar, Function1 function1, wu5 wu5Var, Function1 function12) {
        this.a = list;
        this.b = list2;
        this.c = jtaVar;
        this.d = function1;
        this.e = wu5Var;
        this.f = function12;
    }

    @Override // defpackage.xu5
    public final j6g j(xo8 xo8Var, Integer num, b bVar, Integer num2) throws Throwable {
        int i;
        xo8 xo8Var2 = xo8Var;
        int iIntValue = num.intValue();
        b bVar2 = bVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (bVar2.K(xo8Var2) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= bVar2.d(iIntValue) ? 32 : 16;
        }
        if (bVar2.o(i & 1, (i & 147) != 146)) {
            ConversationWithDraft conversationWithDraft = (ConversationWithDraft) this.a.get(iIntValue);
            bVar2.L(-1767378455);
            by2.b(xo8Var2.a(zd0.d(250, 0, null, 6), zd0.d(300, 0, null, 6), zd0.d(100, 0, null, 6)), conversationWithDraft.getConversation(), conversationWithDraft.getDraft(), this.c, this.d, this.e, this.f, iIntValue, this.b.size(), bVar2, ((i & 126) << 18) & 29360128);
            bVar2.F();
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
