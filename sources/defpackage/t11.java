package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class t11 extends ne1 {
    public final ArrayList a;

    public t11(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.ne1
    public final List<l39> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ne1) {
            return this.a.equals(((ne1) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.a + "}";
    }
}
