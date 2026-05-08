package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.ExtractedText;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import androidx.compose.ui.platform.AndroidComposeView;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.iid.Registrar;
import io.jsonwebtoken.JwtParser;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes.dex */
public final class cr8 implements jg2, nvh, i1i {
    public final /* synthetic */ int a;
    public static final b43 b = new b43(1);
    public static final cr8 c = new cr8(1);
    public static final cr8 d = new cr8(2);
    public static final ykf e = new ykf(0, new long[0], new Object[0]);
    public static final cr8 f = new cr8(4);
    public static final cr8 V = new cr8(5);
    public static final cr8 W = new cr8(6);
    public static final cr8 X = new cr8(7);
    public static final cr8 Y = new cr8(8);
    public static final cr8 Z = new cr8(9);
    public static final cr8 a0 = new cr8(10);

    public /* synthetic */ cr8(int i) {
        this.a = i;
    }

    public static void A(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = j5 ^ (j7 >>> 50);
        long j9 = (j4 ^ ((j7 >>> 1) ^ (j7 << 14))) ^ (j6 >>> 50);
        long j10 = j ^ (j8 << 63);
        long j11 = (j2 ^ (j6 << 63)) ^ ((j8 >>> 1) ^ (j8 << 14));
        long j12 = ((j3 ^ (j7 << 63)) ^ ((j6 >>> 1) ^ (j6 << 14))) ^ (j8 >>> 50);
        long j13 = j9 >>> 1;
        jArr2[0] = (j10 ^ j13) ^ (j13 << 15);
        jArr2[1] = (j9 >>> 50) ^ j11;
        jArr2[2] = j12;
        jArr2[3] = 1 & j9;
    }

    public static final boolean B(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof AndroidComposeView) {
            return ((AndroidComposeView) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    public static void D(long[] jArr, long[] jArr2, int i) {
        long[] jArr3 = new long[8];
        u(jArr, jArr3);
        A(jArr3, jArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            u(jArr2, jArr3);
            A(jArr3, jArr2);
        }
    }

    public static final void E(yd8 yd8Var, String str) {
        String string;
        yd8Var.getClass();
        String str2 = "in the polymorphic scope of '" + yd8Var.r() + '\'';
        if (str == null) {
            string = ja.f(JwtParser.SEPARATOR_CHAR, "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder sbF = u40.f("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            ia.r(sbF, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbF.append(yd8Var.r());
            sbF.append("' has to be sealed and '@Serializable'.");
            string = sbF.toString();
        }
        throw new SerializationException(string);
    }

    public static final Integer F(int i) {
        if (i == 5) {
            return 33;
        }
        if (i == 6) {
            return 130;
        }
        if (i == 3) {
            return 17;
        }
        if (i == 4) {
            return 66;
        }
        if (i == 1) {
            return 2;
        }
        return i == 2 ? 1 : null;
    }

    public static final ExtractedText G(jhf jhfVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = jhfVar.a.b;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = jhfVar.b;
        extractedText.selectionStart = kjf.f(j);
        extractedText.selectionEnd = kjf.e(j);
        extractedText.flags = !zve.M(jhfVar.a.b, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final ol5 H(int i) {
        if (i == 1) {
            return new ol5(2);
        }
        if (i == 2) {
            return new ol5(1);
        }
        if (i == 17) {
            return new ol5(3);
        }
        if (i == 33) {
            return new ol5(5);
        }
        if (i == 66) {
            return new ol5(4);
        }
        if (i != 130) {
            return null;
        }
        return new ol5(6);
    }

    public static final List I(int i, int i2, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return zr4.a;
        }
        ArrayList arrayList2 = new ArrayList(list);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            br8 br8Var = (br8) arrayList.get(i3);
            int index = br8Var.getIndex();
            if (i <= index && index <= i2) {
                arrayList2.add(br8Var);
            }
        }
        w92.E0(b, arrayList2);
        return arrayList2;
    }

    public static final void b(int i, gu5 gu5Var, b bVar, boolean z) {
        gu5 gu5Var2;
        gu5Var.getClass();
        c cVarH = bVar.h(-1214383909);
        int i2 = (cVarH.a(z) ? 4 : 2) | i | (cVarH.x(gu5Var) ? 32 : 16);
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            if (z) {
                cVarH.L(-1201362161);
                Object objV = cVarH.v();
                if (objV == b.a.a) {
                    objV = new o7(10);
                    cVarH.p(objV);
                }
                gu5Var2 = gu5Var;
                qof.a(gu5Var2, (gu5) objV, false, cVarH, ((i2 >> 3) & 14) | 432, 0);
            } else {
                gu5Var2 = gu5Var;
                cVarH.L(-1201672409);
            }
            cVarH.U(false);
        } else {
            gu5Var2 = gu5Var;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new el6(i, gu5Var2, z);
        }
    }

    public static final long c(int i, int i2) {
        if (i < 0 || i2 < 0) {
            be7.a("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        int i3 = kjf.c;
        return j;
    }

    public static final float e(long j, long j2) {
        return Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static final boolean f(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (wl7.c(cCharAt, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }

    public static void g(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr2[6] ^ jArr[6];
    }

    public static final qtc h(View view, AndroidComposeView androidComposeView) {
        int[] iArr = q92.V;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        androidComposeView.getLocationInWindow(iArr);
        float f2 = i - iArr[0];
        float f3 = i2 - iArr[1];
        return new qtc(f2, f3, view.getWidth() + f2, view.getHeight() + f3);
    }

    public static final long j(int i, long j) {
        int i2 = kjf.c;
        int i3 = (int) (j >> 32);
        int i4 = i3 < 0 ? 0 : i3;
        if (i4 > i) {
            i4 = i;
        }
        int i5 = (int) (4294967295L & j);
        int i6 = i5 >= 0 ? i5 : 0;
        if (i6 <= i) {
            i = i6;
        }
        return (i4 == i3 && i == i5) ? j : c(i4, i);
    }

    public static final void l(pa5 pa5Var, w5b w5bVar) throws IOException {
        try {
            IOException iOException = null;
            for (w5b w5bVar2 : pa5Var.h(w5bVar)) {
                try {
                    if (pa5Var.i(w5bVar2).b) {
                        l(pa5Var, w5bVar2);
                    }
                    pa5Var.e(w5bVar2);
                } catch (IOException e2) {
                    if (iOException == null) {
                        iOException = e2;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int m(defpackage.yfd r18, defpackage.x4d r19, defpackage.vs4 r20, int r21) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cr8.m(yfd, x4d, vs4, int):int");
    }

    public static boolean n() {
        return ((kq7) p(kq7.class)).j("Onboarding", "OnboardingCompleted", false) && ((kq7) p(kq7.class)).j("Onboarding", "AllQuestionsSkipped", false) && x() && w() && ((pp7) p(pp7.class)).a() != gr7.b;
    }

    public static boolean o() {
        return (((kq7) p(kq7.class)).j("Onboarding", "OnboardingCompleted", false) || !x() || ((pp7) p(pp7.class)).a() == gr7.b) ? false : true;
    }

    public static Object p(Class cls) {
        yd8 yd8VarB = fwc.a.b(cls);
        vh8 vh8Var = web.d;
        if (vh8Var != null) {
            return ((qpd) vh8Var.a.b).a(null, yd8VarB, null);
        }
        r6.g("KoinApplication has not been started");
        return null;
    }

    public static boolean q() {
        return ((kq7) p(kq7.class)).j("Onboarding", "EligibleWhenSawRegPromo", false);
    }

    public static void r(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = j & 562949953421311L;
        jArr2[1] = ((j >>> 49) ^ (j2 << 15)) & 562949953421311L;
        jArr2[2] = ((j2 >>> 34) ^ (j3 << 30)) & 562949953421311L;
        jArr2[3] = (j3 >>> 19) ^ (j4 << 45);
    }

    public static void s(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        r(jArr, jArr4);
        r(jArr2, jArr5);
        t(jArr4[0], jArr5[0], jArr3, 0);
        t(jArr4[1], jArr5[1], jArr3, 1);
        t(jArr4[2], jArr5[2], jArr3, 2);
        t(jArr4[3], jArr5[3], jArr3, 3);
        for (int i = 5; i > 0; i--) {
            jArr3[i] = jArr3[i] ^ jArr3[i - 1];
        }
        t(jArr4[1] ^ jArr4[0], jArr5[1] ^ jArr5[0], jArr3, 1);
        t(jArr4[3] ^ jArr4[2], jArr5[3] ^ jArr5[2], jArr3, 3);
        for (int i2 = 7; i2 > 1; i2--) {
            jArr3[i2] = jArr3[i2] ^ jArr3[i2 - 2];
        }
        long j = jArr4[0] ^ jArr4[2];
        long j2 = jArr4[1] ^ jArr4[3];
        long j3 = jArr5[0] ^ jArr5[2];
        long j4 = jArr5[3] ^ jArr5[1];
        t(j ^ j2, j3 ^ j4, jArr3, 3);
        long[] jArr6 = new long[3];
        t(j, j3, jArr6, 0);
        t(j2, j4, jArr6, 1);
        long j5 = jArr6[0];
        long j6 = jArr6[1];
        long j7 = jArr6[2];
        long j8 = jArr3[2] ^ j5;
        jArr3[2] = j8;
        long j9 = (j5 ^ j6) ^ jArr3[3];
        jArr3[3] = j9;
        long j10 = (j6 ^ j7) ^ jArr3[4];
        jArr3[4] = j10;
        long j11 = j7 ^ jArr3[5];
        jArr3[5] = j11;
        long j12 = jArr3[0];
        long j13 = jArr3[1];
        long j14 = jArr3[6];
        long j15 = jArr3[7];
        jArr3[0] = j12 ^ (j13 << 49);
        jArr3[1] = (j13 >>> 15) ^ (j8 << 34);
        jArr3[2] = (j8 >>> 30) ^ (j9 << 19);
        jArr3[3] = ((j9 >>> 45) ^ (j10 << 4)) ^ (j11 << 53);
        jArr3[4] = ((j10 >>> 60) ^ (j14 << 38)) ^ (j11 >>> 11);
        jArr3[5] = (j14 >>> 26) ^ (j15 << 23);
        jArr3[6] = j15 >>> 41;
        jArr3[7] = 0;
    }

    public static void t(long j, long j2, long[] jArr, int i) {
        long j3 = j2 << 1;
        long j4 = j3 ^ j2;
        long j5 = j2 << 2;
        long j6 = j4 << 1;
        long[] jArr2 = {0, j2, j3, j4, j5, j5 ^ j2, j6, j6 ^ j2};
        int i2 = (int) j;
        long j7 = (jArr2[(i2 >>> 3) & 7] << 3) ^ jArr2[i2 & 7];
        long j8 = 0;
        int i3 = 36;
        do {
            int i4 = (int) (j >>> i3);
            long j9 = (((jArr2[i4 & 7] ^ (jArr2[(i4 >>> 3) & 7] << 3)) ^ (jArr2[(i4 >>> 6) & 7] << 6)) ^ (jArr2[(i4 >>> 9) & 7] << 9)) ^ (jArr2[(i4 >>> 12) & 7] << 12);
            j7 ^= j9 << i3;
            j8 ^= j9 >>> (-i3);
            i3 -= 15;
        } while (i3 > 0);
        jArr[i] = jArr[i] ^ (562949953421311L & j7);
        int i5 = i + 1;
        jArr[i5] = jArr[i5] ^ ((j7 >>> 49) ^ (j8 << 15));
    }

    public static void u(long[] jArr, long[] jArr2) {
        wab.j(0, jArr[0], jArr2);
        wab.j(2, jArr[1], jArr2);
        wab.j(4, jArr[2], jArr2);
        jArr2[6] = jArr[3] & 1;
    }

    public static final boolean v(s38 s38Var, int i) {
        int i2;
        s38Var.getClass();
        switch (s38Var.ordinal()) {
            case 1:
                i2 = 1;
                break;
            case 2:
                i2 = 2;
                break;
            case 3:
                i2 = 3;
                break;
            case 4:
                i2 = 4;
                break;
            case 5:
                i2 = 5;
                break;
            case 6:
                i2 = 6;
                break;
            case 7:
                i2 = 7;
                break;
            case 8:
                i2 = 8;
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                i2 = 9;
                break;
            case 10:
                i2 = 10;
                break;
            case 11:
                i2 = 11;
                break;
            case 12:
                i2 = 12;
                break;
            default:
                i2 = -1;
                break;
        }
        if (i2 < 0) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        int i3 = calendar.get(1);
        return i > i3 || (i == i3 && i2 > calendar.get(2) + 1);
    }

    public static boolean w() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long lH = ((kq7) p(kq7.class)).h(0L, "Onboarding", "LastShownTimestamp");
        return jCurrentTimeMillis - (lH != null ? lH.longValue() : 0L) > 172800000;
    }

    public static boolean x() {
        Integer numC = ((kq7) p(kq7.class)).c("Onboarding", 0, "OnboardingShownCount");
        return (numC != null ? numC.intValue() : 0) < 2;
    }

    public static final bg9 y(zgd zgdVar, int i, int i2, int i3, int i4, int i5, q qVar, List list, w[] wVarArr, int i6, int i7, int[] iArr, int i8) {
        int i9;
        float f2;
        long j;
        int i10;
        int i11;
        int i12;
        List list2 = list;
        long j2 = i5;
        int i13 = i7 - i6;
        int[] iArr2 = new int[i13];
        int i14 = i6;
        int iMax = 0;
        int i15 = 0;
        int i16 = 0;
        int iMin = 0;
        float f3 = 0.0f;
        while (i14 < i7) {
            vf9 vf9Var = (vf9) list2.get(i14);
            float fN = q92.n(q92.l(vf9Var));
            if (fN > 0.0f) {
                f3 += fN;
                i15++;
                j = j2;
                i10 = i14;
            } else {
                int i17 = i3 - i16;
                w wVarR = wVarArr[i14];
                j = j2;
                if (wVarR == null) {
                    if (i3 == Integer.MAX_VALUE) {
                        i10 = i14;
                        i11 = i15;
                        i12 = Integer.MAX_VALUE;
                    } else {
                        i10 = i14;
                        i11 = i15;
                        i12 = i17 < 0 ? 0 : i17;
                    }
                    wVarR = vf9Var.R(zgdVar.d(0, i12, i4, false));
                } else {
                    i10 = i14;
                    i11 = i15;
                }
                w wVar = wVarR;
                int iG = zgdVar.g(wVar);
                int iJ = zgdVar.j(wVar);
                iArr2[i10 - i6] = iG;
                int i18 = i17 - iG;
                if (i18 < 0) {
                    i18 = 0;
                }
                iMin = Math.min(i5, i18);
                i16 += iG + iMin;
                iMax = Math.max(iMax, iJ);
                wVarArr[i10] = wVar;
                i15 = i11;
            }
            i14 = i10 + 1;
            j2 = j;
        }
        long j3 = j2;
        int i19 = i15;
        if (i19 == 0) {
            i16 -= iMin;
            i9 = 0;
        } else {
            long j4 = ((long) (i19 - 1)) * j3;
            long jRound = ((long) ((i3 != Integer.MAX_VALUE ? i3 : i) - i16)) - j4;
            if (jRound < 0) {
                jRound = 0;
            }
            float f4 = jRound / f3;
            for (int i20 = i6; i20 < i7; i20++) {
                jRound -= (long) Math.round(q92.n(q92.l((vf9) list2.get(i20))) * f4);
            }
            int i21 = i6;
            int i22 = iMax;
            int i23 = 0;
            while (i21 < i7) {
                if (wVarArr[i21] == null) {
                    vf9 vf9Var2 = (vf9) list2.get(i21);
                    f2 = f4;
                    ahd ahdVarL = q92.l(vf9Var2);
                    float fN2 = q92.n(ahdVarL);
                    if (fN2 <= 0.0f) {
                        yd7.b("All weights <= 0 should have placeables");
                    }
                    int iSignum = Long.signum(jRound);
                    long j5 = jRound - ((long) iSignum);
                    int iMax2 = Math.max(0, Math.round(fN2 * f2) + iSignum);
                    w wVarR2 = vf9Var2.R(zgdVar.d((!(ahdVarL != null ? ahdVarL.b : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i4, true));
                    int iG2 = zgdVar.g(wVarR2);
                    int iJ2 = zgdVar.j(wVarR2);
                    iArr2[i21 - i6] = iG2;
                    i23 += iG2;
                    int iMax3 = Math.max(i22, iJ2);
                    wVarArr[i21] = wVarR2;
                    i22 = iMax3;
                    jRound = j5;
                } else {
                    f2 = f4;
                }
                i21++;
                list2 = list;
                f4 = f2;
            }
            i9 = (int) (((long) i23) + j4);
            int i24 = i3 - i16;
            if (i9 < 0) {
                i9 = 0;
            }
            if (i9 > i24) {
                i9 = i24;
            }
            iMax = i22;
        }
        int i25 = i9 + i16;
        if (i25 < 0) {
            i25 = 0;
        }
        int iMax4 = Math.max(i25, i);
        int iMax5 = Math.max(iMax, Math.max(i2, 0));
        int[] iArr3 = new int[i13];
        zgdVar.b(iMax4, iArr2, iArr3, qVar);
        return zgdVar.i(wVarArr, qVar, iArr3, iMax4, iMax5, iArr, i8, i6, i7);
    }

    public static void z(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        s(jArr, jArr2, jArr4);
        A(jArr4, jArr3);
    }

    public void C(boolean z) {
        throw null;
    }

    public void J(String str) {
        if (i(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    public void K(Exception exc, String str) {
        if (i(5)) {
            Log.w("FirebaseCrashlytics", str, exc);
        }
    }

    @Override // defpackage.i1i
    public byte[] a(int i, byte[] bArr, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // defpackage.jg2
    public Object d(l7d l7dVar) {
        return new Registrar.a();
    }

    public boolean i(int i) {
        return 4 <= i || Log.isLoggable("FirebaseCrashlytics", i);
    }

    public void k(String str) {
        if (i(3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    @Override // defpackage.nvh
    public Object zza() {
        switch (this.a) {
            case 6:
                List<svh<?>> list = djh.a;
                return Long.valueOf(((ubi) vbi.b.zza()).zzq());
            case 7:
                List<svh<?>> list2 = djh.a;
                return Boolean.valueOf(((igi) fgi.b.zza()).zzb());
            case 8:
                List<svh<?>> list3 = djh.a;
                return Boolean.valueOf(((lfi) mfi.b.zza()).zzb());
            case DatadogLogGenerator.CRASH /* 9 */:
                List<svh<?>> list4 = djh.a;
                return Boolean.valueOf(((uci) oci.b.zza()).zzc());
            default:
                List<svh<?>> list5 = djh.a;
                return Boolean.valueOf(((kfi) gfi.b.zza()).zzb());
        }
    }
}
