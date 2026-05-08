package defpackage;

import androidx.compose.runtime.d;
import androidx.compose.runtime.m;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class wne implements Iterator<Object>, ze8 {
    public final m a;
    public final int b;
    public final qd6 c;
    public final int d;
    public int e;

    public wne(m mVar, int i, qd6 qd6Var, v1 v1Var) {
        this.a = mVar;
        this.b = i;
        this.c = qd6Var;
        this.d = mVar.W;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        ArrayList<Object> arrayList = this.c.a;
        return arrayList != null && this.e < arrayList.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        ArrayList<Object> arrayList = this.c.a;
        if (arrayList != null) {
            int i = this.e;
            this.e = i + 1;
            obj = arrayList.get(i);
        } else {
            obj = null;
        }
        boolean z = obj instanceof x20;
        m mVar = this.a;
        if (z) {
            return new fke(mVar, ((x20) obj).a, this.d);
        }
        if (obj instanceof qd6) {
            return new xne(mVar, this.b, (qd6) obj, new uyc());
        }
        d.d("Unexpected group information structure");
        r40.e();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
