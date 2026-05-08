package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.backendservices.data.urlregistry.UrlRegistryRepositoryImpl", f = "UrlRegistryRepository.kt", l = {61, 62}, m = "cacheUrlRegistryResponse")
public final class oig extends pu2 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ qig this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oig(qig qigVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = qigVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, null, this);
    }
}
