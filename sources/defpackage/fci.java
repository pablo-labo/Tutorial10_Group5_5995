package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class fci implements Iterator {
    public int a = -1;
    public boolean b;
    public Iterator c;
    public final /* synthetic */ obi d;

    public fci(obi obiVar) {
        this.d = obiVar;
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
        obi obiVar = this.d;
        return i < obiVar.b.size() || (!obiVar.c.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.b = true;
        int i = this.a + 1;
        this.a = i;
        obi obiVar = this.d;
        return i < obiVar.b.size() ? obiVar.b.get(this.a) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.b) {
            r6.g("remove() was called before next()");
            return;
        }
        this.b = false;
        int i = obi.V;
        obi obiVar = this.d;
        obiVar.i();
        if (this.a >= obiVar.b.size()) {
            a().remove();
            return;
        }
        int i2 = this.a;
        this.a = i2 - 1;
        obiVar.f(i2);
    }
}
