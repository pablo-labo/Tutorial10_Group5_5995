package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@o7e
public final class co0 {
    public static final b Companion = new b();
    public static final Lazy<KSerializer<Object>>[] j;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final o09 h;
    public final o09 i;

    @sy3
    public static final /* synthetic */ class a implements sw5<co0> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.ghostwriter.models.backend.ApplicationJob", aVar, 9);
            pluginGeneratedSerialDescriptor.k("id", false);
            pluginGeneratedSerialDescriptor.k("job_url", false);
            pluginGeneratedSerialDescriptor.k("job_title", false);
            pluginGeneratedSerialDescriptor.k("job_description", false);
            pluginGeneratedSerialDescriptor.k("job_location", false);
            pluginGeneratedSerialDescriptor.k("job_salary", false);
            pluginGeneratedSerialDescriptor.k("job_company", false);
            pluginGeneratedSerialDescriptor.k("created_at", false);
            pluginGeneratedSerialDescriptor.k("updated_at", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = co0.j;
            mve mveVar = mve.a;
            return new KSerializer[]{mveVar, mveVar, mveVar, mveVar, mveVar, qp1.b(mveVar), mveVar, lazyArr[7].getValue(), lazyArr[8].getValue()};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = co0.j;
            o09 o09Var = null;
            boolean z = true;
            o09 o09Var2 = null;
            int i = 0;
            String strO = null;
            String strO2 = null;
            String strO3 = null;
            String strO4 = null;
            String strO5 = null;
            String str = null;
            String strO6 = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                switch (iP) {
                    case -1:
                        z = false;
                        break;
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
                        str = (String) ul2VarB.h(serialDescriptor, 5, mve.a, str);
                        i |= 32;
                        break;
                    case 6:
                        strO6 = ul2VarB.o(serialDescriptor, 6);
                        i |= 64;
                        break;
                    case 7:
                        o09Var2 = (o09) ul2VarB.z(serialDescriptor, 7, lazyArr[7].getValue(), o09Var2);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        break;
                    case 8:
                        o09Var = (o09) ul2VarB.z(serialDescriptor, 8, lazyArr[8].getValue(), o09Var);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        break;
                    default:
                        b0.m(iP);
                        return null;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new co0(i, strO, strO2, strO3, strO4, strO5, str, strO6, o09Var2, o09Var);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            co0 co0Var = (co0) obj;
            co0Var.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = co0.j;
            vl2VarB.x(serialDescriptor, 0, co0Var.a);
            vl2VarB.x(serialDescriptor, 1, co0Var.b);
            vl2VarB.x(serialDescriptor, 2, co0Var.c);
            vl2VarB.x(serialDescriptor, 3, co0Var.d);
            vl2VarB.x(serialDescriptor, 4, co0Var.e);
            vl2VarB.k(serialDescriptor, 5, mve.a, co0Var.f);
            vl2VarB.x(serialDescriptor, 6, co0Var.g);
            vl2VarB.y(serialDescriptor, 7, lazyArr[7].getValue(), co0Var.h);
            vl2VarB.y(serialDescriptor, 8, lazyArr[8].getValue(), co0Var.i);
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<co0> serializer() {
            return a.a;
        }
    }

    static {
        ao0 ao0Var = new ao0(0);
        qt8 qt8Var = qt8.b;
        j = new Lazy[]{null, null, null, null, null, null, null, boa.E(qt8Var, ao0Var), boa.E(qt8Var, new bo0(0))};
    }

    public /* synthetic */ co0(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, o09 o09Var, o09 o09Var2) {
        if (511 != (i & 511)) {
            ewa.M(i, 511, a.a.get$$serialDesc());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = o09Var;
        this.i = o09Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co0)) {
            return false;
        }
        co0 co0Var = (co0) obj;
        return wl7.b(this.a, co0Var.a) && wl7.b(this.b, co0Var.b) && wl7.b(this.c, co0Var.c) && wl7.b(this.d, co0Var.d) && wl7.b(this.e, co0Var.e) && wl7.b(this.f, co0Var.f) && wl7.b(this.g, co0Var.g) && wl7.b(this.h, co0Var.h) && wl7.b(this.i, co0Var.i);
    }

    public final int hashCode() {
        int iD = akb.d(akb.d(akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return this.i.a.hashCode() + ((this.h.a.hashCode() + akb.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.g)) * 31);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("ApplicationJob(id=", this.a, ", job_url=", this.b, ", job_title=");
        ia.r(sbF, this.c, ", job_description=", this.d, ", job_location=");
        ia.r(sbF, this.e, ", job_salary=", this.f, ", job_company=");
        sbF.append(this.g);
        sbF.append(", created_at=");
        sbF.append(this.h);
        sbF.append(", updated_at=");
        sbF.append(this.i);
        sbF.append(")");
        return sbF.toString();
    }
}
