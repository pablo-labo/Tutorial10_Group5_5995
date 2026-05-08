package defpackage;

import java.lang.reflect.Type;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vvc implements jw7 {
    public final boolean equals(Object obj) {
        return (obj instanceof vvc) && wl7.b(s(), ((vvc) obj).s());
    }

    public final int hashCode() {
        return s().hashCode();
    }

    @Override // defpackage.ku7
    public fu7 p(mq5 mq5Var) {
        Object next;
        mq5Var.getClass();
        Iterator<T> it = getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((fu7) next).j().a(), mq5Var)) {
                break;
            }
        }
        return (fu7) next;
    }

    public abstract Type s();

    public final String toString() {
        return getClass().getName() + ": " + s();
    }
}
