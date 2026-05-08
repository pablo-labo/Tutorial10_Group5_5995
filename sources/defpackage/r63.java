package defpackage;

import android.os.CancellationSignal;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class r63 extends mj8 implements Function1<Throwable, j6g> {
    final /* synthetic */ CancellationSignal $canceller;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r63(CancellationSignal cancellationSignal) {
        super(1);
        this.$canceller = cancellationSignal;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(Throwable th) {
        this.$canceller.cancel();
        return j6g.a;
    }
}
