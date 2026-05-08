package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.backendservices.data.urlregistry.UrlRegistryRepositoryImpl", f = "UrlRegistryRepository.kt", l = {38, 46}, m = "updateUrlRegistry")
public final class pig extends pu2 {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ qig this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pig(qig qigVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = qigVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, null, null, null, this);
    }
}
