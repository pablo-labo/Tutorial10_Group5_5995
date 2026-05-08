package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class f4i implements Iterator {
    public int a;
    public boolean b;
    public Iterator c;
    public final /* synthetic */ o4i d;

    public /* synthetic */ f4i(o4i o4iVar) {
        Objects.requireNonNull(o4iVar);
        this.d = o4iVar;
        this.a = -1;
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
        o4i o4iVar = this.d;
        if (i >= o4iVar.b) {
            return !o4iVar.c.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.b = true;
        int i = this.a + 1;
        this.a = i;
        o4i o4iVar = this.d;
        return i < o4iVar.b ? (s3i) o4iVar.a[i] : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.b) {
            r6.g("remove() was called before next()");
            return;
        }
        this.b = false;
        int i = o4i.V;
        o4i o4iVar = this.d;
        o4iVar.j();
        int i2 = this.a;
        if (i2 >= o4iVar.b) {
            a().remove();
        } else {
            this.a = i2 - 1;
            o4iVar.h(i2);
        }
    }
}
