package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class wp {
    public final ArrayList a;

    public wp(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wp) && this.a.equals(((wp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return m6.g("AddJobSeekerProfileStructuredDataPreferenceAttributesInput(attributes=", ")", this.a);
    }
}
