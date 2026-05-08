package defpackage;

import defpackage.xh8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.bottomnav.web.IanWebViewController$setupWebView$newWebViewClient$3$2", f = "IanWebViewController.kt", l = {129}, m = "invokeSuspend")
public final class lq6 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ mq6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq6(mq6 mq6Var, lu2<? super lq6> lu2Var) {
        super(2, lu2Var);
        this.this$0 = mq6Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new lq6(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((lq6) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        qpd qpdVarD;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            xh8 xh8Var = this.this$0;
            if (xh8Var instanceof ai8) {
                qpdVarD = ((ai8) xh8Var).d();
            } else {
                xh8Var.getClass();
                qpdVarD = (qpd) xh8.a.a().a.b;
            }
            w1g w1gVar = (w1g) qpdVarD.a(null, fwc.a.b(w1g.class), null);
            j7 j7Var = new j7(4);
            this.label = 1;
            Object objF = w1gVar.f(j7Var, this);
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
