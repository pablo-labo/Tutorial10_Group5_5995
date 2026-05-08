package defpackage;

import com.android.volley.VolleyError;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.ts1;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public final class hha {

    public static class a {
        public final String a;
        public final VolleyError b;

        public a(String str, VolleyError volleyError) {
            this.a = str;
            this.b = volleyError;
        }
    }

    public static wga a(m3d m3dVar, List list) {
        ts1.a cacheEntry = m3dVar.getCacheEntry();
        if (cacheEntry == null) {
            return new wga(304, null, true, list);
        }
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(((pg6) it.next()).a);
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<pg6> list2 = cacheEntry.h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (pg6 pg6Var : cacheEntry.h) {
                    if (!treeSet.contains(pg6Var.a)) {
                        arrayList.add(pg6Var);
                    }
                }
            }
        } else if (!cacheEntry.g.isEmpty()) {
            for (Map.Entry<String, String> entry : cacheEntry.g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new pg6(entry.getKey(), entry.getValue()));
                }
            }
        }
        return new wga(304, cacheEntry.a, true, arrayList);
    }

    public static byte[] b(InputStream inputStream, int i, br1 br1Var) throws Throwable {
        byte[] bArrA;
        kgb kgbVar = new kgb(br1Var, i);
        try {
            bArrA = br1Var.a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
            while (true) {
                try {
                    int i2 = inputStream.read(bArrA);
                    if (i2 == -1) {
                        break;
                    }
                    kgbVar.write(bArrA, 0, i2);
                } catch (Throwable th) {
                    th = th;
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        jtg.d("Error occurred when closing InputStream", new Object[0]);
                    }
                    br1Var.b(bArrA);
                    kgbVar.close();
                    throw th;
                }
            }
            byte[] byteArray = kgbVar.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                jtg.d("Error occurred when closing InputStream", new Object[0]);
            }
            br1Var.b(bArrA);
            kgbVar.close();
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            bArrA = null;
        }
    }
}
