package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.g0;
import androidx.datastore.preferences.protobuf.l.a;
import androidx.datastore.preferences.protobuf.p;
import androidx.datastore.preferences.protobuf.q;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.r0h;
import defpackage.sp9;
import defpackage.tr1;
import defpackage.u0h;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class l<T extends a<T>> {
    public static final l d = new l(0);
    public final f0 a;
    public boolean b;
    public boolean c;

    public interface a<T extends a<T>> extends Comparable<T> {
        u0h b();
    }

    public l(int i) {
        int i2 = g0.V;
        f0 f0Var = new f0(0);
        this.a = f0Var;
        if (!this.b) {
            f0Var.h();
            this.b = true;
        }
        if (this.b) {
            return;
        }
        f0Var.h();
        this.b = true;
    }

    public static int b(r0h r0hVar, int i, Object obj) {
        int size;
        int iT1;
        int iR1 = CodedOutputStream.R1(i);
        if (r0hVar == r0h.b) {
            iR1 *= 2;
        }
        int iU1 = 1;
        switch (r0hVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = CodedOutputStream.e;
                iU1 = 8;
                break;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = CodedOutputStream.e;
                iU1 = 4;
                break;
            case 2:
                iU1 = CodedOutputStream.U1(((Long) obj).longValue());
                break;
            case 3:
                iU1 = CodedOutputStream.U1(((Long) obj).longValue());
                break;
            case 4:
                iU1 = CodedOutputStream.O1(((Integer) obj).intValue());
                break;
            case 5:
                ((Long) obj).getClass();
                Logger logger3 = CodedOutputStream.e;
                iU1 = 8;
                break;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = CodedOutputStream.e;
                iU1 = 4;
                break;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = CodedOutputStream.e;
                break;
            case 8:
                if (!(obj instanceof tr1)) {
                    iU1 = CodedOutputStream.Q1((String) obj);
                } else {
                    Logger logger6 = CodedOutputStream.e;
                    size = ((tr1) obj).size();
                    iT1 = CodedOutputStream.T1(size);
                    iU1 = iT1 + size;
                }
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                Logger logger7 = CodedOutputStream.e;
                iU1 = ((sp9) obj).e();
                break;
            case 10:
                if (!(obj instanceof q)) {
                    Logger logger8 = CodedOutputStream.e;
                    size = ((sp9) obj).e();
                    iT1 = CodedOutputStream.T1(size);
                    iU1 = iT1 + size;
                } else {
                    iU1 = CodedOutputStream.P1((q) obj);
                }
                break;
            case 11:
                if (obj instanceof tr1) {
                    Logger logger9 = CodedOutputStream.e;
                    size = ((tr1) obj).size();
                    iT1 = CodedOutputStream.T1(size);
                } else {
                    Logger logger10 = CodedOutputStream.e;
                    size = ((byte[]) obj).length;
                    iT1 = CodedOutputStream.T1(size);
                }
                iU1 = iT1 + size;
                break;
            case 12:
                iU1 = CodedOutputStream.T1(((Integer) obj).intValue());
                break;
            case 13:
                iU1 = !(obj instanceof p.a) ? CodedOutputStream.O1(((Integer) obj).intValue()) : CodedOutputStream.O1(((p.a) obj).getNumber());
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                ((Integer) obj).getClass();
                Logger logger11 = CodedOutputStream.e;
                iU1 = 4;
                break;
            case 15:
                ((Long) obj).getClass();
                Logger logger12 = CodedOutputStream.e;
                iU1 = 8;
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                iU1 = CodedOutputStream.T1((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iU1 = CodedOutputStream.U1((jLongValue >> 63) ^ (jLongValue << 1));
                break;
            default:
                defpackage.b0.o("There is no way to get here, but the compiler thinks otherwise.");
                iU1 = 0;
                break;
        }
        return iU1 + iR1;
    }

    public static int c(a<?> aVar, Object obj) {
        aVar.getClass();
        return b(null, 0, obj);
    }

    public static int d(Map.Entry entry) {
        CodedOutputStream.R1(1);
        a aVar = (a) entry.getKey();
        entry.getValue();
        aVar.b();
        throw null;
    }

    public static <T extends a<T>> boolean f(Map.Entry<T, Object> entry) {
        entry.getKey().b();
        throw null;
    }

    public static void j(CodedOutputStream codedOutputStream, r0h r0hVar, int i, Object obj) {
        if (r0hVar == r0h.b) {
            codedOutputStream.n2(i, 3);
            ((sp9) obj).g(codedOutputStream);
            codedOutputStream.n2(i, 4);
        }
        codedOutputStream.n2(i, r0hVar.c());
        switch (r0hVar.ordinal()) {
            case 0:
                codedOutputStream.e2(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                codedOutputStream.c2(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                codedOutputStream.r2(((Long) obj).longValue());
                break;
            case 3:
                codedOutputStream.r2(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.g2(((Integer) obj).intValue());
                break;
            case 5:
                codedOutputStream.e2(((Long) obj).longValue());
                break;
            case 6:
                codedOutputStream.c2(((Integer) obj).intValue());
                break;
            case 7:
                codedOutputStream.W1(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof tr1)) {
                    codedOutputStream.m2((String) obj);
                } else {
                    codedOutputStream.a2((tr1) obj);
                }
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                ((sp9) obj).g(codedOutputStream);
                break;
            case 10:
                codedOutputStream.i2((sp9) obj);
                break;
            case 11:
                if (!(obj instanceof tr1)) {
                    byte[] bArr = (byte[]) obj;
                    codedOutputStream.Y1(bArr.length, bArr);
                } else {
                    codedOutputStream.a2((tr1) obj);
                }
                break;
            case 12:
                codedOutputStream.p2(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof p.a)) {
                    codedOutputStream.g2(((Integer) obj).intValue());
                } else {
                    codedOutputStream.g2(((p.a) obj).getNumber());
                }
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                codedOutputStream.c2(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.e2(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                codedOutputStream.p2((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                codedOutputStream.r2((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final l<T> clone() {
        f0 f0Var;
        l<T> lVar = new l<>();
        int i = 0;
        while (true) {
            f0Var = this.a;
            if (i >= f0Var.b.size()) {
                break;
            }
            Map.Entry<Object, Object> entryD = f0Var.d(i);
            lVar.i((a) entryD.getKey(), entryD.getValue());
            i++;
        }
        for (Map.Entry<Object, Object> entry : f0Var.f()) {
            lVar.i((a) entry.getKey(), entry.getValue());
        }
        lVar.c = this.c;
        return lVar;
    }

    public final boolean e() {
        f0 f0Var = this.a;
        if (f0Var.b.size() > 0) {
            f(f0Var.d(0));
            throw null;
        }
        Iterator<Map.Entry<Object, Object>> it = f0Var.f().iterator();
        if (!it.hasNext()) {
            return true;
        }
        f(it.next());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return this.a.equals(((l) obj).a);
        }
        return false;
    }

    public final Iterator<Map.Entry<T, Object>> g() {
        boolean z = this.c;
        f0 f0Var = this.a;
        if (!z) {
            return ((g0.d) f0Var.entrySet()).iterator();
        }
        Iterator<Map.Entry<K, Object>> it = ((g0.d) f0Var.entrySet()).iterator();
        q.b bVar = new q.b();
        bVar.a = it;
        return bVar;
    }

    public final void h(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof q) {
            ((q) value).a(null);
        }
        key.getClass();
        key.b();
        throw null;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(T r4, java.lang.Object r5) {
        /*
            r3 = this;
            r4.getClass()
            java.nio.charset.Charset r0 = androidx.datastore.preferences.protobuf.p.a
            r5.getClass()
            r0 = 0
            u0h r0 = r0.a()
            int r0 = r0.ordinal()
            r1 = 1
            r2 = 0
            switch(r0) {
                case 0: goto L42;
                case 1: goto L3f;
                case 2: goto L3c;
                case 3: goto L39;
                case 4: goto L36;
                case 5: goto L33;
                case 6: goto L2a;
                case 7: goto L21;
                case 8: goto L17;
                default: goto L16;
            }
        L16:
            goto L44
        L17:
            boolean r0 = r5 instanceof defpackage.sp9
            if (r0 != 0) goto L1f
            boolean r0 = r5 instanceof androidx.datastore.preferences.protobuf.q
            if (r0 == 0) goto L44
        L1f:
            r2 = r1
            goto L44
        L21:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L1f
            boolean r0 = r5 instanceof androidx.datastore.preferences.protobuf.p.a
            if (r0 == 0) goto L44
            goto L1f
        L2a:
            boolean r0 = r5 instanceof defpackage.tr1
            if (r0 != 0) goto L1f
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L44
            goto L1f
        L33:
            boolean r2 = r5 instanceof java.lang.String
            goto L44
        L36:
            boolean r2 = r5 instanceof java.lang.Boolean
            goto L44
        L39:
            boolean r2 = r5 instanceof java.lang.Double
            goto L44
        L3c:
            boolean r2 = r5 instanceof java.lang.Float
            goto L44
        L3f:
            boolean r2 = r5 instanceof java.lang.Long
            goto L44
        L42:
            boolean r2 = r5 instanceof java.lang.Integer
        L44:
            if (r2 == 0) goto L47
            goto L4c
        L47:
            java.lang.String r0 = "Wrong object type used with protocol message reflection."
            defpackage.l5.q(r0)
        L4c:
            boolean r0 = r5 instanceof androidx.datastore.preferences.protobuf.q
            if (r0 == 0) goto L52
            r3.c = r1
        L52:
            androidx.datastore.preferences.protobuf.f0 r3 = r3.a
            r3.i(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.l.i(androidx.datastore.preferences.protobuf.l$a, java.lang.Object):void");
    }

    public l() {
        this.a = new f0(16);
    }
}
