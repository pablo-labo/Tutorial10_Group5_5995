package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.utils.ProfileRUMErrorTrackingModifierKt$trackProfileRUMError$1$1$1", f = "ProfileRUMErrorTrackingModifier.kt", l = {}, m = "invokeSuspend")
public final class mub extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ String $errorMessage;
    final /* synthetic */ gu5<String> $errorMessageProvider;
    final /* synthetic */ oub $errorType;
    final /* synthetic */ boolean $isErrorPresented;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mub(boolean z, gu5<String> gu5Var, String str, oub oubVar, lu2<? super mub> lu2Var) {
        super(2, lu2Var);
        this.$isErrorPresented = z;
        this.$errorMessageProvider = gu5Var;
        this.$errorMessage = str;
        this.$errorType = oubVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new mub(this.$isErrorPresented, this.$errorMessageProvider, this.$errorMessage, this.$errorType, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((mub) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        if (this.$isErrorPresented && c0h.C()) {
            gu5<String> gu5Var = this.$errorMessageProvider;
            String str = this.$errorMessage;
            if (gu5Var != null) {
                str = str + ": " + ((Object) gu5Var.invoke());
            }
            dg3.e(str, this.$errorType);
        }
        return j6g.a;
    }
}
