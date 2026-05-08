package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfileSectionsViewModel$addNewAward$1$1", f = "ProfileSectionsViewModel.kt", l = {1108, 1121}, m = "invokeSuspend")
public final class vvb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ d18 $awardInputDateType;
    final /* synthetic */ m61 $awardItem;
    final /* synthetic */ gu5<j6g> $onComplete;
    final /* synthetic */ String $resumeId;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ yvb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vvb(yvb yvbVar, String str, m61 m61Var, d18 d18Var, gu5<j6g> gu5Var, lu2<? super vvb> lu2Var) {
        super(2, lu2Var);
        this.this$0 = yvbVar;
        this.$resumeId = str;
        this.$awardItem = m61Var;
        this.$awardInputDateType = d18Var;
        this.$onComplete = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        vvb vvbVar = new vvb(this.this$0, this.$resumeId, this.$awardItem, this.$awardInputDateType, this.$onComplete, lu2Var);
        vvbVar.L$0 = obj;
        return vvbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((vvb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017a  */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r66) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vvb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
