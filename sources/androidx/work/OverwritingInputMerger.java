package androidx.work;

import androidx.work.b;
import defpackage.ve7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class OverwritingInputMerger extends ve7 {
    @Override // defpackage.ve7
    public final b a(ArrayList arrayList) throws Throwable {
        b.a aVar = new b.a();
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map.putAll(Collections.unmodifiableMap(((b) it.next()).a));
        }
        aVar.a(map);
        b bVar = new b(aVar.a);
        b.b(bVar);
        return bVar;
    }
}
