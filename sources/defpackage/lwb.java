package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfileSectionsViewModel$dismissSkillsSuggestions$1", f = "ProfileSectionsViewModel.kt", l = {2991}, m = "invokeSuspend")
public final class lwb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ yvb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lwb(yvb yvbVar, lu2<? super lwb> lu2Var) {
        super(2, lu2Var);
        this.this$0 = yvbVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new lwb(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((lwb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            c0g c0gVar = this.this$0.c;
            this.label = 1;
            Object objA = c0gVar.a(this);
            g13 g13Var = g13.a;
            if (objA == g13Var) {
                return g13Var;
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
