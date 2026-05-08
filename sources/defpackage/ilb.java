package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.screens.PreferencesSubTabScreenKt$PreferencesSubTabScreen$1$1", f = "PreferencesSubTabScreen.kt", l = {}, m = "invokeSuspend")
public final class ilb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ boolean $isProfileFragmentActive;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ilb(boolean z, lu2<? super ilb> lu2Var) {
        super(2, lu2Var);
        this.$isProfileFragmentActive = z;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new ilb(this.$isProfileFragmentActive, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((ilb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        if (this.$isProfileFragmentActive) {
            dg3.g(dg3.c(rxb.b));
        }
        return j6g.a;
    }
}
