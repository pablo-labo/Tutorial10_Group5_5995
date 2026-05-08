package defpackage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class bo2 {
    public static final HashSet d = new HashSet(Arrays.asList("DD_API_KEY", "dd.api-key", "dd.profiling.api-key", "dd.profiling.apikey"));
    public final String a;
    public final Object b;
    public final int c;

    public bo2(String str, int i, String str2) {
        this.a = str;
        this.b = d.contains(str) ? "<hidden>" : str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bo2.class != obj.getClass()) {
            return false;
        }
        bo2 bo2Var = (bo2) obj;
        return this.a.equals(bo2Var.a) && Objects.equals(this.b, bo2Var.b) && this.c == bo2Var.c;
    }

    public final int hashCode() {
        int i = this.c;
        return Objects.hash(this.a, this.b, i == 0 ? null : Integer.valueOf(i - 1));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfigSetting{key='");
        sb.append(this.a);
        sb.append("', value=");
        sb.append(this.b);
        sb.append(", origin=");
        int i = this.c;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "DEFAULT" : "JVM_PROP" : "REMOTE" : "ENV");
        sb.append('}');
        return sb.toString();
    }
}
