package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class le5 {
    public final String a;

    public le5(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof le5) && wl7.b(this.a, ((le5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return l5.m("FindResumeFileSuggestionsInput(resumeFileId=", this.a, ")");
    }
}
