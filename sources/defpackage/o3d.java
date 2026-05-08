package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class o3d {
    public final y6b a;
    public final ArrayList b;
    public final boolean c;
    public final String d;

    public o3d(ArrayList arrayList, ArrayList arrayList2) {
        String str;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        loop0: while (true) {
            str = null;
            while (it.hasNext()) {
                y6b y6bVar = (y6b) it.next();
                arrayList3.add(y6bVar.a());
                HashMap mapA = y6bVar.a();
                if (mapA == null) {
                    mapA = null;
                }
                if (mapA != null) {
                    Object obj = mapA.get("ua");
                    str = obj instanceof String ? (String) obj : str;
                }
            }
            break loop0;
        }
        rqf rqfVar = new rqf();
        this.a = rqfVar;
        HashMap<String, Object> map = new t4e(arrayList3, "iglu:com.snowplowanalytics.snowplow/payload_data/jsonschema/1-0-4").a;
        HashMap<String, Object> map2 = map != null ? map : null;
        if (map2 != null) {
            rqfVar.e(map2);
        }
        this.b = arrayList2;
        this.d = str;
        this.c = false;
    }

    public o3d(y6b y6bVar, long j, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j));
        this.b = arrayList;
        this.a = y6bVar;
        this.c = z;
        HashMap mapA = y6bVar.a();
        String str = null;
        mapA = mapA == null ? null : mapA;
        if (mapA != null) {
            Object obj = mapA.get("ua");
            if (obj instanceof String) {
                str = (String) obj;
            }
        }
        this.d = str;
    }
}
