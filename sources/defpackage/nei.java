package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.zzfw;
import defpackage.dzh;
import defpackage.jph;
import defpackage.lph;
import defpackage.nph;
import defpackage.rph;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class nei extends bei {
    public static void A(StringBuilder sb, String str, pph pphVar) {
        if (pphVar == null) {
            return;
        }
        v(3, sb);
        sb.append(str);
        sb.append(" {\n");
        if (pphVar.D() != 0) {
            v(4, sb);
            sb.append("results: ");
            int i = 0;
            for (Long l : pphVar.B()) {
                int i2 = i + 1;
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i = i2;
            }
            sb.append('\n');
        }
        if (pphVar.w() != 0) {
            v(4, sb);
            sb.append("status: ");
            int i3 = 0;
            for (Long l2 : pphVar.r()) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (pphVar.G() != 0) {
            v(4, sb);
            sb.append("dynamic_filter_timestamps: {");
            int i5 = 0;
            for (iph iphVar : pphVar.F()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append(iphVar.t() ? Integer.valueOf(iphVar.u()) : null);
                sb.append(":");
                sb.append(iphVar.v() ? Long.valueOf(iphVar.w()) : null);
                i5 = i6;
            }
            sb.append("}\n");
        }
        if (pphVar.I() != 0) {
            v(4, sb);
            sb.append("sequence_filter_timestamps: {");
            int i7 = 0;
            for (qph qphVar : pphVar.H()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append(qphVar.u() ? Integer.valueOf(qphVar.v()) : null);
                sb.append(": [");
                Iterator<Long> it = qphVar.w().iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    long jLongValue = it.next().longValue();
                    int i10 = i9 + 1;
                    if (i9 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i9 = i10;
                }
                sb.append("]");
                i7 = i8;
            }
            sb.append("}\n");
        }
        v(3, sb);
        sb.append("}\n");
    }

    public static boolean F(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static boolean G(wzh wzhVar, int i) {
        if (i < (wzhVar.size() << 6)) {
            return ((1 << (i % 64)) & wzhVar.get(i / 64).longValue()) != 0;
        }
        return false;
    }

    public static int l(nph.a aVar, String str) {
        for (int i = 0; i < ((nph) aVar.b).K0(); i++) {
            if (str.equals(((nph) aVar.b).e0(i).A())) {
                return i;
            }
        }
        return -1;
    }

    public static String p(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    public static ArrayList q(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 < bitSet.length()) {
                    if (bitSet.get(i3)) {
                        j |= 1 << i2;
                    }
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static ArrayList r(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                lph.a aVarN = lph.N();
                for (String str : bundle.keySet()) {
                    lph.a aVarN2 = lph.N();
                    aVarN2.p(str);
                    Object obj = bundle.get(str);
                    if (obj instanceof Long) {
                        aVarN2.o(((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        aVarN2.q((String) obj);
                    } else if (obj instanceof Double) {
                        aVarN2.n(((Double) obj).doubleValue());
                    }
                    if (aVarN.c) {
                        aVarN.k();
                        aVarN.c = false;
                    }
                    lph.v((lph) aVarN.b, (lph) aVarN2.m());
                }
                if (((lph) aVarN.b).M() > 0) {
                    arrayList.add((lph) aVarN.m());
                }
            }
        }
        return arrayList;
    }

    public static lph t(String str, jph jphVar) {
        for (lph lphVar : jphVar.r()) {
            if (lphVar.y().equals(str)) {
                return lphVar;
            }
        }
        return null;
    }

    public static dzh.a u(dzh.a aVar, byte[] bArr) throws zzfw {
        lxh lxhVarA;
        lxh lxhVar = lxh.c;
        if (lxhVar == null) {
            synchronized (lxh.class) {
                try {
                    lxhVarA = lxh.c;
                    if (lxhVarA == null) {
                        lxhVarA = czh.a();
                        lxh.c = lxhVarA;
                    }
                } finally {
                }
            }
            lxhVar = lxhVarA;
        }
        if (lxhVar != null) {
            aVar.getClass();
            aVar.j(bArr, bArr.length, lxhVar);
            return aVar;
        }
        aVar.getClass();
        aVar.j(bArr, bArr.length, lxh.a());
        return aVar;
    }

    public static void v(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    public static void w(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        v(i + 1, sb);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static void x(StringBuilder sb, int i, String str, inh inhVar) {
        if (inhVar == null) {
            return;
        }
        v(i, sb);
        sb.append(str);
        sb.append(" {\n");
        if (inhVar.r()) {
            w(sb, i, "comparison_type", inhVar.s().name());
        }
        if (inhVar.t()) {
            w(sb, i, "match_as_float", Boolean.valueOf(inhVar.u()));
        }
        if (inhVar.v()) {
            w(sb, i, "comparison_value", inhVar.w());
        }
        if (inhVar.x()) {
            w(sb, i, "min_comparison_value", inhVar.y());
        }
        if (inhVar.z()) {
            w(sb, i, "max_comparison_value", inhVar.A());
        }
        v(i, sb);
        sb.append("}\n");
    }

    public final void B(jph.a aVar, String str, Object obj) {
        List listUnmodifiableList = Collections.unmodifiableList(((jph) aVar.b).r());
        int i = 0;
        while (true) {
            if (i >= listUnmodifiableList.size()) {
                i = -1;
                break;
            } else if (str.equals(((lph) listUnmodifiableList.get(i)).y())) {
                break;
            } else {
                i++;
            }
        }
        lph.a aVarN = lph.N();
        aVarN.p(str);
        if (obj instanceof Long) {
            aVarN.o(((Long) obj).longValue());
        } else if (obj instanceof String) {
            aVarN.q((String) obj);
        } else if (obj instanceof Double) {
            aVarN.n(((Double) obj).doubleValue());
        } else {
            oci.a();
            if (this.a.V.k(null, djh.F0) && (obj instanceof Bundle[])) {
                ArrayList arrayListR = r((Bundle[]) obj);
                if (aVarN.c) {
                    aVarN.k();
                    aVarN.c = false;
                }
                lph.u((lph) aVarN.b, arrayListR);
            }
        }
        if (i < 0) {
            aVar.p(aVarN);
            return;
        }
        if (aVar.c) {
            aVar.k();
            aVar.c = false;
        }
        jph.x((jph) aVar.b, i, (lph) aVarN.m());
    }

    public final void C(lph.a aVar, Object obj) {
        fib.i(obj);
        if (aVar.c) {
            aVar.k();
            aVar.c = false;
        }
        lph.x((lph) aVar.b);
        if (aVar.c) {
            aVar.k();
            aVar.c = false;
        }
        lph.z((lph) aVar.b);
        if (aVar.c) {
            aVar.k();
            aVar.c = false;
        }
        lph.B((lph) aVar.b);
        if (aVar.c) {
            aVar.k();
            aVar.c = false;
        }
        lph.E((lph) aVar.b);
        if (obj instanceof String) {
            aVar.q((String) obj);
            return;
        }
        if (obj instanceof Long) {
            aVar.o(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            aVar.n(((Double) obj).doubleValue());
            return;
        }
        oci.a();
        if (!this.a.V.k(null, djh.F0) || !(obj instanceof Bundle[])) {
            zzr().f.a(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayListR = r((Bundle[]) obj);
        if (aVar.c) {
            aVar.k();
            aVar.c = false;
        }
        lph.u((lph) aVar.b, arrayListR);
    }

    public final void D(rph.a aVar, Object obj) {
        fib.i(obj);
        if (aVar.c) {
            aVar.k();
            aVar.c = false;
        }
        rph.v((rph) aVar.b);
        if (aVar.c) {
            aVar.k();
            aVar.c = false;
        }
        rph.x((rph) aVar.b);
        if (aVar.c) {
            aVar.k();
            aVar.c = false;
        }
        rph.B((rph) aVar.b);
        if (obj instanceof String) {
            String str = (String) obj;
            if (aVar.c) {
                aVar.k();
                aVar.c = false;
            }
            rph.z((rph) aVar.b, str);
            return;
        }
        if (obj instanceof Long) {
            aVar.p(((Long) obj).longValue());
            return;
        }
        if (!(obj instanceof Double)) {
            zzr().f.a(obj, "Ignoring invalid (type) user attribute value");
            return;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        if (aVar.c) {
            aVar.k();
            aVar.c = false;
        }
        rph.r((rph) aVar.b, dDoubleValue);
    }

    public final boolean E(long j, long j2) {
        if (j == 0 || j2 <= 0) {
            return true;
        }
        this.a.c0.getClass();
        return Math.abs(System.currentTimeMillis() - j) > j2;
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [android.os.Bundle[], java.io.Serializable] */
    public final Serializable H(String str, jph jphVar) {
        lph lphVarT = t(str, jphVar);
        if (lphVarT != null) {
            if (lphVarT.C()) {
                return lphVarT.D();
            }
            if (lphVarT.F()) {
                return Long.valueOf(lphVarT.G());
            }
            if (lphVarT.J()) {
                return Double.valueOf(lphVarT.K());
            }
            oci.a();
            if (this.a.V.k(null, djh.F0) && lphVarT.M() > 0) {
                e0i<lph> e0iVarL = lphVarT.L();
                ArrayList arrayList = new ArrayList();
                for (lph lphVar : e0iVarL) {
                    if (lphVar != null) {
                        Bundle bundle = new Bundle();
                        for (lph lphVar2 : lphVar.L()) {
                            if (lphVar2.C()) {
                                bundle.putString(lphVar2.y(), lphVar2.D());
                            } else if (lphVar2.F()) {
                                bundle.putLong(lphVar2.y(), lphVar2.G());
                            } else if (lphVar2.J()) {
                                bundle.putDouble(lphVar2.y(), lphVar2.K());
                            }
                        }
                        if (!bundle.isEmpty()) {
                            arrayList.add(bundle);
                        }
                    }
                }
                return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
            }
        }
        return null;
    }

    public final byte[] I(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];
            while (true) {
                int i = gZIPInputStream.read(bArr2);
                if (i <= 0) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, 0, i);
            }
        } catch (IOException e) {
            this.zzr().f.a(e, "Failed to ungzip content");
            throw e;
        }
    }

    public final byte[] J(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            this.zzr().f.a(e, "Failed to gzip content");
            throw e;
        }
    }

    public final ArrayList K() {
        Context context = this.b.X.a;
        List<svh<?>> list = djh.a;
        jqh jqhVarB = jqh.b(context.getContentResolver(), jrh.a());
        Map<String, String> mapA = jqhVarB == null ? Collections.EMPTY_MAP : jqhVarB.a();
        if (mapA != null && mapA.size() != 0) {
            ArrayList arrayList = new ArrayList();
            int iIntValue = djh.P.a(null).intValue();
            for (Map.Entry<String, String> entry : mapA.entrySet()) {
                if (entry.getKey().startsWith("measurement.id.")) {
                    try {
                        int i = Integer.parseInt(entry.getValue());
                        if (i != 0) {
                            arrayList.add(Integer.valueOf(i));
                            if (arrayList.size() >= iIntValue) {
                                zzr().X.a(Integer.valueOf(arrayList.size()), "Too many experiment IDs. Number of IDs");
                                break;
                            }
                            continue;
                        } else {
                            continue;
                        }
                    } catch (NumberFormatException e) {
                        zzr().X.a(e, "Experiment ID NumberFormatException");
                    }
                }
            }
            if (arrayList.size() != 0) {
                return arrayList;
            }
        }
        return null;
    }

    @Override // defpackage.bei
    public final boolean i() {
        return false;
    }

    public final long m(byte[] bArr) {
        e().b();
        MessageDigest messageDigestK0 = yei.k0();
        if (messageDigestK0 != null) {
            return yei.l(messageDigestK0.digest(bArr));
        }
        zzr().f.b("Failed to get MD5");
        return 0L;
    }

    public final <T extends Parcelable> T n(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return creator.createFromParcel(parcelObtain);
        } catch (SafeParcelReader.ParseException unused) {
            zzr().f.b("Failed to load parcelable from buffer");
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    public final String o(mph mphVar) {
        StringBuilder sbG = q6.g("\nbatch {\n");
        for (nph nphVar : mphVar.r()) {
            if (nphVar != null) {
                v(1, sbG);
                sbG.append("bundle {\n");
                if (nphVar.A()) {
                    w(sbG, 1, "protocol_version", Integer.valueOf(nphVar.d0()));
                }
                w(sbG, 1, "platform", nphVar.p1());
                if (nphVar.y1()) {
                    w(sbG, 1, "gmp_version", Long.valueOf(nphVar.D()));
                }
                if (nphVar.E()) {
                    w(sbG, 1, "uploading_gmp_version", Long.valueOf(nphVar.F()));
                }
                if (nphVar.m0()) {
                    w(sbG, 1, "dynamite_version", Long.valueOf(nphVar.n0()));
                }
                if (nphVar.X()) {
                    w(sbG, 1, "config_version", Long.valueOf(nphVar.Y()));
                }
                w(sbG, 1, "gmp_app_id", nphVar.P());
                w(sbG, 1, "admob_app_id", nphVar.l0());
                w(sbG, 1, "app_id", nphVar.w1());
                w(sbG, 1, "app_version", nphVar.x1());
                if (nphVar.U()) {
                    w(sbG, 1, "app_version_major", Integer.valueOf(nphVar.V()));
                }
                w(sbG, 1, "firebase_instance_id", nphVar.T());
                if (nphVar.K()) {
                    w(sbG, 1, "dev_cert_hash", Long.valueOf(nphVar.L()));
                }
                w(sbG, 1, "app_store", nphVar.v1());
                if (nphVar.S0()) {
                    w(sbG, 1, "upload_timestamp_millis", Long.valueOf(nphVar.T0()));
                }
                if (nphVar.Y0()) {
                    w(sbG, 1, "start_timestamp_millis", Long.valueOf(nphVar.Z0()));
                }
                if (nphVar.e1()) {
                    w(sbG, 1, "end_timestamp_millis", Long.valueOf(nphVar.f1()));
                }
                if (nphVar.j1()) {
                    w(sbG, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(nphVar.k1()));
                }
                if (nphVar.m1()) {
                    w(sbG, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(nphVar.n1()));
                }
                w(sbG, 1, "app_instance_id", nphVar.J());
                w(sbG, 1, "resettable_device_id", nphVar.G());
                w(sbG, 1, "device_id", nphVar.W());
                w(sbG, 1, "ds_id", nphVar.b0());
                if (nphVar.H()) {
                    w(sbG, 1, "limited_ad_tracking", Boolean.valueOf(nphVar.I()));
                }
                w(sbG, 1, "os_version", nphVar.q1());
                w(sbG, 1, "device_model", nphVar.r1());
                w(sbG, 1, "user_default_language", nphVar.s1());
                if (nphVar.t1()) {
                    w(sbG, 1, "time_zone_offset_minutes", Integer.valueOf(nphVar.u1()));
                }
                if (nphVar.M()) {
                    w(sbG, 1, "bundle_sequential_index", Integer.valueOf(nphVar.N()));
                }
                if (nphVar.Q()) {
                    w(sbG, 1, "service_upload", Boolean.valueOf(nphVar.R()));
                }
                w(sbG, 1, "health_monitor", nphVar.O());
                if (!this.a.V.k(null, djh.L0) && nphVar.Z() && nphVar.a0() != 0) {
                    w(sbG, 1, "android_id", Long.valueOf(nphVar.a0()));
                }
                if (nphVar.c0()) {
                    w(sbG, 1, "retry_counter", Integer.valueOf(nphVar.k0()));
                }
                e0i<rph> e0iVarF0 = nphVar.F0();
                if (e0iVarF0 != null) {
                    for (rph rphVar : e0iVarF0) {
                        if (rphVar != null) {
                            v(2, sbG);
                            sbG.append("user_property {\n");
                            w(sbG, 2, "set_timestamp_millis", rphVar.u() ? Long.valueOf(rphVar.w()) : null);
                            w(sbG, 2, "name", d().p(rphVar.A()));
                            w(sbG, 2, "string_value", rphVar.D());
                            w(sbG, 2, "int_value", rphVar.E() ? Long.valueOf(rphVar.F()) : null);
                            w(sbG, 2, "double_value", rphVar.G() ? Double.valueOf(rphVar.H()) : null);
                            v(2, sbG);
                            sbG.append("}\n");
                        }
                    }
                }
                e0i<hph> e0iVarS = nphVar.S();
                if (e0iVarS != null) {
                    for (hph hphVar : e0iVarS) {
                        if (hphVar != null) {
                            v(2, sbG);
                            sbG.append("audience_membership {\n");
                            if (hphVar.u()) {
                                w(sbG, 2, "audience_id", Integer.valueOf(hphVar.v()));
                            }
                            if (hphVar.A()) {
                                w(sbG, 2, "new_audience", Boolean.valueOf(hphVar.B()));
                            }
                            A(sbG, "current_data", hphVar.x());
                            if (hphVar.y()) {
                                A(sbG, "previous_data", hphVar.z());
                            }
                            v(2, sbG);
                            sbG.append("}\n");
                        }
                    }
                }
                List<jph> listT0 = nphVar.t0();
                if (listT0 != null) {
                    for (jph jphVar : listT0) {
                        if (jphVar != null) {
                            v(2, sbG);
                            sbG.append("event {\n");
                            w(sbG, 2, "name", d().l(jphVar.C()));
                            if (jphVar.D()) {
                                w(sbG, 2, "timestamp_millis", Long.valueOf(jphVar.E()));
                            }
                            if (jphVar.F()) {
                                w(sbG, 2, "previous_timestamp_millis", Long.valueOf(jphVar.G()));
                            }
                            if (jphVar.H()) {
                                w(sbG, 2, "count", Integer.valueOf(jphVar.I()));
                            }
                            if (jphVar.A() != 0) {
                                z(sbG, 2, (e0i) jphVar.r());
                            }
                            v(2, sbG);
                            sbG.append("}\n");
                        }
                    }
                }
                v(1, sbG);
                sbG.append("}\n");
            }
        }
        sbG.append("}\n");
        return sbG.toString();
    }

    public final List s(wzh wzhVar, List list) {
        int i;
        ArrayList arrayList = new ArrayList(wzhVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                zzr().X.a(num, "Ignoring negative bit index to be cleared");
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    zzr().X.c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    public final void y(StringBuilder sb, int i, hnh hnhVar) {
        if (hnhVar == null) {
            return;
        }
        v(i, sb);
        sb.append("filter {\n");
        if (hnhVar.w()) {
            w(sb, i, "complement", Boolean.valueOf(hnhVar.x()));
        }
        if (hnhVar.y()) {
            w(sb, i, "param_name", d().o(hnhVar.z()));
        }
        if (hnhVar.s()) {
            int i2 = i + 1;
            knh knhVarT = hnhVar.t();
            if (knhVarT != null) {
                v(i2, sb);
                sb.append("string_filter");
                sb.append(" {\n");
                if (knhVarT.r()) {
                    w(sb, i2, "match_type", knhVarT.s().name());
                }
                if (knhVarT.t()) {
                    w(sb, i2, "expression", knhVarT.u());
                }
                if (knhVarT.v()) {
                    w(sb, i2, "case_sensitive", Boolean.valueOf(knhVarT.w()));
                }
                if (knhVarT.y() > 0) {
                    v(i + 2, sb);
                    sb.append("expression_list {\n");
                    for (String str : knhVarT.x()) {
                        v(i + 3, sb);
                        sb.append(str);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                v(i2, sb);
                sb.append("}\n");
            }
        }
        if (hnhVar.u()) {
            x(sb, i + 1, "number_filter", hnhVar.v());
        }
        v(i, sb);
        sb.append("}\n");
    }

    public final void z(StringBuilder sb, int i, e0i e0iVar) {
        if (e0iVar == null) {
            return;
        }
        int i2 = i + 1;
        Iterator<E> it = e0iVar.iterator();
        while (it.hasNext()) {
            lph lphVar = (lph) it.next();
            if (lphVar != null) {
                v(i2, sb);
                sb.append("param {\n");
                oci.a();
                if (this.a.V.k(null, djh.D0)) {
                    w(sb, i2, "name", lphVar.w() ? d().o(lphVar.y()) : null);
                    w(sb, i2, "string_value", lphVar.C() ? lphVar.D() : null);
                    w(sb, i2, "int_value", lphVar.F() ? Long.valueOf(lphVar.G()) : null);
                    w(sb, i2, "double_value", lphVar.J() ? Double.valueOf(lphVar.K()) : null);
                    if (lphVar.M() > 0) {
                        z(sb, i2, lphVar.L());
                    }
                } else {
                    w(sb, i2, "name", d().o(lphVar.y()));
                    w(sb, i2, "string_value", lphVar.D());
                    w(sb, i2, "int_value", lphVar.F() ? Long.valueOf(lphVar.G()) : null);
                    w(sb, i2, "double_value", lphVar.J() ? Double.valueOf(lphVar.K()) : null);
                }
                v(i2, sb);
                sb.append("}\n");
            }
        }
    }
}
