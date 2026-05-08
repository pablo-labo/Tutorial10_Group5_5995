package defpackage;

import android.util.Base64;
import com.indeed.android.messaging.data.conversations.ConversationRecord;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.report.spam.ReportSpamViewModel$reportSpam$2$2$1", f = "ReportSpamViewModel.kt", l = {54}, m = "invokeSuspend")
public final class h3d extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ ConversationRecord $conversation;
    final /* synthetic */ f3d $currentState;
    final /* synthetic */ String $reportType;
    int label;
    final /* synthetic */ i3d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3d(i3d i3dVar, ConversationRecord conversationRecord, String str, f3d f3dVar, lu2<? super h3d> lu2Var) {
        super(2, lu2Var);
        this.this$0 = i3dVar;
        this.$conversation = conversationRecord;
        this.$reportType = str;
        this.$currentState = f3dVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new h3d(this.this$0, this.$conversation, this.$reportType, this.$currentState, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((h3d) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            dq9 dq9Var = this.this$0.b;
            String id = this.$conversation.getId();
            String str = this.$reportType;
            String str2 = this.$currentState.c;
            this.label = 1;
            lh2 lh2Var = new lh2(12, (byte) 0);
            dq9Var.getClass();
            id.getClass();
            byte[] bytes = "CONVERSATION_SERVICE_ENCRYPTED///".concat(id).getBytes(a32.b);
            bytes.getClass();
            String strEncodeToString = Base64.encodeToString(bytes, 2);
            strEncodeToString.getClass();
            obj = dq9Var.r(new ds9(dq9Var, strEncodeToString, str, str2, null), lh2Var, this);
            g13 g13Var = g13.a;
            if (obj == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        boolean zD = ((wg0) obj).d();
        i3d i3dVar = this.this$0;
        if (zD) {
            gse gseVar = i3dVar.d;
            do {
                value2 = gseVar.getValue();
            } while (!gseVar.h(value2, f3d.a((f3d) value2, null, null, null, Boolean.TRUE, false, 79)));
        } else {
            gse gseVar2 = i3dVar.d;
            do {
                value = gseVar2.getValue();
            } while (!gseVar2.h(value, f3d.a((f3d) value, null, null, null, Boolean.FALSE, false, 79)));
        }
        return j6g.a;
    }
}
