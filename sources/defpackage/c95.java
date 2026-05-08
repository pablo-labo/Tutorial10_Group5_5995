package defpackage;

import c95.a;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.pi7;
import defpackage.rp9;
import defpackage.rw5;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class c95<FieldDescriptorType extends a<FieldDescriptorType>> {
    public static final c95 d = new c95(0);
    public boolean b;
    public boolean c = false;
    public final jke a = new jke(16);

    public interface a<T extends a<T>> extends Comparable<T> {
        t0h b();

        rw5.a d(rp9.a aVar, rp9 rp9Var);

        boolean g();

        int getNumber();

        s0h j();

        boolean q();
    }

    public c95(int i) {
        g();
    }

    public static int c(s0h s0hVar, Object obj) {
        int iE;
        int iF;
        switch (s0hVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                return 8;
            case 1:
                ((Float) obj).getClass();
                return 4;
            case 2:
                return f92.g(((Long) obj).longValue());
            case 3:
                return f92.g(((Long) obj).longValue());
            case 4:
                return f92.c(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                return 8;
            case 6:
                ((Integer) obj).getClass();
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                return 1;
            case 8:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return f92.f(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e) {
                    l6.p("UTF-8 not supported.", e);
                    return 0;
                }
            case DatadogLogGenerator.CRASH /* 9 */:
                return ((rp9) obj).e();
            case 10:
                if (!(obj instanceof in8)) {
                    return f92.e((rp9) obj);
                }
                iE = ((in8) obj).a.e();
                iF = f92.f(iE);
                break;
                break;
            case 11:
                if (!(obj instanceof ur1)) {
                    byte[] bArr = (byte[]) obj;
                    return f92.f(bArr.length) + bArr.length;
                }
                ur1 ur1Var = (ur1) obj;
                iE = f92.f(ur1Var.size());
                iF = ur1Var.size();
                break;
                break;
            case 12:
                return f92.f(((Integer) obj).intValue());
            case 13:
                return obj instanceof pi7.a ? f92.c(((pi7.a) obj).getNumber()) : f92.c(((Integer) obj).intValue());
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                ((Integer) obj).getClass();
                return 4;
            case 15:
                ((Long) obj).getClass();
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return f92.f((iIntValue >> 31) ^ (iIntValue << 1));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return f92.g((jLongValue >> 63) ^ (jLongValue << 1));
            default:
                b0.o("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
        return iF + iE;
    }

    public static int d(a<?> aVar, Object obj) {
        int iH;
        int iC;
        s0h s0hVarJ = aVar.j();
        int number = aVar.getNumber();
        if (aVar.g()) {
            int iC2 = 0;
            if (!aVar.q()) {
                for (Object obj2 : (List) obj) {
                    int iH2 = f92.h(number);
                    if (s0hVarJ == s0h.c) {
                        iH2 *= 2;
                    }
                    iC2 += c(s0hVarJ, obj2) + iH2;
                }
                return iC2;
            }
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iC2 += c(s0hVarJ, it.next());
            }
            iH = f92.h(number) + iC2;
            iC = f92.f(iC2);
        } else {
            iH = f92.h(number);
            if (s0hVarJ == s0h.c) {
                iH *= 2;
            }
            iC = c(s0hVarJ, obj);
        }
        return iC + iH;
    }

    public static boolean f(Map.Entry entry) {
        a aVar = (a) entry.getKey();
        if (aVar.b() != t0h.MESSAGE) {
            return true;
        }
        if (aVar.g()) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                if (!((rp9) it.next()).d()) {
                }
            }
            return true;
        }
        Object value = entry.getValue();
        if (!(value instanceof rp9)) {
            if (value instanceof in8) {
                return true;
            }
            l5.q("Wrong object type used with protocol message reflection.");
            return false;
        }
        if (((rp9) value).d()) {
            return true;
        }
        return false;
    }

    public static Object i(e92 e92Var, s0h s0hVar) {
        switch (s0hVar.ordinal()) {
            case 0:
                return Double.valueOf(Double.longBitsToDouble(e92Var.j()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(e92Var.i()));
            case 2:
                return Long.valueOf(e92Var.l());
            case 3:
                return Long.valueOf(e92Var.l());
            case 4:
                return Integer.valueOf(e92Var.k());
            case 5:
                return Long.valueOf(e92Var.j());
            case 6:
                return Integer.valueOf(e92Var.i());
            case 7:
                return Boolean.valueOf(e92Var.l() != 0);
            case 8:
                int iK = e92Var.k();
                int i = e92Var.b;
                int i2 = e92Var.d;
                if (iK > i - i2 || iK <= 0) {
                    return iK == 0 ? "" : new String(e92Var.h(iK), "UTF-8");
                }
                String str = new String(e92Var.a, i2, iK, "UTF-8");
                e92Var.d += iK;
                return str;
            case DatadogLogGenerator.CRASH /* 9 */:
                l5.q("readPrimitiveField() cannot handle nested groups.");
                return null;
            case 10:
                l5.q("readPrimitiveField() cannot handle embedded messages.");
                return null;
            case 11:
                return e92Var.e();
            case 12:
                return Integer.valueOf(e92Var.k());
            case 13:
                l5.q("readPrimitiveField() cannot handle enums.");
                return null;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                return Integer.valueOf(e92Var.i());
            case 15:
                return Long.valueOf(e92Var.j());
            case 16:
                int iK2 = e92Var.k();
                return Integer.valueOf((-(iK2 & 1)) ^ (iK2 >>> 1));
            case 17:
                long jL = e92Var.l();
                return Long.valueOf((-(jL & 1)) ^ (jL >>> 1));
            default:
                b0.o("There is no way to get here, but the compiler thinks otherwise.");
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void k(defpackage.s0h r2, java.lang.Object r3) {
        /*
            r3.getClass()
            t0h r2 = r2.a()
            int r2 = r2.ordinal()
            r0 = 1
            r1 = 0
            switch(r2) {
                case 0: goto L3e;
                case 1: goto L3b;
                case 2: goto L38;
                case 3: goto L35;
                case 4: goto L32;
                case 5: goto L2f;
                case 6: goto L26;
                case 7: goto L1d;
                case 8: goto L11;
                default: goto L10;
            }
        L10:
            goto L40
        L11:
            boolean r2 = r3 instanceof defpackage.rp9
            if (r2 != 0) goto L1b
            boolean r2 = r3 instanceof defpackage.in8
            if (r2 == 0) goto L1a
            goto L1b
        L1a:
            r0 = r1
        L1b:
            r1 = r0
            goto L40
        L1d:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L1b
            boolean r2 = r3 instanceof pi7.a
            if (r2 == 0) goto L1a
            goto L1b
        L26:
            boolean r2 = r3 instanceof defpackage.ur1
            if (r2 != 0) goto L1b
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L1a
            goto L1b
        L2f:
            boolean r1 = r3 instanceof java.lang.String
            goto L40
        L32:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L40
        L35:
            boolean r1 = r3 instanceof java.lang.Double
            goto L40
        L38:
            boolean r1 = r3 instanceof java.lang.Float
            goto L40
        L3b:
            boolean r1 = r3 instanceof java.lang.Long
            goto L40
        L3e:
            boolean r1 = r3 instanceof java.lang.Integer
        L40:
            if (r1 == 0) goto L43
            return
        L43:
            java.lang.String r2 = "Wrong object type used with protocol message reflection."
            defpackage.l5.q(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c95.k(s0h, java.lang.Object):void");
    }

    public static void l(f92 f92Var, s0h s0hVar, int i, Object obj) throws IOException {
        if (s0hVar == s0h.c) {
            f92Var.x(i, 3);
            ((rp9) obj).h(f92Var);
            f92Var.x(i, 4);
        }
        f92Var.x(i, s0hVar.c());
        switch (s0hVar.ordinal()) {
            case 0:
                double dDoubleValue = ((Double) obj).doubleValue();
                f92Var.getClass();
                f92Var.u(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 1:
                float fFloatValue = ((Float) obj).floatValue();
                f92Var.getClass();
                f92Var.t(Float.floatToRawIntBits(fFloatValue));
                break;
            case 2:
                f92Var.w(((Long) obj).longValue());
                break;
            case 3:
                f92Var.w(((Long) obj).longValue());
                break;
            case 4:
                f92Var.n(((Integer) obj).intValue());
                break;
            case 5:
                f92Var.u(((Long) obj).longValue());
                break;
            case 6:
                f92Var.t(((Integer) obj).intValue());
                break;
            case 7:
                f92Var.q(((Boolean) obj).booleanValue() ? 1 : 0);
                break;
            case 8:
                f92Var.getClass();
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                f92Var.v(bytes.length);
                f92Var.s(bytes);
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                f92Var.getClass();
                ((rp9) obj).h(f92Var);
                break;
            case 10:
                f92Var.p((rp9) obj);
                break;
            case 11:
                if (!(obj instanceof ur1)) {
                    byte[] bArr = (byte[]) obj;
                    f92Var.getClass();
                    f92Var.v(bArr.length);
                    f92Var.s(bArr);
                } else {
                    ur1 ur1Var = (ur1) obj;
                    f92Var.getClass();
                    f92Var.v(ur1Var.size());
                    f92Var.r(ur1Var);
                }
                break;
            case 12:
                f92Var.v(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof pi7.a)) {
                    f92Var.n(((Integer) obj).intValue());
                } else {
                    f92Var.n(((pi7.a) obj).getNumber());
                }
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                f92Var.t(((Integer) obj).intValue());
                break;
            case 15:
                f92Var.u(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                f92Var.v((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                f92Var.w((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a(rw5.d dVar, Object obj) {
        List arrayList;
        if (!dVar.c) {
            l5.q("addRepeatedField() can only be called on repeated fields.");
            return;
        }
        k(dVar.b, obj);
        Object objE = e(dVar);
        if (objE == null) {
            arrayList = new ArrayList();
            this.a.g(dVar, arrayList);
        } else {
            arrayList = (List) objE;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final c95<FieldDescriptorType> clone() {
        jke jkeVar;
        c95<FieldDescriptorType> c95Var = new c95<>();
        int i = 0;
        while (true) {
            jkeVar = this.a;
            if (i >= jkeVar.b.size()) {
                break;
            }
            kke<K, V>.b bVar = jkeVar.b.get(i);
            c95Var.j((a) bVar.getKey(), bVar.getValue());
            i++;
        }
        for (Map.Entry<Object, Object> entry : jkeVar.d()) {
            c95Var.j((a) entry.getKey(), entry.getValue());
        }
        c95Var.c = this.c;
        return c95Var;
    }

    public final Object e(FieldDescriptorType fielddescriptortype) {
        Object obj = this.a.get(fielddescriptortype);
        return obj instanceof in8 ? ((in8) obj).a() : obj;
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, java.util.List] */
    public final void g() {
        if (this.b) {
            return;
        }
        jke jkeVar = this.a;
        if (!jkeVar.d) {
            for (int i = 0; i < jkeVar.b.size(); i++) {
                kke<K, V>.b bVar = jkeVar.b.get(i);
                if (((a) bVar.getKey()).g()) {
                    bVar.setValue(Collections.unmodifiableList((List) bVar.getValue()));
                }
            }
            for (Map.Entry<Object, Object> entry : jkeVar.d()) {
                if (((a) entry.getKey()).g()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!jkeVar.d) {
            jkeVar.c = jkeVar.c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(jkeVar.c);
            jkeVar.d = true;
        }
        this.b = true;
    }

    public final void h(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof in8) {
            value = ((in8) value).a();
        }
        boolean zG = key.g();
        jke jkeVar = this.a;
        if (zG) {
            Object objE = e(key);
            if (objE == null) {
                objE = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) objE;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            jkeVar.g(key, objE);
            return;
        }
        if (key.b() != t0h.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            jkeVar.g(key, value);
            return;
        }
        Object objE2 = e(key);
        if (objE2 != null) {
            jkeVar.g(key, key.d(((rp9) objE2).c(), (rp9) value).build());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        jkeVar.g(key, value);
    }

    public final void j(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.g()) {
            k(fielddescriptortype.j(), obj);
        } else {
            if (!(obj instanceof List)) {
                l5.q("Wrong object type used with protocol message reflection.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                k(fielddescriptortype.j(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof in8) {
            this.c = true;
        }
        this.a.g(fielddescriptortype, obj);
    }

    public c95() {
    }
}
