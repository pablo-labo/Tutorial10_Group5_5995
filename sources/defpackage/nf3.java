package defpackage;

import android.content.Context;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.m17;
import defpackage.of3;
import defpackage.og2;

/* JADX INFO: loaded from: classes3.dex */
public final class nf3 {
    public static final kv0 a(String str, b bVar, int i) {
        Context context = (Context) bVar.M(AndroidCompositionLocals_androidKt.b);
        boolean zK = bVar.K(context);
        Object objV = bVar.v();
        if (zK || objV == b.a.a) {
            m17.a aVar = new m17.a(context);
            og2.a aVar2 = new og2.a();
            aVar2.a(new of3.a(), fwc.a.b(lhg.class));
            aVar.c = aVar2.c();
            objV = aVar.a();
            bVar.p(objV);
        }
        return mv0.a(str, (m17) objV, null, null, null, bVar, i & 14, 60);
    }
}
