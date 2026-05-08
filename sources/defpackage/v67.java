package defpackage;

import com.indeed.android.messaging.data.conversations.ConversationWithDraft;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.inbox.InboxViewModel$loadData$2", f = "InboxViewModel.kt", l = {105, 114}, m = "invokeSuspend")
public final class v67 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ gu5<j6g> $isCompleted;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ u67 this$0;

    @uh3(c = "com.indeed.android.messaging.ui.inbox.InboxViewModel$loadData$2$4", f = "InboxViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<List<? extends ConversationWithDraft>, lu2<? super j6g>, Object> {
        final /* synthetic */ e13 $$this$launch;
        int label;
        final /* synthetic */ u67 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u67 u67Var, e13 e13Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.this$0 = u67Var;
            this.$$this$launch = e13Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.this$0, this.$$this$launch, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(List<? extends ConversationWithDraft> list, lu2<? super j6g> lu2Var) {
            return ((a) create(list, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            Object value;
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            gse gseVar = this.this$0.X;
            do {
                value = gseVar.getValue();
            } while (!gseVar.h(value, t67.a((t67) value, Boolean.FALSE, false, null, null, null, 62)));
            f13.c(this.$$this$launch, null);
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v67(u67 u67Var, gu5<j6g> gu5Var, lu2<? super v67> lu2Var) {
        super(2, lu2Var);
        this.this$0 = u67Var;
        this.$isCompleted = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        v67 v67Var = new v67(this.this$0, this.$isCompleted, lu2Var);
        v67Var.L$0 = obj;
        return v67Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((v67) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c8, code lost:
    
        if (defpackage.wg2.q(r1, r2, r17) == r9) goto L28;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v67.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
