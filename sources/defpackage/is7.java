package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class is7 {
    public final List<String> a;

    public is7(List<String> list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof is7) && this.a.equals(((is7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return g7.h("JSTProfilePreferredJobTitles(jobTitles=", ")", this.a);
    }
}
