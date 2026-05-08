package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.conversation.details.ParticipantListKt$ParticipantListHeader$2$1$1$1$1", f = "ParticipantList.kt", l = {135}, m = "invokeSuspend")
public final class x4b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ fe1 $basicTooltipState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4b(fe1 fe1Var, lu2<? super x4b> lu2Var) {
        super(2, lu2Var);
        this.$basicTooltipState = fe1Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new x4b(this.$basicTooltipState, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((x4b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            fe1 fe1Var = this.$basicTooltipState;
            this.label = 1;
            Object objB = fe1Var.b(n4a.a, this);
            g13 g13Var = g13.a;
            if (objB == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        return j6g.a;
    }
}
