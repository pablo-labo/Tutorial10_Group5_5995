package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class jta {
    public final Set<String> a;
    public final boolean b;

    public jta(Set<String> set, boolean z) {
        this.a = set;
        this.b = z;
    }

    public static jta a(jta jtaVar, Set set, boolean z, int i) {
        if ((i & 1) != 0) {
            set = jtaVar.a;
        }
        if ((i & 2) != 0) {
            z = jtaVar.b;
        }
        jtaVar.getClass();
        set.getClass();
        return new jta(set, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jta)) {
            return false;
        }
        jta jtaVar = (jta) obj;
        return wl7.b(this.a, jtaVar.a) && this.b == jtaVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnlineStatusUiState(onlineEmployerIds=" + this.a + ", jsOnlineStatusEnabled=" + this.b + ")";
    }

    public jta() {
        this(0);
    }

    public /* synthetic */ jta(int i) {
        this(is4.a, false);
    }
}
