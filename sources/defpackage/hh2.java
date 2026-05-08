package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import com.airbnb.lottie.parser.moshi.a;
import com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.soloader.SoLoader;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.MalformedJsonException;
import defpackage.i34;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public class hh2 implements tlg, nvh, tme, v9a {
    public static final hh2 V;
    public static final ux0 Y;
    public static final ux0 Z;
    public static final ah2 b;
    public static final ah2 d;
    public static final ah2 e;
    public static long f0 = -1;
    public final /* synthetic */ int a;
    public static final ah2 c = new ah2(975091101, new ri2(), false);
    public static final ah2 f = new ah2(-581260047, new si2(), false);
    public static final int[] W = {-1, -1, 0, -1, -1, -1, -1, -2};
    public static final int[] X = {1, 0, -2, 1, 1, -2, 0, 2, -2, -3, 3, -2, -1, -1, 0, -2};
    public static final rg a0 = new rg(14);
    public static final hh2 b0 = new hh2(6);
    public static final hh2 c0 = new hh2(7);
    public static final hh2 d0 = new hh2(8);
    public static final hh2 e0 = new hh2(9);

    static {
        int i = 2;
        b = new ah2(-526547141, new fm0(i), false);
        int i2 = 1;
        d = new ah2(-855903772, new gh2(i2), false);
        e = new ah2(712512527, new vh2(i2), false);
        V = new hh2(i);
        int i3 = 4;
        Y = new ux0("NONE", i3);
        Z = new ux0("PENDING", i3);
    }

    public hh2(i34.b bVar) {
        this.a = 15;
    }

    public static ka8 A(String str) {
        try {
            nb8 nb8Var = new nb8(new StringReader(str));
            ka8 ka8VarZ = z(nb8Var);
            ka8VarZ.getClass();
            if (!(ka8VarZ instanceof xa8) && nb8Var.j0() != sb8.Y) {
                throw new JsonSyntaxException("Did not consume the entire document.");
            }
            return ka8VarZ;
        } catch (MalformedJsonException e2) {
            throw new JsonSyntaxException(e2);
        } catch (IOException e3) {
            throw new JsonIOException(e3);
        } catch (NumberFormatException e4) {
            throw new JsonSyntaxException(e4);
        }
    }

    public static final void B(View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.endViewTransition(view);
            viewGroup.removeView(view);
        }
        view.setVisibility(0);
        view.setTranslationY(0.0f);
    }

    public static void C(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[8]) & 4294967295L;
        long j2 = ((long) iArr[9]) & 4294967295L;
        long j3 = ((long) iArr[10]) & 4294967295L;
        long j4 = ((long) iArr[11]) & 4294967295L;
        long j5 = ((long) iArr[12]) & 4294967295L;
        long j6 = ((long) iArr[13]) & 4294967295L;
        long j7 = ((long) iArr[14]) & 4294967295L;
        long j8 = ((long) iArr[15]) & 4294967295L;
        long j9 = j3 + j4;
        long j10 = j6 + j7;
        long j11 = j10 + (j8 << 1);
        long j12 = j + j2 + j10;
        long j13 = j9 + j5 + j8 + j12;
        long j14 = (((long) iArr[0]) & 4294967295L) + j13 + j6 + j7 + j8;
        iArr2[0] = (int) j14;
        long j15 = (((((long) iArr[1]) & 4294967295L) + j13) - j) + j7 + j8 + (j14 >> 32);
        iArr2[1] = (int) j15;
        long j16 = ((((long) iArr[2]) & 4294967295L) - j12) + (j15 >> 32);
        iArr2[2] = (int) j16;
        long j17 = ((((((long) iArr[3]) & 4294967295L) + j13) - j2) - j3) + j6 + (j16 >> 32);
        iArr2[3] = (int) j17;
        long j18 = ((((((long) iArr[4]) & 4294967295L) + j13) - j9) - j) + j7 + (j17 >> 32);
        iArr2[4] = (int) j18;
        long j19 = (((long) iArr[5]) & 4294967295L) + j11 + j3 + (j18 >> 32);
        iArr2[5] = (int) j19;
        long j20 = (((long) iArr[6]) & 4294967295L) + j4 + j7 + j8 + (j19 >> 32);
        iArr2[6] = (int) j20;
        long j21 = (((long) iArr[7]) & 4294967295L) + j13 + j11 + j5 + (j20 >> 32);
        iArr2[7] = (int) j21;
        D((int) (j21 >> 32), iArr2);
    }

    public static void D(int i, int[] iArr) {
        long j;
        if (i != 0) {
            long j2 = ((long) i) & 4294967295L;
            long j3 = (((long) iArr[0]) & 4294967295L) + j2;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j5;
                j4 = j5 >> 32;
            }
            long j6 = ((((long) iArr[2]) & 4294967295L) - j2) + j4;
            iArr[2] = (int) j6;
            long j7 = (((long) iArr[3]) & 4294967295L) + j2 + (j6 >> 32);
            iArr[3] = (int) j7;
            long j8 = j7 >> 32;
            if (j8 != 0) {
                long j9 = j8 + (((long) iArr[4]) & 4294967295L);
                iArr[4] = (int) j9;
                long j10 = (j9 >> 32) + (((long) iArr[5]) & 4294967295L);
                iArr[5] = (int) j10;
                long j11 = (j10 >> 32) + (((long) iArr[6]) & 4294967295L);
                iArr[6] = (int) j11;
                j8 = j11 >> 32;
            }
            long j12 = (4294967295L & ((long) iArr[7])) + j2 + j8;
            iArr[7] = (int) j12;
            j = j12 >> 32;
        } else {
            j = 0;
        }
        if (j != 0 || ((iArr[7] >>> 1) >= Integer.MAX_VALUE && ka6.q0(iArr, W))) {
            g(iArr);
        }
    }

    public static final boolean E(ui8 ui8Var) {
        v62 v62VarD = ui8Var.M0().d();
        if (v62VarD != null && ((fe7.b(v62VarD) && fe7.e(v62VarD) && !b04.g((t52) v62VarD).equals(ere.h)) || fe7.f(ui8Var))) {
            return true;
        }
        v62 v62VarD2 = ui8Var.M0().d();
        rxf rxfVar = v62VarD2 instanceof rxf ? (rxf) v62VarD2 : null;
        return rxfVar != null && E(boa.u(rxfVar));
    }

    public static int F(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static int G(Object obj) {
        return F(obj == null ? 0 : obj.hashCode());
    }

    public static void H(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        ka6.k1(iArr, iArr3);
        C(iArr3, iArr2);
    }

    public static void I(int i, int[] iArr, int[] iArr2) {
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

    public static final boolean J(byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        return u(0, bArr, bArr2);
    }

    public static void K(int[] iArr, int[] iArr2, int[] iArr3) {
        if (ka6.o1(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & 4294967295L) - 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (((long) iArr3[1]) & 4294967295L);
                iArr3[1] = (int) j3;
                j2 = j3 >> 32;
            }
            long j4 = (((long) iArr3[2]) & 4294967295L) + 1 + j2;
            iArr3[2] = (int) j4;
            long j5 = ((((long) iArr3[3]) & 4294967295L) - 1) + (j4 >> 32);
            iArr3[3] = (int) j5;
            long j6 = j5 >> 32;
            if (j6 != 0) {
                long j7 = j6 + (((long) iArr3[4]) & 4294967295L);
                iArr3[4] = (int) j7;
                long j8 = (j7 >> 32) + (((long) iArr3[5]) & 4294967295L);
                iArr3[5] = (int) j8;
                long j9 = (j8 >> 32) + (((long) iArr3[6]) & 4294967295L);
                iArr3[6] = (int) j9;
                j6 = j9 >> 32;
            }
            iArr3[7] = (int) (((4294967295L & ((long) iArr3[7])) - 1) + j6);
        }
    }

    public static void L(File file, wa5 wa5Var) {
        wa5Var.c(file);
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    L(file2, wa5Var);
                } else {
                    wa5Var.b(file2);
                }
            }
        }
        wa5Var.a(file);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(gu5 gu5Var, gu5 gu5Var2, gu5 gu5Var3, gu5 gu5Var4, gu5 gu5Var5, gu5 gu5Var6, b bVar, int i) {
        gu5Var.getClass();
        gu5Var2.getClass();
        gu5Var3.getClass();
        gu5Var4.getClass();
        gu5Var5.getClass();
        gu5Var6.getClass();
        c cVarH = bVar.h(525280718);
        int i2 = i | (cVarH.x(gu5Var) ? 4 : 2) | (cVarH.x(gu5Var2) ? 32 : 16) | (cVarH.x(gu5Var3) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var4) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(gu5Var5) ? 16384 : 8192) | (cVarH.x(gu5Var6) ? 131072 : 65536);
        int i3 = 0;
        if (cVarH.o(i2 & 1, (74899 & i2) != 74898)) {
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.f(dqd.a);
                cVarH.p(objV);
            }
            g4a g4aVar = (g4a) objV;
            int iOrdinal = ((dqd) g4aVar.getValue()).ordinal();
            if (iOrdinal == 0) {
                cVarH.L(-2011357392);
                boolean z = (i2 & 14) == 4;
                Object objV2 = cVarH.v();
                if (z || objV2 == c0020a) {
                    objV2 = new tm0(gu5Var, g4aVar, i3);
                    cVarH.p(objV2);
                }
                gu5 gu5Var7 = (gu5) objV2;
                i = (i2 & 112) != 32 ? 0 : 1;
                Object objV3 = cVarH.v();
                if (i != 0 || objV3 == c0020a) {
                    objV3 = new um0(gu5Var2, g4aVar, i3);
                    cVarH.p(objV3);
                }
                u63.e(gu5Var7, (gu5) objV3, cVarH, 0);
                cVarH.U(false);
            } else if (iOrdinal == 1) {
                cVarH.L(-2011346199);
                boolean z2 = (i2 & 896) == 256;
                Object objV4 = cVarH.v();
                if (z2 || objV4 == c0020a) {
                    objV4 = new ta(i, gu5Var3);
                    cVarH.p(objV4);
                }
                gu5 gu5Var8 = (gu5) objV4;
                boolean z3 = (i2 & 7168) == 2048;
                Object objV5 = cVarH.v();
                if (z3 || objV5 == c0020a) {
                    objV5 = new og0(gu5Var4, g4aVar, i);
                    cVarH.p(objV5);
                }
                ojh.b(gu5Var8, (gu5) objV5, cVarH, 0);
                cVarH.U(false);
            } else {
                if (iOrdinal != 2) {
                    cVarH.L(-2011358192);
                    cVarH.U(false);
                    l.g();
                    return;
                }
                cVarH.L(-2011336250);
                boolean z4 = (57344 & i2) == 16384;
                Object objV6 = cVarH.v();
                if (z4 || objV6 == c0020a) {
                    objV6 = new zb(3, gu5Var5);
                    cVarH.p(objV6);
                }
                gu5 gu5Var9 = (gu5) objV6;
                i = (i2 & 458752) != 131072 ? 0 : 1;
                Object objV7 = cVarH.v();
                if (i != 0 || objV7 == c0020a) {
                    objV7 = new vm0(gu5Var6, g4aVar, i3);
                    cVarH.p(objV7);
                }
                nn2.c(gu5Var9, (gu5) objV7, cVarH, 0);
                cVarH.U(false);
            }
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new wm0(gu5Var, gu5Var2, gu5Var3, gu5Var4, gu5Var5, gu5Var6, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(final java.lang.String r20, final java.lang.String r21, defpackage.gu5 r22, final defpackage.gu5 r23, java.lang.String r24, final java.lang.String r25, boolean r26, boolean r27, int r28, androidx.compose.runtime.b r29, final int r30, final int r31) {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hh2.d(java.lang.String, java.lang.String, gu5, gu5, java.lang.String, java.lang.String, boolean, boolean, int, androidx.compose.runtime.b, int, int):void");
    }

    public static final gse e(Object obj) {
        if (obj == null) {
            obj = ewa.W;
        }
        return new gse(obj);
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        if (ka6.H(iArr, iArr2, iArr3) != 0 || ((iArr3[7] >>> 1) >= Integer.MAX_VALUE && ka6.q0(iArr3, W))) {
            g(iArr3);
        }
    }

    public static void g(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            j2 = j3 >> 32;
        }
        long j4 = ((((long) iArr[2]) & 4294967295L) - 1) + j2;
        iArr[2] = (int) j4;
        long j5 = (((long) iArr[3]) & 4294967295L) + 1 + (j4 >> 32);
        iArr[3] = (int) j5;
        long j6 = j5 >> 32;
        if (j6 != 0) {
            long j7 = j6 + (((long) iArr[4]) & 4294967295L);
            iArr[4] = (int) j7;
            long j8 = (j7 >> 32) + (((long) iArr[5]) & 4294967295L);
            iArr[5] = (int) j8;
            long j9 = (j8 >> 32) + (((long) iArr[6]) & 4294967295L);
            iArr[6] = (int) j9;
            j6 = j9 >> 32;
        }
        iArr[7] = (int) ((4294967295L & ((long) iArr[7])) + 1 + j6);
    }

    public static final byte[] h(String str) {
        try {
            Charset charsetForName = Charset.forName("ASCII");
            charsetForName.getClass();
            byte[] bytes = str.getBytes(charsetForName);
            bytes.getClass();
            return bytes;
        } catch (UnsupportedEncodingException e2) {
            l6.p("ASCII not found!", e2);
            return null;
        }
    }

    public static void i(StringBuilder sb, Object obj) {
        int iLastIndexOf;
        if (obj == null) {
            sb.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(iLastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    public static void j(String str, boolean z) {
        if (z) {
            return;
        }
        l5.q(str);
    }

    public static void k(int i) {
        if (i >= 0) {
            return;
        }
        o6.h();
    }

    public static final void l(long j) {
        ckf[] ckfVarArr = bkf.b;
        if ((j & 1095216660480L) == 0) {
            ce7.a("Cannot perform operation for Unspecified type.");
        }
    }

    public static void m(Object obj, String str) {
        if (obj != null) {
            return;
        }
        ja.k(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a6, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0168, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlinx.serialization.KSerializer n(java.lang.Class r17, kotlinx.serialization.KSerializer... r18) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hh2.n(java.lang.Class, kotlinx.serialization.KSerializer[]):kotlinx.serialization.KSerializer");
    }

    public static boolean o(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                o(file2);
            }
        }
        return file.delete();
    }

    public static final WritableMap p(gf4 gf4Var) {
        gf4Var.getClass();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        writableMapCreateMap.putDouble("top", nn2.C(gf4Var.a));
        writableMapCreateMap.putDouble(GesturesListener.SCROLL_DIRECTION_RIGHT, nn2.C(gf4Var.b));
        writableMapCreateMap.putDouble("bottom", nn2.C(gf4Var.c));
        writableMapCreateMap.putDouble(GesturesListener.SCROLL_DIRECTION_LEFT, nn2.C(gf4Var.d));
        return writableMapCreateMap;
    }

    public static ApiException q(Status status) {
        return status.c != null ? new ResolvableApiException(status) : new ApiException(status);
    }

    public static final long r(double d2) {
        return y(8589934592L, (float) d2);
    }

    public static final long s(double d2) {
        return y(4294967296L, (float) d2);
    }

    public static final long t(int i) {
        return y(4294967296L, i);
    }

    public static final boolean u(int i, byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        if (bArr2.length + i <= bArr.length) {
            Iterable oh7Var = new oh7(0, bArr2.length - 1, 1);
            if (!(oh7Var instanceof Collection) || !((Collection) oh7Var).isEmpty()) {
                Iterator<Integer> it = oh7Var.iterator();
                while (((nh7) it).c) {
                    int iNextInt = ((fh7) it).nextInt();
                    if (bArr[i + iNextInt] != bArr2[iNextInt]) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final KSerializer v(Object obj, KSerializer... kSerializerArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (kSerializerArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = kSerializerArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = KSerializer.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(kSerializerArr, kSerializerArr.length));
            if (objInvoke instanceof KSerializer) {
                return (KSerializer) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause == null) {
                throw e2;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e2.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static final long w(long j, float f2) {
        return (Float.isNaN(f2) || f2 >= 1.0f) ? j : da2.b(j, da2.d(j) * f2);
    }

    public static void x(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        ka6.H0(iArr, iArr2, iArr4);
        C(iArr4, iArr3);
    }

    public static final long y(long j, float f2) {
        long jFloatToRawIntBits = j | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
        ckf[] ckfVarArr = bkf.b;
        return jFloatToRawIntBits;
    }

    public static ka8 z(nb8 nb8Var) {
        boolean z = nb8Var.b;
        nb8Var.b = true;
        try {
            try {
                try {
                    return web.u(nb8Var);
                } catch (OutOfMemoryError e2) {
                    throw new JsonParseException("Failed parsing JSON source: " + nb8Var + " to Json", e2);
                }
            } catch (StackOverflowError e3) {
                throw new JsonParseException("Failed parsing JSON source: " + nb8Var + " to Json", e3);
            }
        } finally {
            nb8Var.b = z;
        }
    }

    @Override // defpackage.tlg
    public Object a(a aVar, float f2) {
        return Float.valueOf(ec8.d(aVar) * f2);
    }

    @Override // defpackage.v9a
    public boolean c(String str) {
        return SoLoader.m(0, str);
    }

    @Override // defpackage.nvh
    public Object zza() {
        switch (this.a) {
            case 6:
                List<svh<?>> list = djh.a;
                return ((ubi) vbi.b.zza()).h();
            case 7:
                List<svh<?>> list2 = djh.a;
                return Boolean.valueOf(((jei) eei.b.zza()).zzb());
            case 8:
                List<svh<?>> list3 = djh.a;
                return Boolean.valueOf(((jbi) kbi.b.zza()).zza());
            default:
                List<svh<?>> list4 = djh.a;
                return Boolean.valueOf(((afi) ffi.b.zza()).zzb());
        }
    }

    public /* synthetic */ hh2(int i) {
        this.a = i;
    }
}
