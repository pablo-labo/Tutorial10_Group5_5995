package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.paging.compose.LazyPagingItems$collectPagingData$2", f = "LazyPagingItems.kt", l = {179}, m = "invokeSuspend")
public final class ys8 extends c1f implements Function2<l2b<Object>, lu2<? super j6g>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ at8<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys8(at8<Object> at8Var, lu2<? super ys8> lu2Var) {
        super(2, lu2Var);
        this.this$0 = at8Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        ys8 ys8Var = new ys8(this.this$0, lu2Var);
        ys8Var.L$0 = obj;
        return ys8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(l2b<Object> l2bVar, lu2<? super j6g> lu2Var) {
        return ((ys8) create(l2bVar, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            l2b l2bVar = (l2b) this.L$0;
            zs8 zs8Var = this.this$0.c;
            this.label = 1;
            Object objA = zs8Var.f.a(0, new p2b(zs8Var, l2bVar, null), this);
            g13 g13Var = g13.a;
            if (objA != g13Var) {
                objA = j6g.a;
            }
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
