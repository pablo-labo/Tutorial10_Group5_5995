package defpackage;

import android.content.res.Resources;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.e;
import androidx.navigation.s;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.indeed.android.jsmappservices.bridge.SearchType;
import com.indeed.android.jsmappservices.bridge.ShowSearchOverlayData;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.webrtc.Logging;
import org.webrtc.NativeLibraryLoader;

/* JADX INFO: loaded from: classes2.dex */
public class ak2 implements nvh, jg2, Continuation, hna, fh6, NativeLibraryLoader {
    public final /* synthetic */ int a;
    public static final ah2 b = new ah2(1776720715, new mj2(1, 0), false);
    public static final kd9 c = new kd9("~", true);
    public static final kd9 d = new kd9("TABLE_SEPARATOR", true);
    public static final kd9 e = new kd9("GFM_AUTOLINK", true);
    public static final kd9 f = new kd9("CHECK_BOX", true);
    public static final kd9 V = new kd9("CELL", true);
    public static final kd9 W = new kd9("DOLLAR", true);
    public static final int[] X = {-977, -2, -1, -1, -1, -1, -1, -1};
    public static final int[] Y = {954529, 1954, 1, 0, 0, 0, 0, 0, -1954, -3, -1, -1, -1, -1, -1, -1};
    public static final int[] Z = {-954529, -1955, -2, -1, -1, -1, -1, -1, 1953, 2};
    public static final Object a0 = new Object();
    public static final ak2 b0 = new ak2(4);
    public static final ak2 c0 = new ak2(5);
    public static final ak2 d0 = new ak2(6);
    public static final ak2 e0 = new ak2(7);
    public static final String[] f0 = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};
    public static final String[] g0 = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};
    public static final ak2 h0 = new ak2(9);
    public static final ak2 i0 = new ak2(10);

    public ak2(t8e t8eVar) {
        this.a = 15;
        t8eVar.getClass();
    }

    public static byte[] A(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = fileInputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
            }
            if (i3 == i) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } finally {
            inflater.end();
        }
    }

    public static long B(InputStream inputStream, int i) throws IOException {
        byte[] bArrZ = z(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrZ[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    public static void C(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[8]) & 4294967295L;
        long j2 = (977 * j) + (((long) iArr[0]) & 4294967295L);
        int i = (int) j2;
        iArr2[0] = i;
        long j3 = ((long) iArr[9]) & 4294967295L;
        long j4 = (977 * j3) + j + (((long) iArr[1]) & 4294967295L) + (j2 >>> 32);
        int i2 = (int) j4;
        iArr2[1] = i2;
        long j5 = ((long) iArr[10]) & 4294967295L;
        long j6 = (977 * j5) + j3 + (((long) iArr[2]) & 4294967295L) + (j4 >>> 32);
        int i3 = (int) j6;
        iArr2[2] = i3;
        long j7 = ((long) iArr[11]) & 4294967295L;
        long j8 = (977 * j7) + j5 + (((long) iArr[3]) & 4294967295L) + (j6 >>> 32);
        int i4 = (int) j8;
        iArr2[3] = i4;
        long j9 = ((long) iArr[12]) & 4294967295L;
        long j10 = (977 * j9) + j7 + (((long) iArr[4]) & 4294967295L) + (j8 >>> 32);
        iArr2[4] = (int) j10;
        long j11 = ((long) iArr[13]) & 4294967295L;
        long j12 = (977 * j11) + j9 + (((long) iArr[5]) & 4294967295L) + (j10 >>> 32);
        iArr2[5] = (int) j12;
        long j13 = ((long) iArr[14]) & 4294967295L;
        long j14 = (977 * j13) + j11 + (((long) iArr[6]) & 4294967295L) + (j12 >>> 32);
        iArr2[6] = (int) j14;
        long j15 = ((long) iArr[15]) & 4294967295L;
        long j16 = (977 * j15) + j13 + (((long) iArr[7]) & 4294967295L) + (j14 >>> 32);
        iArr2[7] = (int) j16;
        long j17 = (j16 >>> 32) + j15;
        long j18 = j17 & 4294967295L;
        long j19 = (977 * j18) + (((long) i) & 4294967295L);
        iArr2[0] = (int) j19;
        long j20 = j17 >>> 32;
        long j21 = (977 * j20) + j18 + (((long) i2) & 4294967295L) + (j19 >>> 32);
        iArr2[1] = (int) j21;
        long j22 = j20 + (((long) i3) & 4294967295L) + (j21 >>> 32);
        iArr2[2] = (int) j22;
        long j23 = (j22 >>> 32) + (((long) i4) & 4294967295L);
        iArr2[3] = (int) j23;
        if (((j23 >>> 32) == 0 ? 0 : ka6.u0(8, 4, iArr2)) != 0 || (iArr2[7] == -1 && ka6.q0(iArr2, X))) {
            ka6.I(8, 977, iArr2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void D(int r11, int[] r12) {
        /*
            r0 = 8
            if (r11 == 0) goto L3d
            long r1 = (long) r11
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            r5 = 977(0x3d1, double:4.827E-321)
            long r5 = r5 * r1
            r11 = 0
            r7 = r12[r11]
            long r7 = (long) r7
            long r7 = r7 & r3
            long r5 = r5 + r7
            int r7 = (int) r5
            r12[r11] = r7
            r7 = 32
            long r5 = r5 >>> r7
            r8 = 1
            r9 = r12[r8]
            long r9 = (long) r9
            long r9 = r9 & r3
            long r1 = r1 + r9
            long r1 = r1 + r5
            int r5 = (int) r1
            r12[r8] = r5
            long r1 = r1 >>> r7
            r5 = 2
            r6 = r12[r5]
            long r8 = (long) r6
            long r3 = r3 & r8
            long r1 = r1 + r3
            int r3 = (int) r1
            r12[r5] = r3
            long r1 = r1 >>> r7
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L36
            goto L3b
        L36:
            r11 = 3
            int r11 = defpackage.ka6.u0(r0, r11, r12)
        L3b:
            if (r11 != 0) goto L4b
        L3d:
            r11 = 7
            r11 = r12[r11]
            r1 = -1
            if (r11 != r1) goto L50
            int[] r11 = defpackage.ak2.X
            boolean r11 = defpackage.ka6.q0(r12, r11)
            if (r11 == 0) goto L50
        L4b:
            r11 = 977(0x3d1, float:1.369E-42)
            defpackage.ka6.I(r0, r11, r12)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ak2.D(int, int[]):void");
    }

    public static final long E(long j) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    public static final long F(long j, long j2) {
        long j3 = j - j2;
        long j4 = (j3 ^ j) & (~(j3 ^ j2));
        be4 be4Var = be4.NANOSECONDS;
        if (j4 >= 0) {
            return pg8.U(j3, be4Var);
        }
        be4 be4Var2 = be4.MILLISECONDS;
        if (be4Var.compareTo(be4Var2) >= 0) {
            return wd4.r(s(j3));
        }
        long jConvert = be4Var.a().convert(1L, be4Var2.a());
        long j5 = (j / jConvert) - (j2 / jConvert);
        long j6 = (j % jConvert) - (j2 % jConvert);
        int i = wd4.d;
        return wd4.n(pg8.U(j5, be4Var2), pg8.U(j6, be4Var));
    }

    public static void G(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        ka6.k1(iArr, iArr3);
        C(iArr3, iArr2);
    }

    public static void H(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        ka6.k1(iArr, iArr3);
        C(iArr3, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            ka6.k1(iArr2, iArr3);
            C(iArr3, iArr2);
        }
    }

    public static final String I(int i, b bVar) {
        return ((Resources) bVar.M(AndroidCompositionLocals_androidKt.c)).getString(i);
    }

    public static final String J(int i, Object[] objArr, b bVar) {
        return ((Resources) bVar.M(AndroidCompositionLocals_androidKt.c)).getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    public static void K(int[] iArr, int[] iArr2, int[] iArr3) {
        if (ka6.o1(iArr, iArr2, iArr3) != 0) {
            ka6.p1(8, 977, iArr3);
        }
    }

    public static final jt7 L(ShowSearchOverlayData showSearchOverlayData) {
        it7 it7Var;
        showSearchOverlayData.getClass();
        SearchType searchType = showSearchOverlayData.a;
        searchType.getClass();
        int iOrdinal = searchType.ordinal();
        if (iOrdinal == 0) {
            it7Var = it7.b;
        } else {
            if (iOrdinal != 1) {
                l.g();
                return null;
            }
            it7Var = it7.c;
        }
        return new jt7(it7Var, showSearchOverlayData.b, showSearchOverlayData.c);
    }

    public static final String M(SearchType searchType) {
        searchType.getClass();
        int iOrdinal = searchType.ordinal();
        if (iOrdinal == 0) {
            return "search-overlay-what";
        }
        if (iOrdinal == 1) {
            return "search-overlay-where";
        }
        l.g();
        return null;
    }

    public static void N(ByteArrayOutputStream byteArrayOutputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void O(ByteArrayOutputStream byteArrayOutputStream, int i) throws IOException {
        N(byteArrayOutputStream, i, 2);
    }

    public static final long a(int i) {
        long j = ((long) i) << 32;
        int i2 = lg8.p;
        return j;
    }

    public static final void c(final int i, final gu5 gu5Var, final u67 u67Var, final kta ktaVar, final j7d j7dVar, final fnf fnfVar, final d4g d4gVar, b bVar, final FragmentManager fragmentManager, final e eVar, final Function1 function1, final Function2 function2) {
        u67Var.getClass();
        ktaVar.getClass();
        fnfVar.getClass();
        d4gVar.getClass();
        j7dVar.getClass();
        function1.getClass();
        function2.getClass();
        gu5Var.getClass();
        c cVarH = bVar.h(428455368);
        int i2 = i | (cVarH.x(u67Var) ? 4 : 2) | (cVarH.x(ktaVar) ? 32 : 16) | (cVarH.x(fnfVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(d4gVar) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(j7dVar) ? 16384 : 8192) | (cVarH.x(fragmentManager) ? 131072 : 65536) | (cVarH.x(eVar) ? 1048576 : 524288) | (cVarH.x(function1) ? 8388608 : 4194304) | (cVarH.x(function2) ? 67108864 : 33554432) | (cVarH.x(gu5Var) ? 536870912 : 268435456);
        if (cVarH.o(i2 & 1, (i2 & 306783379) != 306783378)) {
            iba ibaVarB = q92.B(new s[0], cVarH);
            b57 b57Var = b57.INSTANCE;
            boolean zX = ((57344 & i2) == 16384 || cVarH.x(j7dVar)) | cVarH.x(u67Var) | cVarH.x(ktaVar) | cVarH.x(fnfVar) | ((i2 & 7168) == 2048 || cVarH.x(d4gVar)) | ((i2 & 29360128) == 8388608) | cVarH.x(fragmentManager) | cVarH.x(eVar) | ((i2 & 234881024) == 67108864) | ((i2 & 1879048192) == 536870912);
            Object objV = cVarH.v();
            if (zX || objV == b.a.a) {
                yv yvVar = new yv(u67Var, ktaVar, fnfVar, d4gVar, j7dVar, function1, fragmentManager, eVar, function2, gu5Var);
                cVarH.p(yvVar);
                objV = yvVar;
            }
            nba.b(ibaVarB, b57Var, null, null, null, null, null, null, null, null, null, (Function1) objV, cVarH, 0, 0, 2044);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(i, gu5Var, u67Var, ktaVar, j7dVar, fnfVar, d4gVar, fragmentManager, eVar, function1, function2) { // from class: xr9
                public final /* synthetic */ e V;
                public final /* synthetic */ Function1 W;
                public final /* synthetic */ Function2 X;
                public final /* synthetic */ gu5 Y;
                public final /* synthetic */ u67 a;
                public final /* synthetic */ kta b;
                public final /* synthetic */ fnf c;
                public final /* synthetic */ d4g d;
                public final /* synthetic */ j7d e;
                public final /* synthetic */ FragmentManager f;

                {
                    this.a = u67Var;
                    this.b = ktaVar;
                    this.c = fnfVar;
                    this.d = d4gVar;
                    this.e = j7dVar;
                    this.f = fragmentManager;
                    this.V = eVar;
                    this.W = function1;
                    this.X = function2;
                    this.Y = gu5Var;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ak2.c(ka2.L(36865), this.Y, this.a, this.b, this.e, this.c, this.d, (b) obj, this.f, this.V, this.W, this.X);
                    return j6g.a;
                }
            };
        }
    }

    public static final zfd e(float f2, float f3, float f4, float f5, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
        return new zfd(f2, f3, f4, f5, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    public static final void f(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
    }

    public static final boolean g(lse lseVar, int i, r3 r3Var, boolean z) {
        boolean z2;
        synchronized (a0) {
            try {
                int i2 = lseVar.d;
                if (i2 == i) {
                    lseVar.c = r3Var;
                    z2 = true;
                    if (z) {
                        lseVar.e++;
                    }
                    lseVar.d = i2 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [jd2] */
    public static jd2 h(final Function1... function1Arr) {
        if (function1Arr.length > 0) {
            return new Comparator() { // from class: jd2
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    for (Function1 function1 : function1Arr) {
                        int i = ak2.i((Comparable) function1.invoke(obj), (Comparable) function1.invoke(obj2));
                        if (i != 0) {
                            return i;
                        }
                    }
                    return 0;
                }
            };
        }
        l5.q("Failed requirement.");
        return null;
    }

    public static int i(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static byte[] j(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static String k(tr1 tr1Var) {
        StringBuilder sb = new StringBuilder(tr1Var.size());
        for (int i = 0; i < tr1Var.size(); i++) {
            byte bA = tr1Var.a(i);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case DatadogLogGenerator.CRASH /* 9 */:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                        } else {
                            sb.append((char) bA);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final int l(int i, androidx.compose.foundation.lazy.layout.c cVar, Object obj) {
        int iC;
        return (obj == null || cVar.a() == 0 || (i < cVar.a() && obj.equals(cVar.g(i))) || (iC = cVar.c(obj)) == -1) ? i : iC;
    }

    public static final int m(int i, List list) {
        int i2;
        int i3 = ((f3b) z92.Y0(list)).c;
        if (i > ((f3b) z92.Y0(list)).c) {
            be7.a("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            f3b f3bVar = (f3b) list.get(i2);
            byte b2 = f3bVar.b > i ? (byte) 1 : f3bVar.c <= i ? (byte) -1 : (byte) 0;
            if (b2 >= 0) {
                if (b2 <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        StringBuilder sbG = o6.g(i2, "Found paragraph index ", " should be in range [0, ");
        sbG.append(list.size());
        sbG.append(").\nDebug info: index=");
        sbG.append(i);
        sbG.append(", paragraphs=[");
        sbG.append(fz8.b(31, null, list, new tr(11)));
        sbG.append(']');
        be7.a(sbG.toString());
        return i2;
    }

    public static final int n(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            f3b f3bVar = (f3b) list.get(i3);
            byte b2 = f3bVar.d > i ? (byte) 1 : f3bVar.e <= i ? (byte) -1 : (byte) 0;
            if (b2 < 0) {
                i2 = i3 + 1;
            } else {
                if (b2 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int o(ArrayList arrayList, float f2) {
        if (f2 <= 0.0f) {
            return 0;
        }
        if (f2 >= ((f3b) z92.Y0(arrayList)).g) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            f3b f3bVar = (f3b) arrayList.get(i2);
            byte b2 = f3bVar.f > f2 ? (byte) 1 : f3bVar.g <= f2 ? (byte) -1 : (byte) 0;
            if (b2 < 0) {
                i = i2 + 1;
            } else {
                if (b2 <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final void p(ArrayList arrayList, long j, Function1 function1) {
        int size = arrayList.size();
        for (int iM = m(kjf.f(j), arrayList); iM < size; iM++) {
            f3b f3bVar = (f3b) arrayList.get(iM);
            if (f3bVar.b >= kjf.e(j)) {
                return;
            }
            if (f3bVar.b != f3bVar.c) {
                function1.invoke(f3bVar);
            }
        }
    }

    public static final lse q(SnapshotStateList snapshotStateList) {
        lse lseVar = snapshotStateList.a;
        lseVar.getClass();
        return (lse) ame.s(lseVar, snapshotStateList);
    }

    public static final int r(SnapshotStateList snapshotStateList) {
        lse lseVar = snapshotStateList.a;
        lseVar.getClass();
        return ((lse) ame.h(lseVar)).e;
    }

    public static final long s(long j) {
        if (j < 0) {
            int i = wd4.d;
            return wd4.c;
        }
        int i2 = wd4.d;
        return wd4.b;
    }

    public static final boolean t(zfd zfdVar) {
        long j = zfdVar.e;
        return (j >>> 32) == (4294967295L & j) && j == zfdVar.f && j == zfdVar.g && j == zfdVar.h;
    }

    public static int u(int i, int... iArr) {
        for (int i2 : iArr) {
            i = Math.max(i, i2);
        }
        return i;
    }

    public static void v(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        ka6.H0(iArr, iArr2, iArr4);
        C(iArr4, iArr3);
    }

    public static final boolean w(SnapshotStateList snapshotStateList, Function1 function1) {
        int i;
        r3 r3Var;
        Object objInvoke;
        wle wleVarJ;
        boolean zG;
        do {
            synchronized (a0) {
                lse lseVar = snapshotStateList.a;
                lseVar.getClass();
                lse lseVar2 = (lse) ame.h(lseVar);
                i = lseVar2.d;
                r3Var = lseVar2.c;
                j6g j6gVar = j6g.a;
            }
            r3Var.getClass();
            q9b q9bVarG = r3Var.g();
            objInvoke = function1.invoke(q9bVarG);
            r3 r3VarD = q9bVarG.d();
            if (wl7.b(r3VarD, r3Var)) {
                break;
            }
            lse lseVar3 = snapshotStateList.a;
            lseVar3.getClass();
            synchronized (ame.c) {
                wle.e.getClass();
                wleVarJ = ame.j();
                zG = g((lse) ame.v(lseVar3, snapshotStateList, wleVarJ), i, r3VarD, true);
            }
            ame.m(wleVarJ, snapshotStateList);
        } while (!zG);
        return ((Boolean) objInvoke).booleanValue();
    }

    public static final String x(int i, int i2, Object[] objArr, b bVar) {
        return ((Resources) bVar.M(AndroidCompositionLocals_androidKt.c)).getQuantityString(i, i2, Arrays.copyOf(objArr, objArr.length));
    }

    public static final long y(long j, long j2) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    public static byte[] z(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                r6.g(p6.c(i, "Not enough bytes to read: "));
                return null;
            }
            i2 += i3;
        }
        return bArr;
    }

    @Override // defpackage.hna
    public Object b() {
        return new ConcurrentSkipListMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0050  */
    @Override // defpackage.jg2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(defpackage.l7d r9) {
        /*
            r8 = this;
            com.google.firebase.messaging.FirebaseMessaging r0 = new com.google.firebase.messaging.FirebaseMessaging
            java.lang.Class<pf5> r8 = defpackage.pf5.class
            java.lang.Object r8 = r9.get(r8)
            r1 = r8
            pf5 r1 = (defpackage.pf5) r1
            java.lang.Class<com.google.firebase.iid.FirebaseInstanceId> r8 = com.google.firebase.iid.FirebaseInstanceId.class
            java.lang.Object r8 = r9.get(r8)
            r2 = r8
            com.google.firebase.iid.FirebaseInstanceId r2 = (com.google.firebase.iid.FirebaseInstanceId) r2
            java.lang.Class<bjg> r8 = defpackage.bjg.class
            java.lang.Object r8 = r9.get(r8)
            r3 = r8
            bjg r3 = (defpackage.bjg) r3
            java.lang.Class<hh6> r8 = defpackage.hh6.class
            java.lang.Object r8 = r9.get(r8)
            r4 = r8
            hh6 r4 = (defpackage.hh6) r4
            java.lang.Class<vf5> r8 = defpackage.vf5.class
            java.lang.Object r8 = r9.get(r8)
            r5 = r8
            vf5 r5 = (defpackage.vf5) r5
            java.lang.Class<btf> r8 = defpackage.btf.class
            java.lang.Object r8 = r9.get(r8)
            btf r8 = (defpackage.btf) r8
            if (r8 == 0) goto L50
            as1 r9 = defpackage.as1.e
            r9.getClass()
            java.util.Set<dt4> r9 = defpackage.as1.d
            dt4 r6 = new dt4
            java.lang.String r7 = "json"
            r6.<init>(r7)
            boolean r9 = r9.contains(r6)
            if (r9 != 0) goto L4e
            goto L50
        L4e:
            r6 = r8
            goto L56
        L50:
            com.google.firebase.messaging.FirebaseMessagingRegistrar$b r8 = new com.google.firebase.messaging.FirebaseMessagingRegistrar$b
            r8.<init>()
            goto L4e
        L56:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ak2.d(l7d):java.lang.Object");
    }

    @Override // org.webrtc.NativeLibraryLoader
    public boolean load(String str) {
        Logging.d("LibraryLoader", "Loading library: " + str);
        System.loadLibrary(str);
        return true;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return null;
    }

    @Override // defpackage.nvh
    public Object zza() {
        switch (this.a) {
            case 4:
                List<svh<?>> list = djh.a;
                return Boolean.valueOf(((igi) fgi.b.zza()).zza());
            case 5:
                List<svh<?>> list2 = djh.a;
                return Boolean.valueOf(((jei) eei.b.zza()).zzd());
            case 6:
                List<svh<?>> list3 = djh.a;
                return Boolean.valueOf(((khi) xgi.b.zza()).zzc());
            default:
                List<svh<?>> list4 = djh.a;
                return Boolean.valueOf(((uci) oci.b.zza()).zzg());
        }
    }

    public /* synthetic */ ak2(int i) {
        this.a = i;
    }
}
