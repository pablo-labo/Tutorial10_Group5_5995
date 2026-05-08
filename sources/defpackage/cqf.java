package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cqf {
    public static final String c;
    public static final String d;
    public final wpf a;
    public final e47<Integer> b;

    static {
        String str = vjg.a;
        c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public cqf(wpf wpfVar, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= wpfVar.a)) {
            k20.o();
            throw null;
        }
        this.a = wpfVar;
        this.b = e47.j(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cqf.class == obj.getClass()) {
            cqf cqfVar = (cqf) obj;
            if (this.a.equals(cqfVar.a) && this.b.equals(cqfVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public cqf(wpf wpfVar, int i) {
        this(wpfVar, e47.n(Integer.valueOf(i)));
    }
}
