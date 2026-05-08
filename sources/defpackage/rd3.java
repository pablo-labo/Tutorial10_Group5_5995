package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class rd3 {
    public static gf3 a(l3d l3dVar, String str, mic micVar, int i, ryc rycVar) {
        Map map = Collections.EMPTY_MAP;
        Uri uriD = shg.d(str, micVar.c);
        long j = micVar.a;
        long j2 = micVar.b;
        String strK = l3dVar.k();
        if (strK == null) {
            strK = shg.d(l3dVar.b.get(0).a, micVar.c).toString();
        }
        String str2 = strK;
        ka2.s(uriD, "The uri must be set.");
        return new gf3(uriD, 0L, 1, null, rycVar, j, j2, str2, i);
    }
}
