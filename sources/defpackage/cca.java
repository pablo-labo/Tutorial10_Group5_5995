package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.backendservices.data.navigationmenu.NavMenuRemoteDataSource", f = "NavMenuRemoteDataSource.kt", l = {17}, m = "fetchNavMenu$backendservices_release")
public final class cca extends pu2 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ dca this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cca(dca dcaVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = dcaVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, this);
    }
}
