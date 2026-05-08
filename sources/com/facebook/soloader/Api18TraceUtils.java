package com.facebook.soloader;

import android.annotation.TargetApi;
import android.os.Trace;
import defpackage.d84;
import defpackage.q6;
import defpackage.z3;

/* JADX INFO: loaded from: classes2.dex */
@d84
@TargetApi(18)
class Api18TraceUtils {
    public static void a(String str, String str2, String str3) {
        String strM = z3.m(str, str2, str3);
        if (strM.length() > 127 && str2 != null) {
            int length = (127 - str.length()) - str3.length();
            StringBuilder sbG = q6.g(str);
            sbG.append(str2.substring(0, length));
            sbG.append(str3);
            strM = sbG.toString();
        }
        Trace.beginSection(strM);
    }
}
