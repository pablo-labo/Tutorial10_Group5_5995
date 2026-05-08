package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g4h {
    public final String a;
    public final Integer b;
    public final List<sjb> c;

    public g4h(String str, Integer num, ArrayList arrayList) {
        this.a = str;
        this.b = num;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4h)) {
            return false;
        }
        g4h g4hVar = (g4h) obj;
        return wl7.b(this.a, g4hVar.a) && wl7.b(this.b, g4hVar.b) && wl7.b(this.c, g4hVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<sjb> list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkWellbeingPreferencesData(label=");
        sb.append(this.a);
        sb.append(", selectionLimit=");
        sb.append(this.b);
        sb.append(", workWellbeing=");
        return g7.i(sb, this.c, ")");
    }
}
