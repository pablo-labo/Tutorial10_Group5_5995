package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class xe2 {
    public final hva<String> a;

    public xe2() {
        hva.a aVar = hva.a.a;
        aVar.getClass();
        this.a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xe2) && wl7.b(this.a, ((xe2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CompleteButtonParametersJobQuestionInput(sourceUrl=" + this.a + ")";
    }
}
