package defpackage;

import androidx.compose.runtime.b;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;

/* JADX INFO: loaded from: classes.dex */
public final class fde {
    public static final jte a = new jte(a.a);

    public static final class a extends mj8 implements gu5<dde> {
        public static final a a = new a(0);

        @Override // defpackage.gu5
        public final dde invoke() {
            return new dde(0);
        }
    }

    public static final dce a(pce pceVar, b bVar) {
        dde ddeVar = (dde) bVar.M(a);
        switch (pceVar.ordinal()) {
            case 0:
                return ddeVar.e;
            case 1:
                return p03.c(ddeVar.e, null, new k94(0.0f), new k94(0.0f), 3);
            case 2:
                return ddeVar.a;
            case 3:
                return p03.c(ddeVar.a, null, new k94(0.0f), new k94(0.0f), 3);
            case 4:
                return ggd.a;
            case 5:
                return ddeVar.d;
            case 6:
                return p03.c(ddeVar.d, new k94(0.0f), null, new k94(0.0f), 6);
            case 7:
                return p03.c(ddeVar.d, null, new k94(0.0f), new k94(0.0f), 3);
            case 8:
                return ddeVar.c;
            case DatadogLogGenerator.CRASH /* 9 */:
                return ytc.a;
            case 10:
                return ddeVar.b;
            default:
                l.g();
                return null;
        }
    }
}
