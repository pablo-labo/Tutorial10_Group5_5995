package defpackage;

import android.content.Context;
import defpackage.aie;
import defpackage.m17;
import defpackage.q55;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bie implements aie.a {
    @Override // aie.a
    public final xqc a(Context context) {
        m17.a aVar = new m17.a(context);
        q55.b<j6g> bVar = cie.b;
        j6g j6gVar = j6g.a;
        LinkedHashMap linkedHashMap = aVar.d.a;
        if (j6gVar != null) {
            linkedHashMap.put(bVar, j6gVar);
        } else {
            linkedHashMap.remove(bVar);
        }
        return aVar.a();
    }
}
