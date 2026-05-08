package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "com.apollographql.apollo.network.http.HttpNetworkTransport$execute$1", f = "HttpNetworkTransport.kt", l = {71, 107}, m = "invokeSuspend", v = 1)
public final class vl6 extends c1f implements Function2<wi5<? super sh0<Object>>, lu2<? super j6g>, Object> {
    final /* synthetic */ lb3 $customScalarAdapters;
    final /* synthetic */ yl6 $httpRequest;
    final /* synthetic */ rh0<Object> $request;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ tl6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl6(tl6 tl6Var, yl6 yl6Var, rh0<Object> rh0Var, lb3 lb3Var, lu2<? super vl6> lu2Var) {
        super(2, lu2Var);
        this.this$0 = tl6Var;
        this.$httpRequest = yl6Var;
        this.$request = rh0Var;
        this.$customScalarAdapters = lb3Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        vl6 vl6Var = new vl6(this.this$0, this.$httpRequest, this.$request, this.$customScalarAdapters, lu2Var);
        vl6Var.L$0 = obj;
        return vl6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wi5<? super sh0<Object>> wi5Var, lu2<? super j6g> lu2Var) {
        return ((vl6) create(wi5Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0173, code lost:
    
        if (r0 == r5) goto L65;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vl6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
