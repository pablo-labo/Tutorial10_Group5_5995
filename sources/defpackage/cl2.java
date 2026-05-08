package defpackage;

import android.os.CancellationSignal;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class cl2 extends mj8 implements Function1<Throwable, j6g> {
    final /* synthetic */ CancellationSignal $signal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl2(CancellationSignal cancellationSignal) {
        super(1);
        this.$signal = cancellationSignal;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(Throwable th) {
        if (th != null) {
            this.$signal.cancel();
        }
        return j6g.a;
    }
}
