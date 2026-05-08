package defpackage;

import android.os.Bundle;
import androidx.navigation.p;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class laa {
    public final int a;
    public p b = null;
    public Bundle c = null;

    public laa(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof laa)) {
            laa laaVar = (laa) obj;
            if (this.a == laaVar.a && wl7.b(this.b, laaVar.b)) {
                if (!wl7.b(this.c, laaVar.c)) {
                    Bundle bundle = this.c;
                    if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                        Set<String> set = setKeySet;
                        if (!(set instanceof Collection) || !set.isEmpty()) {
                            for (String str : set) {
                                Bundle bundle2 = this.c;
                                Object obj2 = bundle2 != null ? bundle2.get(str) : null;
                                Bundle bundle3 = laaVar.c;
                                if (!wl7.b(obj2, bundle3 != null ? bundle3.get(str) : null)) {
                                }
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = Integer.hashCode(this.a) * 31;
        p pVar = this.b;
        int iHashCode2 = iHashCode + (pVar != null ? pVar.hashCode() : 0);
        Bundle bundle = this.c;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            for (String str : setKeySet) {
                int i = iHashCode2 * 31;
                Bundle bundle2 = this.c;
                Object obj = bundle2 != null ? bundle2.get(str) : null;
                iHashCode2 = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return iHashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(laa.class.getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(this.a));
        sb.append(")");
        if (this.b != null) {
            sb.append(" navOptions=");
            sb.append(this.b);
        }
        return sb.toString();
    }
}
