package defpackage;

import android.util.Log;
import androidx.compose.runtime.r;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class f7d {
    public static final ko2 e = pnb.H(new so0(12), new ue(16));
    public final long a;
    public final g4a b;
    public final g4a c;
    public final g4a d;

    public f7d(boolean z, Long l) {
        this.a = 604800000L;
        this.b = r.f(Boolean.valueOf(z));
        this.c = r.f(l);
        this.d = r.f(null);
    }

    public static void c(f7d f7dVar, boolean z, Long l, Integer num, int i) {
        if ((i & 2) != 0) {
            l = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        ((gme) f7dVar.b).setValue(Boolean.valueOf(z));
        if (l != null) {
            long jLongValue = l.longValue();
            ((gme) f7dVar.c).setValue(Long.valueOf(jLongValue));
            ((kq7) cr8.p(kq7.class)).i(jLongValue, "Messaging", "ResponsiveBannerLastShownTimestamp");
        }
        if (num != null) {
            ((gme) f7dVar.d).setValue(Integer.valueOf(num.intValue()));
        }
        ArrayList arrayList = lz2.a;
        Log.d("ResponsiveBannerState", "setState called with: show = " + z + ", timestamp = " + l + ", textId = " + num, null);
    }

    public final boolean a() {
        return ((Boolean) ((gme) this.b).getValue()).booleanValue();
    }

    public final boolean b() {
        long jLongValue;
        Long l = (Long) ((gme) this.c).getValue();
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            Long lH = ((kq7) cr8.p(kq7.class)).h(0L, "Messaging", "ResponsiveBannerLastShownTimestamp");
            jLongValue = lH != null ? lH.longValue() : 0L;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = lz2.a;
        StringBuilder sbI = w40.i(jLongValue, "isOverCoolDown called with lastTimestamp = ", ", currentTimestamp = ");
        sbI.append(jCurrentTimeMillis);
        sbI.append(", coolDownTime = ");
        long j = this.a;
        sbI.append(j);
        Log.d("ResponsiveBannerState", sbI.toString(), null);
        return jLongValue == 0 || jCurrentTimeMillis - jLongValue > j;
    }

    public /* synthetic */ f7d(int i) {
        this(false, null);
    }

    public f7d() {
        this(3);
    }
}
