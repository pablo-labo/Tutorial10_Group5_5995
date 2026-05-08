package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class a19 {
    public final Locale a;

    public a19(Locale locale) {
        this.a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a19)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return wl7.b(this.a.toLanguageTag(), ((a19) obj).a.toLanguageTag());
    }

    public final int hashCode() {
        return this.a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.a.toLanguageTag();
    }
}
