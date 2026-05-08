package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.lp5;
import java.util.List;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@o7e
public final class qn0 {
    public static final b Companion = new b();
    public static final Lazy<KSerializer<Object>>[] t;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final e95 e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final Integer m;
    public final Integer n;
    public final String o;
    public final String p;
    public final String q;
    public final List<gva> r;
    public final lp5 s;

    @sy3
    public static final /* synthetic */ class a implements sw5<qn0> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.ghostwriter.models.backend.ApplicationFormField", aVar, 19);
            pluginGeneratedSerialDescriptor.k("id", false);
            pluginGeneratedSerialDescriptor.k("job_id", false);
            pluginGeneratedSerialDescriptor.k("field_name", false);
            pluginGeneratedSerialDescriptor.k("field_id", false);
            pluginGeneratedSerialDescriptor.k("field_type", false);
            pluginGeneratedSerialDescriptor.k("classification", false);
            pluginGeneratedSerialDescriptor.k("label", false);
            pluginGeneratedSerialDescriptor.k("placeholder", false);
            pluginGeneratedSerialDescriptor.k("required", false);
            pluginGeneratedSerialDescriptor.k("disabled", false);
            pluginGeneratedSerialDescriptor.k("readonly", false);
            pluginGeneratedSerialDescriptor.k("pattern", false);
            pluginGeneratedSerialDescriptor.k("min_length", false);
            pluginGeneratedSerialDescriptor.k("max_length", false);
            pluginGeneratedSerialDescriptor.k("min_value", false);
            pluginGeneratedSerialDescriptor.k("max_value", false);
            pluginGeneratedSerialDescriptor.k("step", false);
            pluginGeneratedSerialDescriptor.k("options", false);
            pluginGeneratedSerialDescriptor.k("response", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = qn0.t;
            mve mveVar = mve.a;
            ni1 ni1Var = ni1.a;
            rh7 rh7Var = rh7.a;
            return new KSerializer[]{mveVar, mveVar, mveVar, qp1.b(mveVar), lazyArr[4].getValue(), mveVar, mveVar, qp1.b(mveVar), ni1Var, ni1Var, ni1Var, qp1.b(mveVar), qp1.b(rh7Var), qp1.b(rh7Var), qp1.b(mveVar), qp1.b(mveVar), qp1.b(mveVar), qp1.b(lazyArr[17].getValue()), qp1.b(lp5.a.a)};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            String str;
            String str2;
            int i;
            String str3;
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = qn0.t;
            String str4 = null;
            Integer num = null;
            Integer num2 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            int i2 = 0;
            String str8 = null;
            List list = null;
            lp5 lp5Var = null;
            String str9 = null;
            e95 e95Var = null;
            String strO = null;
            String strO2 = null;
            boolean zE = false;
            boolean zE2 = false;
            boolean zE3 = false;
            boolean z = true;
            String strO3 = null;
            String strO4 = null;
            String strO5 = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                switch (iP) {
                    case -1:
                        str = strO2;
                        z = false;
                        strO2 = str;
                        break;
                    case 0:
                        str2 = strO;
                        str = strO2;
                        strO3 = ul2VarB.o(serialDescriptor, 0);
                        i2 |= 1;
                        strO = str2;
                        strO2 = str;
                        break;
                    case 1:
                        str3 = strO;
                        strO4 = ul2VarB.o(serialDescriptor, 1);
                        i2 |= 2;
                        strO = str3;
                        break;
                    case 2:
                        str3 = strO;
                        strO5 = ul2VarB.o(serialDescriptor, 2);
                        i2 |= 4;
                        strO = str3;
                        break;
                    case 3:
                        str2 = strO;
                        str = strO2;
                        str9 = (String) ul2VarB.h(serialDescriptor, 3, mve.a, str9);
                        i2 |= 8;
                        strO = str2;
                        strO2 = str;
                        break;
                    case 4:
                        str2 = strO;
                        str = strO2;
                        e95Var = (e95) ul2VarB.z(serialDescriptor, 4, lazyArr[4].getValue(), e95Var);
                        i2 |= 16;
                        strO = str2;
                        strO2 = str;
                        break;
                    case 5:
                        strO = ul2VarB.o(serialDescriptor, 5);
                        i2 |= 32;
                        break;
                    case 6:
                        str3 = strO;
                        strO2 = ul2VarB.o(serialDescriptor, 6);
                        i2 |= 64;
                        strO = str3;
                        break;
                    case 7:
                        str2 = strO;
                        str = strO2;
                        str7 = (String) ul2VarB.h(serialDescriptor, 7, mve.a, str7);
                        i2 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        strO = str2;
                        strO2 = str;
                        break;
                    case 8:
                        str3 = strO;
                        zE = ul2VarB.E(serialDescriptor, 8);
                        i2 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        strO = str3;
                        break;
                    case DatadogLogGenerator.CRASH /* 9 */:
                        str3 = strO;
                        zE2 = ul2VarB.E(serialDescriptor, 9);
                        i2 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        strO = str3;
                        break;
                    case 10:
                        str3 = strO;
                        zE3 = ul2VarB.E(serialDescriptor, 10);
                        i2 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        strO = str3;
                        break;
                    case 11:
                        str2 = strO;
                        str = strO2;
                        str5 = (String) ul2VarB.h(serialDescriptor, 11, mve.a, str5);
                        i2 |= 2048;
                        strO = str2;
                        strO2 = str;
                        break;
                    case 12:
                        str2 = strO;
                        str = strO2;
                        num2 = (Integer) ul2VarB.h(serialDescriptor, 12, rh7.a, num2);
                        i2 |= 4096;
                        strO = str2;
                        strO2 = str;
                        break;
                    case 13:
                        str2 = strO;
                        str = strO2;
                        num = (Integer) ul2VarB.h(serialDescriptor, 13, rh7.a, num);
                        i2 |= 8192;
                        strO = str2;
                        strO2 = str;
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 14 */:
                        str2 = strO;
                        str = strO2;
                        str4 = (String) ul2VarB.h(serialDescriptor, 14, mve.a, str4);
                        i2 |= 16384;
                        strO = str2;
                        strO2 = str;
                        break;
                    case 15:
                        str2 = strO;
                        str = strO2;
                        str6 = (String) ul2VarB.h(serialDescriptor, 15, mve.a, str6);
                        i = 32768;
                        i2 |= i;
                        strO = str2;
                        strO2 = str;
                        break;
                    case 16:
                        str2 = strO;
                        str = strO2;
                        str8 = (String) ul2VarB.h(serialDescriptor, 16, mve.a, str8);
                        i = 65536;
                        i2 |= i;
                        strO = str2;
                        strO2 = str;
                        break;
                    case 17:
                        str2 = strO;
                        str = strO2;
                        list = (List) ul2VarB.h(serialDescriptor, 17, lazyArr[17].getValue(), list);
                        i = 131072;
                        i2 |= i;
                        strO = str2;
                        strO2 = str;
                        break;
                    case 18:
                        str2 = strO;
                        str = strO2;
                        lp5Var = (lp5) ul2VarB.h(serialDescriptor, 18, lp5.a.a, lp5Var);
                        i = 262144;
                        i2 |= i;
                        strO = str2;
                        strO2 = str;
                        break;
                    default:
                        b0.m(iP);
                        return null;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new qn0(i2, strO3, strO4, strO5, str9, e95Var, strO, strO2, str7, zE, zE2, zE3, str5, num2, num, str4, str6, str8, list, lp5Var);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            qn0 qn0Var = (qn0) obj;
            qn0Var.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = qn0.t;
            vl2VarB.x(serialDescriptor, 0, qn0Var.a);
            vl2VarB.x(serialDescriptor, 1, qn0Var.b);
            vl2VarB.x(serialDescriptor, 2, qn0Var.c);
            mve mveVar = mve.a;
            vl2VarB.k(serialDescriptor, 3, mveVar, qn0Var.d);
            vl2VarB.y(serialDescriptor, 4, lazyArr[4].getValue(), qn0Var.e);
            vl2VarB.x(serialDescriptor, 5, qn0Var.f);
            vl2VarB.x(serialDescriptor, 6, qn0Var.g);
            vl2VarB.k(serialDescriptor, 7, mveVar, qn0Var.h);
            vl2VarB.w(serialDescriptor, 8, qn0Var.i);
            vl2VarB.w(serialDescriptor, 9, qn0Var.j);
            vl2VarB.w(serialDescriptor, 10, qn0Var.k);
            vl2VarB.k(serialDescriptor, 11, mveVar, qn0Var.l);
            rh7 rh7Var = rh7.a;
            vl2VarB.k(serialDescriptor, 12, rh7Var, qn0Var.m);
            vl2VarB.k(serialDescriptor, 13, rh7Var, qn0Var.n);
            vl2VarB.k(serialDescriptor, 14, mveVar, qn0Var.o);
            vl2VarB.k(serialDescriptor, 15, mveVar, qn0Var.p);
            vl2VarB.k(serialDescriptor, 16, mveVar, qn0Var.q);
            vl2VarB.k(serialDescriptor, 17, lazyArr[17].getValue(), qn0Var.r);
            vl2VarB.k(serialDescriptor, 18, lp5.a.a, qn0Var.s);
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<qn0> serializer() {
            return a.a;
        }
    }

    static {
        zw zwVar = new zw(1);
        qt8 qt8Var = qt8.b;
        t = new Lazy[]{null, null, null, null, boa.E(qt8Var, zwVar), null, null, null, null, null, null, null, null, null, null, null, null, boa.E(qt8Var, new lz(2)), null};
    }

    public /* synthetic */ qn0(int i, String str, String str2, String str3, String str4, e95 e95Var, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, String str8, Integer num, Integer num2, String str9, String str10, String str11, List list, lp5 lp5Var) {
        if (524287 != (i & 524287)) {
            ewa.M(i, 524287, a.a.get$$serialDesc());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = e95Var;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = str8;
        this.m = num;
        this.n = num2;
        this.o = str9;
        this.p = str10;
        this.q = str11;
        this.r = list;
        this.s = lp5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qn0)) {
            return false;
        }
        qn0 qn0Var = (qn0) obj;
        return wl7.b(this.a, qn0Var.a) && wl7.b(this.b, qn0Var.b) && wl7.b(this.c, qn0Var.c) && wl7.b(this.d, qn0Var.d) && this.e == qn0Var.e && wl7.b(this.f, qn0Var.f) && wl7.b(this.g, qn0Var.g) && wl7.b(this.h, qn0Var.h) && this.i == qn0Var.i && this.j == qn0Var.j && this.k == qn0Var.k && wl7.b(this.l, qn0Var.l) && wl7.b(this.m, qn0Var.m) && wl7.b(this.n, qn0Var.n) && wl7.b(this.o, qn0Var.o) && wl7.b(this.p, qn0Var.p) && wl7.b(this.q, qn0Var.q) && wl7.b(this.r, qn0Var.r) && wl7.b(this.s, qn0Var.s);
    }

    public final int hashCode() {
        int iD = akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iD2 = akb.d(akb.d((this.e.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f), 31, this.g);
        String str2 = this.h;
        int iF = ia.f(ia.f(ia.f((iD2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.i), 31, this.j), 31, this.k);
        String str3 = this.l;
        int iHashCode = (iF + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.m;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.n;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.o;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.p;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.q;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<gva> list = this.r;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        lp5 lp5Var = this.s;
        return iHashCode7 + (lp5Var != null ? lp5Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("ApplicationFormField(id=", this.a, ", job_id=", this.b, ", field_name=");
        ia.r(sbF, this.c, ", field_id=", this.d, ", field_type=");
        sbF.append(this.e);
        sbF.append(", classification=");
        sbF.append(this.f);
        sbF.append(", label=");
        ia.r(sbF, this.g, ", placeholder=", this.h, ", required=");
        p6.j(sbF, this.i, ", disabled=", this.j, ", readonly=");
        k6.k(", pattern=", this.l, ", min_length=", sbF, this.k);
        sbF.append(this.m);
        sbF.append(", max_length=");
        sbF.append(this.n);
        sbF.append(", min_value=");
        ia.r(sbF, this.o, ", max_value=", this.p, ", step=");
        sbF.append(this.q);
        sbF.append(", options=");
        sbF.append(this.r);
        sbF.append(", response=");
        sbF.append(this.s);
        sbF.append(")");
        return sbF.toString();
    }
}
