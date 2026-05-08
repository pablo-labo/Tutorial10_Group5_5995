package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2", f = "ForEachGesture.kt", l = {75}, m = "invokeSuspend")
public final class yo5 extends n7d implements Function2<l61, lu2<? super j6g>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        yo5 yo5Var = new yo5(2, lu2Var);
        yo5Var.L$0 = obj;
        return yo5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(l61 l61Var, lu2<? super j6g> lu2Var) {
        return ((yo5) create(l61Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            l61 l61Var = (l61) this.L$0;
            this.label = 1;
            Object objB = ap5.b(l61Var, peb.c, this);
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
