package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class kn9 {
    public static final HashSet a(Iterable iterable) {
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set<n8a> setG = ((in9) it.next()).g();
            if (setG == null) {
                return null;
            }
            w92.w0(hashSet, setG);
        }
        return hashSet;
    }
}
