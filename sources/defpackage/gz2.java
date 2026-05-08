package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class gz2 {
    public static final pxc a = new pxc("\\s*;\\s*");
    public static final pxc b = new pxc("\\s*=\\s*");

    public static ArrayList a(String str) {
        str.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = a.g(str, 0).iterator();
        while (it.hasNext()) {
            List<String> listG = b.g(it.next(), 2);
            if (listG.size() == 2) {
                arrayList.add(new Pair(listG.get(0), listG.get(1)));
            }
        }
        return arrayList;
    }
}
