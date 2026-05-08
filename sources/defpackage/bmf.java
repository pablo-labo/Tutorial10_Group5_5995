package defpackage;

import java.time.DateTimeException;
import java.time.ZoneId;
import java.time.ZoneOffset;
import kotlinx.datetime.IllegalTimeZoneException;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
@o7e(with = cmf.class)
public class bmf {
    public static final a Companion = new a();
    public static final og5 b;
    public final ZoneId a;

    public static final class a {
        public static bmf a(String str) throws Exception {
            str.getClass();
            try {
                ZoneId zoneIdOf = ZoneId.of(str);
                zoneIdOf.getClass();
                return b(zoneIdOf);
            } catch (Exception e) {
                if (e instanceof DateTimeException) {
                    throw new IllegalTimeZoneException(e);
                }
                throw e;
            }
        }

        public static bmf b(ZoneId zoneId) {
            boolean zIsFixedOffset;
            if (zoneId instanceof ZoneOffset) {
                ZoneOffset zoneOffset = (ZoneOffset) zoneId;
                new pjg(zoneOffset);
                return new og5(zoneOffset);
            }
            try {
                zIsFixedOffset = zoneId.getRules().isFixedOffset();
            } catch (ArrayIndexOutOfBoundsException unused) {
                zIsFixedOffset = false;
            }
            if (!zIsFixedOffset) {
                return new bmf(zoneId);
            }
            ZoneId zoneIdNormalized = zoneId.normalized();
            zoneIdNormalized.getClass();
            new pjg((ZoneOffset) zoneIdNormalized);
            return new og5(zoneId);
        }

        public final KSerializer<bmf> serializer() {
            return cmf.a;
        }
    }

    static {
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        zoneOffset.getClass();
        new pjg(zoneOffset);
        b = new og5(zoneOffset);
    }

    public bmf(ZoneId zoneId) {
        this.a = zoneId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bmf) {
            return this.a.equals(((bmf) obj).a);
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
