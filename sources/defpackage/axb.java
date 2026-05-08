package defpackage;

import defpackage.hva;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfileSectionsViewModel$updateSummary$1", f = "ProfileSectionsViewModel.kt", l = {280}, m = "invokeSuspend")
public final class axb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ String $newSummary;
    final /* synthetic */ gu5<j6g> $onComplete;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ yvb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axb(lu2 lu2Var, gu5 gu5Var, yvb yvbVar, String str) {
        super(2, lu2Var);
        this.this$0 = yvbVar;
        this.$newSummary = str;
        this.$onComplete = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        axb axbVar = new axb(lu2Var, this.$onComplete, this.this$0, this.$newSummary);
        axbVar.L$0 = obj;
        return axbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((axb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        yvb yvbVar;
        Object objW;
        gu5<j6g> gu5Var;
        e13 e13Var = (e13) this.L$0;
        g13 g13Var = g13.a;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            String str = this.this$0.v().a;
            if (str != null) {
                yvbVar = this.this$0;
                String str2 = this.$newSummary;
                gu5<j6g> gu5Var2 = this.$onComplete;
                ((gme) yvbVar.e).setValue(b5g.b);
                zcd zcdVar = yvbVar.b;
                h48 h48Var = new h48(str, null, null, null, null, null, null, null, null, new hva.c(str2), -2050);
                this.L$0 = e13Var;
                this.L$1 = yvbVar;
                this.L$2 = gu5Var2;
                this.L$3 = null;
                this.I$0 = 0;
                this.label = 1;
                objW = zcdVar.W(h48Var, this);
                if (objW == g13Var) {
                    return g13Var;
                }
                gu5Var = gu5Var2;
            }
            return j6g.a;
        }
        if (i != 1) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        gu5Var = (gu5) this.L$2;
        yvb yvbVar2 = (yvb) this.L$1;
        r7d.b(obj);
        yvbVar = yvbVar2;
        objW = obj;
        String str3 = (String) objW;
        if (str3 != null) {
            synchronized (e13Var) {
                ((gme) yvbVar.d).setValue(svb.a(yvbVar.v(), null, str3, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -3, 8388607));
                j6g j6gVar = j6g.a;
            }
            ((gme) yvbVar.e).setValue(b5g.a);
            gu5Var.invoke();
        } else {
            ((gme) yvbVar.e).setValue(b5g.c);
        }
        return j6g.a;
    }
}
