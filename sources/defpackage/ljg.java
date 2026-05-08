package defpackage;

import java.util.List;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@o7e
public final class ljg {
    public static final b Companion = new b();
    public static final Lazy<KSerializer<Object>>[] h;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List<String> f;
    public final List<njg> g;

    @sy3
    public static final /* synthetic */ class a implements sw5<ljg> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.ghostwriter.debug.models.UserPersona", aVar, 7);
            pluginGeneratedSerialDescriptor.k("firstName", false);
            pluginGeneratedSerialDescriptor.k("lastName", false);
            pluginGeneratedSerialDescriptor.k("location", false);
            pluginGeneratedSerialDescriptor.k("jobTitle", false);
            pluginGeneratedSerialDescriptor.k("phoneNumber", false);
            pluginGeneratedSerialDescriptor.k("skills", false);
            pluginGeneratedSerialDescriptor.k("workExperience", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = ljg.h;
            mve mveVar = mve.a;
            return new KSerializer[]{mveVar, mveVar, mveVar, mveVar, mveVar, lazyArr[5].getValue(), lazyArr[6].getValue()};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = ljg.h;
            Object obj = null;
            boolean z = true;
            int i = 0;
            String strO = null;
            String strO2 = null;
            String strO3 = null;
            String strO4 = null;
            String strO5 = null;
            List list = null;
            List list2 = null;
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
                        list = (List) ul2VarB.z(serialDescriptor, 5, lazyArr[5].getValue(), list);
                        i |= 32;
                        break;
                    case 6:
                        list2 = (List) ul2VarB.z(serialDescriptor, 6, lazyArr[6].getValue(), list2);
                        i |= 64;
                        break;
                    default:
                        b0.m(iP);
                        return obj;
                }
                obj = null;
            }
            ul2VarB.c(serialDescriptor);
            return new ljg(i, strO, strO2, strO3, strO4, strO5, list, list2);
        }

        @Override // defpackage.r7e, defpackage.i04
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            ljg ljgVar = (ljg) obj;
            ljgVar.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = ljg.h;
            vl2VarB.x(serialDescriptor, 0, ljgVar.a);
            vl2VarB.x(serialDescriptor, 1, ljgVar.b);
            vl2VarB.x(serialDescriptor, 2, ljgVar.c);
            vl2VarB.x(serialDescriptor, 3, ljgVar.d);
            vl2VarB.x(serialDescriptor, 4, ljgVar.e);
            vl2VarB.y(serialDescriptor, 5, lazyArr[5].getValue(), ljgVar.f);
            vl2VarB.y(serialDescriptor, 6, lazyArr[6].getValue(), ljgVar.g);
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<ljg> serializer() {
            return a.a;
        }
    }

    static {
        mz mzVar = new mz(18);
        qt8 qt8Var = qt8.b;
        h = new Lazy[]{null, null, null, null, null, boa.E(qt8Var, mzVar), boa.E(qt8Var, new cp0(20))};
    }

    public /* synthetic */ ljg(int i, String str, String str2, String str3, String str4, String str5, List list, List list2) {
        if (127 != (i & 127)) {
            ewa.M(i, 127, a.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = list;
        this.g = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ljg)) {
            return false;
        }
        ljg ljgVar = (ljg) obj;
        return wl7.b(this.a, ljgVar.a) && wl7.b(this.b, ljgVar.b) && wl7.b(this.c, ljgVar.c) && wl7.b(this.d, ljgVar.d) && wl7.b(this.e, ljgVar.e) && wl7.b(this.f, ljgVar.f) && wl7.b(this.g, ljgVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ia.g(this.f, akb.d(akb.d(akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("UserPersona(firstName=", this.a, ", lastName=", this.b, ", location=");
        ia.r(sbF, this.c, ", jobTitle=", this.d, ", phoneNumber=");
        sbF.append(this.e);
        sbF.append(", skills=");
        sbF.append(this.f);
        sbF.append(", workExperience=");
        return g7.i(sbF, this.g, ")");
    }

    public ljg(String str, String str2, String str3, String str4, String str5, List<String> list, List<njg> list2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = list;
        this.g = list2;
    }
}
