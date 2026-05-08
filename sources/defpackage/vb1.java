package defpackage;

import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class vb1 {
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final Random d;

    public vb1() {
        Random random = new Random();
        this.c = new HashMap();
        this.d = random;
        this.a = new HashMap();
        this.b = new HashMap();
    }

    public static void b(long j, HashMap map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            map.remove(arrayList.get(i));
        }
    }

    public final ArrayList a(List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.a;
        b(jElapsedRealtime, map);
        HashMap map2 = this.b;
        b(jElapsedRealtime, map2);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            tb1 tb1Var = (tb1) list.get(i);
            if (!map.containsKey(tb1Var.b) && !map2.containsKey(Integer.valueOf(tb1Var.c))) {
                arrayList.add(tb1Var);
            }
        }
        return arrayList;
    }

    public final tb1 c(List<tb1> list) {
        tb1 tb1Var;
        ArrayList arrayListA = a(list);
        if (arrayListA.size() < 2) {
            return (tb1) h4.k(arrayListA, null);
        }
        int i = 0;
        Collections.sort(arrayListA, new ub1(0));
        ArrayList arrayList = new ArrayList();
        int i2 = ((tb1) arrayListA.get(0)).c;
        int i3 = 0;
        while (true) {
            if (i3 >= arrayListA.size()) {
                break;
            }
            tb1 tb1Var2 = (tb1) arrayListA.get(i3);
            if (i2 == tb1Var2.c) {
                arrayList.add(new Pair(tb1Var2.b, Integer.valueOf(tb1Var2.d)));
                i3++;
            } else if (arrayList.size() == 1) {
                return (tb1) arrayListA.get(0);
            }
        }
        HashMap map = this.c;
        tb1 tb1Var3 = (tb1) map.get(arrayList);
        if (tb1Var3 != null) {
            return tb1Var3;
        }
        List listSubList = arrayListA.subList(0, arrayList.size());
        int i4 = 0;
        for (int i5 = 0; i5 < listSubList.size(); i5++) {
            i4 += ((tb1) listSubList.get(i5)).d;
        }
        int iNextInt = this.d.nextInt(i4);
        int i6 = 0;
        while (true) {
            if (i >= listSubList.size()) {
                tb1Var = (tb1) h4.l(listSubList);
                break;
            }
            tb1Var = (tb1) listSubList.get(i);
            i6 += tb1Var.d;
            if (iNextInt < i6) {
                break;
            }
            i++;
        }
        map.put(arrayList, tb1Var);
        return tb1Var;
    }
}
