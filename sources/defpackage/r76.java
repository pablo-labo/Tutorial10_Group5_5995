package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.ghostwriter.services.GhostwriterImpl$1", f = "GhostwriterImpl.kt", l = {36}, m = "invokeSuspend")
public final class r76 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ x76 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r76(x76 x76Var, lu2<? super r76> lu2Var) {
        super(2, lu2Var);
        this.this$0 = x76Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new r76(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((r76) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            x76 x76Var = this.this$0;
            this.label = 1;
            Object objF = x76Var.f(this);
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
