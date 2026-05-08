package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.inbox.InboxViewModel$switchToFolder$1", f = "InboxViewModel.kt", l = {139}, m = "invokeSuspend")
public final class y67 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ w47 $folder;
    int label;
    final /* synthetic */ u67 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y67(w47 w47Var, u67 u67Var, lu2<? super y67> lu2Var) {
        super(2, lu2Var);
        this.$folder = w47Var;
        this.this$0 = u67Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new y67(this.$folder, this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((y67) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        Object value;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            if (this.$folder == this.this$0.f.getValue()) {
                return j6g.a;
            }
            gse gseVar = this.this$0.X;
            do {
                value = gseVar.getValue();
            } while (!gseVar.h(value, t67.a((t67) value, Boolean.TRUE, false, null, null, null, 62)));
            gse gseVar2 = this.this$0.f;
            w47 w47Var = this.$folder;
            this.label = 1;
            gseVar2.setValue(w47Var);
            j6g j6gVar = j6g.a;
            g13 g13Var = g13.a;
            if (j6gVar == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        u67.g(this.this$0);
        return j6g.a;
    }
}
