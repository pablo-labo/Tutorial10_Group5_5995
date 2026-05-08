package defpackage;

import android.annotation.SuppressLint;
import android.util.Base64;
import androidx.compose.runtime.b;
import androidx.compose.runtime.k;
import androidx.compose.runtime.r;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.ad3;
import defpackage.gl2;
import defpackage.pm8;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Annotation;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes2.dex */
public class jh2 implements ad3.c, nvh, hna, vn9 {
    public static final ah2 b;
    public static final ah2 c;
    public static final ah2 d;
    public final /* synthetic */ int a;
    public static final ah2 e = new ah2(1366708488, new ih2(2), false);
    public static final jh2 f = new jh2(3);
    public static final jh2 V = new jh2(4);
    public static final int[] W = {1, 0, 0, -1, -1, -1, -1};
    public static final int[] X = {1, 0, 0, -2, -1, -1, 0, 2, 0, 0, -2, -1, -1, -1};
    public static final int[] Y = {-1, -1, -1, 1, 0, 0, -1, -3, -1, -1, 1};
    public static final jh2 Z = new jh2(7);
    public static final jh2 a0 = new jh2(8);
    public static final jh2 b0 = new jh2(9);
    public static final jh2 c0 = new jh2(10);
    public static final jh2 d0 = new jh2(11);

    static {
        int i = 1;
        byte b2 = 0;
        b = new ah2(1477800460, new fn0(i, b2), false);
        c = new ah2(1708211532, new ih2(b2), false);
        d = new ah2(-1835651720, new ih2(i), false);
    }

    public jh2(j29 j29Var) {
        this.a = 26;
        new ConcurrentHashMap(3, 1.0f, 2);
    }

    public static final Object A(s98 s98Var, String str, JsonObject jsonObject, i04 i04Var) {
        s98Var.getClass();
        str.getClass();
        return new tb8(s98Var, jsonObject, str, i04Var.getDescriptor()).B(i04Var);
    }

    public static void B(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[10]) & 4294967295L;
        long j2 = ((long) iArr[11]) & 4294967295L;
        long j3 = ((long) iArr[12]) & 4294967295L;
        long j4 = ((long) iArr[13]) & 4294967295L;
        long j5 = ((((long) iArr[7]) & 4294967295L) + j2) - 1;
        long j6 = (((long) iArr[8]) & 4294967295L) + j3;
        long j7 = (((long) iArr[9]) & 4294967295L) + j4;
        long j8 = (((long) iArr[0]) & 4294967295L) - j5;
        long j9 = j8 & 4294967295L;
        long j10 = ((((long) iArr[1]) & 4294967295L) - j6) + (j8 >> 32);
        int i = (int) j10;
        iArr2[1] = i;
        long j11 = ((((long) iArr[2]) & 4294967295L) - j7) + (j10 >> 32);
        int i2 = (int) j11;
        iArr2[2] = i2;
        long j12 = (((((long) iArr[3]) & 4294967295L) + j5) - j) + (j11 >> 32);
        long j13 = j12 & 4294967295L;
        long j14 = (((((long) iArr[4]) & 4294967295L) + j6) - j2) + (j12 >> 32);
        iArr2[4] = (int) j14;
        long j15 = (((((long) iArr[5]) & 4294967295L) + j7) - j3) + (j14 >> 32);
        iArr2[5] = (int) j15;
        long j16 = (((((long) iArr[6]) & 4294967295L) + j) - j4) + (j15 >> 32);
        iArr2[6] = (int) j16;
        long j17 = (j16 >> 32) + 1;
        long j18 = j13 + j17;
        long j19 = j9 - j17;
        iArr2[0] = (int) j19;
        long j20 = j19 >> 32;
        if (j20 != 0) {
            long j21 = j20 + (((long) i) & 4294967295L);
            iArr2[1] = (int) j21;
            long j22 = (j21 >> 32) + (((long) i2) & 4294967295L);
            iArr2[2] = (int) j22;
            j18 += j22 >> 32;
        }
        iArr2[3] = (int) j18;
        if (((j18 >> 32) == 0 || ka6.t0(7, 4, iArr2) == 0) && !(iArr2[6] == -1 && h91.z(iArr2, W))) {
            return;
        }
        h(iArr2);
    }

    public static void C(int i, int[] iArr) {
        long j;
        if (i != 0) {
            long j2 = ((long) i) & 4294967295L;
            long j3 = (((long) iArr[0]) & 4294967295L) - j2;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j5;
                long j6 = (j5 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j6;
                j4 = j6 >> 32;
            }
            long j7 = (4294967295L & ((long) iArr[3])) + j2 + j4;
            iArr[3] = (int) j7;
            j = j7 >> 32;
        } else {
            j = 0;
        }
        if ((j == 0 || ka6.t0(7, 4, iArr) == 0) && !(iArr[6] == -1 && h91.z(iArr, W))) {
            return;
        }
        h(iArr);
    }

    public static final g7c D(final boolean z, gu5 gu5Var, b bVar) {
        if (Float.compare(80.0f, 0.0f) <= 0) {
            l5.q("The refresh trigger must be greater than zero!");
            return null;
        }
        Object objV = bVar.v();
        Object obj = b.a.a;
        if (objV == obj) {
            m74 m74Var = to4.a;
            Object kVar = new k(bVar.l());
            bVar.p(kVar);
            objV = kVar;
        }
        e13 e13Var = (e13) objV;
        g4a g4aVarG = r.g(gu5Var, bVar);
        final iuc iucVar = new iuc();
        final iuc iucVar2 = new iuc();
        iy3 iy3Var = (iy3) bVar.M(um2.h);
        iucVar.element = iy3Var.t1(80.0f);
        iucVar2.element = iy3Var.t1(56.0f);
        boolean zK = bVar.K(e13Var);
        Object objV2 = bVar.v();
        if (zK || objV2 == obj) {
            objV2 = new g7c(e13Var, g4aVarG, iucVar2.element, iucVar.element);
            bVar.p(objV2);
        }
        final g7c g7cVar = (g7c) objV2;
        boolean zX = bVar.x(g7cVar) | bVar.a(z) | bVar.c(iucVar.element) | bVar.c(iucVar2.element);
        Object objV3 = bVar.v();
        if (zX || objV3 == obj) {
            objV3 = new gu5() { // from class: h7c
                @Override // defpackage.gu5
                public final Object invoke() {
                    g7c g7cVar2 = g7cVar;
                    boolean zC = g7cVar2.c();
                    e13 e13Var2 = g7cVar2.a;
                    x2a x2aVar = g7cVar2.h;
                    boolean z2 = z;
                    if (zC != z2) {
                        ((gme) g7cVar2.d).setValue(Boolean.valueOf(z2));
                        ((cme) g7cVar2.f).q(0.0f);
                        u63.Y(e13Var2, null, null, new f7c(g7cVar2, z2 ? ((cme) x2aVar).g() : 0.0f, null), 3);
                    }
                    ((cme) g7cVar2.g).q(iucVar.element);
                    float f2 = iucVar2.element;
                    cme cmeVar = (cme) x2aVar;
                    if (cmeVar.g() != f2) {
                        cmeVar.q(f2);
                        if (g7cVar2.c()) {
                            u63.Y(e13Var2, null, null, new f7c(g7cVar2, f2, null), 3);
                        }
                    }
                    return j6g.a;
                }
            };
            bVar.p(objV3);
        }
        m74 m74Var2 = to4.a;
        bVar.E((gu5) objV3);
        return g7cVar;
    }

    public static String E(ot1 ot1Var) {
        String strA = ot1Var.a();
        strA.getClass();
        Charset charsetForName = Charset.forName("UTF-8");
        charsetForName.getClass();
        byte[] bytes = strA.getBytes(charsetForName);
        bytes.getClass();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bytes, 0, bytes.length);
            String strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
            strEncodeToString.getClass();
            return strEncodeToString;
        } catch (NoSuchAlgorithmException e2) {
            l5.r(e2);
            return null;
        }
    }

    public static void F(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[14];
        h91.N(iArr, iArr3);
        B(iArr3, iArr2);
    }

    public static void G(int[] iArr, int[] iArr2, int[] iArr3) {
        if (h91.P(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & 4294967295L) + 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (((long) iArr3[1]) & 4294967295L);
                iArr3[1] = (int) j3;
                long j4 = (j3 >> 32) + (((long) iArr3[2]) & 4294967295L);
                iArr3[2] = (int) j4;
                j2 = j4 >> 32;
            }
            long j5 = ((4294967295L & ((long) iArr3[3])) - 1) + j2;
            iArr3[3] = (int) j5;
            if ((j5 >> 32) != 0) {
                ka6.U(7, 4, iArr3);
            }
        }
    }

    public static final ea5 H(File file) {
        List list;
        String path = file.getPath();
        path.getClass();
        int iV = v(path);
        String strSubstring = path.substring(0, iV);
        String strSubstring2 = path.substring(iV);
        if (strSubstring2.length() == 0) {
            list = zr4.a;
        } else {
            List listJ0 = zve.j0(strSubstring2, new char[]{File.separatorChar});
            ArrayList arrayList = new ArrayList(t92.r0(listJ0, 10));
            Iterator it = listJ0.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
            list = arrayList;
        }
        return new ea5(new File(strSubstring), list);
    }

    public static String I(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c2 = charArray[i];
                    if (c2 >= 'A' && c2 <= 'Z') {
                        charArray[i] = (char) (c2 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static final f4g J(String str) {
        int i;
        ypd.s(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (wl7.c(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        int iDivideUnsigned = 119304647;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i2, iDivideUnsigned) > 0) {
                if (iDivideUnsigned != 119304647) {
                    return null;
                }
                iDivideUnsigned = Integer.divideUnsigned(-1, 10);
                if (Integer.compareUnsigned(i2, iDivideUnsigned) > 0) {
                    return null;
                }
            }
            int i3 = i2 * 10;
            int i4 = iDigit + i3;
            if (Integer.compareUnsigned(i4, i3) < 0) {
                return null;
            }
            i++;
            i2 = i4;
        }
        return new f4g(i2);
    }

    public static final l4g K(String str) {
        str.getClass();
        ypd.s(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        if (wl7.c(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long j = 0;
        long jDivideUnsigned = 512409557603043100L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Long.compareUnsigned(j, jDivideUnsigned) > 0) {
                if (jDivideUnsigned != 512409557603043100L) {
                    return null;
                }
                jDivideUnsigned = Long.divideUnsigned(-1L, 10L);
                if (Long.compareUnsigned(j, jDivideUnsigned) > 0) {
                    return null;
                }
            }
            long j2 = j * 10;
            long j3 = (((long) iDigit) & 4294967295L) + j2;
            if (Long.compareUnsigned(j3, j2) < 0) {
                return null;
            }
            i++;
            j = j3;
        }
        return new l4g(j);
    }

    public static String L(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c2 = charArray[i];
                    if (c2 >= 'a' && c2 <= 'z') {
                        charArray[i] = (char) (c2 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static void M(int[] iArr, int[] iArr2) {
        if (ka6.b1(7, 0, iArr, iArr2) != 0 || (iArr2[6] == -1 && h91.z(iArr2, W))) {
            h(iArr2);
        }
    }

    public static final void f(b bVar, e eVar) {
        int iHashCode = Long.hashCode(bVar.k());
        e eVarC = c.c(bVar, eVar);
        t8b t8bVarM = bVar.m();
        gl2.j.getClass();
        pm8.a aVar = gl2.a.b;
        if (bVar.j() == null) {
            pg8.B();
            throw null;
        }
        bVar.B();
        if (bVar.f()) {
            bVar.y(aVar);
        } else {
            bVar.n();
        }
        ygg.y(bVar, boe.a, gl2.a.g);
        ygg.y(bVar, t8bVarM, gl2.a.f);
        ygg.y(bVar, eVarC, gl2.a.d);
        gl2.a.C0251a c0251a = gl2.a.j;
        if (bVar.f() || !wl7.b(bVar.v(), Integer.valueOf(iHashCode))) {
            uz.g(iHashCode, bVar, iHashCode, c0251a);
        }
        bVar.q();
    }

    public static void g(int[] iArr, int[] iArr2, int[] iArr3) {
        if (h91.h(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && h91.z(iArr3, W))) {
            h(iArr3);
        }
    }

    public static void h(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) - 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        long j5 = (4294967295L & ((long) iArr[3])) + 1 + j2;
        iArr[3] = (int) j5;
        if ((j5 >> 32) != 0) {
            ka6.t0(7, 4, iArr);
        }
    }

    public static gm3 i(b bVar) {
        jte jteVar = lb2.a;
        long jE = ((kb2) bVar.M(jteVar)).e();
        long jB = da2.b(((kb2) bVar.M(jteVar)).c(), 0.6f);
        long jF = ((kb2) bVar.M(jteVar)).f();
        long jC = ((kb2) bVar.M(jteVar)).c();
        ne4 ne4Var = ps2.a;
        long j = ((da2) bVar.M(ne4Var)).a;
        if (((kb2) bVar.M(jteVar)).g()) {
            pnb.J(j);
        } else {
            pnb.J(j);
        }
        long jB2 = da2.b(jC, 0.38f);
        long j2 = ((da2) bVar.M(ne4Var)).a;
        if (((kb2) bVar.M(jteVar)).g()) {
            pnb.J(j2);
        } else {
            pnb.J(j2);
        }
        long jB3 = da2.b(jE, 0.38f);
        boolean zE = bVar.e(jE) | bVar.e(jB) | bVar.e(jF) | bVar.e(jB2) | bVar.e(jB3);
        Object objV = bVar.v();
        if (zE || objV == b.a.a) {
            gm3 gm3Var = new gm3(jF, da2.b(jF, 0.0f), jE, da2.b(jE, 0.0f), jB2, da2.b(jB2, 0.0f), jB3, jE, jB, jB2, jB3);
            bVar.p(gm3Var);
            objV = gm3Var;
        }
        return (gm3) objV;
    }

    public static final double j(double d2, be4 be4Var, be4 be4Var2) {
        long jConvert = be4Var2.a().convert(1L, be4Var.a());
        return jConvert > 0 ? d2 * jConvert : d2 / be4Var.a().convert(1L, be4Var2.a());
    }

    public static boolean k(String str, String str2) {
        char c2;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length == str2.length()) {
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) == str2.charAt(i) || ((c2 = (char) ((r3 | ' ') - 97)) < 26 && c2 == ((char) ((r4 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final y l(y yVar, en6 en6Var) {
        yVar.getClass();
        en6Var.getClass();
        for (y yVar2 : yVar.a()) {
            if (wl7.b(yVar2.getType(), en6Var)) {
                return yVar2;
            }
            y yVarL = l(yVar2, en6Var);
            if (yVarL != null) {
                return yVarL;
            }
        }
        return null;
    }

    public static final yd8 m(Annotation annotation) {
        annotation.getClass();
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        clsAnnotationType.getClass();
        return fwc.a.b(clsAnnotationType);
    }

    public static String n(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        boolean z = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = ((aqf) it.next()).a.g.n;
            if (st9.o(str2)) {
                return "video/mp4";
            }
            if (st9.k(str2)) {
                z = true;
            } else if (st9.m(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z ? "audio/mp4" : str != null ? str : "application/mp4";
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static Set o() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final Class p(yd8 yd8Var) {
        yd8Var.getClass();
        Class<?> clsJ = ((k52) yd8Var).j();
        clsJ.getClass();
        return clsJ;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class q(yd8 yd8Var) {
        yd8Var.getClass();
        Class<?> clsJ = ((k52) yd8Var).j();
        if (!clsJ.isPrimitive()) {
            return clsJ;
        }
        String name = clsJ.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return clsJ;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class r(yd8 yd8Var) {
        yd8Var.getClass();
        Class<?> clsJ = ((k52) yd8Var).j();
        if (clsJ.isPrimitive()) {
            return clsJ;
        }
        String name = clsJ.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final ArrayList u(ot1 ot1Var) {
        ot1Var.getClass();
        try {
            if (!(ot1Var instanceof f1a)) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(ot1Var.c() ? ot1Var.a() : E(ot1Var));
                return arrayList;
            }
            ArrayList arrayList2 = ((f1a) ot1Var).a;
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                Object obj = arrayList2.get(i);
                obj.getClass();
                arrayList3.add(E((ot1) obj));
            }
            return arrayList3;
        } catch (UnsupportedEncodingException e2) {
            l5.r(e2);
            return null;
        }
    }

    public static final int v(String str) {
        int iR;
        char c2 = File.separatorChar;
        int iR2 = zve.R(str, c2, 0, false, 4);
        if (iR2 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c2 || (iR = zve.R(str, c2, 2, false, 4)) < 0) {
                return 1;
            }
            int iR3 = zve.R(str, c2, iR + 1, false, 4);
            return iR3 >= 0 ? iR3 + 1 : str.length();
        }
        if (iR2 > 0 && str.charAt(iR2 - 1) == ':') {
            return iR2 + 1;
        }
        if (iR2 == -1 && zve.O(str, ':')) {
            return str.length();
        }
        return 0;
    }

    public static final boolean w(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[9];
        float f12 = fArr[10];
        float f13 = fArr[11];
        float f14 = fArr[12];
        float f15 = fArr[13];
        float f16 = fArr[14];
        float f17 = fArr[15];
        float f18 = (f2 * f7) - (f3 * f6);
        float f19 = (f2 * f8) - (f4 * f6);
        float f20 = (f2 * f9) - (f5 * f6);
        float f21 = (f3 * f8) - (f4 * f7);
        float f22 = (f3 * f9) - (f5 * f7);
        float f23 = (f4 * f9) - (f5 * f8);
        float f24 = (f10 * f15) - (f11 * f14);
        float f25 = (f10 * f16) - (f12 * f14);
        float f26 = (f10 * f17) - (f13 * f14);
        float f27 = (f11 * f16) - (f12 * f15);
        float f28 = (f11 * f17) - (f13 * f15);
        float f29 = (f12 * f17) - (f13 * f16);
        float f30 = (f23 * f24) + (((f21 * f26) + ((f20 * f27) + ((f18 * f29) - (f19 * f28)))) - (f22 * f25));
        if (f30 != 0.0f) {
            float f31 = 1.0f / f30;
            fArr2[0] = ((f9 * f27) + ((f7 * f29) - (f8 * f28))) * f31;
            fArr2[1] = (((f4 * f28) + ((-f3) * f29)) - (f5 * f27)) * f31;
            fArr2[2] = ((f17 * f21) + ((f15 * f23) - (f16 * f22))) * f31;
            fArr2[3] = (((f12 * f22) + ((-f11) * f23)) - (f13 * f21)) * f31;
            float f32 = -f6;
            fArr2[4] = (((f8 * f26) + (f32 * f29)) - (f9 * f25)) * f31;
            fArr2[5] = ((f5 * f25) + ((f29 * f2) - (f4 * f26))) * f31;
            float f33 = -f14;
            fArr2[6] = (((f16 * f20) + (f33 * f23)) - (f17 * f19)) * f31;
            fArr2[7] = ((f13 * f19) + ((f23 * f10) - (f12 * f20))) * f31;
            fArr2[8] = ((f9 * f24) + ((f6 * f28) - (f7 * f26))) * f31;
            fArr2[9] = (((f26 * f3) + ((-f2) * f28)) - (f5 * f24)) * f31;
            fArr2[10] = ((f17 * f18) + ((f14 * f22) - (f15 * f20))) * f31;
            fArr2[11] = (((f20 * f11) + ((-f10) * f22)) - (f13 * f18)) * f31;
            fArr2[12] = (((f7 * f25) + (f32 * f27)) - (f8 * f24)) * f31;
            fArr2[13] = ((f4 * f24) + ((f2 * f27) - (f3 * f25))) * f31;
            fArr2[14] = (((f15 * f19) + (f33 * f21)) - (f16 * f18)) * f31;
            fArr2[15] = ((f12 * f18) + ((f10 * f21) - (f11 * f19))) * f31;
        }
        return !(f30 == 0.0f);
    }

    public static final boolean x() {
        return ((kr7) cr8.p(kr7.class)).e("droid_native_messaging_ai_assistant").a > 0;
    }

    public static final boolean y() {
        return ((kr7) cr8.p(kr7.class)).e("ai_messaging_mobile_version_two_improvements").a == 2;
    }

    public static void z(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[14];
        h91.I(iArr, iArr2, iArr4);
        B(iArr4, iArr3);
    }

    @Override // defpackage.vn9
    public void a(Object obj) {
    }

    @Override // defpackage.hna
    public Object b() {
        return new ArrayList();
    }

    @Override // defpackage.vn9
    public void c(Object obj) {
    }

    @Override // ad3.c
    public Iterable d(Object obj) {
        int i = b04.a;
        Collection<? extends fv1> collectionM = ((rlg) obj).m();
        ArrayList arrayList = new ArrayList(t92.r0(collectionM, 10));
        Iterator<T> it = collectionM.iterator();
        while (it.hasNext()) {
            arrayList.add(((rlg) it.next()).a());
        }
        return arrayList;
    }

    @Override // defpackage.vn9
    public void e(Object obj) {
    }

    public void s(t52 t52Var) {
        t52Var.getClass();
    }

    public void t(t52 t52Var) {
    }

    @Override // defpackage.nvh
    public Object zza() {
        switch (this.a) {
            case 8:
                List<svh<?>> list = djh.a;
                return Long.valueOf(((ubi) vbi.b.zza()).zzr());
            case DatadogLogGenerator.CRASH /* 9 */:
                List<svh<?>> list2 = djh.a;
                return ((ubi) vbi.b.zza()).zzc();
            default:
                List<svh<?>> list3 = djh.a;
                return Boolean.valueOf(((sii) tii.b.zza()).zzb());
        }
    }

    public /* synthetic */ jh2(int i) {
        this.a = i;
    }

    public jh2(jia jiaVar) {
        this.a = 17;
    }
}
