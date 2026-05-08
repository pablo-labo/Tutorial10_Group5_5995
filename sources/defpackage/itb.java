package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfilePreferencesViewModel$removePreferredJobTitles$1", f = "ProfilePreferencesViewModel.kt", l = {451}, m = "invokeSuspend")
public final class itb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ Function1<is7, j6g> $onComplete;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ aub this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public itb(aub aubVar, Function1<? super is7, j6g> function1, lu2<? super itb> lu2Var) {
        super(2, lu2Var);
        this.this$0 = aubVar;
        this.$onComplete = function1;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        itb itbVar = new itb(this.this$0, this.$onComplete, lu2Var);
        itbVar.L$0 = obj;
        return itbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((itb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        e13 e13Var = (e13) this.L$0;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            ((gme) this.this$0.e).setValue(b5g.b);
            String str = this.this$0.l().o;
            aub aubVar = this.this$0;
            if (str != null) {
                Function1<is7, j6g> function1 = this.$onComplete;
                this.L$0 = e13Var;
                this.L$1 = null;
                this.I$0 = 0;
                this.label = 1;
                Object objG = aub.g(aubVar, zr4.a, str, function1, this);
                g13 g13Var = g13.a;
                if (objG == g13Var) {
                    return g13Var;
                }
            } else {
                ((gme) aubVar.e).setValue(b5g.a);
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
