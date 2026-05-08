package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class u58 {
    public final hva<List<String>> a;

    /* JADX WARN: Multi-variable type inference failed */
    public u58(hva<? extends List<String>> hvaVar) {
        hvaVar.getClass();
        this.a = hvaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u58) && wl7.b(this.a, ((u58) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "JobSeekerProfileStructuredDataPreferenceAttributeByCustomClassInput(customClassSuids=" + this.a + ")";
    }

    public u58() {
        this(hva.a.a);
    }
}
