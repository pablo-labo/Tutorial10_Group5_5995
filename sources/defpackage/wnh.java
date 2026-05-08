package defpackage;

import io.jsonwebtoken.JwtParser;
import java.io.Serializable;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class wnh implements Serializable {
    public static final TimeZone a = TimeZone.getTimeZone("GMT");
    private final boolean zzfp = false;
    private final long value = 0;
    private final int zzfq = TimeZone.getDefault().getOffset(0) / 60000;

    static {
        Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})([Tt](\\d{2}):(\\d{2}):(\\d{2})(\\.\\d+)?)?([Zz]|([+-])(\\d{2}):(\\d{2}))?");
    }

    public static void a(StringBuilder sb, int i, int i2) {
        if (i < 0) {
            sb.append('-');
            i = -i;
        }
        int i3 = i;
        while (i3 > 0) {
            i3 /= 10;
            i2--;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append('0');
        }
        if (i != 0) {
            sb.append(i);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wnh)) {
            return false;
        }
        wnh wnhVar = (wnh) obj;
        return this.zzfp == wnhVar.zzfp && this.value == wnhVar.value && this.zzfq == wnhVar.zzfq;
    }

    public final int hashCode() {
        return Arrays.hashCode(new long[]{this.value, this.zzfp ? 1L : 0L, this.zzfq});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(a);
        gregorianCalendar.setTimeInMillis((((long) this.zzfq) * 60000) + this.value);
        a(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        a(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        a(sb, gregorianCalendar.get(5), 2);
        if (!this.zzfp) {
            sb.append('T');
            a(sb, gregorianCalendar.get(11), 2);
            sb.append(':');
            a(sb, gregorianCalendar.get(12), 2);
            sb.append(':');
            a(sb, gregorianCalendar.get(13), 2);
            if (gregorianCalendar.isSet(14)) {
                sb.append(JwtParser.SEPARATOR_CHAR);
                a(sb, gregorianCalendar.get(14), 3);
            }
            int i = this.zzfq;
            if (i == 0) {
                sb.append('Z');
            } else {
                if (i > 0) {
                    sb.append('+');
                } else {
                    sb.append('-');
                    i = -i;
                }
                a(sb, i / 60, 2);
                sb.append(':');
                a(sb, i % 60, 2);
            }
        }
        return sb.toString();
    }
}
