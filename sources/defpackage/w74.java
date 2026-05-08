package defpackage;

import android.text.Layout;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.draw.a;
import androidx.compose.ui.e;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.datadog.android.core.internal.system.DefaultAndroidInfoProvider;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import org.apache.avro.reflect.Nullable;

/* JADX INFO: loaded from: classes.dex */
@fd8
public final class w74 implements n0d, nvh {
    public static final ah2 V;
    public static final ah2 W;
    public static final ah2 X;
    public static final ah2 Y;
    public static final ah2 Z;
    public static final ah2 b;
    public static final ah2 c;
    public static final ah2 d;
    public static final ah2 e;
    public static final ah2 f;
    public static WeakReference h0;
    public static boolean i0;
    public static w74 j0;
    public final /* synthetic */ int a;
    public static final long[] a0 = {3161836309350906777L, -7642453882179322845L, -3821226941089661423L, 7312758566309945096L, -556661012383879292L, 8945041530681231562L, -4750851271514160027L, 6847946401097695794L, 541669439031730457L};
    public static final /* synthetic */ w74 b0 = new w74(9);
    public static final w74 c0 = new w74(10);
    public static final w74 d0 = new w74(11);
    public static final w74 e0 = new w74(12);
    public static final w74 f0 = new w74(13);
    public static final w74 g0 = new w74(14);

    static {
        int i = 0;
        b = new ah2(-1704633345, new qh2(i), false);
        int i2 = 1;
        c = new ah2(-20616164, new qh2(i2), false);
        d = new ah2(-561580916, new cj2(i), false);
        int i3 = 2;
        e = new ah2(-493426226, new qh2(i3), false);
        f = new ah2(437650562, new ki2(i3), false);
        V = new ah2(-74636391, new c10(i3), false);
        W = new ah2(-159604995, new zh1(i3), false);
        X = new ah2(-703198777, new ph2(i3), false);
        Y = new ah2(-1114320306, new vb2(i3), false);
        Z = new ah2(289548880, new cj2(i2), false);
    }

    public /* synthetic */ w74(int i) {
        this.a = i;
    }

    public static int A(@Nullable Object obj) {
        int i = 0;
        if (obj == null) {
            return 0;
        }
        if (obj.getClass().isArray()) {
            int iHashCode = 7;
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                int length = objArr.length;
                while (i < length) {
                    iHashCode = (iHashCode * 31) + A(objArr[i]);
                    i++;
                }
                return iHashCode;
            }
            if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length2 = zArr.length;
                while (i < length2) {
                    iHashCode = (iHashCode * 31) + Boolean.hashCode(zArr[i]);
                    i++;
                }
                return iHashCode;
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int length3 = bArr.length;
                while (i < length3) {
                    iHashCode = (iHashCode * 31) + bArr[i];
                    i++;
                }
                return iHashCode;
            }
            if (obj instanceof char[]) {
                char[] cArr = (char[]) obj;
                int length4 = cArr.length;
                while (i < length4) {
                    iHashCode = (iHashCode * 31) + cArr[i];
                    i++;
                }
                return iHashCode;
            }
            if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length5 = dArr.length;
                while (i < length5) {
                    iHashCode = (iHashCode * 31) + Double.hashCode(dArr[i]);
                    i++;
                }
                return iHashCode;
            }
            if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                int length6 = fArr.length;
                while (i < length6) {
                    iHashCode = (iHashCode * 31) + Float.hashCode(fArr[i]);
                    i++;
                }
                return iHashCode;
            }
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length7 = iArr.length;
                while (i < length7) {
                    iHashCode = (iHashCode * 31) + iArr[i];
                    i++;
                }
                return iHashCode;
            }
            if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length8 = jArr.length;
                while (i < length8) {
                    iHashCode = (iHashCode * 31) + Long.hashCode(jArr[i]);
                    i++;
                }
                return iHashCode;
            }
            if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int length9 = sArr.length;
                while (i < length9) {
                    iHashCode = (iHashCode * 31) + sArr[i];
                    i++;
                }
                return iHashCode;
            }
        }
        return obj.hashCode();
    }

    public static long[] B(long[] jArr) {
        long j;
        long[] jArr2 = new long[288];
        int i = 0;
        System.arraycopy(jArr, 0, jArr2, 9, 9);
        int i2 = 7;
        int i3 = 0;
        while (true) {
            j = 0;
            if (i2 <= 0) {
                break;
            }
            int i4 = i3 + 18;
            int i5 = i4 >>> 1;
            int i6 = 0;
            while (i6 < 9) {
                long j2 = jArr2[i5 + i6];
                jArr2[i4 + i6] = (j >>> 63) | (j2 << 1);
                i6++;
                j = j2;
            }
            D(jArr2, i4);
            int i7 = i3 + 27;
            for (int i8 = 0; i8 < 9; i8++) {
                jArr2[i7 + i8] = jArr2[9 + i8] ^ jArr2[i4 + i8];
            }
            i2--;
            i3 = i4;
        }
        while (i < 144) {
            long j3 = jArr2[i];
            jArr2[144 + i] = (j >>> (-4)) | (j3 << 4);
            i++;
            j = j3;
        }
        return jArr2;
    }

    public static void C(long[] jArr, long[] jArr2) {
        long j = jArr[9];
        long j2 = jArr[17];
        long j3 = (((j ^ (j2 >>> 59)) ^ (j2 >>> 57)) ^ (j2 >>> 54)) ^ (j2 >>> 49);
        long j4 = (j2 << 15) ^ (((jArr[8] ^ (j2 << 5)) ^ (j2 << 7)) ^ (j2 << 10));
        for (int i = 16; i >= 10; i--) {
            long j5 = jArr[i];
            jArr2[i - 8] = (((j4 ^ (j5 >>> 59)) ^ (j5 >>> 57)) ^ (j5 >>> 54)) ^ (j5 >>> 49);
            j4 = (((jArr[i - 9] ^ (j5 << 5)) ^ (j5 << 7)) ^ (j5 << 10)) ^ (j5 << 15);
        }
        jArr2[1] = (((j4 ^ (j3 >>> 59)) ^ (j3 >>> 57)) ^ (j3 >>> 54)) ^ (j3 >>> 49);
        long j6 = (j3 << 15) ^ (((jArr[0] ^ (j3 << 5)) ^ (j3 << 7)) ^ (j3 << 10));
        long j7 = jArr2[8];
        long j8 = j7 >>> 59;
        jArr2[0] = (((j6 ^ j8) ^ (j8 << 2)) ^ (j8 << 5)) ^ (j8 << 10);
        jArr2[8] = 576460752303423487L & j7;
    }

    public static void D(long[] jArr, int i) {
        int i2 = i + 8;
        long j = jArr[i2];
        long j2 = j >>> 59;
        jArr[i] = ((j2 << 10) ^ (((j2 << 2) ^ j2) ^ (j2 << 5))) ^ jArr[i];
        jArr[i2] = j & 576460752303423487L;
    }

    public static void E(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[18];
        p(jArr, jArr3);
        C(jArr3, jArr2);
    }

    public static void F(long[] jArr, long[] jArr2, int i) {
        long[] jArr3 = new long[18];
        p(jArr, jArr3);
        C(jArr3, jArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            p(jArr2, jArr3);
            C(jArr3, jArr2);
        }
    }

    public static final mge G(ui8 ui8Var) {
        ui8Var.getClass();
        p7g p7gVarP0 = ui8Var.P0();
        if (p7gVarP0 instanceof jh5) {
            return ((jh5) p7gVarP0).c;
        }
        if (p7gVarP0 instanceof mge) {
            return (mge) p7gVarP0;
        }
        l.g();
        return null;
    }

    public static final void a(e eVar, Function1 function1, b bVar, int i) {
        c cVarH = bVar.h(-932836462);
        int i2 = (cVarH.K(eVar) ? 4 : 2) | i | (cVarH.x(function1) ? 32 : 16);
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            jh2.f(cVarH, a.a(eVar, function1));
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new gh(eVar, i, 3, function1);
        }
    }

    public static final long b(float f2, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003f -> B:18:0x0042). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(defpackage.l61 r7, defpackage.x81 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.ddd
            if (r0 == 0) goto L13
            r0 = r8
            ddd r0 = (defpackage.ddd) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            ddd r0 = new ddd
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            java.lang.Object r7 = r0.L$0
            l61 r7 = (defpackage.l61) r7
            defpackage.r7d.b(r8)
            goto L42
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r7)
            r7 = 0
            return r7
        L30:
            defpackage.r7d.b(r8)
        L33:
            r0.L$0 = r7
            r0.label = r2
            peb r8 = defpackage.peb.b
            java.lang.Object r8 = r7.B1(r8, r0)
            g13 r1 = defpackage.g13.a
            if (r8 != r1) goto L42
            return r1
        L42:
            neb r8 = (defpackage.neb) r8
            int r1 = r8.d
            java.util.List<yeb> r8 = r8.a
            r1 = r1 & 66
            if (r1 == 0) goto L33
            r1 = r8
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r3 = 0
            r4 = r3
        L55:
            if (r4 >= r1) goto L6e
            java.lang.Object r5 = r8.get(r4)
            yeb r5 = (defpackage.yeb) r5
            boolean r6 = r5.b()
            if (r6 != 0) goto L33
            boolean r6 = r5.h
            if (r6 != 0) goto L33
            boolean r5 = r5.d
            if (r5 == 0) goto L33
            int r4 = r4 + 1
            goto L55
        L6e:
            java.lang.Object r7 = r8.get(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w74.c(l61, x81):java.lang.Object");
    }

    public static final boolean d(float f2) {
        return Float.isNaN(f2) || Math.abs(f2) < 0.5f;
    }

    public static void e(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 9; i++) {
            jArr3[i] = jArr[i] ^ jArr2[i];
        }
    }

    public static void f(long[] jArr, int i, long[] jArr2, int i2, long[] jArr3, int i3) {
        for (int i4 = 0; i4 < 9; i4++) {
            int i5 = i3 + i4;
            jArr3[i5] = jArr3[i5] ^ (jArr[i + i4] ^ jArr2[i2 + i4]);
        }
    }

    public static final Object g(Task task, pu2 pu2Var) throws Exception {
        if (!task.isComplete()) {
            qw1 qw1Var = new qw1(1, ewa.v(pu2Var));
            qw1Var.q();
            task.addOnCompleteListener(i54.a, new ki8(qw1Var));
            return qw1Var.p();
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }

    public static final int h(long j, long j2) {
        boolean zR = r(j);
        if (zR != r(j2)) {
            return zR ? -1 : 1;
        }
        return (Math.min(l(j), l(j2)) >= 0.0f && q(j) != q(j2)) ? q(j) ? -1 : 1 : (int) Math.signum(l(j) - l(j2));
    }

    public static final nyf i(ylg ylgVar) {
        int iOrdinal = ylgVar.ordinal();
        if (iOrdinal == 0) {
            return nyf.INV;
        }
        if (iOrdinal == 1) {
            return nyf.IN;
        }
        if (iOrdinal == 2) {
            return nyf.OUT;
        }
        l.g();
        return null;
    }

    public static final float j(float f2) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f2)) & 8589934591L) / 3)) + 709952852);
        float f3 = fIntBitsToFloat - ((fIntBitsToFloat - (f2 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f3 - ((f3 - (f2 / (f3 * f3))) * 0.33333334f);
    }

    public static HashMap k() {
        HashMap map = new HashMap(286);
        ArrayList arrayList = new ArrayList(25);
        arrayList.add("US");
        arrayList.add("AG");
        arrayList.add("AI");
        arrayList.add("AS");
        arrayList.add("BB");
        arrayList.add("BM");
        arrayList.add("BS");
        arrayList.add("CA");
        arrayList.add("DM");
        arrayList.add("DO");
        arrayList.add("GD");
        arrayList.add("GU");
        arrayList.add("JM");
        arrayList.add("KN");
        arrayList.add("KY");
        arrayList.add("LC");
        arrayList.add("MP");
        arrayList.add("MS");
        arrayList.add("PR");
        arrayList.add("SX");
        arrayList.add("TC");
        arrayList.add("TT");
        arrayList.add("VC");
        arrayList.add("VG");
        arrayList.add("VI");
        map.put(1, arrayList);
        ArrayList arrayList2 = new ArrayList(2);
        arrayList2.add("RU");
        arrayList2.add("KZ");
        ArrayList arrayListF = l.f(36, map, l.f(34, map, l.f(33, map, l.f(32, map, l.f(31, map, l.f(30, map, l.f(27, map, l.f(20, map, l.f(7, map, arrayList2, 1, "EG"), 1, "ZA"), 1, "GR"), 1, "NL"), 1, "BE"), 1, "FR"), 1, "ES"), 1, "HU"), 2, "IT");
        arrayListF.add("VA");
        map.put(39, arrayListF);
        ArrayList arrayList3 = new ArrayList(1);
        arrayList3.add("RO");
        ArrayList arrayListF2 = l.f(43, map, l.f(41, map, l.f(40, map, arrayList3, 1, "CH"), 1, "AT"), 4, "GB");
        arrayListF2.add("GG");
        arrayListF2.add("IM");
        arrayListF2.add("JE");
        map.put(44, arrayListF2);
        ArrayList arrayList4 = new ArrayList(1);
        arrayList4.add("DK");
        ArrayList arrayListF3 = l.f(46, map, l.f(45, map, arrayList4, 1, "SE"), 2, "NO");
        arrayListF3.add("SJ");
        map.put(47, arrayListF3);
        ArrayList arrayList5 = new ArrayList(1);
        arrayList5.add("PL");
        ArrayList arrayListF4 = l.f(60, map, l.f(58, map, l.f(57, map, l.f(56, map, l.f(55, map, l.f(54, map, l.f(53, map, l.f(52, map, l.f(51, map, l.f(49, map, l.f(48, map, arrayList5, 1, "DE"), 1, "PE"), 1, "MX"), 1, "CU"), 1, "AR"), 1, "BR"), 1, "CL"), 1, "CO"), 1, "VE"), 1, "MY"), 3, "AU");
        arrayListF4.add("CC");
        arrayListF4.add("CX");
        map.put(61, arrayListF4);
        ArrayList arrayList6 = new ArrayList(1);
        arrayList6.add("ID");
        ArrayList arrayListF5 = l.f(211, map, l.f(98, map, l.f(95, map, l.f(94, map, l.f(93, map, l.f(92, map, l.f(91, map, l.f(90, map, l.f(86, map, l.f(84, map, l.f(82, map, l.f(81, map, l.f(66, map, l.f(65, map, l.f(64, map, l.f(63, map, l.f(62, map, arrayList6, 1, "PH"), 1, "NZ"), 1, "SG"), 1, "TH"), 1, "JP"), 1, "KR"), 1, "VN"), 1, "CN"), 1, "TR"), 1, "IN"), 1, "PK"), 1, "AF"), 1, "LK"), 1, "MM"), 1, "IR"), 1, "SS"), 2, "MA");
        arrayListF5.add("EH");
        map.put(212, arrayListF5);
        ArrayList arrayList7 = new ArrayList(1);
        arrayList7.add("DZ");
        ArrayList arrayListF6 = l.f(261, map, l.f(260, map, l.f(258, map, l.f(257, map, l.f(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, map, l.f(255, map, l.f(254, map, l.f(253, map, l.f(252, map, l.f(251, map, l.f(250, map, l.f(249, map, l.f(248, map, l.f(247, map, l.f(246, map, l.f(245, map, l.f(244, map, l.f(243, map, l.f(242, map, l.f(241, map, l.f(240, map, l.f(239, map, l.f(238, map, l.f(237, map, l.f(236, map, l.f(235, map, l.f(234, map, l.f(233, map, l.f(232, map, l.f(231, map, l.f(230, map, l.f(229, map, l.f(228, map, l.f(227, map, l.f(226, map, l.f(225, map, l.f(224, map, l.f(223, map, l.f(222, map, l.f(221, map, l.f(220, map, l.f(218, map, l.f(216, map, l.f(213, map, arrayList7, 1, "TN"), 1, "LY"), 1, "GM"), 1, "SN"), 1, "MR"), 1, "ML"), 1, "GN"), 1, "CI"), 1, "BF"), 1, "NE"), 1, "TG"), 1, "BJ"), 1, "MU"), 1, "LR"), 1, "SL"), 1, "GH"), 1, "NG"), 1, "TD"), 1, "CF"), 1, "CM"), 1, "CV"), 1, "ST"), 1, "GQ"), 1, "GA"), 1, "CG"), 1, "CD"), 1, "AO"), 1, "GW"), 1, "IO"), 1, "AC"), 1, "SC"), 1, "SD"), 1, "RW"), 1, "ET"), 1, "SO"), 1, "DJ"), 1, "KE"), 1, "TZ"), 1, "UG"), 1, "BI"), 1, "MZ"), 1, "ZM"), 1, "MG"), 2, "RE");
        arrayListF6.add("YT");
        map.put(262, arrayListF6);
        ArrayList arrayList8 = new ArrayList(1);
        arrayList8.add("ZW");
        ArrayList arrayListF7 = l.f(269, map, l.f(268, map, l.f(267, map, l.f(266, map, l.f(265, map, l.f(264, map, l.f(263, map, arrayList8, 1, "NA"), 1, "MW"), 1, "LS"), 1, "BW"), 1, "SZ"), 1, "KM"), 2, "SH");
        arrayListF7.add("TA");
        map.put(290, arrayListF7);
        ArrayList arrayList9 = new ArrayList(1);
        arrayList9.add("ER");
        ArrayList arrayListF8 = l.f(357, map, l.f(356, map, l.f(355, map, l.f(354, map, l.f(353, map, l.f(352, map, l.f(351, map, l.f(350, map, l.f(299, map, l.f(298, map, l.f(297, map, l.f(291, map, arrayList9, 1, "AW"), 1, "FO"), 1, "GL"), 1, "GI"), 1, "PT"), 1, "LU"), 1, "IE"), 1, "IS"), 1, "AL"), 1, "MT"), 1, "CY"), 2, "FI");
        arrayListF8.add("AX");
        map.put(358, arrayListF8);
        ArrayList arrayList10 = new ArrayList(1);
        arrayList10.add("BG");
        ArrayList arrayListF9 = l.f(509, map, l.f(508, map, l.f(DataOkHttpUploader.HTTP_INSUFFICIENT_STORAGE, map, l.f(506, map, l.f(505, map, l.f(DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT, map, l.f(DataOkHttpUploader.HTTP_UNAVAILABLE, map, l.f(DataOkHttpUploader.HTTP_BAD_GATEWAY, map, l.f(501, map, l.f(500, map, l.f(423, map, l.f(421, map, l.f(420, map, l.f(389, map, l.f(387, map, l.f(386, map, l.f(385, map, l.f(383, map, l.f(382, map, l.f(381, map, l.f(380, map, l.f(378, map, l.f(377, map, l.f(376, map, l.f(375, map, l.f(374, map, l.f(373, map, l.f(372, map, l.f(371, map, l.f(370, map, l.f(359, map, arrayList10, 1, "LT"), 1, "LV"), 1, "EE"), 1, "MD"), 1, "AM"), 1, "BY"), 1, "AD"), 1, "MC"), 1, "SM"), 1, "UA"), 1, "RS"), 1, "ME"), 1, "XK"), 1, "HR"), 1, "SI"), 1, "BA"), 1, "MK"), 1, "CZ"), 1, "SK"), 1, "LI"), 1, "FK"), 1, "BZ"), 1, "GT"), 1, "SV"), 1, "HN"), 1, "NI"), 1, "CR"), 1, "PA"), 1, "PM"), 1, "HT"), 3, "GP");
        arrayListF9.add("BL");
        arrayListF9.add("MF");
        map.put(590, arrayListF9);
        ArrayList arrayList11 = new ArrayList(1);
        arrayList11.add("BO");
        ArrayList arrayListF10 = l.f(598, map, l.f(597, map, l.f(596, map, l.f(595, map, l.f(594, map, l.f(593, map, l.f(592, map, l.f(591, map, arrayList11, 1, "GY"), 1, "EC"), 1, "GF"), 1, "PY"), 1, "MQ"), 1, "SR"), 1, "UY"), 2, "CW");
        arrayListF10.add("BQ");
        map.put(599, arrayListF10);
        ArrayList arrayList12 = new ArrayList(1);
        arrayList12.add("TL");
        map.put(998, l.f(996, map, l.f(995, map, l.f(994, map, l.f(993, map, l.f(992, map, l.f(979, map, l.f(977, map, l.f(976, map, l.f(975, map, l.f(974, map, l.f(973, map, l.f(972, map, l.f(971, map, l.f(970, map, l.f(968, map, l.f(967, map, l.f(966, map, l.f(965, map, l.f(964, map, l.f(963, map, l.f(962, map, l.f(961, map, l.f(960, map, l.f(888, map, l.f(886, map, l.f(883, map, l.f(882, map, l.f(881, map, l.f(880, map, l.f(878, map, l.f(870, map, l.f(856, map, l.f(855, map, l.f(853, map, l.f(852, map, l.f(850, map, l.f(808, map, l.f(DefaultAndroidInfoProvider.MIN_TABLET_WIDTH_DP, map, l.f(692, map, l.f(691, map, l.f(690, map, l.f(689, map, l.f(688, map, l.f(687, map, l.f(686, map, l.f(685, map, l.f(683, map, l.f(682, map, l.f(681, map, l.f(680, map, l.f(679, map, l.f(678, map, l.f(677, map, l.f(676, map, l.f(675, map, l.f(674, map, l.f(673, map, l.f(672, map, l.f(670, map, arrayList12, 1, "NF"), 1, "BN"), 1, "NR"), 1, "PG"), 1, "TO"), 1, "SB"), 1, "VU"), 1, "FJ"), 1, "PW"), 1, "WF"), 1, "CK"), 1, "NU"), 1, "WS"), 1, "KI"), 1, "NC"), 1, "TV"), 1, "PF"), 1, "TK"), 1, "FM"), 1, "MH"), 1, "001"), 1, "001"), 1, "KP"), 1, "HK"), 1, "MO"), 1, "KH"), 1, "LA"), 1, "001"), 1, "001"), 1, "BD"), 1, "001"), 1, "001"), 1, "001"), 1, "TW"), 1, "001"), 1, "MV"), 1, "LB"), 1, "JO"), 1, "SY"), 1, "IQ"), 1, "KW"), 1, "SA"), 1, "YE"), 1, "OM"), 1, "PS"), 1, "AE"), 1, "IL"), 1, "BH"), 1, "QA"), 1, "BT"), 1, "MN"), 1, "NP"), 1, "001"), 1, "TJ"), 1, "TM"), 1, "AZ"), 1, "GE"), 1, "KG"), 1, "UZ"));
        return map;
    }

    public static final float l(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final int m(Layout layout, int i, boolean z) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i || lineEnd == i) {
            if (lineStart == i) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static final b5d n(mif mifVar, int i) {
        kif kifVar = mifVar.a;
        q1a q1aVar = mifVar.b;
        if (kifVar.a.b.length() != 0) {
            int iD = q1aVar.d(i);
            if ((i != 0 && iD == q1aVar.d(i - 1)) || (i != mifVar.a.a.b.length() && iD == q1aVar.d(i + 1))) {
                return mifVar.a(i);
            }
        }
        return mifVar.h(i);
    }

    public static void o(long[] jArr, long[] jArr2, long[] jArr3) {
        int i = 56;
        while (true) {
            long j = 0;
            int i2 = 0;
            if (i < 0) {
                break;
            }
            for (int i3 = 1; i3 < 9; i3 += 2) {
                int i4 = (int) (jArr[i3] >>> i);
                f(jArr2, (i4 & 15) * 9, jArr2, (((i4 >>> 4) & 15) + 16) * 9, jArr3, i3 - 1);
            }
            while (i2 < 16) {
                long j2 = jArr3[i2];
                jArr3[i2] = (j >>> (-8)) | (j2 << 8);
                i2++;
                j = j2;
            }
            i -= 8;
        }
        for (int i5 = 56; i5 >= 0; i5 -= 8) {
            int i6 = 0;
            while (i6 < 9) {
                int i7 = (int) (jArr[i6] >>> i5);
                int i8 = i6;
                f(jArr2, (i7 & 15) * 9, jArr2, (((i7 >>> 4) & 15) + 16) * 9, jArr3, i8);
                i6 = i8 + 2;
            }
            if (i5 > 0) {
                long j3 = 0;
                int i9 = 0;
                while (i9 < 18) {
                    long j4 = jArr3[i9];
                    jArr3[i9] = (j3 >>> (-8)) | (j4 << 8);
                    i9++;
                    j3 = j4;
                }
            }
        }
    }

    public static void p(long[] jArr, long[] jArr2) {
        for (int i = 0; i < 9; i++) {
            wab.j(i << 1, jArr[i], jArr2);
        }
    }

    public static final boolean q(long j) {
        return (j & 2) != 0;
    }

    public static final boolean r(long j) {
        return (j & 1) != 0;
    }

    public static boolean s(int i, String str) {
        int i2;
        if (i < str.length() && (i2 = i + 1) >= 3 && i2 <= 8) {
            for (int i3 = 0; i3 <= i; i3++) {
                char cCharAt = str.charAt(i3);
                if ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= '0' && cCharAt <= '9'))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final float t(float f2, float f3, float f4) {
        return (f4 * f3) + ((1.0f - f4) * f2);
    }

    public static final int u(int i, float f2, int i2) {
        return i + ((int) Math.round(((double) (i2 - i)) * ((double) f2)));
    }

    public static final mge v(ui8 ui8Var) {
        ui8Var.getClass();
        p7g p7gVarP0 = ui8Var.P0();
        if (p7gVarP0 instanceof jh5) {
            return ((jh5) p7gVarP0).b;
        }
        if (p7gVarP0 instanceof mge) {
            return (mge) p7gVarP0;
        }
        l.g();
        return null;
    }

    public static void w(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[18];
        o(jArr, B(jArr2), jArr4);
        C(jArr4, jArr3);
    }

    public static void x(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[18];
        o(jArr, B(jArr2), jArr4);
        for (int i = 0; i < 18; i++) {
            jArr3[i] = jArr3[i] ^ jArr4[i];
        }
    }

    public static void y(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[18];
        o(jArr, jArr2, jArr4);
        C(jArr4, jArr3);
    }

    public static boolean z(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj2 != null) {
            if (obj.equals(obj2)) {
                return true;
            }
            if (obj.getClass().isArray() && obj2.getClass().isArray()) {
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    return Arrays.equals((Object[]) obj, (Object[]) obj2);
                }
                if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    return Arrays.equals((boolean[]) obj, (boolean[]) obj2);
                }
                if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    return Arrays.equals((byte[]) obj, (byte[]) obj2);
                }
                if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    return Arrays.equals((char[]) obj, (char[]) obj2);
                }
                if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    return Arrays.equals((double[]) obj, (double[]) obj2);
                }
                if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    return Arrays.equals((float[]) obj, (float[]) obj2);
                }
                if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    return Arrays.equals((int[]) obj, (int[]) obj2);
                }
                if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    return Arrays.equals((long[]) obj, (long[]) obj2);
                }
                if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    return Arrays.equals((short[]) obj, (short[]) obj2);
                }
            }
        }
        return false;
    }

    @Override // defpackage.n0d
    public void accept(Object obj, Object obj2) {
        ish ishVar = (ish) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        LastLocationRequest lastLocationRequest = new LastLocationRequest(Long.MAX_VALUE, 0, false, null, null);
        ishVar.getClass();
        if (ishVar.r(fhi.b)) {
            ((pji) ishVar.i()).Z0(lastLocationRequest, new rqh(taskCompletionSource));
        } else {
            taskCompletionSource.setResult(((pji) ishVar.i()).zzd());
        }
    }

    @Override // defpackage.nvh
    public Object zza() {
        switch (this.a) {
            case 10:
                List<svh<?>> list = djh.a;
                return Boolean.valueOf(((xhi) yhi.b.zza()).zza());
            case 11:
                List<svh<?>> list2 = djh.a;
                return Boolean.valueOf(((pai) sai.b.zza()).zza());
            case 12:
                List<svh<?>> list3 = djh.a;
                return Boolean.valueOf(((vgi) wgi.b.zza()).zzd());
            case 13:
                List<svh<?>> list4 = djh.a;
                return Boolean.valueOf(((whi) thi.b.zza()).zza());
            default:
                List<svh<?>> list5 = djh.a;
                return Boolean.valueOf(((gci) ybi.b.zza()).zzc());
        }
    }
}
