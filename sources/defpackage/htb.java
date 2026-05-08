package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfilePreferencesViewModel$loadSdcPreferences$1", f = "ProfilePreferencesViewModel.kt", l = {218}, m = "invokeSuspend")
public final class htb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ gu5<j6g> $onComplete;
    int label;
    final /* synthetic */ aub this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public htb(aub aubVar, gu5<j6g> gu5Var, lu2<? super htb> lu2Var) {
        super(2, lu2Var);
        this.this$0 = aubVar;
        this.$onComplete = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new htb(this.this$0, this.$onComplete, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((htb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            aub aubVar = this.this$0;
            this.label = 1;
            Object objO = aubVar.o(this);
            g13 g13Var = g13.a;
            if (objO == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        this.$onComplete.invoke();
        return j6g.a;
    }
}
