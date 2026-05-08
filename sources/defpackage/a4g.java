package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.uiplugin.topnav.UIPTopNavBarKt$UIPTopNavBar$1$1", f = "UIPTopNavBar.kt", l = {167}, m = "invokeSuspend")
public final class a4g extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ g4a<Boolean> $visible$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4g(g4a<Boolean> g4aVar, lu2<? super a4g> lu2Var) {
        super(2, lu2Var);
        this.$visible$delegate = g4aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new a4g(this.$visible$delegate, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((a4g) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            this.label = 1;
            Object objB = ls3.b(50L, this);
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
        g4a<Boolean> g4aVar = this.$visible$delegate;
        jte jteVar = b4g.a;
        g4aVar.setValue(Boolean.TRUE);
        return j6g.a;
    }
}
