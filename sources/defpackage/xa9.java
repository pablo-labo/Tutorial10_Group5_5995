package defpackage;

import android.graphics.Bitmap;
import expo.modules.kotlin.exception.CodedException;

/* JADX INFO: loaded from: classes3.dex */
public final class xa9 {
    public final Bitmap a;
    public final CodedException b;

    public xa9(Bitmap bitmap, CodedException codedException) {
        this.a = bitmap;
        this.b = codedException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa9)) {
            return false;
        }
        xa9 xa9Var = (xa9) obj;
        return wl7.b(this.a, xa9Var.a) && wl7.b(this.b, xa9Var.b);
    }

    public final int hashCode() {
        Bitmap bitmap = this.a;
        int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        CodedException codedException = this.b;
        return iHashCode + (codedException != null ? codedException.hashCode() : 0);
    }

    public final String toString() {
        return "ManipulatorResult(value=" + this.a + ", error=" + this.b + ")";
    }
}
