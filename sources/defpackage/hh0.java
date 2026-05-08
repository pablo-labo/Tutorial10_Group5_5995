package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$readFromNetwork$1", f = "ApolloCacheInterceptor.kt", l = {265}, m = "invokeSuspend", v = 1)
public final class hh0 extends c1f implements Function2<sh0<Object>, lu2<? super j6g>, Object> {
    final /* synthetic */ lb3 $customScalarAdapters;
    final /* synthetic */ rh0<Object> $request;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ih0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh0(ih0 ih0Var, rh0<Object> rh0Var, lb3 lb3Var, lu2<? super hh0> lu2Var) {
        super(2, lu2Var);
        this.this$0 = ih0Var;
        this.$request = rh0Var;
        this.$customScalarAdapters = lb3Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        hh0 hh0Var = new hh0(this.this$0, this.$request, this.$customScalarAdapters, lu2Var);
        hh0Var.L$0 = obj;
        return hh0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(sh0<Object> sh0Var, lu2<? super j6g> lu2Var) {
        return ((hh0) create(sh0Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            sh0 sh0Var = (sh0) this.L$0;
            ih0 ih0Var = this.this$0;
            rh0<Object> rh0Var = this.$request;
            lb3 lb3Var = this.$customScalarAdapters;
            this.label = 1;
            Object objB = ih0Var.b(rh0Var, sh0Var, lb3Var, is4.a, this);
            g13 g13Var = g13.a;
            if (objB == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        return j6g.a;
    }
}
