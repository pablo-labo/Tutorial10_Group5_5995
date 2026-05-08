package defpackage;

import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class snh implements Map.Entry<String, Object> {
    public Object a;
    public final hoh b;
    public final /* synthetic */ bnh c;

    public snh(bnh bnhVar, hoh hohVar, Object obj) {
        this.c = bnhVar;
        this.b = hohVar;
        obj.getClass();
        this.a = obj;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return ((String) getKey()).equals(entry.getKey()) && this.a.equals(entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final String getKey() {
        String str = this.b.c;
        return this.c.b.b ? str.toLowerCase(Locale.US) : str;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.a.hashCode() ^ ((String) getKey()).hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.a;
        obj.getClass();
        this.a = obj;
        this.b.c(this.c.a, obj);
        return obj2;
    }
}
