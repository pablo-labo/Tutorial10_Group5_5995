package defpackage;

import defpackage.aga;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public final class jm6 extends pa1 {
    public final /* synthetic */ Future a;
    public final /* synthetic */ aga.a b;

    public jm6(Future future, aga.a aVar) {
        this.a = future;
        this.b = aVar;
    }

    @Override // defpackage.qpb
    public final void b() {
        if (this.a.cancel(false)) {
            this.b.a();
        }
    }
}
