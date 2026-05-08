package com.indeed.android.jobsearch.locationselector;

import defpackage.d2f;
import defpackage.dp0;
import defpackage.vh8;
import defpackage.xh8;
import defpackage.zr4;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements xh8 {
    public static final a a = new a();
    public static LinkedHashMap b = new LinkedHashMap();
    public static final d2f c = new d2f(new dp0(2));

    public static List a(String str) {
        str.getClass();
        if (b.isEmpty()) {
            List list = (List) ((Map) c.getValue()).get(str);
            if (list != null) {
                return list;
            }
        } else {
            List list2 = (List) b.get(str);
            if (list2 != null) {
                return list2;
            }
        }
        return zr4.a;
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
