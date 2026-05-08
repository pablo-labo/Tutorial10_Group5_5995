package defpackage;

import android.util.JsonReader;
import defpackage.p21;
import defpackage.v33;
import defpackage.x11;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class x33 {
    public static final i62 a;

    public interface a<T> {
        T a(JsonReader jsonReader);
    }

    static {
        ea8 ea8Var = new ea8();
        a01 a01Var = a01.a;
        ea8Var.a(v33.class, a01Var);
        ea8Var.a(v11.class, a01Var);
        g01 g01Var = g01.a;
        ea8Var.a(v33.e.class, g01Var);
        ea8Var.a(c21.class, g01Var);
        d01 d01Var = d01.a;
        ea8Var.a(v33.e.a.class, d01Var);
        ea8Var.a(d21.class, d01Var);
        e01 e01Var = e01.a;
        ea8Var.a(v33.e.a.AbstractC0441a.class, e01Var);
        ea8Var.a(e21.class, e01Var);
        w01 w01Var = w01.a;
        ea8Var.a(v33.e.f.class, w01Var);
        ea8Var.a(v21.class, w01Var);
        v01 v01Var = v01.a;
        ea8Var.a(v33.e.AbstractC0449e.class, v01Var);
        ea8Var.a(u21.class, v01Var);
        f01 f01Var = f01.a;
        ea8Var.a(v33.e.c.class, f01Var);
        ea8Var.a(f21.class, f01Var);
        q01 q01Var = q01.a;
        ea8Var.a(v33.e.d.class, q01Var);
        ea8Var.a(g21.class, q01Var);
        h01 h01Var = h01.a;
        ea8Var.a(v33.e.d.a.class, h01Var);
        ea8Var.a(h21.class, h01Var);
        j01 j01Var = j01.a;
        ea8Var.a(v33.e.d.a.b.class, j01Var);
        ea8Var.a(i21.class, j01Var);
        m01 m01Var = m01.a;
        ea8Var.a(v33.e.d.a.b.AbstractC0445d.class, m01Var);
        ea8Var.a(m21.class, m01Var);
        n01 n01Var = n01.a;
        ea8Var.a(v33.e.d.a.b.AbstractC0445d.AbstractC0446a.class, n01Var);
        ea8Var.a(n21.class, n01Var);
        k01 k01Var = k01.a;
        ea8Var.a(v33.e.d.a.b.AbstractC0444b.class, k01Var);
        ea8Var.a(k21.class, k01Var);
        yz0 yz0Var = yz0.a;
        ea8Var.a(v33.a.class, yz0Var);
        ea8Var.a(x11.class, yz0Var);
        xz0 xz0Var = xz0.a;
        ea8Var.a(v33.a.AbstractC0440a.class, xz0Var);
        ea8Var.a(y11.class, xz0Var);
        l01 l01Var = l01.a;
        ea8Var.a(v33.e.d.a.b.c.class, l01Var);
        ea8Var.a(l21.class, l01Var);
        i01 i01Var = i01.a;
        ea8Var.a(v33.e.d.a.b.AbstractC0443a.class, i01Var);
        ea8Var.a(j21.class, i01Var);
        zz0 zz0Var = zz0.a;
        ea8Var.a(v33.c.class, zz0Var);
        ea8Var.a(z11.class, zz0Var);
        o01 o01Var = o01.a;
        ea8Var.a(v33.e.d.a.c.class, o01Var);
        ea8Var.a(o21.class, o01Var);
        p01 p01Var = p01.a;
        ea8Var.a(v33.e.d.c.class, p01Var);
        ea8Var.a(p21.class, p01Var);
        r01 r01Var = r01.a;
        ea8Var.a(v33.e.d.AbstractC0447d.class, r01Var);
        ea8Var.a(q21.class, r01Var);
        u01 u01Var = u01.a;
        ea8Var.a(v33.e.d.f.class, u01Var);
        ea8Var.a(t21.class, u01Var);
        s01 s01Var = s01.a;
        ea8Var.a(v33.e.d.AbstractC0448e.class, s01Var);
        ea8Var.a(r21.class, s01Var);
        t01 t01Var = t01.a;
        ea8Var.a(v33.e.d.AbstractC0448e.a.class, t01Var);
        ea8Var.a(s21.class, t01Var);
        b01 b01Var = b01.a;
        ea8Var.a(v33.d.class, b01Var);
        ea8Var.a(a21.class, b01Var);
        c01 c01Var = c01.a;
        ea8Var.a(v33.d.a.class, c01Var);
        ea8Var.a(b21.class, c01Var);
        ea8Var.d = true;
        a = new i62(ea8Var);
    }

    public static n21 a(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        Long lValueOf = null;
        Long lValueOf2 = null;
        Integer numValueOf = null;
        String strNextString = null;
        String strNextString2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    lValueOf2 = Long.valueOf(jsonReader.nextLong());
                    break;
                case "symbol":
                    strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        ja.k("Null symbol");
                        return null;
                    }
                    break;
                    break;
                case "pc":
                    lValueOf = Long.valueOf(jsonReader.nextLong());
                    break;
                case "file":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "importance":
                    numValueOf = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        String strConcat = lValueOf == null ? " pc" : "";
        if (strNextString == null) {
            strConcat = strConcat.concat(" symbol");
        }
        if (lValueOf2 == null) {
            strConcat = strConcat.concat(" offset");
        }
        if (numValueOf == null) {
            strConcat = strConcat.concat(" importance");
        }
        if (strConcat.isEmpty()) {
            return new n21(lValueOf.longValue(), strNextString, strNextString2, lValueOf2.longValue(), numValueOf.intValue());
        }
        r6.g("Missing required properties:".concat(strConcat));
        return null;
    }

    public static z11 b(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("key")) {
                strNextString = jsonReader.nextString();
                if (strNextString == null) {
                    ja.k("Null key");
                    return null;
                }
            } else if (strNextName.equals("value")) {
                strNextString2 = jsonReader.nextString();
                if (strNextString2 == null) {
                    ja.k("Null value");
                    return null;
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        String strConcat = strNextString == null ? " key" : "";
        if (strNextString2 == null) {
            strConcat = strConcat.concat(" value");
        }
        if (strConcat.isEmpty()) {
            return new z11(strNextString, strNextString2);
        }
        r6.g("Missing required properties:".concat(strConcat));
        return null;
    }

    public static x11 c(JsonReader jsonReader) throws IOException {
        x11.a aVar = new x11.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    aVar.i = d(jsonReader, new k20(6));
                    break;
                case "pid":
                    aVar.a = Integer.valueOf(jsonReader.nextInt());
                    break;
                case "pss":
                    aVar.e = Long.valueOf(jsonReader.nextLong());
                    break;
                case "rss":
                    aVar.f = Long.valueOf(jsonReader.nextLong());
                    break;
                case "timestamp":
                    aVar.g = Long.valueOf(jsonReader.nextLong());
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        ja.k("Null processName");
                        return null;
                    }
                    aVar.b = strNextString;
                    break;
                    break;
                case "reasonCode":
                    aVar.c = Integer.valueOf(jsonReader.nextInt());
                    break;
                case "traceFile":
                    aVar.h = jsonReader.nextString();
                    break;
                case "importance":
                    aVar.d = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    public static <T> List<T> d(JsonReader jsonReader, a<T> aVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.a(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r12v2, types: [v33$e$d$a$b] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v2, types: [v33$e$d$a$c] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r17v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [g21] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v60, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v61, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v68 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v70 */
    /* JADX WARN: Type inference failed for: r1v71 */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r1v73 */
    /* JADX WARN: Type inference failed for: r24v0, types: [g21] */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v10 */
    /* JADX WARN: Type inference failed for: r24v2, types: [g21] */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v5, types: [g21] */
    /* JADX WARN: Type inference failed for: r24v6, types: [g21] */
    /* JADX WARN: Type inference failed for: r24v7 */
    /* JADX WARN: Type inference failed for: r24v8 */
    /* JADX WARN: Type inference failed for: r24v9 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r27v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r27v5 */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1, types: [k21] */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r28v4 */
    /* JADX WARN: Type inference failed for: r28v5 */
    /* JADX WARN: Type inference failed for: r28v6 */
    /* JADX WARN: Type inference failed for: r28v7 */
    /* JADX WARN: Type inference failed for: r28v8 */
    /* JADX WARN: Type inference failed for: r28v9 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1, types: [v33$a] */
    /* JADX WARN: Type inference failed for: r29v2, types: [x11] */
    /* JADX WARN: Type inference failed for: r29v3 */
    /* JADX WARN: Type inference failed for: r29v4 */
    /* JADX WARN: Type inference failed for: r29v5 */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1, types: [l21] */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r30v3 */
    /* JADX WARN: Type inference failed for: r30v4 */
    /* JADX WARN: Type inference failed for: r30v5 */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r31v3 */
    /* JADX WARN: Type inference failed for: r31v4 */
    /* JADX WARN: Type inference failed for: r31v5 */
    /* JADX WARN: Type inference failed for: r31v6 */
    /* JADX WARN: Type inference failed for: r31v7 */
    /* JADX WARN: Type inference failed for: r31v8 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v41, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v46, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public static g21 e(JsonReader jsonReader) throws IOException {
        String strConcat;
        int i;
        ?? r24;
        Long l;
        int i2;
        Long l2;
        Long l3;
        jsonReader.beginObject();
        ?? D = 0;
        Long lValueOf = null;
        String strNextString = null;
        h21 h21Var = null;
        p21 p21VarA = null;
        q21 q21Var = null;
        t21 t21Var = null;
        while (true) {
            if (!jsonReader.hasNext()) {
                ?? r242 = D;
                Long l4 = lValueOf;
                jsonReader.endObject();
                strConcat = l4 == null ? " timestamp" : "";
                if (strNextString == null) {
                    strConcat = strConcat.concat(" type");
                }
                if (h21Var == null) {
                    strConcat = strConcat.concat(" app");
                }
                if (p21VarA == null) {
                    strConcat = strConcat.concat(" device");
                }
                if (strConcat.isEmpty()) {
                    return new g21(l4.longValue(), strNextString, h21Var, p21VarA, q21Var, t21Var);
                }
                r6.g("Missing required properties:".concat(strConcat));
                return r242;
            }
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            i = 5;
            switch (strNextName) {
                case "device":
                    r24 = D;
                    l = lValueOf;
                    p21.a aVar = new p21.a();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        switch (strNextName2) {
                            case "batteryLevel":
                                aVar.a = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case "batteryVelocity":
                                aVar.b = Integer.valueOf(jsonReader.nextInt());
                                break;
                            case "orientation":
                                aVar.d = Integer.valueOf(jsonReader.nextInt());
                                break;
                            case "diskUsed":
                                aVar.f = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "ramUsed":
                                aVar.e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "proximityOn":
                                aVar.c = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    p21VarA = aVar.a();
                    lValueOf = l;
                    D = r24;
                    break;
                case "rollouts":
                    ?? r243 = D;
                    l = lValueOf;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        if (strNextName3.equals("assignments")) {
                            D = d(jsonReader, new l5(6));
                            if (D == 0) {
                                ja.k("Null rolloutAssignments");
                                break;
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    strConcat = D == 0 ? " rolloutAssignments" : "";
                    if (strConcat.isEmpty()) {
                        t21Var = new t21(D);
                        r24 = r243;
                        lValueOf = l;
                        D = r24;
                        break;
                    } else {
                        r6.g("Missing required properties:".concat(strConcat));
                        break;
                    }
                    break;
                case "app":
                    jsonReader.beginObject();
                    ?? r3 = D;
                    ?? r7 = r3;
                    ?? r13 = r7;
                    ?? r14 = r13;
                    ?? r15 = r14;
                    ?? r16 = r15;
                    ?? UnmodifiableList = r16;
                    ?? r1 = D;
                    ?? i21Var = r3;
                    ?? ValueOf = r7;
                    ?? UnmodifiableList2 = r13;
                    ?? UnmodifiableList3 = r14;
                    ?? ValueOf2 = r15;
                    ?? G = r16;
                    while (jsonReader.hasNext()) {
                        ?? r244 = r1;
                        String strNextName4 = jsonReader.nextName();
                        strNextName4.getClass();
                        switch (strNextName4.hashCode()) {
                            case -1405314732:
                                i2 = !strNextName4.equals("appProcessDetails") ? -1 : 0;
                                break;
                            case -1332194002:
                                i2 = !strNextName4.equals("background") ? -1 : 1;
                                break;
                            case -1090974952:
                                i2 = !strNextName4.equals("execution") ? -1 : 2;
                                break;
                            case -80231855:
                                i2 = !strNextName4.equals("internalKeys") ? -1 : 3;
                                break;
                            case 555169704:
                                i2 = !strNextName4.equals("customAttributes") ? -1 : 4;
                                break;
                            case 928737948:
                                i2 = !strNextName4.equals("uiOrientation") ? -1 : i;
                                break;
                            case 1847730860:
                                i2 = !strNextName4.equals("currentProcessDetails") ? -1 : 6;
                                break;
                            default:
                                i2 = -1;
                                break;
                        }
                        switch (i2) {
                            case 0:
                                l2 = lValueOf;
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(g(jsonReader));
                                }
                                jsonReader.endArray();
                                UnmodifiableList = Collections.unmodifiableList(arrayList);
                                r1 = r244;
                                lValueOf = l2;
                                i = 5;
                                i21Var = i21Var;
                                ValueOf = ValueOf;
                                UnmodifiableList2 = UnmodifiableList2;
                                UnmodifiableList3 = UnmodifiableList3;
                                ValueOf2 = ValueOf2;
                                G = G;
                                UnmodifiableList = UnmodifiableList;
                                break;
                            case 1:
                                l2 = lValueOf;
                                ValueOf2 = Boolean.valueOf(jsonReader.nextBoolean());
                                r1 = r244;
                                lValueOf = l2;
                                i = 5;
                                i21Var = i21Var;
                                ValueOf = ValueOf;
                                UnmodifiableList2 = UnmodifiableList2;
                                UnmodifiableList3 = UnmodifiableList3;
                                ValueOf2 = ValueOf2;
                                G = G;
                                UnmodifiableList = UnmodifiableList;
                                break;
                            case 2:
                                jsonReader.beginObject();
                                ?? r27 = r244;
                                ?? r28 = r27;
                                ?? r29 = r28;
                                ?? r30 = r29;
                                ?? r31 = r30;
                                ?? D2 = r27;
                                ?? F = r28;
                                ?? C = r29;
                                ?? l21Var = r30;
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.getClass();
                                    switch (strNextName5) {
                                        case "appExitInfo":
                                            l3 = lValueOf;
                                            C = c(jsonReader);
                                            lValueOf = l3;
                                            i = 5;
                                            D2 = D2;
                                            F = F;
                                            C = C;
                                            l21Var = l21Var;
                                            r31 = r31;
                                            break;
                                        case "threads":
                                            l3 = lValueOf;
                                            D2 = d(jsonReader, new g7(7));
                                            lValueOf = l3;
                                            i = 5;
                                            D2 = D2;
                                            F = F;
                                            C = C;
                                            l21Var = l21Var;
                                            r31 = r31;
                                            break;
                                        case "signal":
                                            jsonReader.beginObject();
                                            ?? r12 = r244;
                                            ?? r32 = r12;
                                            ?? ValueOf3 = r32;
                                            ?? NextString = r12;
                                            ?? NextString2 = r32;
                                            while (jsonReader.hasNext()) {
                                                String strNextName6 = jsonReader.nextName();
                                                strNextName6.getClass();
                                                Long l5 = lValueOf;
                                                switch (strNextName6) {
                                                    case "address":
                                                        ValueOf3 = Long.valueOf(jsonReader.nextLong());
                                                        break;
                                                    case "code":
                                                        NextString2 = jsonReader.nextString();
                                                        if (NextString2 != 0) {
                                                            break;
                                                        } else {
                                                            ja.k("Null code");
                                                            break;
                                                        }
                                                        break;
                                                    case "name":
                                                        NextString = jsonReader.nextString();
                                                        if (NextString != 0) {
                                                            break;
                                                        } else {
                                                            ja.k("Null name");
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        jsonReader.skipValue();
                                                        break;
                                                }
                                                lValueOf = l5;
                                                NextString = NextString;
                                                NextString2 = NextString2;
                                                ValueOf3 = ValueOf3;
                                            }
                                            l3 = lValueOf;
                                            jsonReader.endObject();
                                            String strConcat2 = NextString == 0 ? " name" : "";
                                            if (NextString2 == 0) {
                                                strConcat2 = strConcat2.concat(" code");
                                            }
                                            if (ValueOf3 == 0) {
                                                strConcat2 = strConcat2.concat(" address");
                                            }
                                            if (strConcat2.isEmpty()) {
                                                l21Var = new l21(ValueOf3.longValue(), NextString, NextString2);
                                                lValueOf = l3;
                                                i = 5;
                                                D2 = D2;
                                                F = F;
                                                C = C;
                                                l21Var = l21Var;
                                                r31 = r31;
                                                break;
                                            } else {
                                                r6.g("Missing required properties:".concat(strConcat2));
                                                break;
                                            }
                                            break;
                                        case "binaries":
                                            List listD = d(jsonReader, new t40(i));
                                            F = F;
                                            r31 = listD;
                                            if (listD == null) {
                                                ja.k("Null binaries");
                                                break;
                                            }
                                            l3 = lValueOf;
                                            lValueOf = l3;
                                            i = 5;
                                            D2 = D2;
                                            F = F;
                                            C = C;
                                            l21Var = l21Var;
                                            r31 = r31;
                                            break;
                                        case "exception":
                                            F = f(jsonReader);
                                            r31 = r31;
                                            l3 = lValueOf;
                                            lValueOf = l3;
                                            i = 5;
                                            D2 = D2;
                                            F = F;
                                            C = C;
                                            l21Var = l21Var;
                                            r31 = r31;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            F = F;
                                            r31 = r31;
                                            l3 = lValueOf;
                                            lValueOf = l3;
                                            i = 5;
                                            D2 = D2;
                                            F = F;
                                            C = C;
                                            l21Var = l21Var;
                                            r31 = r31;
                                            break;
                                    }
                                }
                                l2 = lValueOf;
                                jsonReader.endObject();
                                String strConcat3 = l21Var == 0 ? " signal" : "";
                                if (r31 == 0) {
                                    strConcat3 = strConcat3.concat(" binaries");
                                }
                                if (!strConcat3.isEmpty()) {
                                    r6.g("Missing required properties:".concat(strConcat3));
                                } else {
                                    i21Var = new i21(D2, F, C, l21Var, r31);
                                    r1 = r244;
                                    lValueOf = l2;
                                    i = 5;
                                    i21Var = i21Var;
                                    ValueOf = ValueOf;
                                    UnmodifiableList2 = UnmodifiableList2;
                                    UnmodifiableList3 = UnmodifiableList3;
                                    ValueOf2 = ValueOf2;
                                    G = G;
                                    UnmodifiableList = UnmodifiableList;
                                }
                                break;
                            case 3:
                                ArrayList arrayList2 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList2.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                ValueOf = ValueOf;
                                UnmodifiableList2 = UnmodifiableList2;
                                UnmodifiableList3 = Collections.unmodifiableList(arrayList2);
                                G = G;
                                l2 = lValueOf;
                                r1 = r244;
                                lValueOf = l2;
                                i = 5;
                                i21Var = i21Var;
                                ValueOf = ValueOf;
                                UnmodifiableList2 = UnmodifiableList2;
                                UnmodifiableList3 = UnmodifiableList3;
                                ValueOf2 = ValueOf2;
                                G = G;
                                UnmodifiableList = UnmodifiableList;
                                break;
                            case 4:
                                ArrayList arrayList3 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList3.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                ValueOf = ValueOf;
                                UnmodifiableList2 = Collections.unmodifiableList(arrayList3);
                                UnmodifiableList3 = UnmodifiableList3;
                                G = G;
                                l2 = lValueOf;
                                r1 = r244;
                                lValueOf = l2;
                                i = 5;
                                i21Var = i21Var;
                                ValueOf = ValueOf;
                                UnmodifiableList2 = UnmodifiableList2;
                                UnmodifiableList3 = UnmodifiableList3;
                                ValueOf2 = ValueOf2;
                                G = G;
                                UnmodifiableList = UnmodifiableList;
                                break;
                            case 5:
                                ValueOf = Integer.valueOf(jsonReader.nextInt());
                                UnmodifiableList2 = UnmodifiableList2;
                                UnmodifiableList3 = UnmodifiableList3;
                                G = G;
                                l2 = lValueOf;
                                r1 = r244;
                                lValueOf = l2;
                                i = 5;
                                i21Var = i21Var;
                                ValueOf = ValueOf;
                                UnmodifiableList2 = UnmodifiableList2;
                                UnmodifiableList3 = UnmodifiableList3;
                                ValueOf2 = ValueOf2;
                                G = G;
                                UnmodifiableList = UnmodifiableList;
                                break;
                            case 6:
                                ValueOf = ValueOf;
                                UnmodifiableList2 = UnmodifiableList2;
                                UnmodifiableList3 = UnmodifiableList3;
                                G = g(jsonReader);
                                l2 = lValueOf;
                                r1 = r244;
                                lValueOf = l2;
                                i = 5;
                                i21Var = i21Var;
                                ValueOf = ValueOf;
                                UnmodifiableList2 = UnmodifiableList2;
                                UnmodifiableList3 = UnmodifiableList3;
                                ValueOf2 = ValueOf2;
                                G = G;
                                UnmodifiableList = UnmodifiableList;
                                break;
                            default:
                                jsonReader.skipValue();
                                ValueOf = ValueOf;
                                UnmodifiableList2 = UnmodifiableList2;
                                UnmodifiableList3 = UnmodifiableList3;
                                G = G;
                                l2 = lValueOf;
                                r1 = r244;
                                lValueOf = l2;
                                i = 5;
                                i21Var = i21Var;
                                ValueOf = ValueOf;
                                UnmodifiableList2 = UnmodifiableList2;
                                UnmodifiableList3 = UnmodifiableList3;
                                ValueOf2 = ValueOf2;
                                G = G;
                                UnmodifiableList = UnmodifiableList;
                                break;
                        }
                    }
                    ?? r245 = r1;
                    l = lValueOf;
                    jsonReader.endObject();
                    strConcat = i21Var == 0 ? " execution" : "";
                    if (ValueOf == 0) {
                        strConcat = strConcat.concat(" uiOrientation");
                    }
                    if (strConcat.isEmpty()) {
                        h21Var = new h21(i21Var, UnmodifiableList2, UnmodifiableList3, ValueOf2, G, UnmodifiableList, ValueOf.intValue());
                        r24 = r245;
                        lValueOf = l;
                        D = r24;
                        break;
                    } else {
                        r6.g("Missing required properties:".concat(strConcat));
                        break;
                    }
                    break;
                case "log":
                    jsonReader.beginObject();
                    ?? NextString3 = D;
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals("content")) {
                            NextString3 = jsonReader.nextString();
                            if (NextString3 == 0) {
                                ja.k("Null content");
                                break;
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    strConcat = NextString3 == 0 ? " content" : "";
                    if (strConcat.isEmpty()) {
                        q21Var = new q21(NextString3);
                        r24 = D;
                        D = r24;
                        break;
                    } else {
                        r6.g("Missing required properties:".concat(strConcat));
                        break;
                    }
                    break;
                case "type":
                    strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        ja.k("Null type");
                        break;
                    }
                    r24 = D;
                    D = r24;
                    break;
                case "timestamp":
                    lValueOf = Long.valueOf(jsonReader.nextLong());
                    r24 = D;
                    D = r24;
                    break;
                default:
                    jsonReader.skipValue();
                    r24 = D;
                    D = r24;
                    break;
            }
            return D;
        }
    }

    public static k21 f(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        Integer numValueOf = null;
        String strNextString = null;
        String strNextString2 = null;
        List listD = null;
        k21 k21VarF = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    listD = d(jsonReader, new w20(3));
                    if (listD == null) {
                        ja.k("Null frames");
                        return null;
                    }
                    break;
                    break;
                case "reason":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "type":
                    strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        ja.k("Null type");
                        return null;
                    }
                    break;
                    break;
                case "causedBy":
                    k21VarF = f(jsonReader);
                    break;
                case "overflowCount":
                    numValueOf = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        String strConcat = strNextString == null ? " type" : "";
        if (listD == null) {
            strConcat = strConcat.concat(" frames");
        }
        if (numValueOf == null) {
            strConcat = strConcat.concat(" overflowCount");
        }
        if (strConcat.isEmpty()) {
            return new k21(strNextString, strNextString2, listD, k21VarF, numValueOf.intValue());
        }
        r6.g("Missing required properties:".concat(strConcat));
        return null;
    }

    public static o21 g(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        Integer numValueOf = null;
        Integer numValueOf2 = null;
        Boolean boolValueOf = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    numValueOf = Integer.valueOf(jsonReader.nextInt());
                    break;
                case "processName":
                    strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        ja.k("Null processName");
                        return null;
                    }
                    break;
                    break;
                case "defaultProcess":
                    boolValueOf = Boolean.valueOf(jsonReader.nextBoolean());
                    break;
                case "importance":
                    numValueOf2 = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        String strConcat = strNextString == null ? " processName" : "";
        if (numValueOf == null) {
            strConcat = strConcat.concat(" pid");
        }
        if (numValueOf2 == null) {
            strConcat = strConcat.concat(" importance");
        }
        if (boolValueOf == null) {
            strConcat = strConcat.concat(" defaultProcess");
        }
        if (strConcat.isEmpty()) {
            return new o21(numValueOf.intValue(), numValueOf2.intValue(), strNextString, boolValueOf.booleanValue());
        }
        r6.g("Missing required properties:".concat(strConcat));
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02c2 A[PHI: r24
  0x02c2: PHI (r24v17 java.lang.String) = 
  (r24v10 java.lang.String)
  (r24v11 java.lang.String)
  (r24v12 java.lang.String)
  (r24v14 java.lang.String)
  (r24v18 java.lang.String)
 binds: [B:219:0x02ef, B:215:0x02e3, B:509:?, B:508:?, B:204:0x02c0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.v11 h(android.util.JsonReader r32) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1764
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x33.h(android.util.JsonReader):v11");
    }

    public static v11 i(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                v11 v11VarH = h(jsonReader);
                jsonReader.close();
                return v11VarH;
            } finally {
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }
}
