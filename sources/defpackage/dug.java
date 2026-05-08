package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "com.apollographql.apollo.cache.normalized.internal.WatcherInterceptorKt$flattenConcatPolyfill$1", f = "WatcherInterceptor.kt", l = {71}, m = "invokeSuspend", v = 1)
public final class dug extends c1f implements Function2<wi5<Object>, lu2<? super j6g>, Object> {
    final /* synthetic */ vi5<vi5<Object>> $this_flattenConcatPolyfill;
    private /* synthetic */ Object L$0;
    int label;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ wi5<T> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(wi5<? super T> wi5Var) {
            this.a = wi5Var;
        }

        @Override // defpackage.wi5
        public final Object a(Object obj, lu2 lu2Var) throws Throwable {
            Object objX = wg2.x(this.a, (vi5) obj, lu2Var);
            return objX == g13.a ? objX : j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public dug(vi5<? extends vi5<Object>> vi5Var, lu2<? super dug> lu2Var) {
        super(2, lu2Var);
        this.$this_flattenConcatPolyfill = vi5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        dug dugVar = new dug(this.$this_flattenConcatPolyfill, lu2Var);
        dugVar.L$0 = obj;
        return dugVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wi5<Object> wi5Var, lu2<? super j6g> lu2Var) {
        return ((dug) create(wi5Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            wi5 wi5Var = (wi5) this.L$0;
            vi5<vi5<Object>> vi5Var = this.$this_flattenConcatPolyfill;
            a aVar = new a(wi5Var);
            this.label = 1;
            Object objE = vi5Var.e(aVar, this);
            g13 g13Var = g13.a;
            if (objE == g13Var) {
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
