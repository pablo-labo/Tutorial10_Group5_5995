package defpackage;

import defpackage.js9;

/* JADX INFO: loaded from: classes.dex */
public final class v0a implements js9.a {
    public final int a;

    public v0a(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v0a) && this.a == ((v0a) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Mp4AlternateGroup: " + this.a;
    }
}
