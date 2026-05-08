package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", l = {521}, m = "invokeSuspend")
public final class o30 extends c1f implements Function1<lu2<? super j6g>, Object> {
    final /* synthetic */ wu5<y20, oa4<Object>, lu2<? super j6g>, Object> $block;
    int label;
    final /* synthetic */ q30<Object> this$0;

    public static final class a extends mj8 implements gu5<oa4<Object>> {
        final /* synthetic */ q30<Object> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q30<Object> q30Var) {
            super(0);
            this.this$0 = q30Var;
        }

        @Override // defpackage.gu5
        public final oa4<Object> invoke() {
            return this.this$0.e();
        }
    }

    @uh3(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", l = {522}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<oa4<Object>, lu2<? super j6g>, Object> {
        final /* synthetic */ wu5<y20, oa4<Object>, lu2<? super j6g>, Object> $block;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ q30<Object> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q30 q30Var, lu2 lu2Var, wu5 wu5Var) {
            super(2, lu2Var);
            this.$block = wu5Var;
            this.this$0 = q30Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            b bVar = new b(this.this$0, lu2Var, this.$block);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(oa4<Object> oa4Var, lu2<? super j6g> lu2Var) {
            return ((b) create(oa4Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                oa4<Object> oa4Var = (oa4) this.L$0;
                wu5<y20, oa4<Object>, lu2<? super j6g>, Object> wu5Var = this.$block;
                t30 t30Var = this.this$0.o;
                this.label = 1;
                Object objQ = wu5Var.q(t30Var, oa4Var, this);
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
    public o30(q30 q30Var, lu2 lu2Var, wu5 wu5Var) {
        super(1, lu2Var);
        this.this$0 = q30Var;
        this.$block = wu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new o30(this.this$0, lu2Var, this.$block);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super j6g> lu2Var) {
        return ((o30) create(lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            a aVar = new a(this.this$0);
            b bVar = new b(this.this$0, null, this.$block);
            this.label = 1;
            Object objA = androidx.compose.material3.internal.a.a(aVar, bVar, this);
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
