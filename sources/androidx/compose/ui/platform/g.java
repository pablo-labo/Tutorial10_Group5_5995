package androidx.compose.ui.platform;

import defpackage.c1f;
import defpackage.e13;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r6;
import defpackage.r7d;
import defpackage.uh3;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1$1", f = "Wrapper.android.kt", l = {136}, m = "invokeSuspend")
public final class g extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, lu2<? super g> lu2Var) {
        super(2, lu2Var);
        this.this$0 = kVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new g(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((g) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            AndroidComposeView androidComposeView = this.this$0.a;
            this.label = 1;
            Object objL = androidComposeView.m0.l(this);
            g13 g13Var = g13.a;
            if (objL != g13Var) {
                objL = j6g.a;
            }
            if (objL == g13Var) {
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
