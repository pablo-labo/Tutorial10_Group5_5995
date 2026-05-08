package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class jre extends qic {
    public static final String d;
    public static final String e;
    public final int b;
    public final float c;

    static {
        String str = vjg.a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public jre(float f, int i) {
        boolean z = false;
        ka2.k("maxStars must be a positive integer", i > 0);
        if (f >= 0.0f && f <= i) {
            z = true;
        }
        ka2.k("starRating is out of range [0, maxStars]", z);
        this.b = i;
        this.c = f;
    }

    @Override // defpackage.qic
    public final boolean b() {
        return this.c != -1.0f;
    }

    @Override // defpackage.qic
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(qic.a, 2);
        bundle.putInt(d, this.b);
        bundle.putFloat(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jre)) {
            return false;
        }
        jre jreVar = (jre) obj;
        return this.b == jreVar.b && this.c == jreVar.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), Float.valueOf(this.c));
    }

    public jre(int i) {
        ka2.k("maxStars must be a positive integer", i > 0);
        this.b = i;
        this.c = -1.0f;
    }
}
