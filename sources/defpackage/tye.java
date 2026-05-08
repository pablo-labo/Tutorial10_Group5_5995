package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes2.dex */
public final class tye {
    public final hva<String> a;

    public tye(hva<String> hvaVar) {
        hvaVar.getClass();
        this.a = hvaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tye) && wl7.b(this.a, ((tye) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SuggestedMessageNewGenerationInput(messageDraft=" + this.a + ")";
    }

    public tye() {
        this(hva.a.a);
    }
}
