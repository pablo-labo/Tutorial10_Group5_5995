package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class lyb {
    public static final byte[] a = {112, 114, 111, 0};
    public static final byte[] b = {112, 114, 109, 0};

    public static byte[] a(b44[] b44VarArr, byte[] bArr) throws IOException {
        int i = 0;
        int length = 0;
        for (b44 b44Var : b44VarArr) {
            length += ((((b44Var.g * 2) + 7) & (-8)) / 8) + (b44Var.e * 2) + b(bArr, b44Var.a, b44Var.b).getBytes(StandardCharsets.UTF_8).length + 16 + b44Var.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, w1c.c)) {
            int length2 = b44VarArr.length;
            while (i < length2) {
                b44 b44Var2 = b44VarArr[i];
                k(byteArrayOutputStream, b44Var2, b(bArr, b44Var2.a, b44Var2.b));
                j(byteArrayOutputStream, b44Var2);
                i++;
            }
        } else {
            for (b44 b44Var3 : b44VarArr) {
                k(byteArrayOutputStream, b44Var3, b(bArr, b44Var3.a, b44Var3.b));
            }
            int length3 = b44VarArr.length;
            while (i < length3) {
                j(byteArrayOutputStream, b44VarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static String b(byte[] bArr, String str, String str2) {
        byte[] bArr2 = w1c.e;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = w1c.d;
        String str3 = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return l6.i(q6.g(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static int[] c(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iB = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iB += (int) ak2.B(byteArrayInputStream, 2);
            iArr[i2] = iB;
        }
        return iArr;
    }

    public static b44[] d(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, b44[] b44VarArr) throws IOException {
        byte[] bArr3 = w1c.f;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, w1c.g)) {
                r6.g("Unsupported meta version");
                return null;
            }
            int iB = (int) ak2.B(fileInputStream, 2);
            byte[] bArrA = ak2.A(fileInputStream, (int) ak2.B(fileInputStream, 4), (int) ak2.B(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                r6.g("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrA);
            try {
                b44[] b44VarArrF = f(byteArrayInputStream, bArr2, iB, b44VarArr);
                byteArrayInputStream.close();
                return b44VarArrF;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(w1c.a, bArr2)) {
            r6.g("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            r6.g("Unsupported meta version");
            return null;
        }
        int iB2 = (int) ak2.B(fileInputStream, 1);
        byte[] bArrA2 = ak2.A(fileInputStream, (int) ak2.B(fileInputStream, 4), (int) ak2.B(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            r6.g("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrA2);
        try {
            b44[] b44VarArrE = e(byteArrayInputStream2, iB2, b44VarArr);
            byteArrayInputStream2.close();
            return b44VarArrE;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static b44[] e(ByteArrayInputStream byteArrayInputStream, int i, b44[] b44VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new b44[0];
        }
        if (i != b44VarArr.length) {
            r6.g("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iB = (int) ak2.B(byteArrayInputStream, 2);
            iArr[i2] = (int) ak2.B(byteArrayInputStream, 2);
            strArr[i2] = new String(ak2.z(byteArrayInputStream, iB), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            b44 b44Var = b44VarArr[i3];
            if (!b44Var.b.equals(strArr[i3])) {
                r6.g("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i4 = iArr[i3];
            b44Var.e = i4;
            b44Var.h = c(byteArrayInputStream, i4);
        }
        return b44VarArr;
    }

    public static b44[] f(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, b44[] b44VarArr) throws IOException {
        b44 b44Var;
        if (byteArrayInputStream.available() == 0) {
            return new b44[0];
        }
        if (i != b44VarArr.length) {
            r6.g("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            ak2.B(byteArrayInputStream, 2);
            String str = new String(ak2.z(byteArrayInputStream, (int) ak2.B(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jB = ak2.B(byteArrayInputStream, 4);
            int iB = (int) ak2.B(byteArrayInputStream, 2);
            if (b44VarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i3 = 0; i3 < b44VarArr.length; i3++) {
                    if (b44VarArr[i3].b.equals(strSubstring)) {
                        b44Var = b44VarArr[i3];
                        break;
                    }
                }
                b44Var = null;
            } else {
                b44Var = null;
            }
            if (b44Var == null) {
                r6.g("Missing profile key: ".concat(str));
                return null;
            }
            b44Var.d = jB;
            int[] iArrC = c(byteArrayInputStream, iB);
            if (Arrays.equals(bArr, w1c.e)) {
                b44Var.e = iB;
                b44Var.h = iArrC;
            }
        }
        return b44VarArr;
    }

    public static b44[] g(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, w1c.b)) {
            r6.g("Unsupported version");
            return null;
        }
        int iB = (int) ak2.B(fileInputStream, 1);
        byte[] bArrA = ak2.A(fileInputStream, (int) ak2.B(fileInputStream, 4), (int) ak2.B(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            r6.g("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrA);
        try {
            b44[] b44VarArrH = h(byteArrayInputStream, str, iB);
            byteArrayInputStream.close();
            return b44VarArrH;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static b44[] h(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new b44[0];
        }
        b44[] b44VarArr = new b44[i];
        for (int i3 = 0; i3 < i; i3++) {
            int iB = (int) ak2.B(byteArrayInputStream, 2);
            int iB2 = (int) ak2.B(byteArrayInputStream, 2);
            b44VarArr[i3] = new b44(str, new String(ak2.z(byteArrayInputStream, iB), StandardCharsets.UTF_8), ak2.B(byteArrayInputStream, 4), iB2, (int) ak2.B(byteArrayInputStream, 4), (int) ak2.B(byteArrayInputStream, 4), new int[iB2], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            b44 b44Var = b44VarArr[i4];
            int iAvailable = byteArrayInputStream.available();
            int i5 = b44Var.f;
            int i6 = b44Var.g;
            TreeMap<Integer, Integer> treeMap = b44Var.i;
            int i7 = iAvailable - i5;
            int iB3 = i2;
            while (byteArrayInputStream.available() > i7) {
                iB3 += (int) ak2.B(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iB3), 1);
                int iB4 = (int) ak2.B(byteArrayInputStream, 2);
                while (iB4 > 0) {
                    ak2.B(byteArrayInputStream, 2);
                    int iB5 = (int) ak2.B(byteArrayInputStream, 1);
                    if (iB5 != 6 && iB5 != 7) {
                        while (iB5 > 0) {
                            ak2.B(byteArrayInputStream, 1);
                            int i8 = i2;
                            int i9 = i4;
                            for (int iB6 = (int) ak2.B(byteArrayInputStream, 1); iB6 > 0; iB6--) {
                                ak2.B(byteArrayInputStream, 2);
                            }
                            iB5--;
                            i2 = i8;
                            i4 = i9;
                        }
                    }
                    iB4--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i10 = i2;
            int i11 = i4;
            if (byteArrayInputStream.available() != i7) {
                r6.g("Read too much data during profile line parse");
                return null;
            }
            b44Var.h = c(byteArrayInputStream, b44Var.e);
            BitSet bitSetValueOf = BitSet.valueOf(ak2.z(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i12 = i10; i12 < i6; i12++) {
                int i13 = bitSetValueOf.get(i12) ? 2 : i10;
                if (bitSetValueOf.get(i12 + i6)) {
                    i13 |= 4;
                }
                if (i13 != 0) {
                    Integer numValueOf = treeMap.get(Integer.valueOf(i12));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i10);
                    }
                    treeMap.put(Integer.valueOf(i12), Integer.valueOf(i13 | numValueOf.intValue()));
                }
            }
            i4 = i11 + 1;
            i2 = i10;
        }
        return b44VarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean i(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, b44[] b44VarArr) throws IOException {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = w1c.a;
        int i = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = w1c.b;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrA = a(b44VarArr, bArr3);
                ak2.N(byteArrayOutputStream, b44VarArr.length, 1);
                ak2.N(byteArrayOutputStream, bArrA.length, 4);
                byte[] bArrJ = ak2.j(bArrA);
                ak2.N(byteArrayOutputStream, bArrJ.length, 4);
                byteArrayOutputStream.write(bArrJ);
                return true;
            }
            byte[] bArr4 = w1c.d;
            if (Arrays.equals(bArr, bArr4)) {
                ak2.N(byteArrayOutputStream, b44VarArr.length, 1);
                for (b44 b44Var : b44VarArr) {
                    int size = b44Var.i.size() * 4;
                    String strB = b(bArr4, b44Var.a, b44Var.b);
                    Charset charset = StandardCharsets.UTF_8;
                    ak2.O(byteArrayOutputStream, strB.getBytes(charset).length);
                    ak2.O(byteArrayOutputStream, b44Var.h.length);
                    ak2.N(byteArrayOutputStream, size, 4);
                    ak2.N(byteArrayOutputStream, b44Var.c, 4);
                    byteArrayOutputStream.write(strB.getBytes(charset));
                    Iterator<Integer> it = b44Var.i.keySet().iterator();
                    while (it.hasNext()) {
                        ak2.O(byteArrayOutputStream, it.next().intValue());
                        ak2.O(byteArrayOutputStream, 0);
                    }
                    for (int i2 : b44Var.h) {
                        ak2.O(byteArrayOutputStream, i2);
                    }
                }
                return true;
            }
            byte[] bArr5 = w1c.c;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrA2 = a(b44VarArr, bArr5);
                ak2.N(byteArrayOutputStream, b44VarArr.length, 1);
                ak2.N(byteArrayOutputStream, bArrA2.length, 4);
                byte[] bArrJ2 = ak2.j(bArrA2);
                ak2.N(byteArrayOutputStream, bArrJ2.length, 4);
                byteArrayOutputStream.write(bArrJ2);
                return true;
            }
            byte[] bArr6 = w1c.e;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            ak2.O(byteArrayOutputStream, b44VarArr.length);
            for (b44 b44Var2 : b44VarArr) {
                String str = b44Var2.a;
                TreeMap<Integer, Integer> treeMap = b44Var2.i;
                String strB2 = b(bArr6, str, b44Var2.b);
                Charset charset2 = StandardCharsets.UTF_8;
                ak2.O(byteArrayOutputStream, strB2.getBytes(charset2).length);
                ak2.O(byteArrayOutputStream, treeMap.size());
                ak2.O(byteArrayOutputStream, b44Var2.h.length);
                ak2.N(byteArrayOutputStream, b44Var2.c, 4);
                byteArrayOutputStream.write(strB2.getBytes(charset2));
                Iterator<Integer> it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    ak2.O(byteArrayOutputStream, it2.next().intValue());
                }
                for (int i3 : b44Var2.h) {
                    ak2.O(byteArrayOutputStream, i3);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            ak2.O(byteArrayOutputStream2, b44VarArr.length);
            int i4 = 2;
            int i5 = 2;
            for (b44 b44Var3 : b44VarArr) {
                ak2.N(byteArrayOutputStream2, b44Var3.c, 4);
                ak2.N(byteArrayOutputStream2, b44Var3.d, 4);
                ak2.N(byteArrayOutputStream2, b44Var3.g, 4);
                String strB3 = b(bArr2, b44Var3.a, b44Var3.b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strB3.getBytes(charset3).length;
                ak2.O(byteArrayOutputStream2, length2);
                i5 = i5 + 14 + length2;
                byteArrayOutputStream2.write(strB3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i5 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray.length);
            }
            c5h c5hVar = new c5h(na5.DEX_FILES, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(c5hVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i6 = 0;
            for (int i7 = 0; i7 < b44VarArr.length; i7++) {
                try {
                    b44 b44Var4 = b44VarArr[i7];
                    ak2.O(byteArrayOutputStream3, i7);
                    ak2.O(byteArrayOutputStream3, b44Var4.e);
                    i6 = i6 + 4 + (b44Var4.e * i4);
                    int[] iArr = b44Var4.h;
                    int length3 = iArr.length;
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < length3) {
                        int i10 = iArr[i8];
                        ak2.O(byteArrayOutputStream3, i10 - i9);
                        i8++;
                        i4 = i4;
                        i9 = i10;
                    }
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i6 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray2.length);
            }
            c5h c5hVar2 = new c5h(na5.CLASSES, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c5hVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i11 = 0;
            int i12 = 0;
            while (i11 < b44VarArr.length) {
                try {
                    b44 b44Var5 = b44VarArr[i11];
                    Iterator<Map.Entry<Integer, Integer>> it3 = b44Var5.i.entrySet().iterator();
                    int iIntValue = i;
                    while (it3.hasNext()) {
                        iIntValue |= it3.next().getValue().intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        l(byteArrayOutputStream4, iIntValue, b44Var5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            m(byteArrayOutputStream4, b44Var5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            ak2.O(byteArrayOutputStream3, i11);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i13 = i12 + 6;
                            ArrayList arrayList4 = arrayList3;
                            ak2.N(byteArrayOutputStream3, length4, 4);
                            ak2.O(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i12 = i13 + length4;
                            i11++;
                            arrayList3 = arrayList4;
                            i = 0;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i12 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            c5h c5hVar3 = new c5h(na5.METHODS, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c5hVar3);
            long size2 = 12 + ((long) (arrayList2.size() * 16));
            ak2.N(byteArrayOutputStream, arrayList2.size(), 4);
            int i14 = 0;
            while (i14 < arrayList2.size()) {
                c5h c5hVar4 = (c5h) arrayList2.get(i14);
                na5 na5Var = c5hVar4.a;
                byte[] bArr7 = c5hVar4.b;
                ak2.N(byteArrayOutputStream, na5Var.a(), 4);
                ak2.N(byteArrayOutputStream, size2, 4);
                if (c5hVar4.c) {
                    long length5 = bArr7.length;
                    byte[] bArrJ3 = ak2.j(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrJ3);
                    ak2.N(byteArrayOutputStream, bArrJ3.length, 4);
                    ak2.N(byteArrayOutputStream, length5, 4);
                    length = bArrJ3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    ak2.N(byteArrayOutputStream, bArr7.length, 4);
                    ak2.N(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i14++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i15));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static void j(ByteArrayOutputStream byteArrayOutputStream, b44 b44Var) throws IOException {
        m(byteArrayOutputStream, b44Var);
        int i = b44Var.g;
        int[] iArr = b44Var.h;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            ak2.O(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry<Integer, Integer> entry : b44Var.i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            if ((iIntValue2 & 2) != 0) {
                int i5 = iIntValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i6 = iIntValue + i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void k(ByteArrayOutputStream byteArrayOutputStream, b44 b44Var, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        ak2.O(byteArrayOutputStream, str.getBytes(charset).length);
        ak2.O(byteArrayOutputStream, b44Var.e);
        ak2.N(byteArrayOutputStream, b44Var.f, 4);
        ak2.N(byteArrayOutputStream, b44Var.c, 4);
        ak2.N(byteArrayOutputStream, b44Var.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void l(ByteArrayOutputStream byteArrayOutputStream, int i, b44 b44Var) throws IOException {
        int i2 = b44Var.g;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry<Integer, Integer> entry : b44Var.i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & iIntValue2) == i4) {
                        int i5 = (i3 * i2) + iIntValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void m(ByteArrayOutputStream byteArrayOutputStream, b44 b44Var) throws IOException {
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : b44Var.i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                ak2.O(byteArrayOutputStream, iIntValue - i);
                ak2.O(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }
}
