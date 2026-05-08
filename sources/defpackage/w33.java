package defpackage;

import android.content.Context;
import defpackage.v33;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class w33 {
    public static final HashMap f;
    public static final String g;
    public final Context a;
    public final nr6 b;
    public final qk0 c;
    public final ws9 d;
    public final nbe e;

    static {
        HashMap map = new HashMap();
        f = map;
        p6.f(5, map, "armeabi", 6, "armeabi-v7a");
        p6.f(9, map, "arm64-v8a", 0, "x86");
        map.put("x86_64", 1);
        Locale locale = Locale.US;
        g = "Crashlytics Android SDK/18.6.3";
    }

    public w33(Context context, nr6 nr6Var, qk0 qk0Var, ws9 ws9Var, nbe nbeVar) {
        this.a = context;
        this.b = nr6Var;
        this.c = qk0Var;
        this.d = ws9Var;
        this.e = nbeVar;
    }

    public static k21 c(kuf kufVar, int i) {
        String str = kufVar.b;
        String str2 = kufVar.a;
        StackTraceElement[] stackTraceElementArr = kufVar.c;
        int i2 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        kuf kufVar2 = kufVar.d;
        if (i >= 8) {
            kuf kufVar3 = kufVar2;
            while (kufVar3 != null) {
                kufVar3 = kufVar3.d;
                i2++;
            }
        }
        int i3 = i2;
        List listD = d(stackTraceElementArr, 4);
        k21 k21VarC = null;
        if (listD == null) {
            ja.k("Null frames");
            return null;
        }
        if (kufVar2 != null && i3 == 0) {
            k21VarC = c(kufVar2, i + 1);
        }
        return new k21(str, str2, listD, k21VarC, i3);
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            arrayList.add(new n21(jMax, str, fileName, lineNumber, i));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final List<v33.e.d.a.b.AbstractC0443a> a() {
        qk0 qk0Var = this.c;
        String str = qk0Var.e;
        if (str != null) {
            return Collections.singletonList(new j21(0L, 0L, str, qk0Var.b));
        }
        ja.k("Null name");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.p21 b(int r13) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w33.b(int):p21");
    }
}
