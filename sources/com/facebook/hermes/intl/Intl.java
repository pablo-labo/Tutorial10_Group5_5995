package com.facebook.hermes.intl;

import android.icu.lang.UCharacter;
import defpackage.f19;
import defpackage.f84;
import defpackage.g19;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@f84
public class Intl {
    @f84
    public static List<String> getCanonicalLocales(List<String> list) throws JSRangeErrorException {
        if (list.size() == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str == null) {
                throw new JSRangeErrorException("Incorrect locale information provided");
            }
            if (str.isEmpty()) {
                throw new JSRangeErrorException("Incorrect locale information provided");
            }
            String strE = f19.a(str).e();
            if (!strE.isEmpty() && !arrayList.contains(strE)) {
                arrayList.add(strE);
            }
        }
        return arrayList;
    }

    @f84
    public static String toLocaleLowerCase(List<String> list, String str) throws JSRangeErrorException {
        g19 g19Var = a.b((String[]) list.toArray(new String[list.size()])).a;
        g19Var.f();
        return UCharacter.toLowerCase(g19Var.a, str);
    }

    @f84
    public static String toLocaleUpperCase(List<String> list, String str) throws JSRangeErrorException {
        g19 g19Var = a.b((String[]) list.toArray(new String[list.size()])).a;
        g19Var.f();
        return UCharacter.toUpperCase(g19Var.a, str);
    }
}
