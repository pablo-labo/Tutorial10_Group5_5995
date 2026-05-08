package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class er7 {
    public final String a;
    public final Map<String, Object> b;
    public final boolean c;

    public er7(String str, Map<String, ? extends Object> map, boolean z) {
        str.getClass();
        map.getClass();
        this.a = str;
        this.b = map;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er7)) {
            return false;
        }
        er7 er7Var = (er7) obj;
        return wl7.b(this.a, er7Var.a) && wl7.b(this.b, er7Var.b) && this.c == er7Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k20.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JSTOnboardingArgs(experienceKey=");
        sb.append(this.a);
        sb.append(", experienceData=");
        sb.append(this.b);
        sb.append(", skipExempt=");
        return z3.o(sb, this.c, ")");
    }
}
