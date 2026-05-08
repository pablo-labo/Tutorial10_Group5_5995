package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ix3 {
    public final hva<List<String>> a;

    /* JADX WARN: Multi-variable type inference failed */
    public ix3(hva<? extends List<String>> hvaVar) {
        hvaVar.getClass();
        this.a = hvaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ix3) && wl7.b(this.a, ((ix3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DeleteJobSeekerProfileStructuredDataPreferenceAttributesInput(ids=" + this.a + ")";
    }

    public ix3() {
        this(hva.a.a);
    }
}
