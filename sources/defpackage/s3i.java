package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class s3i implements Map.Entry, Comparable {
    public final Comparable a;
    public Object b;
    public final /* synthetic */ o4i c;

    public s3i(o4i o4iVar, Comparable comparable, Object obj) {
        this.c = o4iVar;
        this.a = comparable;
        this.b = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a.compareTo(((s3i) obj).a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.a;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.b;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i = o4i.V;
        this.c.j();
        Object obj2 = this.b;
        this.b = obj;
        return obj2;
    }

    public final String toString() {
        return z3.m(String.valueOf(this.a), "=", String.valueOf(this.b));
    }
}
