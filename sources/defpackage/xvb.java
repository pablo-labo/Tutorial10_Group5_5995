package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfileSectionsViewModel$addNewEducation$1$1", f = "ProfileSectionsViewModel.kt", l = {1506, 1543}, m = "invokeSuspend")
public final class xvb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ go4 $educationItem;
    final /* synthetic */ String $indeedResumeId;
    final /* synthetic */ gu5<j6g> $onComplete;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ yvb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xvb(yvb yvbVar, go4 go4Var, String str, gu5<j6g> gu5Var, lu2<? super xvb> lu2Var) {
        super(2, lu2Var);
        this.this$0 = yvbVar;
        this.$educationItem = go4Var;
        this.$indeedResumeId = str;
        this.$onComplete = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        xvb xvbVar = new xvb(this.this$0, this.$educationItem, this.$indeedResumeId, this.$onComplete, lu2Var);
        xvbVar.L$0 = obj;
        return xvbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((xvb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x020a  */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r63) {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xvb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
