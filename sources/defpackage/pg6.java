package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class pg6 {
    public final String a;
    public final String b;

    public pg6(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pg6.class == obj.getClass()) {
            pg6 pg6Var = (pg6) obj;
            if (TextUtils.equals(this.a, pg6Var.a) && TextUtils.equals(this.b, pg6Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header[name=");
        sb.append(this.a);
        sb.append(",value=");
        return l6.i(sb, this.b, "]");
    }
}
