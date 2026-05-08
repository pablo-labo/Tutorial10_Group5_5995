package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.activity.compose.OnBackInstance$job$1", f = "PredictiveBackHandler.kt", l = {121}, m = "invokeSuspend")
public final class upa extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ wpa $callback;
    final /* synthetic */ Function2<vi5<f71>, lu2<? super j6g>, Object> $onBack;
    Object L$0;
    int label;
    final /* synthetic */ vpa this$0;

    @uh3(c = "androidx.activity.compose.OnBackInstance$job$1$1", f = "PredictiveBackHandler.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements wu5<wi5<? super f71>, Throwable, lu2<? super j6g>, Object> {
        final /* synthetic */ huc $completed;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(huc hucVar, lu2<? super a> lu2Var) {
            super(3, lu2Var);
            this.$completed = hucVar;
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            this.$completed.element = true;
            return j6g.a;
        }

        @Override // defpackage.wu5
        public final Object q(wi5<? super f71> wi5Var, Throwable th, lu2<? super j6g> lu2Var) {
            return new a(this.$completed, lu2Var).invokeSuspend(j6g.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public upa(wpa wpaVar, Function2<? super vi5<f71>, ? super lu2<? super j6g>, ? extends Object> function2, vpa vpaVar, lu2<? super upa> lu2Var) {
        super(2, lu2Var);
        this.$callback = wpaVar;
        this.$onBack = function2;
        this.this$0 = vpaVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new upa(this.$callback, this.$onBack, this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((upa) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        huc hucVar;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            if (this.$callback.a) {
                huc hucVar2 = new huc();
                Function2<vi5<f71>, lu2<? super j6g>, Object> function2 = this.$onBack;
                lj5 lj5Var = new lj5(wg2.t(this.this$0.b), new a(hucVar2, null));
                this.L$0 = hucVar2;
                this.label = 1;
                Object objInvoke = function2.invoke(lj5Var, this);
                g13 g13Var = g13.a;
                if (objInvoke == g13Var) {
                    return g13Var;
                }
                hucVar = hucVar2;
            }
            return j6g.a;
        }
        if (i != 1) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hucVar = (huc) this.L$0;
        r7d.b(obj);
        if (!hucVar.element) {
            r6.g("You must collect the progress flow");
            return null;
        }
        return j6g.a;
    }
}
