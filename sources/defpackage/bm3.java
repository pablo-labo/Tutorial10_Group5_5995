package defpackage;

import defpackage.cu1;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bm3 implements cu1 {
    @Override // defpackage.cu1
    public final cu1.b a(xga xgaVar, xga xgaVar2) {
        if (xgaVar2.a != 304 || xgaVar == null) {
            return new cu1.b(xgaVar2);
        }
        hga hgaVar = xgaVar.d;
        hga hgaVar2 = xgaVar2.d;
        hgaVar.getClass();
        Map<String, List<String>> map = hgaVar.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), z92.B1((Collection) entry.getValue()));
        }
        for (Map.Entry<String, List<String>> entry2 : hgaVar2.a.entrySet()) {
            String key = entry2.getKey();
            List<String> value = entry2.getValue();
            String lowerCase = key.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            linkedHashMap.put(lowerCase, z92.B1(value));
        }
        return new cu1.b(new xga(xgaVar2.a, xgaVar2.b, xgaVar2.c, new hga(lc9.g0(linkedHashMap)), null, xgaVar2.f));
    }

    @Override // defpackage.cu1
    public final cu1.a b(xga xgaVar) {
        return new cu1.a(xgaVar);
    }
}
