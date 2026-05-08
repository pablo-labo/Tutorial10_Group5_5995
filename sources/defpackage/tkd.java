package defpackage;

import android.os.Bundle;
import defpackage.ald;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tkd implements ald.b {
    public final /* synthetic */ ukd a;

    @Override // ald.b
    public final Bundle a() {
        Pair[] pairArr;
        ukd ukdVar = this.a;
        for (Map.Entry entry : lc9.g0(ukdVar.d).entrySet()) {
            ukdVar.a(((h4a) entry.getValue()).getValue(), (String) entry.getKey());
        }
        for (Map.Entry entry2 : lc9.g0(ukdVar.b).entrySet()) {
            ukdVar.a(((ald.b) entry2.getValue()).a(), (String) entry2.getKey());
        }
        LinkedHashMap linkedHashMap = ukdVar.a;
        if (linkedHashMap.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                arrayList.add(new Pair((String) entry3.getKey(), entry3.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        return aq1.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }
}
