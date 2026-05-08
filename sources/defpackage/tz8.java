package defpackage;

import com.datadog.android.rum.internal.utils.ViewUtilsKt;

/* JADX INFO: loaded from: classes.dex */
@fd8
public final class tz8 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof tz8) {
            return this.a == ((tz8) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        return i == 0 ? "Polite" : i == 1 ? "Assertive" : ViewUtilsKt.UNKNOWN_DESTINATION_URL;
    }
}
