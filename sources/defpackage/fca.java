package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.backendservices.data.navigationmenu.NavMenuRepositoryImpl", f = "NavMenuRepository.kt", l = {88, 89, 96, 97, 102, 103, 108, 109, 116, 117}, m = "cacheNavMenuResponse")
public final class fca extends pu2 {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ hca this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fca(hca hcaVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = hcaVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.i(null, false, this);
    }
}
