package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class tyc implements s03 {
    public final float a;

    public tyc(float f) {
        this.a = f;
    }

    @Override // defpackage.s03
    public final float a(RectF rectF) {
        return rectF.height() * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tyc) && this.a == ((tyc) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
