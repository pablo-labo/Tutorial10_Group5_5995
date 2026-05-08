package defpackage;

import com.indeed.android.messaging.data.conversations.ConversationRecord;
import defpackage.o12;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.report.spam.ReportSpamViewModel$moveToSpam$1", f = "ReportSpamViewModel.kt", l = {73}, m = "invokeSuspend")
public final class g3d extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ i3d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3d(i3d i3dVar, lu2<? super g3d> lu2Var) {
        super(2, lu2Var);
        this.this$0 = i3dVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new g3d(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((g3d) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        Object value;
        i3d i3dVar;
        Object value2;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            ConversationRecord conversationRecord = ((f3d) this.this$0.d.getValue()).a;
            if (conversationRecord != null) {
                i3d i3dVar2 = this.this$0;
                gse gseVar = i3dVar2.d;
                do {
                    value = gseVar.getValue();
                } while (!gseVar.h(value, f3d.a((f3d) value, null, null, null, null, false, 119)));
                h02 h02Var = i3dVar2.c;
                this.L$0 = i3dVar2;
                this.L$1 = null;
                this.I$0 = 0;
                this.label = 1;
                obj = h02Var.a(conversationRecord, p12.c, w47.SPAM, this);
                g13 g13Var = g13.a;
                if (obj == g13Var) {
                    return g13Var;
                }
                i3dVar = i3dVar2;
            }
            return j6g.a;
        }
        if (i != 1) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i3dVar = (i3d) this.L$0;
        r7d.b(obj);
        o12 o12Var = (o12) obj;
        gse gseVar2 = i3dVar.d;
        do {
            value2 = gseVar2.getValue();
        } while (!gseVar2.h(value2, f3d.a((f3d) value2, null, null, Boolean.valueOf(o12Var instanceof o12.b), null, false, 87)));
        return j6g.a;
    }
}
