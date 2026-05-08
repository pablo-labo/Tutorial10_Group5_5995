package defpackage;

import android.content.Context;
import android.content.Intent;
import defpackage.o8;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class u8 extends o8<String[], Map<String, Boolean>> {
    @Override // defpackage.o8
    public final Intent a(Object obj, Context context) {
        String[] strArr = (String[]) obj;
        strArr.getClass();
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        intentPutExtra.getClass();
        return intentPutExtra;
    }

    @Override // defpackage.o8
    public final o8.a b(Object obj, Context context) {
        String[] strArr = (String[]) obj;
        strArr.getClass();
        if (strArr.length == 0) {
            return new o8.a(bs4.a);
        }
        for (String str : strArr) {
            if (ot2.a(context, str) != 0) {
                return null;
            }
        }
        int iV = kc9.V(strArr.length);
        if (iV < 16) {
            iV = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iV);
        for (String str2 : strArr) {
            Pair pair = new Pair(str2, Boolean.TRUE);
            linkedHashMap.put(pair.d(), pair.e());
        }
        return new o8.a(linkedHashMap);
    }

    @Override // defpackage.o8
    public final Object c(Intent intent, int i) {
        if (i == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i2 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i2 == 0));
                }
                return lc9.f0(z92.H1(ut0.i0(stringArrayExtra), arrayList));
            }
        }
        return bs4.a;
    }
}
