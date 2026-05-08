package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1", f = "PullRefreshState.kt", l = {196}, m = "invokeSuspend")
public final class f7c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ float $offset;
    int label;
    final /* synthetic */ g7c this$0;

    @uh3(c = "androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1$1", f = "PullRefreshState.kt", l = {197}, m = "invokeSuspend")
    public static final class a extends c1f implements Function1<lu2<? super j6g>, Object> {
        final /* synthetic */ float $offset;
        int label;
        final /* synthetic */ g7c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g7c g7cVar, float f, lu2<? super a> lu2Var) {
            super(1, lu2Var);
            this.this$0 = g7cVar;
            this.$offset = f;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(lu2<?> lu2Var) {
            return new a(this.this$0, this.$offset, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(lu2<? super j6g> lu2Var) {
            return ((a) create(lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                float fG = ((cme) this.this$0.e).g();
                float f = this.$offset;
                zw4 zw4Var = new zw4(this.this$0, 4);
                this.label = 1;
                Object objC = x0f.c(fG, f, null, zw4Var, this, 12);
                g13 g13Var = g13.a;
                if (objC == g13Var) {
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
    public f7c(g7c g7cVar, float f, lu2<? super f7c> lu2Var) {
        super(2, lu2Var);
        this.this$0 = g7cVar;
        this.$offset = f;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new f7c(this.this$0, this.$offset, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((f7c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            g7c g7cVar = this.this$0;
            y4a y4aVar = g7cVar.i;
            a aVar = new a(g7cVar, this.$offset, null);
            this.label = 1;
            Object objB = y4a.b(y4aVar, aVar, this);
            g13 g13Var = g13.a;
            if (objB == g13Var) {
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
