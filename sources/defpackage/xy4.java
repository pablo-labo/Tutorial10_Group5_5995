package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.selected.conversation.components.EventListKt$EventList$7$1$1", f = "EventList.kt", l = {265}, m = "invokeSuspend")
public final class xy4 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ g4a<Boolean> $atBottomDetectedAfterAutoScroll$delegate;
    final /* synthetic */ ss8 $listState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy4(ss8 ss8Var, g4a<Boolean> g4aVar, lu2<? super xy4> lu2Var) {
        super(2, lu2Var);
        this.$listState = ss8Var;
        this.$atBottomDetectedAfterAutoScroll$delegate = g4aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new xy4(this.$listState, this.$atBottomDetectedAfterAutoScroll$delegate, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((xy4) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            ss8 ss8Var = this.$listState;
            this.label = 1;
            Object objK = ss8.k(ss8Var, 0, this);
            g13 g13Var = g13.a;
            if (objK == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        this.$atBottomDetectedAfterAutoScroll$delegate.setValue(Boolean.FALSE);
        return j6g.a;
    }
}
