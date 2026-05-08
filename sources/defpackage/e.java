package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.mb8;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final Object a(mb8 mb8Var) {
        mb8.a aVarPeek = mb8Var.peek();
        int iOrdinal = aVarPeek.ordinal();
        if (iOrdinal == 0) {
            ArrayList arrayListH = v40.h(mb8Var);
            while (mb8Var.hasNext()) {
                arrayListH.add(a(mb8Var));
            }
            mb8Var.l();
            return arrayListH;
        }
        if (iOrdinal == 2) {
            mb8Var.j();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (mb8Var.hasNext()) {
                linkedHashMap.put(mb8Var.X(), a(mb8Var));
            }
            mb8Var.t();
            return linkedHashMap;
        }
        switch (iOrdinal) {
            case 5:
                break;
            case 6:
            case 7:
                try {
                    try {
                        try {
                        } catch (Exception unused) {
                            return Double.valueOf(mb8Var.nextDouble());
                        }
                    } catch (Exception unused2) {
                        return Long.valueOf(mb8Var.nextLong());
                    }
                } catch (Exception unused3) {
                    return mb8Var.B1();
                }
                break;
            case 8:
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                mb8Var.l1();
                break;
            default:
                ja.i(aVarPeek, "unknown token ");
                break;
        }
        return null;
    }
}
