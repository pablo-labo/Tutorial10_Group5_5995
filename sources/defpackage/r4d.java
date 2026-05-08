package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class r4d {
    public final Set<n3d> a = Collections.newSetFromMap(new WeakHashMap());
    public final HashSet b = new HashSet();
    public boolean c;

    public final boolean a(n3d n3dVar) {
        boolean z = true;
        if (n3dVar == null) {
            return true;
        }
        boolean zRemove = this.a.remove(n3dVar);
        if (!this.b.remove(n3dVar) && !zRemove) {
            z = false;
        }
        if (z) {
            n3dVar.clear();
        }
        return z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{numRequests=");
        sb.append(this.a.size());
        sb.append(", isPaused=");
        return z3.o(sb, this.c, "}");
    }
}
