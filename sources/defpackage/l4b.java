package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@o7e
public final class l4b {
    public static final b Companion = new b();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;
    public final int k;

    @sy3
    public static final /* synthetic */ class a implements sw5<l4b> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.ghostwriter.models.backend.ParsedJob", aVar, 11);
            pluginGeneratedSerialDescriptor.k("id", false);
            pluginGeneratedSerialDescriptor.k("indeed_job_key", false);
            pluginGeneratedSerialDescriptor.k("job_url", false);
            pluginGeneratedSerialDescriptor.k("job_title", false);
            pluginGeneratedSerialDescriptor.k("job_description", false);
            pluginGeneratedSerialDescriptor.k("job_location", false);
            pluginGeneratedSerialDescriptor.k("job_salary", false);
            pluginGeneratedSerialDescriptor.k("job_company", false);
            pluginGeneratedSerialDescriptor.k("parsing_status", false);
            pluginGeneratedSerialDescriptor.k("form_field_count", false);
            pluginGeneratedSerialDescriptor.k("field_group_count", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            mve mveVar = mve.a;
            KSerializer<?> kSerializerB = qp1.b(mveVar);
            rh7 rh7Var = rh7.a;
            return new KSerializer[]{mveVar, mveVar, mveVar, mveVar, mveVar, mveVar, kSerializerB, mveVar, mveVar, rh7Var, rh7Var};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            Object obj = null;
            boolean z = true;
            int i = 0;
            int iM = 0;
            int iM2 = 0;
            String strO = null;
            String strO2 = null;
            String strO3 = null;
            String strO4 = null;
            String strO5 = null;
            String strO6 = null;
            String str = null;
            String strO7 = null;
            String strO8 = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                switch (iP) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strO = ul2VarB.o(serialDescriptor, 0);
                        i |= 1;
                        break;
                    case 1:
                        strO2 = ul2VarB.o(serialDescriptor, 1);
                        i |= 2;
                        break;
                    case 2:
                        strO3 = ul2VarB.o(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        strO4 = ul2VarB.o(serialDescriptor, 3);
                        i |= 8;
                        break;
                    case 4:
                        strO5 = ul2VarB.o(serialDescriptor, 4);
                        i |= 16;
                        break;
                    case 5:
                        strO6 = ul2VarB.o(serialDescriptor, 5);
                        i |= 32;
                        break;
                    case 6:
                        str = (String) ul2VarB.h(serialDescriptor, 6, mve.a, str);
                        i |= 64;
                        break;
                    case 7:
                        strO7 = ul2VarB.o(serialDescriptor, 7);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        continue;
                    case 8:
                        strO8 = ul2VarB.o(serialDescriptor, 8);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        continue;
                    case DatadogLogGenerator.CRASH /* 9 */:
                        iM = ul2VarB.m(serialDescriptor, 9);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        continue;
                    case 10:
                        iM2 = ul2VarB.m(serialDescriptor, 10);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        continue;
                    default:
                        b0.m(iP);
                        return obj;
                }
                obj = null;
            }
            ul2VarB.c(serialDescriptor);
            return new l4b(i, strO, strO2, strO3, strO4, strO5, strO6, str, strO7, strO8, iM, iM2);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            l4b l4bVar = (l4b) obj;
            l4bVar.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            vl2VarB.x(serialDescriptor, 0, l4bVar.a);
            vl2VarB.x(serialDescriptor, 1, l4bVar.b);
            vl2VarB.x(serialDescriptor, 2, l4bVar.c);
            vl2VarB.x(serialDescriptor, 3, l4bVar.d);
            vl2VarB.x(serialDescriptor, 4, l4bVar.e);
            vl2VarB.x(serialDescriptor, 5, l4bVar.f);
            vl2VarB.k(serialDescriptor, 6, mve.a, l4bVar.g);
            vl2VarB.x(serialDescriptor, 7, l4bVar.h);
            vl2VarB.x(serialDescriptor, 8, l4bVar.i);
            vl2VarB.r(9, l4bVar.j, serialDescriptor);
            vl2VarB.r(10, l4bVar.k, serialDescriptor);
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<l4b> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ l4b(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i2, int i3) {
        if (2047 != (i & 2047)) {
            ewa.M(i, 2047, a.a.get$$serialDesc());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = i2;
        this.k = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4b)) {
            return false;
        }
        l4b l4bVar = (l4b) obj;
        return wl7.b(this.a, l4bVar.a) && wl7.b(this.b, l4bVar.b) && wl7.b(this.c, l4bVar.c) && wl7.b(this.d, l4bVar.d) && wl7.b(this.e, l4bVar.e) && wl7.b(this.f, l4bVar.f) && wl7.b(this.g, l4bVar.g) && wl7.b(this.h, l4bVar.h) && wl7.b(this.i, l4bVar.i) && this.j == l4bVar.j && this.k == l4bVar.k;
    }

    public final int hashCode() {
        int iD = akb.d(akb.d(akb.d(akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        return Integer.hashCode(this.k) + w40.c(this.j, akb.d(akb.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.h), 31, this.i), 31);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("ParsedJob(id=", this.a, ", indeed_job_key=", this.b, ", job_url=");
        ia.r(sbF, this.c, ", job_title=", this.d, ", job_description=");
        ia.r(sbF, this.e, ", job_location=", this.f, ", job_salary=");
        ia.r(sbF, this.g, ", job_company=", this.h, ", parsing_status=");
        sbF.append(this.i);
        sbF.append(", form_field_count=");
        sbF.append(this.j);
        sbF.append(", field_group_count=");
        return w20.k(sbF, this.k, ")");
    }
}
