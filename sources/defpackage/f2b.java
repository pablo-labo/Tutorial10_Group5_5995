package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.pager.PagerState$scrollToPage$2", f = "PagerState.kt", l = {509}, m = "invokeSuspend")
public final class f2b extends c1f implements Function2<xrd, lu2<? super j6g>, Object> {
    final /* synthetic */ int $page;
    final /* synthetic */ float $pageOffsetFraction;
    int label;
    final /* synthetic */ e2b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2b(e2b e2bVar, float f, int i, lu2<? super f2b> lu2Var) {
        super(2, lu2Var);
        this.this$0 = e2bVar;
        this.$pageOffsetFraction = f;
        this.$page = i;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new f2b(this.this$0, this.$pageOffsetFraction, this.$page, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xrd xrdVar, lu2<? super j6g> lu2Var) {
        return ((f2b) create(xrdVar, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            e2b e2bVar = this.this$0;
            this.label = 1;
            Object objA = e2bVar.w.a(this);
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
        float f = this.$pageOffsetFraction;
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            de7.a("pageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        this.this$0.w(this.$pageOffsetFraction, this.this$0.j(this.$page), true);
        return j6g.a;
    }
}
