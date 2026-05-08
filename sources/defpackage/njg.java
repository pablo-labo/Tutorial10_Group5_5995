package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@o7e
public final class njg {
    public static final b Companion = new b();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    @sy3
    public static final /* synthetic */ class a implements sw5<njg> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.ghostwriter.debug.models.UserPersonaWorkExperience", aVar, 6);
            pluginGeneratedSerialDescriptor.k("company", false);
            pluginGeneratedSerialDescriptor.k("location", false);
            pluginGeneratedSerialDescriptor.k("title", false);
            pluginGeneratedSerialDescriptor.k("dateStarted", false);
            pluginGeneratedSerialDescriptor.k("dateEnded", false);
            pluginGeneratedSerialDescriptor.k("description", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            mve mveVar = mve.a;
            return new KSerializer[]{mveVar, mveVar, mveVar, mveVar, qp1.b(mveVar), mveVar};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            boolean z = true;
            int i = 0;
            String strO = null;
            String strO2 = null;
            String strO3 = null;
            String strO4 = null;
            String str = null;
            String strO5 = null;
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
                        str = (String) ul2VarB.h(serialDescriptor, 4, mve.a, str);
                        i |= 16;
                        break;
                    case 5:
                        strO5 = ul2VarB.o(serialDescriptor, 5);
                        i |= 32;
                        break;
                    default:
                        b0.m(iP);
                        return null;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new njg(i, strO, strO2, strO3, strO4, str, strO5);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            njg njgVar = (njg) obj;
            njgVar.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            vl2VarB.x(serialDescriptor, 0, njgVar.a);
            vl2VarB.x(serialDescriptor, 1, njgVar.b);
            vl2VarB.x(serialDescriptor, 2, njgVar.c);
            vl2VarB.x(serialDescriptor, 3, njgVar.d);
            vl2VarB.k(serialDescriptor, 4, mve.a, njgVar.e);
            vl2VarB.x(serialDescriptor, 5, njgVar.f);
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<njg> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ njg(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        if (63 != (i & 63)) {
            ewa.M(i, 63, a.a.get$$serialDesc());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof njg)) {
            return false;
        }
        njg njgVar = (njg) obj;
        return wl7.b(this.a, njgVar.a) && wl7.b(this.b, njgVar.b) && wl7.b(this.c, njgVar.c) && wl7.b(this.d, njgVar.d) && wl7.b(this.e, njgVar.e) && wl7.b(this.f, njgVar.f);
    }

    public final int hashCode() {
        int iD = akb.d(akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return this.f.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("UserPersonaWorkExperience(company=", this.a, ", location=", this.b, ", title=");
        ia.r(sbF, this.c, ", dateStarted=", this.d, ", dateEnded=");
        return z3.n(sbF, this.e, ", description=", this.f, ")");
    }

    public njg(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }
}
