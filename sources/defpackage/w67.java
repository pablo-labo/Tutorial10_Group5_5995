package defpackage;

import com.indeed.android.messaging.data.conversations.ConversationsRepository;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.inbox.InboxViewModel$loadMoreConversations$1", f = "InboxViewModel.kt", l = {124}, m = "invokeSuspend")
public final class w67 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ u67 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w67(lu2 lu2Var, u67 u67Var) {
        super(2, lu2Var);
        this.this$0 = u67Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new w67(lu2Var, this.this$0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((w67) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        u67 u67Var;
        gse gseVar;
        Object value;
        Object value2;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            String str = ((t67) this.this$0.X.getValue()).c;
            if (str != null) {
                u67 u67Var2 = this.this$0;
                try {
                    ConversationsRepository conversationsRepository = u67Var2.b;
                    w47 w47Var = (w47) u67Var2.f.getValue();
                    this.L$0 = u67Var2;
                    this.L$1 = null;
                    this.I$0 = 0;
                    this.label = 1;
                    obj = conversationsRepository.loadConversationListNextPage(w47Var, str, this);
                    g13 g13Var = g13.a;
                    if (obj == g13Var) {
                        return g13Var;
                    }
                    u67Var = u67Var2;
                } catch (Throwable unused) {
                    u67Var = u67Var2;
                    gseVar = u67Var.X;
                    do {
                        value = gseVar.getValue();
                    } while (!gseVar.h(value, t67.a((t67) value, null, true, null, null, null, 61)));
                }
            }
            return j6g.a;
        }
        if (i != 1) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        u67Var = (u67) this.L$0;
        try {
            r7d.b(obj);
        } catch (Throwable unused2) {
            gseVar = u67Var.X;
            do {
                value = gseVar.getValue();
            } while (!gseVar.h(value, t67.a((t67) value, null, true, null, null, null, 61)));
        }
        String str2 = (String) obj;
        gse gseVar2 = u67Var.X;
        do {
            value2 = gseVar2.getValue();
        } while (!gseVar2.h(value2, t67.a((t67) value2, null, false, str2, null, null, 59)));
        return j6g.a;
    }
}
