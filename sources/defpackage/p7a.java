package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.MyJobsScreenKt$MyJobsScreen$filters$1$2$1$1", f = "MyJobsScreen.kt", l = {405}, m = "invokeSuspend")
public final class p7a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ e2b $pagerState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7a(e2b e2bVar, lu2<? super p7a> lu2Var) {
        super(2, lu2Var);
        this.$pagerState = e2bVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new p7a(this.$pagerState, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((p7a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            e2b e2bVar = this.$pagerState;
            this.label = 1;
            Object objF = e2bVar.f(0, zd0.c(0.0f, null, 7), this);
            g13 g13Var = g13.a;
            if (objF == g13Var) {
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
