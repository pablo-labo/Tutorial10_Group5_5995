package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xnh implements Map, Serializable {
    public transient uph a;
    public transient xph b;
    public transient zph c;

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        zph zphVar = this.c;
        if (zphVar == null) {
            dqh dqhVar = (dqh) this;
            zph zphVar2 = new zph(dqhVar.e, 1, dqhVar.f);
            this.c = zphVar2;
            zphVar = zphVar2;
        }
        return zphVar.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        uph uphVar = this.a;
        if (uphVar != null) {
            return uphVar;
        }
        dqh dqhVar = (dqh) this;
        uph uphVar2 = new uph(dqhVar, dqhVar.e, dqhVar.f);
        this.a = uphVar2;
        return uphVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        uph uphVar = this.a;
        if (uphVar == null) {
            dqh dqhVar = (dqh) this;
            uph uphVar2 = new uph(dqhVar, dqhVar.e, dqhVar.f);
            this.a = uphVar2;
            uphVar = uphVar2;
        }
        Iterator it = uphVar.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((dqh) this).size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        xph xphVar = this.b;
        if (xphVar != null) {
            return xphVar;
        }
        dqh dqhVar = (dqh) this;
        xph xphVar2 = new xph(dqhVar, new zph(dqhVar.e, 0, dqhVar.f));
        this.b = xphVar2;
        return xphVar2;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int i = ((dqh) this).f;
        if (i < 0) {
            l5.q(p6.c(i, "size cannot be negative but was: "));
            return null;
        }
        StringBuilder sb = new StringBuilder((int) Math.min(((long) i) * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : (uph) entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        zph zphVar = this.c;
        if (zphVar != null) {
            return zphVar;
        }
        dqh dqhVar = (dqh) this;
        zph zphVar2 = new zph(dqhVar.e, 1, dqhVar.f);
        this.c = zphVar2;
        return zphVar2;
    }
}
