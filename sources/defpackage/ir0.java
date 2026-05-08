package defpackage;

import defpackage.hf3;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.presentation.tabs.AppliedTabViewModel$ensurePageToken$state$1", f = "AppliedTabViewModel.kt", l = {}, m = "invokeSuspend")
public final class ir0 extends c1f implements Function2<hf3<String>, lu2<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        ir0 ir0Var = new ir0(2, lu2Var);
        ir0Var.L$0 = obj;
        return ir0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(hf3<String> hf3Var, lu2<? super Boolean> lu2Var) {
        return ((ir0) create(hf3Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        hf3 hf3Var = (hf3) this.L$0;
        if (this.label == 0) {
            r7d.b(obj);
            return Boolean.valueOf(!(hf3Var instanceof hf3.b));
        }
        r6.g("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
