package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class xbi implements Comparable, Map.Entry {
    public final Comparable a;
    public Object b;
    public final /* synthetic */ obi c;

    public xbi(obi obiVar, Comparable comparable, Object obj) {
        this.c = obiVar;
        this.a = comparable;
        this.b = obj;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.a.compareTo(((xbi) obj).a);
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
        int i = obi.V;
        this.c.i();
        Object obj2 = this.b;
        this.b = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        return ja.g(strValueOf2.length() + strValueOf.length() + 1, strValueOf, "=", strValueOf2);
    }
}
