package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class j1h {
    public final String a;
    public final Integer b;
    public final List<sjb> c;

    public j1h(String str, Integer num, ArrayList arrayList) {
        this.a = str;
        this.b = num;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1h)) {
            return false;
        }
        j1h j1hVar = (j1h) obj;
        return wl7.b(this.a, j1hVar.a) && wl7.b(this.b, j1hVar.b) && wl7.b(this.c, j1hVar.c);
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
        StringBuilder sb = new StringBuilder("WorkAreasPreferencesData(label=");
        sb.append(this.a);
        sb.append(", selectionLimit=");
        sb.append(this.b);
        sb.append(", workAreas=");
        return g7.i(sb, this.c, ")");
    }
}
