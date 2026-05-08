package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class nr3 implements bjg {
    public final String a;
    public final v96 b;

    public nr3(Set<xu8> set, v96 v96Var) {
        this.a = b(set);
        this.b = v96Var;
    }

    public static String b(Set<xu8> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<xu8> it = set.iterator();
        while (it.hasNext()) {
            xu8 next = it.next();
            sb.append(next.a());
            sb.append('/');
            sb.append(next.b());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // defpackage.bjg
    public final String a() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        v96 v96Var = this.b;
        synchronized (v96Var.a) {
            setUnmodifiableSet = Collections.unmodifiableSet(v96Var.a);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.a;
        if (zIsEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (v96Var.a) {
            setUnmodifiableSet2 = Collections.unmodifiableSet(v96Var.a);
        }
        sb.append(b(setUnmodifiableSet2));
        return sb.toString();
    }
}
