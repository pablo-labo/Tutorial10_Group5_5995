package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class r6i implements Iterator {
    public int a = -1;
    public boolean b;
    public Iterator c;
    public final /* synthetic */ y5i d;

    public r6i(y5i y5iVar) {
        this.d = y5iVar;
    }

    public final Iterator a() {
        if (this.c == null) {
            this.c = this.d.c.entrySet().iterator();
        }
        return this.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a + 1;
        y5i y5iVar = this.d;
        return i < y5iVar.b.size() || (!y5iVar.c.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.b = true;
        int i = this.a + 1;
        this.a = i;
        y5i y5iVar = this.d;
        return i < y5iVar.b.size() ? y5iVar.b.get(this.a) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.b) {
            r6.g("remove() was called before next()");
            return;
        }
        this.b = false;
        int i = y5i.V;
        y5i y5iVar = this.d;
        y5iVar.i();
        if (this.a >= y5iVar.b.size()) {
            a().remove();
            return;
        }
        int i2 = this.a;
        this.a = i2 - 1;
        y5iVar.g(i2);
    }
}
