package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class kj8 {
    public static final String c;
    public static final String d;
    public final String a;
    public final String b;

    static {
        String str = vjg.a;
        c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public kj8(String str, String str2) {
        this.a = vjg.P(str);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kj8.class == obj.getClass()) {
            kj8 kj8Var = (kj8) obj;
            if (Objects.equals(this.a, kj8Var.a) && Objects.equals(this.b, kj8Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
