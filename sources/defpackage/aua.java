package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.linecorp.linesdk.openchat.ui.OpenChatInfoViewModel$checkAgreementStatus$1", f = "OpenChatInfoViewModel.kt", l = {66}, m = "invokeSuspend")
public final class aua extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ gua this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aua(gua guaVar, lu2<? super aua> lu2Var) {
        super(2, lu2Var);
        this.this$0 = guaVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new aua(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((aua) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            r7d.b(obj);
            gua guaVar = this.this$0;
            this.label = 1;
            obj = gua.g(guaVar, this);
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
        ww8 ww8Var = (ww8) obj;
        g3a<Boolean> g3aVar = this.this$0.a0;
        if (ww8Var.d() && ((Boolean) ww8Var.c()).booleanValue()) {
            z = false;
        }
        g3aVar.j(Boolean.valueOf(z));
        return j6g.a;
    }
}
