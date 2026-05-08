package defpackage;

import com.datadog.android.rum.internal.utils.ViewUtilsKt;

/* JADX INFO: loaded from: classes.dex */
@fd8
public final class n07 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof n07) {
            return this.a == ((n07) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        return i == 0 ? "Argb8888" : i == 1 ? "Alpha8" : i == 2 ? "Rgb565" : i == 3 ? "F16" : i == 4 ? "Gpu" : ViewUtilsKt.UNKNOWN_DESTINATION_URL;
    }
}
