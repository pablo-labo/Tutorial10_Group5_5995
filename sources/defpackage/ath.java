package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class ath {
    public static int a(rlh rlhVar) {
        Iterator it = rlhVar.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
