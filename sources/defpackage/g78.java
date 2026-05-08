package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.screens.sheets.preferences.JobTitlePreferencesBottomSheet$getUpdatedPreferences$1", f = "JobTitlePreferencesBottomSheet.kt", l = {83}, m = "invokeSuspend")
public final class g78 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ h78 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g78(h78 h78Var, lu2<? super g78> lu2Var) {
        super(2, lu2Var);
        this.this$0 = h78Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new g78(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((g78) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            aub aubVarR = this.this$0.R();
            this.label = 1;
            Object objO = aubVarR.o(this);
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
        ((gme) this.this$0.R().e).setValue(b5g.a);
        return j6g.a;
    }
}
