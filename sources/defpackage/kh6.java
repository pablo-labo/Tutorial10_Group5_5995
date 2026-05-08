package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class kh6 extends qic {
    public static final String d;
    public static final String e;
    public final boolean b;
    public final boolean c;

    static {
        String str = vjg.a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public kh6() {
        this.b = false;
        this.c = false;
    }

    @Override // defpackage.qic
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.qic
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(qic.a, 0);
        bundle.putBoolean(d, this.b);
        bundle.putBoolean(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kh6)) {
            return false;
        }
        kh6 kh6Var = (kh6) obj;
        return this.c == kh6Var.c && this.b == kh6Var.b;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.b), Boolean.valueOf(this.c));
    }

    public kh6(boolean z) {
        this.b = true;
        this.c = z;
    }
}
