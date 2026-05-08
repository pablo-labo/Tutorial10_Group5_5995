package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.BuildConfig;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@o7e
public final class ol0 {
    public static final b Companion = new b();
    public String a;
    public String b;
    public String c;
    public long d;
    public long e;
    public String f;
    public String g;
    public Long h;
    public Long i;
    public Long j;
    public Long k;
    public int l;
    public int m;
    public int n;

    @sy3
    public static final /* synthetic */ class a implements sw5<ol0> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.jobsearch.tracking.AppLifecycleSnapshot", aVar, 14);
            pluginGeneratedSerialDescriptor.k("appVersion", false);
            pluginGeneratedSerialDescriptor.k("referrerUrl", false);
            pluginGeneratedSerialDescriptor.k("appSessionId", false);
            pluginGeneratedSerialDescriptor.k("firstInstallTime", false);
            pluginGeneratedSerialDescriptor.k("lastInstallTime", false);
            pluginGeneratedSerialDescriptor.k("firstInstallVersion", false);
            pluginGeneratedSerialDescriptor.k("installerPackageName", false);
            pluginGeneratedSerialDescriptor.k("installBeginTimestampSeconds", false);
            pluginGeneratedSerialDescriptor.k("installBeginTimestampServerSeconds", false);
            pluginGeneratedSerialDescriptor.k("referrerClickTimestampSeconds", false);
            pluginGeneratedSerialDescriptor.k("referrerClickTimestampServerSeconds", false);
            pluginGeneratedSerialDescriptor.k("coldLaunchCount", true);
            pluginGeneratedSerialDescriptor.k("upgradeCount", true);
            pluginGeneratedSerialDescriptor.k("sessionStartCount", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            mve mveVar = mve.a;
            KSerializer<?> kSerializerB = qp1.b(mveVar);
            p59 p59Var = p59.a;
            KSerializer<?> kSerializerB2 = qp1.b(mveVar);
            KSerializer<?> kSerializerB3 = qp1.b(p59Var);
            KSerializer<?> kSerializerB4 = qp1.b(p59Var);
            KSerializer<?> kSerializerB5 = qp1.b(p59Var);
            KSerializer<?> kSerializerB6 = qp1.b(p59Var);
            rh7 rh7Var = rh7.a;
            return new KSerializer[]{mveVar, kSerializerB, mveVar, p59Var, p59Var, mveVar, kSerializerB2, kSerializerB3, kSerializerB4, kSerializerB5, kSerializerB6, rh7Var, rh7Var, rh7Var};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            int i;
            String str;
            long j;
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            long jF = 0;
            long jF2 = 0;
            Long l = null;
            Long l2 = null;
            Long l3 = null;
            Long l4 = null;
            int i2 = 0;
            String strO = null;
            String str2 = null;
            String strO2 = null;
            String strO3 = null;
            String str3 = null;
            boolean z = true;
            int iM = 0;
            int iM2 = 0;
            int iM3 = 0;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                switch (iP) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        j = jF2;
                        strO = ul2VarB.o(serialDescriptor, 0);
                        i2 |= 1;
                        jF2 = j;
                        break;
                    case 1:
                        j = jF2;
                        str2 = (String) ul2VarB.h(serialDescriptor, 1, mve.a, str2);
                        i2 |= 2;
                        jF2 = j;
                        break;
                    case 2:
                        j = jF2;
                        strO2 = ul2VarB.o(serialDescriptor, 2);
                        i2 |= 4;
                        jF2 = j;
                        break;
                    case 3:
                        jF = ul2VarB.f(serialDescriptor, 3);
                        i2 |= 8;
                        break;
                    case 4:
                        jF2 = ul2VarB.f(serialDescriptor, 4);
                        i2 |= 16;
                        break;
                    case 5:
                        j = jF2;
                        strO3 = ul2VarB.o(serialDescriptor, 5);
                        i2 |= 32;
                        jF2 = j;
                        break;
                    case 6:
                        j = jF2;
                        str3 = (String) ul2VarB.h(serialDescriptor, 6, mve.a, str3);
                        i2 |= 64;
                        jF2 = j;
                        break;
                    case 7:
                        j = jF2;
                        l3 = (Long) ul2VarB.h(serialDescriptor, 7, p59.a, l3);
                        i2 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        jF2 = j;
                        break;
                    case 8:
                        j = jF2;
                        l2 = (Long) ul2VarB.h(serialDescriptor, 8, p59.a, l2);
                        i2 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        jF2 = j;
                        break;
                    case DatadogLogGenerator.CRASH /* 9 */:
                        j = jF2;
                        l = (Long) ul2VarB.h(serialDescriptor, 9, p59.a, l);
                        i2 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        jF2 = j;
                        break;
                    case 10:
                        j = jF2;
                        l4 = (Long) ul2VarB.h(serialDescriptor, 10, p59.a, l4);
                        i2 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        strO3 = strO3;
                        jF2 = j;
                        break;
                    case 11:
                        str = strO3;
                        iM = ul2VarB.m(serialDescriptor, 11);
                        i2 |= 2048;
                        strO3 = str;
                        break;
                    case 12:
                        str = strO3;
                        iM2 = ul2VarB.m(serialDescriptor, 12);
                        i2 |= 4096;
                        strO3 = str;
                        break;
                    case 13:
                        str = strO3;
                        iM3 = ul2VarB.m(serialDescriptor, 13);
                        i2 |= 8192;
                        strO3 = str;
                        break;
                    default:
                        b0.m(iP);
                        return null;
                }
            }
            long j2 = jF2;
            String str4 = strO3;
            ul2VarB.c(serialDescriptor);
            if (2047 != (i2 & 2047)) {
                ewa.M(i2, 2047, descriptor);
                throw null;
            }
            ol0 ol0Var = new ol0();
            ol0Var.a = strO;
            ol0Var.b = str2;
            ol0Var.c = strO2;
            ol0Var.d = jF;
            ol0Var.e = j2;
            ol0Var.f = str4;
            ol0Var.g = str3;
            ol0Var.h = l3;
            ol0Var.i = l2;
            ol0Var.j = l;
            ol0Var.k = l4;
            if ((i2 & 2048) == 0) {
                i = 0;
                ol0Var.l = 0;
            } else {
                i = 0;
                ol0Var.l = iM;
            }
            if ((i2 & 4096) == 0) {
                ol0Var.m = i;
            } else {
                ol0Var.m = iM2;
            }
            if ((i2 & 8192) == 0) {
                ol0Var.n = i;
                return ol0Var;
            }
            ol0Var.n = iM3;
            return ol0Var;
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            ol0 ol0Var = (ol0) obj;
            ol0Var.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            vl2VarB.x(serialDescriptor, 0, ol0Var.a);
            mve mveVar = mve.a;
            vl2VarB.k(serialDescriptor, 1, mveVar, ol0Var.b);
            vl2VarB.x(serialDescriptor, 2, ol0Var.c);
            vl2VarB.D(serialDescriptor, 3, ol0Var.d);
            vl2VarB.D(serialDescriptor, 4, ol0Var.e);
            vl2VarB.x(serialDescriptor, 5, ol0Var.f);
            vl2VarB.k(serialDescriptor, 6, mveVar, ol0Var.g);
            p59 p59Var = p59.a;
            vl2VarB.k(serialDescriptor, 7, p59Var, ol0Var.h);
            vl2VarB.k(serialDescriptor, 8, p59Var, ol0Var.i);
            vl2VarB.k(serialDescriptor, 9, p59Var, ol0Var.j);
            vl2VarB.k(serialDescriptor, 10, p59Var, ol0Var.k);
            vl2VarB.r(11, ol0Var.l, serialDescriptor);
            vl2VarB.r(12, ol0Var.m, serialDescriptor);
            vl2VarB.r(13, ol0Var.n, serialDescriptor);
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<ol0> serializer() {
            return a.a;
        }
    }

    public ol0(String str, String str2, String str3, long j, long j2, String str4, String str5, Long l, Long l2, Long l3, Long l4, int i, int i2, int i3) {
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = j2;
        this.f = str4;
        this.g = str5;
        this.h = l;
        this.i = l2;
        this.j = l3;
        this.k = l4;
        this.l = i;
        this.m = i2;
        this.n = i3;
    }

    public static ol0 a(ol0 ol0Var, String str, String str2, long j, Long l, Long l2, Long l3, Long l4, int i) {
        String str3 = (i & 1) != 0 ? ol0Var.a : BuildConfig.VERSION_NAME;
        String str4 = (i & 2) != 0 ? ol0Var.b : str;
        long j2 = ol0Var.d;
        long j3 = (i & 16) != 0 ? ol0Var.e : j;
        String str5 = ol0Var.f;
        String str6 = ol0Var.g;
        Long l5 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? ol0Var.h : l;
        Long l6 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? ol0Var.i : l2;
        Long l7 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? ol0Var.j : l3;
        Long l8 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? ol0Var.k : l4;
        int i2 = ol0Var.l;
        int i3 = ol0Var.m;
        int i4 = ol0Var.n;
        ol0Var.getClass();
        str3.getClass();
        str2.getClass();
        str5.getClass();
        return new ol0(str3, str4, str2, j2, j3, str5, str6, l5, l6, l7, l8, i2, i3, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ol0)) {
            return false;
        }
        ol0 ol0Var = (ol0) obj;
        return wl7.b(this.a, ol0Var.a) && wl7.b(this.b, ol0Var.b) && wl7.b(this.c, ol0Var.c) && this.d == ol0Var.d && this.e == ol0Var.e && wl7.b(this.f, ol0Var.f) && wl7.b(this.g, ol0Var.g) && wl7.b(this.h, ol0Var.h) && wl7.b(this.i, ol0Var.i) && wl7.b(this.j, ol0Var.j) && wl7.b(this.k, ol0Var.k) && this.l == ol0Var.l && this.m == ol0Var.m && this.n == ol0Var.n;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iD = akb.d(ia.d(ia.d(akb.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        String str2 = this.g;
        int iHashCode2 = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.h;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.i;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.j;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.k;
        return Integer.hashCode(this.n) + w40.c(this.m, w40.c(this.l, (iHashCode5 + (l4 != null ? l4.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        long j = this.d;
        long j2 = this.e;
        String str4 = this.f;
        String str5 = this.g;
        Long l = this.h;
        Long l2 = this.i;
        Long l3 = this.j;
        Long l4 = this.k;
        int i = this.l;
        int i2 = this.m;
        int i3 = this.n;
        StringBuilder sbF = u40.f("AppLifecycleSnapshot(appVersion=", str, ", referrerUrl=", str2, ", appSessionId=");
        sbF.append(str3);
        sbF.append(", firstInstallTime=");
        sbF.append(j);
        o6.p(sbF, ", lastInstallTime=", j2, ", firstInstallVersion=");
        ia.r(sbF, str4, ", installerPackageName=", str5, ", installBeginTimestampSeconds=");
        sbF.append(l);
        sbF.append(", installBeginTimestampServerSeconds=");
        sbF.append(l2);
        sbF.append(", referrerClickTimestampSeconds=");
        sbF.append(l3);
        sbF.append(", referrerClickTimestampServerSeconds=");
        sbF.append(l4);
        sbF.append(", coldLaunchCount=");
        uz.i(sbF, i, ", upgradeCount=", i2, ", sessionStartCount=");
        return w20.k(sbF, i3, ")");
    }
}
