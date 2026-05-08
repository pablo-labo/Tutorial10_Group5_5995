package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class v3b {
    public final ArrayList a;

    public /* synthetic */ v3b(int i) {
        this(new ArrayList());
    }

    public <T> T a(yd8<?> yd8Var) {
        T t;
        yd8Var.getClass();
        Iterator<T> it = this.a.iterator();
        do {
            t = null;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (yd8Var.n(next) && next != null) {
                t = next;
            }
        } while (t == null);
        return t;
    }

    public final String toString() {
        return "DefinitionParameters" + z92.z1(this.a);
    }

    public v3b(ArrayList arrayList) {
        this.a = arrayList;
    }

    public v3b() {
        this(0);
    }
}
