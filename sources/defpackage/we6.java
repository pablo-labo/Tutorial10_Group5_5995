package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class we6 {
    public final ve6 a;
    public final List<xy1> b;

    public we6(ve6 ve6Var, ArrayList arrayList) {
        arrayList.getClass();
        this.a = ve6Var;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we6)) {
            return false;
        }
        we6 we6Var = (we6) obj;
        return this.a.equals(we6Var.a) && wl7.b(this.b, we6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HamburgerMenuCategoryWithItems(hamburgerMenuCategory=" + this.a + ", hamburgerMenuItems=" + this.b + ")";
    }
}
