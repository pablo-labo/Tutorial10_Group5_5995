package defpackage;

import java.io.IOException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class e90 implements ga0 {
    public final zze a;

    public e90(zze zzeVar) {
        zzeVar.getClass();
        this.a = zzeVar;
    }

    @Override // defpackage.ga0
    public final long b() {
        return this.a.J();
    }

    @Override // defpackage.ga0
    public final <R> R c(Function1<? super wpe, ? extends l9c<R>> function1) {
        function1.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ga0
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // defpackage.bqe
    public final void n(int i, String str) {
        zze zzeVar = this.a;
        int i2 = i + 1;
        if (str == null) {
            zzeVar.u(i2);
        } else {
            zzeVar.n(i2, str);
        }
    }
}
