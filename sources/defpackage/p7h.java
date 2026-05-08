package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p7h extends l7h implements Set {
    public static final /* synthetic */ int f = 0;
    public transient o7h e;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p7h) {
            ((p7h) obj).j();
            if (obj.hashCode() != 0) {
                return false;
            }
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (size() == set.size()) {
                return containsAll(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public abstract void j();
}
