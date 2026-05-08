package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfileSectionsViewModel$addMilitaryService$1$1", f = "ProfileSectionsViewModel.kt", l = {609, 624}, m = "invokeSuspend")
public final class tvb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ mt9 $militaryServiceItem;
    final /* synthetic */ gu5<j6g> $onComplete;
    final /* synthetic */ String $resumeId;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ yvb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tvb(yvb yvbVar, mt9 mt9Var, String str, gu5<j6g> gu5Var, lu2<? super tvb> lu2Var) {
        super(2, lu2Var);
        this.this$0 = yvbVar;
        this.$militaryServiceItem = mt9Var;
        this.$resumeId = str;
        this.$onComplete = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        tvb tvbVar = new tvb(this.this$0, this.$militaryServiceItem, this.$resumeId, this.$onComplete, lu2Var);
        tvbVar.L$0 = obj;
        return tvbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((tvb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018f  */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r66) {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tvb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
