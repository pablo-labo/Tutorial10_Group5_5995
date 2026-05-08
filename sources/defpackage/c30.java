package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1", f = "AnchoredDraggable.kt", l = {}, m = "invokeSuspend")
public final class c30 extends c1f implements wu5<e13, Float, lu2<? super j6g>, Object> {
    final /* synthetic */ d40<Object> $state;
    /* synthetic */ float F$0;
    private /* synthetic */ Object L$0;
    int label;

    @uh3(c = "androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1$1", f = "AnchoredDraggable.kt", l = {180}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ d40<Object> $state;
        final /* synthetic */ float $velocity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d40<Object> d40Var, float f, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$state = d40Var;
            this.$velocity = f;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$state, this.$velocity, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                d40<Object> d40Var = this.$state;
                float f = this.$velocity;
                this.label = 1;
                Object objI = d40Var.i(f, this);
                g13 g13Var = g13.a;
                if (objI == g13Var) {
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
    public c30(d40<Object> d40Var, lu2<? super c30> lu2Var) {
        super(3, lu2Var);
        this.$state = d40Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        u63.Y((e13) this.L$0, null, null, new a(this.$state, this.F$0, null), 3);
        return j6g.a;
    }

    @Override // defpackage.wu5
    public final Object q(e13 e13Var, Float f, lu2<? super j6g> lu2Var) {
        float fFloatValue = f.floatValue();
        c30 c30Var = new c30(this.$state, lu2Var);
        c30Var.L$0 = e13Var;
        c30Var.F$0 = fFloatValue;
        return c30Var.invokeSuspend(j6g.a);
    }
}
