package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", l = {524}, m = "invokeSuspend")
public final class p30 extends c1f implements Function1<lu2<? super j6g>, Object> {
    final /* synthetic */ wu5<z20, pa4<Object>, lu2<? super j6g>, Object> $block;
    int label;
    final /* synthetic */ d40<Object> this$0;

    @uh3(c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", l = {525}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<pa4<Object>, lu2<? super j6g>, Object> {
        final /* synthetic */ wu5<z20, pa4<Object>, lu2<? super j6g>, Object> $block;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ d40<Object> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d40 d40Var, lu2 lu2Var, wu5 wu5Var) {
            super(2, lu2Var);
            this.$block = wu5Var;
            this.this$0 = d40Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.this$0, lu2Var, this.$block);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(pa4<Object> pa4Var, lu2<? super j6g> lu2Var) {
            return ((a) create(pa4Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                pa4<Object> pa4Var = (pa4) this.L$0;
                wu5<z20, pa4<Object>, lu2<? super j6g>, Object> wu5Var = this.$block;
                u30 u30Var = this.this$0.n;
                this.label = 1;
                Object objQ = wu5Var.q(u30Var, pa4Var, this);
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
    public p30(d40 d40Var, lu2 lu2Var, wu5 wu5Var) {
        super(1, lu2Var);
        this.this$0 = d40Var;
        this.$block = wu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new p30(this.this$0, lu2Var, this.$block);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super j6g> lu2Var) {
        return ((p30) create(lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            d40<Object> d40Var = this.this$0;
            n30 n30Var = new n30(d40Var, 0);
            a aVar = new a(d40Var, null, this.$block);
            this.label = 1;
            Object objA = e30.a(n30Var, aVar, this);
            g13 g13Var = g13.a;
            if (objA == g13Var) {
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
