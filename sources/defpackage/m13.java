package defpackage;

import android.os.CancellationSignal;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class m13 implements Function1<Throwable, j6g> {
    public final /* synthetic */ CancellationSignal a;
    public final /* synthetic */ uqe b;

    public m13(CancellationSignal cancellationSignal, uqe uqeVar) {
        this.a = cancellationSignal;
        this.b = uqeVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(Throwable th) {
        CancellationSignal cancellationSignal = this.a;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
        }
        this.b.h(null);
        return j6g.a;
    }
}
