package defpackage;

import defpackage.le0;

/* JADX INFO: loaded from: classes.dex */
@fd8
public final class yue implements le0.a {
    public final String a;

    public /* synthetic */ yue(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yue) {
            return wl7.b(this.a, ((yue) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ja.f(')', "StringAnnotation(value=", this.a);
    }
}
