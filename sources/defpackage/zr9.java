package defpackage;

import com.indeed.android.messaging.data.MessagingDatabase;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.MessagingPlugin$userDidLogout$2", f = "MessagingPlugin.kt", l = {}, m = "invokeSuspend")
public final class zr9 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new zr9(2, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((zr9) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        ((MessagingDatabase) pq9.a.getValue()).d();
        return j6g.a;
    }
}
