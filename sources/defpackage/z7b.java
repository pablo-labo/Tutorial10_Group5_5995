package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class z7b extends qic {
    public static final String c;
    public final float b;

    static {
        String str = vjg.a;
        c = Integer.toString(1, 36);
    }

    public z7b(float f) {
        ka2.k("percent must be in the range of [0, 100]", f >= 0.0f && f <= 100.0f);
        this.b = f;
    }

    @Override // defpackage.qic
    public final boolean b() {
        return this.b != -1.0f;
    }

    @Override // defpackage.qic
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(qic.a, 1);
        bundle.putFloat(c, this.b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z7b) {
            return this.b == ((z7b) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.b));
    }

    public z7b() {
        this.b = -1.0f;
    }
}
