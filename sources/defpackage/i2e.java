package defpackage;

import com.indeed.android.messaging.data.conversations.ConversationRecord;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.selected.conversation.SelectedConversationViewModel$onRestoreFromComposeBoxClicked$1", f = "SelectedConversationViewModel.kt", l = {450}, m = "invokeSuspend")
public final class i2e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ y1e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2e(lu2 lu2Var, y1e y1eVar) {
        super(2, lu2Var);
        this.this$0 = y1eVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new i2e(lu2Var, this.this$0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((i2e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        Object value;
        y1e y1eVar;
        Object value2;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            ConversationRecord conversationRecord = ((x1e) this.this$0.d0.getValue()).a;
            if (conversationRecord != null) {
                y1e y1eVar2 = this.this$0;
                gse gseVar = y1eVar2.c0;
                do {
                    value = gseVar.getValue();
                } while (!gseVar.h(value, x1e.a((x1e) value, null, null, false, false, false, null, false, false, true, null, null, null, null, false, false, null, false, false, 0, null, null, null, null, false, null, 67108607)));
                h02 h02Var = y1eVar2.d;
                this.L$0 = y1eVar2;
                this.L$1 = null;
                this.I$0 = 0;
                this.label = 1;
                Object objA = h02Var.a(conversationRecord, p12.d, null, this);
                g13 g13Var = g13.a;
                if (objA == g13Var) {
                    return g13Var;
                }
                y1eVar = y1eVar2;
            }
            return j6g.a;
        }
        if (i != 1) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y1eVar = (y1e) this.L$0;
        r7d.b(obj);
        gse gseVar2 = y1eVar.c0;
        do {
            value2 = gseVar2.getValue();
        } while (!gseVar2.h(value2, x1e.a((x1e) value2, null, null, false, false, false, null, false, false, false, null, null, null, null, false, false, null, false, false, 0, null, null, null, null, false, null, 67108607)));
        return j6g.a;
    }
}
