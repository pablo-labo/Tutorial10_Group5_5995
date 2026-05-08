package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ota {
    public final List<xsa> a;

    public ota(List<xsa> list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ota) && this.a.equals(((ota) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return g7.h("OnlineStatusesInput(accounts=", ")", this.a);
    }
}
