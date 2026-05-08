package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class uph extends aoh {
    public final transient xnh c;
    public final transient Object[] d;
    public final transient int e;

    public uph(xnh xnhVar, Object[] objArr, int i) {
        this.c = xnhVar;
        this.d = objArr;
        this.e = i;
    }

    @Override // defpackage.wmh
    public final int a(Object[] objArr) {
        mnh sphVar = this.b;
        if (sphVar == null) {
            sphVar = new sph(this);
            this.b = sphVar;
        }
        return sphVar.a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        mnh sphVar = this.b;
        if (sphVar == null) {
            sphVar = new sph(this);
            this.b = sphVar;
        }
        return sphVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }
}
