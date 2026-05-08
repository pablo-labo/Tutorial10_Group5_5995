package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes2.dex */
public final class ye2 {
    public final hva<String> a;

    public ye2() {
        hva.a aVar = hva.a.a;
        aVar.getClass();
        this.a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ye2) && wl7.b(this.a, ((ye2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CompleteButtonParametersJobQuestionInput(sourceUrl=" + this.a + ")";
    }
}
