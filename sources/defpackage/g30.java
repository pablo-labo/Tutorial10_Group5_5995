package defpackage;

import androidx.compose.material.AnchoredDragFinishedSignal;
import androidx.compose.runtime.r;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.material.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", l = {718}, m = "invokeSuspend")
public final class g30 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ Function2<Object, lu2<? super j6g>, Object> $block;
    final /* synthetic */ gu5<Object> $inputs;
    private /* synthetic */ Object L$0;
    int label;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ luc<ex7> a;
        public final /* synthetic */ e13 b;
        public final /* synthetic */ Function2<Object, lu2<? super j6g>, Object> c;

        /* JADX INFO: renamed from: g30$a$a, reason: collision with other inner class name */
        @uh3(c = "androidx.compose.material.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", l = {725}, m = "invokeSuspend")
        public static final class C0246a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ e13 $$this$coroutineScope;
            final /* synthetic */ Function2<Object, lu2<? super j6g>, Object> $block;
            final /* synthetic */ Object $latestInputs;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0246a(Function2<Object, ? super lu2<? super j6g>, ? extends Object> function2, Object obj, e13 e13Var, lu2<? super C0246a> lu2Var) {
                super(2, lu2Var);
                this.$block = function2;
                this.$latestInputs = obj;
                this.$$this$coroutineScope = e13Var;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new C0246a(this.$block, this.$latestInputs, this.$$this$coroutineScope, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((C0246a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i == 0) {
                    r7d.b(obj);
                    Function2<Object, lu2<? super j6g>, Object> function2 = this.$block;
                    Object obj2 = this.$latestInputs;
                    this.label = 1;
                    Object objInvoke = function2.invoke(obj2, this);
                    g13 g13Var = g13.a;
                    if (objInvoke == g13Var) {
                        return g13Var;
                    }
                } else {
                    if (i != 1) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7d.b(obj);
                }
                f13.c(this.$$this$coroutineScope, new AnchoredDragFinishedSignal());
                return j6g.a;
            }
        }

        @uh3(c = "androidx.compose.material.AnchoredDraggableKt$restartable$2$1", f = "AnchoredDraggable.kt", l = {721}, m = "emit")
        public static final class b extends pu2 {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ a<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(a<? super T> aVar, lu2<? super b> lu2Var) {
                super(lu2Var);
                this.this$0 = aVar;
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.a(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(luc<ex7> lucVar, e13 e13Var, Function2<Object, ? super lu2<? super j6g>, ? extends Object> function2) {
            this.a = lucVar;
            this.b = e13Var;
            this.c = function2;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // defpackage.wi5
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(java.lang.Object r6, defpackage.lu2<? super defpackage.j6g> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof g30.a.b
                if (r0 == 0) goto L13
                r0 = r7
                g30$a$b r0 = (g30.a.b) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                g30$a$b r0 = new g30$a$b
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.result
                int r1 = r0.label
                r2 = 0
                luc<ex7> r3 = r5.a
                r4 = 1
                if (r1 == 0) goto L34
                if (r1 != r4) goto L2e
                java.lang.Object r6 = r0.L$1
                ex7 r6 = (defpackage.ex7) r6
                java.lang.Object r6 = r0.L$0
                defpackage.r7d.b(r7)
                goto L54
            L2e:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r5)
                return r2
            L34:
                defpackage.r7d.b(r7)
                T r7 = r3.element
                ex7 r7 = (defpackage.ex7) r7
                if (r7 == 0) goto L54
                androidx.compose.material.AnchoredDragFinishedSignal r1 = new androidx.compose.material.AnchoredDragFinishedSignal
                r1.<init>()
                r7.h(r1)
                r0.L$0 = r6
                r0.L$1 = r7
                r0.label = r4
                java.lang.Object r7 = r7.s0(r0)
                g13 r0 = defpackage.g13.a
                if (r7 != r0) goto L54
                return r0
            L54:
                g30$a$a r7 = new g30$a$a
                kotlin.jvm.functions.Function2<java.lang.Object, lu2<? super j6g>, java.lang.Object> r0 = r5.c
                e13 r5 = r5.b
                r7.<init>(r0, r6, r5, r2)
                i13 r6 = defpackage.i13.d
                uqe r5 = defpackage.u63.Y(r5, r2, r6, r7, r4)
                r3.element = r5
                j6g r5 = defpackage.j6g.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: g30.a.a(java.lang.Object, lu2):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g30(gu5<Object> gu5Var, Function2<Object, ? super lu2<? super j6g>, ? extends Object> function2, lu2<? super g30> lu2Var) {
        super(2, lu2Var);
        this.$inputs = gu5Var;
        this.$block = function2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        g30 g30Var = new g30(this.$inputs, this.$block, lu2Var);
        g30Var.L$0 = obj;
        return g30Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((g30) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            e13 e13Var = (e13) this.L$0;
            luc lucVar = new luc();
            kjd kjdVarH = r.h(this.$inputs);
            a aVar = new a(lucVar, e13Var, this.$block);
            this.label = 1;
            Object objE = kjdVarH.e(aVar, this);
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
