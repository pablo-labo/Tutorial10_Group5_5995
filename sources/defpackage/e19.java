package defpackage;

import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public final class e19 implements d19 {
    public final LocaleList a;

    public e19(LocaleList localeList) {
        this.a = localeList;
    }

    @Override // defpackage.d19
    public final LocaleList a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return this.a.equals(((d19) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
