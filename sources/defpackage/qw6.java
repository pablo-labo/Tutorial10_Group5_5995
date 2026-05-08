package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class qw6 {
    public static final pxc a = new pxc("^\\t(\\d+)\\.\\s");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x047d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x063b  */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final defpackage.jhf r45, final java.lang.String r46, final java.lang.String r47, final java.lang.String r48, final java.lang.String r49, final float r50, androidx.compose.ui.e r51, java.lang.String r52, int r53, boolean r54, final defpackage.kcf r55, final kotlin.jvm.functions.Function1 r56, final kotlin.jvm.functions.Function1 r57, final kotlin.jvm.functions.Function1 r58, java.lang.String r59, androidx.compose.runtime.b r60, final int r61, final int r62, final int r63) {
        /*
            Method dump skipped, instruction units count: 1768
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qw6.a(jhf, java.lang.String, java.lang.String, java.lang.String, java.lang.String, float, androidx.compose.ui.e, java.lang.String, int, boolean, kcf, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, java.lang.String, androidx.compose.runtime.b, int, int, int):void");
    }

    public static final void b(int i, String str, ArrayList arrayList) {
        Integer numE;
        int iIntValue = (i <= 0 || (numE = e(f((String) arrayList.get(i + (-1))))) == null) ? 0 : numE.intValue();
        if (e(f(str)) == null) {
            arrayList.set(i, v40.c(iIntValue + 1, "\t", ". ", str));
        }
    }

    public static final void c(Function1<? super jhf, j6g> function1, jhf jhfVar, kcf kcfVar, kcf kcfVar2) {
        String str = jhfVar.a.b;
        long j = jhfVar.b;
        int i = kjf.c;
        int i2 = (int) (j >> 32);
        int size = zve.k0(str.substring(0, i2), new String[]{"\n"}).size() - 1;
        if (size >= 0) {
            ArrayList arrayList = new ArrayList(zve.k0(str, new String[]{"\n"}));
            String str2 = (String) arrayList.get(size);
            kcf kcfVar3 = kcf.c;
            if (kcfVar2 == kcfVar3) {
                String strF = f(str2);
                arrayList.set(size, wve.I(str2, strF, ""));
                String strW0 = z92.W0(arrayList, "\n", null, null, null, 62);
                int length = i2 - strF.length();
                function1.invoke(new jhf(strW0, cr8.c(length, length), 4));
                return;
            }
            kcf kcfVar4 = kcf.b;
            if (kcfVar == kcfVar3 && kcfVar2 == kcfVar4) {
                b(size, str2, arrayList);
                String strW02 = z92.W0(arrayList, "\n", null, null, null, 62);
                int length2 = (strW02.length() - str.length()) + i2;
                function1.invoke(new jhf(strW02, cr8.c(length2, length2), 4));
                return;
            }
            kcf kcfVar5 = kcf.a;
            if (kcfVar == kcfVar3 && kcfVar2 == kcfVar5) {
                if (!wve.K(str2, "\t• ", false)) {
                    arrayList.set(size, "\t• ".concat(str2));
                }
                String strW03 = z92.W0(arrayList, "\n", null, null, null, 62);
                int length3 = (strW03.length() - str.length()) + i2;
                function1.invoke(new jhf(strW03, cr8.c(length3, length3), 4));
                return;
            }
            if (kcfVar == kcfVar5 && kcfVar2 == kcfVar4) {
                arrayList.set(size, wve.I(str, f(str2), ""));
                b(size, str2, arrayList);
                String strW04 = z92.W0(arrayList, "\n", null, null, null, 62);
                int length4 = (strW04.length() - str.length()) + i2;
                function1.invoke(new jhf(strW04, cr8.c(length4, length4), 4));
                return;
            }
            if (kcfVar == kcfVar4 && kcfVar2 == kcfVar5) {
                arrayList.set(size, wve.I(str, f(str2), ""));
                if (!wve.K(str2, "\t• ", false)) {
                    arrayList.set(size, "\t• ".concat(str2));
                }
                String strW05 = z92.W0(arrayList, "\n", null, null, null, 62);
                int length5 = (strW05.length() - str.length()) + i2;
                function1.invoke(new jhf(strW05, cr8.c(length5, length5), 4));
            }
        }
    }

    public static final jhf d(String str, int i, kcf kcfVar, Function1<? super kcf, j6g> function1) throws IOException {
        int size = zve.k0(str.substring(0, i), new String[]{"\n"}).size();
        int i2 = size - 1;
        if (i2 < 0) {
            return new jhf(str, cr8.c(i, i), 4);
        }
        ArrayList arrayList = new ArrayList(zve.k0(str, new String[]{"\n"}));
        String str2 = (String) arrayList.get(i2);
        int iOrdinal = kcfVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                b(i2, str2, arrayList);
            } else if (i2 > 0) {
                String strF = f((String) arrayList.get(size - 2));
                Integer numE = e(strF);
                if (strF.equals("\t• ")) {
                    kcf kcfVar2 = kcf.a;
                    function1.invoke(kcfVar2);
                    return d(str, i, kcfVar2, function1);
                }
                if (numE != null) {
                    kcf kcfVar3 = kcf.b;
                    function1.invoke(kcfVar3);
                    return d(str, i, kcfVar3, function1);
                }
            }
        } else if (!wve.K(str2, "\t• ", false)) {
            arrayList.set(i2, "\t• ".concat(str2));
        }
        String strW0 = z92.W0(arrayList, "\n", null, null, null, 62);
        int length = (strW0.length() - str.length()) + i;
        return new jhf(strW0, cr8.c(length, length), 4);
    }

    public static final Integer e(String str) {
        String str2;
        ke9 ke9VarA = new pxc("^\\t(\\d+)\\.\\s").a(str, 0);
        if (ke9VarA == null || (str2 = (String) z92.Z0(ke9VarA.a())) == null) {
            return null;
        }
        return vve.B(10, str2);
    }

    public static final String f(String str) {
        if (wve.K(str, "\t• ", false)) {
            return "\t• ";
        }
        ke9 ke9VarA = a.a(str, 0);
        return (ke9VarA != null ? (String) z92.Z0(ke9VarA.a()) : null) != null ? zve.q0(str, " ").concat(" ") : "";
    }
}
