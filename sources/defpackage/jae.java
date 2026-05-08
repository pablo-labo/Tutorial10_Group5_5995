package defpackage;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* JADX INFO: loaded from: classes3.dex */
public final class jae implements xh8 {
    public static da2 a(String str) {
        int iC;
        if (str != null && !zve.U(str)) {
            String strB0 = zve.b0(zve.s0(str).toString(), "#");
            if (strB0.length() != 6 && strB0.length() != 8) {
                l5.q("Invalid hex color: expected #RRGGBB or #AARRGGBB, got: ".concat(str));
                return null;
            }
            if (strB0.length() == 8) {
                Integer numB = vve.B(16, strB0.substring(0, 2));
                if (numB == null) {
                    l5.q("Invalid hex color: alpha is not valid hex, got: ".concat(str));
                    return null;
                }
                iC = nic.C(numB.intValue(), 0, 255);
            } else {
                iC = 255;
            }
            int i = strB0.length() != 8 ? 0 : 2;
            int i2 = i + 2;
            Integer numB2 = vve.B(16, strB0.substring(i, i2));
            if (numB2 != null) {
                int iC2 = nic.C(numB2.intValue(), 0, 255);
                int i3 = i + 4;
                Integer numB3 = vve.B(16, strB0.substring(i2, i3));
                if (numB3 == null) {
                    l5.q("Invalid hex color: green component is not valid hex, got: ".concat(str));
                    return null;
                }
                int iC3 = nic.C(numB3.intValue(), 0, 255);
                Integer numB4 = vve.B(16, strB0.substring(i3, i + 6));
                if (numB4 != null) {
                    return new da2(pnb.f(iC2, iC3, nic.C(numB4.intValue(), 0, 255), iC));
                }
                l5.q("Invalid hex color: blue component is not valid hex, got: ".concat(str));
                return null;
            }
            l5.q("Invalid hex color: red component is not valid hex, got: ".concat(str));
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList b(com.facebook.react.bridge.ReadableArray r13, java.lang.String r14, kotlin.jvm.functions.Function1 r15) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jae.b(com.facebook.react.bridge.ReadableArray, java.lang.String, kotlin.jvm.functions.Function1):java.util.ArrayList");
    }

    public static sof c(ReadableMap readableMap) {
        vmf vmfVar;
        String string = null;
        String string2 = (readableMap.hasKey("title") && readableMap.getType("title") == ReadableType.String) ? readableMap.getString("title") : null;
        if (readableMap.hasKey("alignment") && readableMap.getType("alignment") == ReadableType.String) {
            string = readableMap.getString("alignment");
        }
        if (wl7.b(string, "Leading")) {
            vmfVar = vmf.a;
        } else {
            wl7.b(string, "Center");
            vmfVar = vmf.b;
        }
        return new sof(string2, vmfVar, null, new li(12), 8);
    }
}
