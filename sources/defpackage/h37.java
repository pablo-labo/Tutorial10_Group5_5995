package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class h37 {
    public final String a;
    public final q07 b;
    public final Uri c;
    public final double d;
    public final boolean e;

    public h37(Context context, String str, double d, double d2, q07 q07Var) {
        Uri uriB;
        context.getClass();
        q07Var.getClass();
        this.a = str;
        this.b = q07Var;
        try {
            uriB = Uri.parse(str);
            if (uriB.getScheme() == null) {
                this.e = true;
                uriB = m5d.b(context, str);
            }
        } catch (NullPointerException unused) {
            this.e = true;
            uriB = m5d.b(context, this.a);
        }
        this.c = uriB;
        this.d = d * d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !h37.class.equals(obj.getClass())) {
            return false;
        }
        h37 h37Var = (h37) obj;
        return Double.compare(h37Var.d, this.d) == 0 && this.e == h37Var.e && wl7.b(this.c, h37Var.c) && wl7.b(this.a, h37Var.a) && this.b == h37Var.b;
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.a, Double.valueOf(this.d), Boolean.valueOf(this.e), this.b);
    }

    public /* synthetic */ h37(Context context, String str, q07 q07Var, int i) {
        this(context, str, 0.0d, 0.0d, (i & 16) != 0 ? q07.a : q07Var);
    }
}
