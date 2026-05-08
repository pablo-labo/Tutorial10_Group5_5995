package defpackage;

import android.graphics.Shader;
import defpackage.o97;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tr6 {

    public static final class a extends tbe {
        public final /* synthetic */ o97 c;

        public a(o97 o97Var) {
            this.c = o97Var;
        }

        @Override // defpackage.tbe
        public final Shader b(long j) {
            o97.a aVar = this.c.c;
            List listA0 = u63.a0(new da2(aVar.f.d.a.a), new da2(aVar.f.d.a.b));
            List listA02 = u63.a0(Float.valueOf(0.05f), Float.valueOf(0.95f));
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            return pg8.e(jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), listA0, listA02);
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b20.values().length];
            try {
                iArr[b20.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b20.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b20.CRITICAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b20.SUCCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b20.AI.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final defpackage.b20 r27, final defpackage.gu5<defpackage.j6g> r28, final java.lang.String r29, androidx.compose.ui.e r30, defpackage.fv6 r31, java.lang.String r32, final java.lang.String r33, defpackage.wu5<? super defpackage.pb2, ? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r34, androidx.compose.runtime.b r35, final int r36, final int r37) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tr6.a(b20, gu5, java.lang.String, androidx.compose.ui.e, fv6, java.lang.String, java.lang.String, wu5, androidx.compose.runtime.b, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final defpackage.b20 r24, androidx.compose.ui.e r25, defpackage.fv6 r26, java.lang.String r27, final java.lang.String r28, defpackage.wu5<? super defpackage.pb2, ? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r29, androidx.compose.runtime.b r30, final int r31, final int r32) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tr6.b(b20, androidx.compose.ui.e, fv6, java.lang.String, java.lang.String, wu5, androidx.compose.runtime.b, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final defpackage.fv6 r29, final long r30, androidx.compose.ui.e r32, defpackage.b20 r33, java.lang.String r34, final java.lang.String r35, java.lang.String r36, defpackage.wu5 r37, androidx.compose.runtime.b r38, final int r39, final int r40, final int r41) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tr6.c(fv6, long, androidx.compose.ui.e, b20, java.lang.String, java.lang.String, java.lang.String, wu5, androidx.compose.runtime.b, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0568 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:262:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fc  */
    /* JADX WARN: Type inference failed for: r12v26, types: [androidx.compose.runtime.c] */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29, types: [androidx.compose.runtime.c] */
    /* JADX WARN: Type inference failed for: r12v30, types: [androidx.compose.runtime.c] */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v42, types: [androidx.compose.runtime.c] */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v68 */
    /* JADX WARN: Type inference failed for: r12v74 */
    /* JADX WARN: Type inference failed for: r12v75 */
    /* JADX WARN: Type inference failed for: r12v76 */
    /* JADX WARN: Type inference failed for: r12v77 */
    /* JADX WARN: Type inference failed for: r24v0, types: [androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r24v1, types: [androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(final androidx.compose.ui.e r61, final defpackage.b20 r62, final defpackage.fv6 r63, defpackage.da2 r64, final java.lang.String r65, final java.lang.String r66, final java.lang.String r67, final boolean r68, defpackage.gu5<defpackage.j6g> r69, final java.lang.String r70, final defpackage.gu5<defpackage.j6g> r71, final defpackage.wu5<? super defpackage.pb2, ? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r72, androidx.compose.runtime.b r73, final int r74, final int r75, final int r76) {
        /*
            Method dump skipped, instruction units count: 1594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tr6.d(androidx.compose.ui.e, b20, fv6, da2, java.lang.String, java.lang.String, java.lang.String, boolean, gu5, java.lang.String, gu5, wu5, androidx.compose.runtime.b, int, int, int):void");
    }
}
