package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class mlf extends qic {
    public static final String d;
    public static final String e;
    public final boolean b;
    public final boolean c;

    static {
        String str = vjg.a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public mlf() {
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
        bundle.putInt(qic.a, 3);
        bundle.putBoolean(d, this.b);
        bundle.putBoolean(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mlf)) {
            return false;
        }
        mlf mlfVar = (mlf) obj;
        return this.c == mlfVar.c && this.b == mlfVar.b;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.b), Boolean.valueOf(this.c));
    }

    public mlf(boolean z) {
        this.b = true;
        this.c = z;
    }
}
