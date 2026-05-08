package defpackage;

import com.datadog.android.rum.internal.debug.UiRumDebugListener;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$interceptQuery$1", f = "ApolloCacheInterceptor.kt", l = {198, UiRumDebugListener.DEFAULT_ALPHA}, m = "invokeSuspend", v = 1)
public final class eh0 extends c1f implements Function2<wi5<? super sh0<Object>>, lu2<? super j6g>, Object> {
    final /* synthetic */ qh0 $chain;
    final /* synthetic */ lb3 $customScalarAdapters;
    final /* synthetic */ boolean $fetchFromCache;
    final /* synthetic */ rh0<Object> $request;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ih0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh0(boolean z, ih0 ih0Var, rh0<Object> rh0Var, lb3 lb3Var, qh0 qh0Var, lu2<? super eh0> lu2Var) {
        super(2, lu2Var);
        this.$fetchFromCache = z;
        this.this$0 = ih0Var;
        this.$request = rh0Var;
        this.$customScalarAdapters = lb3Var;
        this.$chain = qh0Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        eh0 eh0Var = new eh0(this.$fetchFromCache, this.this$0, this.$request, this.$customScalarAdapters, this.$chain, lu2Var);
        eh0Var.L$0 = obj;
        return eh0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wi5<? super sh0<Object>> wi5Var, lu2<? super j6g> lu2Var) {
        return ((eh0) create(wi5Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ad, code lost:
    
        if (r5.a(r9, r18) == r8) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e6, code lost:
    
        if (r0 == r8) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e8, code lost:
    
        return r8;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eh0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
