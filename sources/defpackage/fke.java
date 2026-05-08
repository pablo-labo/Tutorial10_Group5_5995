package defpackage;

import androidx.compose.runtime.m;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class fke implements fm2, Iterable<Object>, ze8 {
    public final m a;
    public final int b;
    public final int c;

    public fke(m mVar, int i, int i2) {
        this.a = mVar;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        m mVar = this.a;
        if (mVar.W != this.c) {
            gke.e();
        }
        int i = this.b;
        qd6 qd6VarI = mVar.i(i);
        return qd6VarI != null ? new wne(mVar, i, qd6VarI, new e40()) : new pd6(mVar, i + 1, mVar.a[(i * 5) + 3] + i);
    }
}
