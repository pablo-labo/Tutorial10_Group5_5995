package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.paging.FlowExtKt$simpleTransformLatest$1", f = "FlowExt.kt", l = {88}, m = "invokeSuspend")
public final class cj5 extends c1f implements Function2<cge<Object>, lu2<? super j6g>, Object> {
    final /* synthetic */ vi5<Object> $this_simpleTransformLatest;
    final /* synthetic */ wu5<wi5<Object>, Object, lu2<? super j6g>, Object> $transform;
    private /* synthetic */ Object L$0;
    int label;

    @uh3(c = "androidx.paging.FlowExtKt$simpleTransformLatest$1$1", f = "FlowExt.kt", l = {89}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<Object, lu2<? super j6g>, Object> {
        final /* synthetic */ b22<Object> $collector;
        final /* synthetic */ wu5<wi5<Object>, Object, lu2<? super j6g>, Object> $transform;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(wu5<? super wi5<Object>, Object, ? super lu2<? super j6g>, ? extends Object> wu5Var, b22<Object> b22Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$transform = wu5Var;
            this.$collector = b22Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.$transform, this.$collector, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, lu2<? super j6g> lu2Var) {
            return ((a) create(obj, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                Object obj2 = this.L$0;
                wu5<wi5<Object>, Object, lu2<? super j6g>, Object> wu5Var = this.$transform;
                b22<Object> b22Var = this.$collector;
                this.label = 1;
                Object objQ = wu5Var.q(b22Var, obj2, this);
                g13 g13Var = g13.a;
                if (objQ == g13Var) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public cj5(vi5<Object> vi5Var, wu5<? super wi5<Object>, Object, ? super lu2<? super j6g>, ? extends Object> wu5Var, lu2<? super cj5> lu2Var) {
        super(2, lu2Var);
        this.$this_simpleTransformLatest = vi5Var;
        this.$transform = wu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        cj5 cj5Var = new cj5(this.$this_simpleTransformLatest, this.$transform, lu2Var);
        cj5Var.L$0 = obj;
        return cj5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(cge<Object> cgeVar, lu2<? super j6g> lu2Var) {
        return ((cj5) create(cgeVar, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            cge cgeVar = (cge) this.L$0;
            vi5<Object> vi5Var = this.$this_simpleTransformLatest;
            a aVar = new a(this.$transform, new b22(cgeVar), null);
            this.label = 1;
            Object objQ = wg2.q(vi5Var, aVar, this);
            g13 g13Var = g13.a;
            if (objQ == g13Var) {
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
