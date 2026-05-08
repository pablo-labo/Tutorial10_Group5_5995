package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.rnbridge.ProfileTabContentProviderImpl$ResumeTabContent$2$1", f = "ProfileTabContentProviderImpl.kt", l = {206}, m = "invokeSuspend")
public final class xxb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ gu5<j6g> $onContentChanged;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xxb(gu5<j6g> gu5Var, lu2<? super xxb> lu2Var) {
        super(2, lu2Var);
        this.$onContentChanged = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new xxb(this.$onContentChanged, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((xxb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            this.label = 1;
            Object objB = ls3.b(500L, this);
            g13 g13Var = g13.a;
            if (objB == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        this.$onContentChanged.invoke();
        return j6g.a;
    }
}
