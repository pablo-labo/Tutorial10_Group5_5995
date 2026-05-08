package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zsd {
    public static final zsd b;
    public final i47<Integer> a;

    public static final class a {
        public i47<Integer> a;
    }

    static {
        a aVar = new a();
        aVar.a = i47.j(2, 1, 5);
        b = new zsd(aVar);
    }

    public zsd(a aVar) {
        this.a = aVar.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zsd) && this.a.equals(((zsd) obj).a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool);
    }
}
