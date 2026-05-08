package defpackage;

import defpackage.agg;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfileViewModel$savePrivacyElection$1", f = "ProfileViewModel.kt", l = {891}, m = "invokeSuspend")
public final class h2c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ tnb $actionError;
    final /* synthetic */ tnb $actionSuccess;
    final /* synthetic */ String $newStatus;
    final /* synthetic */ gu5<j6g> $onFailedSave;
    final /* synthetic */ gu5<j6g> $onSuccessfulSave;
    final /* synthetic */ zfg $sourcingElectionInput;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ x1c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2c(x1c x1cVar, zfg zfgVar, tnb tnbVar, String str, gu5<j6g> gu5Var, tnb tnbVar2, gu5<j6g> gu5Var2, lu2<? super h2c> lu2Var) {
        super(2, lu2Var);
        this.this$0 = x1cVar;
        this.$sourcingElectionInput = zfgVar;
        this.$actionSuccess = tnbVar;
        this.$newStatus = str;
        this.$onSuccessfulSave = gu5Var;
        this.$actionError = tnbVar2;
        this.$onFailedSave = gu5Var2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        h2c h2cVar = new h2c(this.this$0, this.$sourcingElectionInput, this.$actionSuccess, this.$newStatus, this.$onSuccessfulSave, this.$actionError, this.$onFailedSave, lu2Var);
        h2cVar.L$0 = obj;
        return h2cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((h2c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        agg.c cVar;
        e13 e13Var = (e13) this.L$0;
        int i = this.label;
        r48 r48Var = null;
        if (i == 0) {
            r7d.b(obj);
            zcd zcdVar = this.this$0.c;
            zfg zfgVar = this.$sourcingElectionInput;
            this.L$0 = e13Var;
            this.label = 1;
            obj = zcdVar.Y(zfgVar, this);
            g13 g13Var = g13.a;
            if (obj == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        agg.a aVar = (agg.a) obj;
        if (aVar != null) {
            x1c x1cVar = this.this$0;
            tnb tnbVar = this.$actionSuccess;
            String str = this.$newStatus;
            gu5<j6g> gu5Var = this.$onSuccessfulSave;
            agg.b bVar = aVar.a;
            if (bVar != null && (cVar = bVar.a) != null) {
                r48Var = cVar.a;
            }
            x1cVar.G(r48Var);
            dg3.d(tnbVar.a(), kc9.W(new Pair("new_status", str)));
            gu5Var.invoke();
        } else {
            tnb tnbVar2 = this.$actionError;
            String str2 = this.$newStatus;
            gu5<j6g> gu5Var2 = this.$onFailedSave;
            dg3.d(tnbVar2.a(), lc9.a0(new Pair("new_status", str2), new Pair("error_message", "Privacy update response was null")));
            gu5Var2.invoke();
        }
        return j6g.a;
    }
}
