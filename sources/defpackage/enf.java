package defpackage;

import app.rive.runtime.kotlin.renderers.RendererMetrics;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.common.toast.ToastViewModel$showToast$1$1$1", f = "ToastViewModel.kt", l = {RendererMetrics.SAMPLES}, m = "invokeSuspend")
public final class enf extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ Function2<h4a<dnf>, lu2<? super j6g>, Object> $onActionClicked;
    int label;
    final /* synthetic */ fnf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public enf(Function2<? super h4a<dnf>, ? super lu2<? super j6g>, ? extends Object> function2, fnf fnfVar, lu2<? super enf> lu2Var) {
        super(2, lu2Var);
        this.$onActionClicked = function2;
        this.this$0 = fnfVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new enf(this.$onActionClicked, this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((enf) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            Function2<h4a<dnf>, lu2<? super j6g>, Object> function2 = this.$onActionClicked;
            if (function2 != null) {
                gse gseVar = this.this$0.b;
                this.label = 1;
                Object objInvoke = function2.invoke(gseVar, this);
                g13 g13Var = g13.a;
                if (objInvoke == g13Var) {
                    return g13Var;
                }
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
