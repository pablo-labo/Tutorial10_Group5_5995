package androidx.compose.material3.internal;

import androidx.compose.runtime.r;
import defpackage.c1f;
import defpackage.e13;
import defpackage.ex7;
import defpackage.f13;
import defpackage.g13;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.kjd;
import defpackage.lu2;
import defpackage.luc;
import defpackage.pu2;
import defpackage.r6;
import defpackage.r7d;
import defpackage.uh3;
import defpackage.wi5;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", l = {715}, m = "invokeSuspend")
public final class c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ Function2<Object, lu2<? super j6g>, Object> $block;
    final /* synthetic */ gu5<Object> $inputs;
    private /* synthetic */ Object L$0;
    int label;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ luc<ex7> a;
        public final /* synthetic */ e13 b;
        public final /* synthetic */ Function2<Object, lu2<? super j6g>, Object> c;

        /* JADX INFO: renamed from: androidx.compose.material3.internal.c$a$a, reason: collision with other inner class name */
        @uh3(c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", l = {722}, m = "invokeSuspend")
        public static final class C0019a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ e13 $$this$coroutineScope;
            final /* synthetic */ Function2<Object, lu2<? super j6g>, Object> $block;
            final /* synthetic */ Object $latestInputs;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0019a(Function2<Object, ? super lu2<? super j6g>, ? extends Object> function2, Object obj, e13 e13Var, lu2<? super C0019a> lu2Var) {
                super(2, lu2Var);
                this.$block = function2;
                this.$latestInputs = obj;
                this.$$this$coroutineScope = e13Var;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new C0019a(this.$block, this.$latestInputs, this.$$this$coroutineScope, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((C0019a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
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

        @uh3(c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1", f = "AnchoredDraggable.kt", l = {718}, m = "emit")
        public static final class b extends pu2 {
            Object L$0;
            Object L$1;
            Object L$2;
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
        public final java.lang.Object a(java.lang.Object r5, defpackage.lu2<? super defpackage.j6g> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof androidx.compose.material3.internal.c.a.b
                if (r0 == 0) goto L13
                r0 = r6
                androidx.compose.material3.internal.c$a$b r0 = (androidx.compose.material3.internal.c.a.b) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.material3.internal.c$a$b r0 = new androidx.compose.material3.internal.c$a$b
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                int r1 = r0.label
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L36
                if (r1 != r3) goto L30
                java.lang.Object r4 = r0.L$2
                ex7 r4 = (defpackage.ex7) r4
                java.lang.Object r5 = r0.L$1
                java.lang.Object r4 = r0.L$0
                androidx.compose.material3.internal.c$a r4 = (androidx.compose.material3.internal.c.a) r4
                defpackage.r7d.b(r6)
                goto L5a
            L30:
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r4)
                return r2
            L36:
                defpackage.r7d.b(r6)
                luc<ex7> r6 = r4.a
                T r6 = r6.element
                ex7 r6 = (defpackage.ex7) r6
                if (r6 == 0) goto L5a
                androidx.compose.material3.internal.AnchoredDragFinishedSignal r1 = new androidx.compose.material3.internal.AnchoredDragFinishedSignal
                r1.<init>()
                r6.h(r1)
                r0.L$0 = r4
                r0.L$1 = r5
                r0.L$2 = r6
                r0.label = r3
                java.lang.Object r6 = r6.s0(r0)
                g13 r0 = defpackage.g13.a
                if (r6 != r0) goto L5a
                return r0
            L5a:
                luc<ex7> r6 = r4.a
                e13 r0 = r4.b
                androidx.compose.material3.internal.c$a$a r1 = new androidx.compose.material3.internal.c$a$a
                kotlin.jvm.functions.Function2<java.lang.Object, lu2<? super j6g>, java.lang.Object> r4 = r4.c
                r1.<init>(r4, r5, r0, r2)
                i13 r4 = defpackage.i13.d
                uqe r4 = defpackage.u63.Y(r0, r2, r4, r1, r3)
                r6.element = r4
                j6g r4 = defpackage.j6g.a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.c.a.a(java.lang.Object, lu2):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(gu5<Object> gu5Var, Function2<Object, ? super lu2<? super j6g>, ? extends Object> function2, lu2<? super c> lu2Var) {
        super(2, lu2Var);
        this.$inputs = gu5Var;
        this.$block = function2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        c cVar = new c(this.$inputs, this.$block, lu2Var);
        cVar.L$0 = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
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
