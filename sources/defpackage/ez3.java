package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ez3 {
    public final String a;
    public final String b;
    public final String c;

    public ez3(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ez3.class == obj.getClass()) {
            ez3 ez3Var = (ez3) obj;
            if (Objects.equals(this.a, ez3Var.a) && Objects.equals(this.b, ez3Var.b) && Objects.equals(this.c, ez3Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
