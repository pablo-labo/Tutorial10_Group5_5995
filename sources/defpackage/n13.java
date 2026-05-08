package defpackage;

import defpackage.o7d;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", f = "CoroutinesRoom.android.kt", l = {}, m = "invokeSuspend")
public final class n13 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ Callable<Object> $callable;
    final /* synthetic */ pw1<Object> $continuation;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n13(Callable<Object> callable, pw1<Object> pw1Var, lu2<? super n13> lu2Var) {
        super(2, lu2Var);
        this.$callable = callable;
        this.$continuation = pw1Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new n13(this.$callable, this.$continuation, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((n13) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        try {
            this.$continuation.resumeWith(this.$callable.call());
        } catch (Throwable th) {
            this.$continuation.resumeWith(new o7d.a(th));
        }
        return j6g.a;
    }
}
