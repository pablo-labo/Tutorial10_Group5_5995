package defpackage;

import android.text.TextUtils;
import androidx.media3.common.a;

/* JADX INFO: loaded from: classes.dex */
public final class dk3 {
    public final String a;
    public final a b;
    public final a c;
    public final int d;
    public final int e;

    public dk3(String str, a aVar, a aVar2, int i, int i2) {
        ka2.l(i == 0 || i2 == 0);
        if (TextUtils.isEmpty(str)) {
            o6.h();
            throw null;
        }
        this.a = str;
        aVar.getClass();
        this.b = aVar;
        aVar2.getClass();
        this.c = aVar2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dk3.class == obj.getClass()) {
            dk3 dk3Var = (dk3) obj;
            if (this.d == dk3Var.d && this.e == dk3Var.e && this.a.equals(dk3Var.a) && this.b.equals(dk3Var.b) && this.c.equals(dk3Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + akb.d((((527 + this.d) * 31) + this.e) * 31, 31, this.a)) * 31);
    }
}
