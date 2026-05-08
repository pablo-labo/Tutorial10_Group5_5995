package androidx.work;

import android.util.Log;
import defpackage.h5;
import defpackage.r6;
import defpackage.z39;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final String b = z39.f("Data");
    public static final b c;
    public final HashMap a;

    public static final class a {
        public final HashMap a = new HashMap();

        public final void a(HashMap map) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                HashMap map2 = this.a;
                if (value == null) {
                    map2.put(str, null);
                } else {
                    Class<?> cls = value.getClass();
                    if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                        map2.put(str, value);
                    } else {
                        int i = 0;
                        if (cls == boolean[].class) {
                            boolean[] zArr = (boolean[]) value;
                            String str2 = b.b;
                            Boolean[] boolArr = new Boolean[zArr.length];
                            while (i < zArr.length) {
                                boolArr[i] = Boolean.valueOf(zArr[i]);
                                i++;
                            }
                            map2.put(str, boolArr);
                        } else if (cls == byte[].class) {
                            byte[] bArr = (byte[]) value;
                            String str3 = b.b;
                            Byte[] bArr2 = new Byte[bArr.length];
                            while (i < bArr.length) {
                                bArr2[i] = Byte.valueOf(bArr[i]);
                                i++;
                            }
                            map2.put(str, bArr2);
                        } else if (cls == int[].class) {
                            int[] iArr = (int[]) value;
                            String str4 = b.b;
                            Integer[] numArr = new Integer[iArr.length];
                            while (i < iArr.length) {
                                numArr[i] = Integer.valueOf(iArr[i]);
                                i++;
                            }
                            map2.put(str, numArr);
                        } else if (cls == long[].class) {
                            long[] jArr = (long[]) value;
                            String str5 = b.b;
                            Long[] lArr = new Long[jArr.length];
                            while (i < jArr.length) {
                                lArr[i] = Long.valueOf(jArr[i]);
                                i++;
                            }
                            map2.put(str, lArr);
                        } else if (cls == float[].class) {
                            float[] fArr = (float[]) value;
                            String str6 = b.b;
                            Float[] fArr2 = new Float[fArr.length];
                            while (i < fArr.length) {
                                fArr2[i] = Float.valueOf(fArr[i]);
                                i++;
                            }
                            map2.put(str, fArr2);
                        } else {
                            if (cls != double[].class) {
                                h5.m("Key ", str, "has invalid type ", cls);
                                return;
                            }
                            double[] dArr = (double[]) value;
                            String str7 = b.b;
                            Double[] dArr2 = new Double[dArr.length];
                            while (i < dArr.length) {
                                dArr2[i] = Double.valueOf(dArr[i]);
                                i++;
                            }
                            map2.put(str, dArr2);
                        }
                    }
                }
            }
        }
    }

    static {
        b bVar = new b(new HashMap());
        b(bVar);
        c = bVar;
    }

    public b(b bVar) {
        this.a = new HashMap(bVar.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0034 A[EXC_TOP_SPLITTER, PHI: r8
  0x0034: PHI (r8v11 java.io.ObjectInputStream) = (r8v8 java.io.ObjectInputStream), (r8v13 java.io.ObjectInputStream) binds: [B:31:0x0051, B:7:0x001d] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.work.b a(byte[] r8) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "Error in Data#fromByteArray: "
            java.lang.String r1 = androidx.work.b.b
            int r2 = r8.length
            r3 = 10240(0x2800, float:1.4349E-41)
            r4 = 0
            if (r2 > r3) goto L6d
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream
            r3.<init>(r8)
            java.io.ObjectInputStream r8 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L45 java.lang.ClassNotFoundException -> L47 java.io.IOException -> L4c
            r8.<init>(r3)     // Catch: java.lang.Throwable -> L45 java.lang.ClassNotFoundException -> L47 java.io.IOException -> L4c
            int r4 = r8.readInt()     // Catch: java.lang.Throwable -> L2d java.lang.ClassNotFoundException -> L30 java.io.IOException -> L32
        L1d:
            if (r4 <= 0) goto L34
            java.lang.String r5 = r8.readUTF()     // Catch: java.lang.Throwable -> L2d java.lang.ClassNotFoundException -> L30 java.io.IOException -> L32
            java.lang.Object r6 = r8.readObject()     // Catch: java.lang.Throwable -> L2d java.lang.ClassNotFoundException -> L30 java.io.IOException -> L32
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L2d java.lang.ClassNotFoundException -> L30 java.io.IOException -> L32
            int r4 = r4 + (-1)
            goto L1d
        L2d:
            r2 = move-exception
            r4 = r8
            goto L5a
        L30:
            r4 = move-exception
            goto L4e
        L32:
            r4 = move-exception
            goto L4e
        L34:
            r8.close()     // Catch: java.io.IOException -> L38
            goto L3c
        L38:
            r8 = move-exception
            android.util.Log.e(r1, r0, r8)
        L3c:
            r3.close()     // Catch: java.io.IOException -> L40
            goto L54
        L40:
            r8 = move-exception
            android.util.Log.e(r1, r0, r8)
            goto L54
        L45:
            r2 = move-exception
            goto L5a
        L47:
            r8 = move-exception
        L48:
            r7 = r4
            r4 = r8
            r8 = r7
            goto L4e
        L4c:
            r8 = move-exception
            goto L48
        L4e:
            android.util.Log.e(r1, r0, r4)     // Catch: java.lang.Throwable -> L2d
            if (r8 == 0) goto L3c
            goto L34
        L54:
            androidx.work.b r8 = new androidx.work.b
            r8.<init>(r2)
            return r8
        L5a:
            if (r4 == 0) goto L64
            r4.close()     // Catch: java.io.IOException -> L60
            goto L64
        L60:
            r8 = move-exception
            android.util.Log.e(r1, r0, r8)
        L64:
            r3.close()     // Catch: java.io.IOException -> L68
            goto L6c
        L68:
            r8 = move-exception
            android.util.Log.e(r1, r0, r8)
        L6c:
            throw r2
        L6d:
            java.lang.String r8 = "Data cannot occupy more than 10240 bytes when serialized"
            defpackage.r6.g(r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.b.a(byte[]):androidx.work.b");
    }

    public static byte[] b(b bVar) throws Throwable {
        String str = b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeInt(bVar.a.size());
                    for (Map.Entry entry : bVar.a.entrySet()) {
                        objectOutputStream2.writeUTF((String) entry.getKey());
                        objectOutputStream2.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e) {
                        Log.e(str, "Error in Data#toByteArray: ", e);
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e2) {
                        Log.e(str, "Error in Data#toByteArray: ", e2);
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    r6.g("Data cannot occupy more than 10240 bytes when serialized");
                    return null;
                } catch (IOException e3) {
                    e = e3;
                    objectOutputStream = objectOutputStream2;
                    Log.e(str, "Error in Data#toByteArray: ", e);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e4) {
                            Log.e(str, "Error in Data#toByteArray: ", e4);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e5) {
                        Log.e(str, "Error in Data#toByteArray: ", e5);
                    }
                    return byteArray;
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e6) {
                            Log.e(str, "Error in Data#toByteArray: ", e6);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e7) {
                        Log.e(str, "Error in Data#toByteArray: ", e7);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e8) {
            e = e8;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && b.class == obj.getClass()) {
                HashMap map = ((b) obj).a;
                HashMap map2 = this.a;
                Set<String> setKeySet = map2.keySet();
                if (setKeySet.equals(map.keySet())) {
                    for (String str : setKeySet) {
                        Object obj2 = map2.get(str);
                        Object obj3 = map.get(str);
                        if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        HashMap map = this.a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = map.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public b() {
    }

    public b(HashMap map) {
        this.a = new HashMap(map);
    }
}
