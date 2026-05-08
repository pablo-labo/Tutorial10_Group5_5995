package defpackage;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", l = {572}, m = "invokeSuspend")
public final class s30 extends c1f implements Function1<lu2<? super j6g>, Object> {
    final /* synthetic */ xu5<z20, pa4<Object>, Object, lu2<? super j6g>, Object> $block;
    final /* synthetic */ Object $targetValue;
    int label;
    final /* synthetic */ d40<Object> this$0;

    @uh3(c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", l = {574}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<Pair<? extends pa4<Object>, Object>, lu2<? super j6g>, Object> {
        final /* synthetic */ xu5<z20, pa4<Object>, Object, lu2<? super j6g>, Object> $block;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ d40<Object> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(xu5<? super z20, ? super pa4<Object>, Object, ? super lu2<? super j6g>, ? extends Object> xu5Var, d40<Object> d40Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$block = xu5Var;
            this.this$0 = d40Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.$block, this.this$0, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Pair<? extends pa4<Object>, Object> pair, lu2<? super j6g> lu2Var) {
            return ((a) create(pair, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                Pair pair = (Pair) this.L$0;
                pa4<Object> pa4Var = (pa4) pair.a();
                Object objB = pair.b();
                xu5<z20, pa4<Object>, Object, lu2<? super j6g>, Object> xu5Var = this.$block;
                u30 u30Var = this.this$0.n;
                this.label = 1;
                Object objJ = xu5Var.j(u30Var, pa4Var, objB, this);
                g13 g13Var = g13.a;
                if (objJ == g13Var) {
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
    public s30(d40<Object> d40Var, Object obj, xu5<? super z20, ? super pa4<Object>, Object, ? super lu2<? super j6g>, ? extends Object> xu5Var, lu2<? super s30> lu2Var) {
        super(1, lu2Var);
        this.this$0 = d40Var;
        this.$targetValue = obj;
        this.$block = xu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new s30(this.this$0, this.$targetValue, this.$block, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super j6g> lu2Var) {
        return ((s30) create(lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            d40<Object> d40Var = this.this$0;
            ((gme) d40Var.l).setValue(this.$targetValue);
            d40<Object> d40Var2 = this.this$0;
            ye yeVar = new ye(d40Var2, 2);
            a aVar = new a(this.$block, d40Var2, null);
            this.label = 1;
            Object objA = e30.a(yeVar, aVar, this);
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
