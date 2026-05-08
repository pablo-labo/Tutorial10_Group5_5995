package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfileSectionsViewModel$onAddWorkExperience$1", f = "ProfileSectionsViewModel.kt", l = {357, 364}, m = "invokeSuspend")
public final class uwb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ g2h $item;
    final /* synthetic */ gu5<j6g> $onComplete;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ yvb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uwb(yvb yvbVar, g2h g2hVar, gu5<j6g> gu5Var, lu2<? super uwb> lu2Var) {
        super(2, lu2Var);
        this.this$0 = yvbVar;
        this.$item = g2hVar;
        this.$onComplete = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        uwb uwbVar = new uwb(this.this$0, this.$item, this.$onComplete, lu2Var);
        uwbVar.L$0 = obj;
        return uwbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((uwb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0217  */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r68) {
        /*
            Method dump skipped, instruction units count: 569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uwb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
