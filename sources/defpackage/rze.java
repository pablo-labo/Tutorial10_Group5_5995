package defpackage;

import java.io.IOException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class rze implements qo2 {
    public final hc0 a;

    public rze(hc0 hc0Var) {
        this.a = hc0Var;
    }

    @Override // defpackage.qo2
    public final Object F0(boolean z, Function2 function2, pu2 pu2Var) {
        tze tzeVar = (tze) this.a.b;
        tzeVar.getDatabaseName();
        return function2.invoke(new uze(new qze(tzeVar.getWritableDatabase())), pu2Var);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        ((tze) this.a.b).close();
    }
}
