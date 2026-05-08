package defpackage;

import java.time.ZoneOffset;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
@o7e(with = qjg.class)
public final class pjg {
    public static final a Companion = new a();
    public final ZoneOffset a;

    public static final class a {
        public final KSerializer<pjg> serializer() {
            return qjg.a;
        }
    }

    static {
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        zoneOffset.getClass();
        new pjg(zoneOffset);
    }

    public pjg(ZoneOffset zoneOffset) {
        zoneOffset.getClass();
        this.a = zoneOffset;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pjg) {
            return wl7.b(this.a, ((pjg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String string = this.a.toString();
        string.getClass();
        return string;
    }
}
