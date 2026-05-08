package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.ifl.components.IdlToastKt$IdlToastInternal$6$2$1$1", f = "IdlToast.kt", l = {}, m = "invokeSuspend")
public final class qz6 extends c1f implements wu5<e13, Float, lu2<? super j6g>, Object> {
    final /* synthetic */ gu5<j6g> $dismissRequested;
    final /* synthetic */ x2a $offsetY$delegate;
    final /* synthetic */ vz6 $toastType;
    /* synthetic */ float F$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz6(vz6 vz6Var, gu5<j6g> gu5Var, x2a x2aVar, lu2<? super qz6> lu2Var) {
        super(3, lu2Var);
        this.$toastType = vz6Var;
        this.$dismissRequested = gu5Var;
        this.$offsetY$delegate = x2aVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        if (Math.abs(this.F$0) <= 10.0f && Math.abs(this.$offsetY$delegate.g()) <= 10.0f) {
            this.$offsetY$delegate.q(0.0f);
        } else if ((this.$toastType == vz6.b && this.$offsetY$delegate.g() < -100.0f) || (this.$toastType == vz6.a && this.$offsetY$delegate.g() > 100.0f)) {
            this.$dismissRequested.invoke();
        }
        return j6g.a;
    }

    @Override // defpackage.wu5
    public final Object q(e13 e13Var, Float f, lu2<? super j6g> lu2Var) {
        float fFloatValue = f.floatValue();
        qz6 qz6Var = new qz6(this.$toastType, this.$dismissRequested, this.$offsetY$delegate, lu2Var);
        qz6Var.F$0 = fFloatValue;
        return qz6Var.invokeSuspend(j6g.a);
    }
}
