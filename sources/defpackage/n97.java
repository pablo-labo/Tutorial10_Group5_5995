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
public final class n97 {
    public static final b Companion = new b();
    public static final Lazy<KSerializer<Object>>[] f;
    public final String a;
    public final String b;
    public final String c;
    public final List<String> d;
    public final List<String> e;

    @sy3
    public static final /* synthetic */ class a implements sw5<n97> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.jobsearch.countryselector.IndeedSupportedCountry", aVar, 5);
            pluginGeneratedSerialDescriptor.k("countryCode", false);
            pluginGeneratedSerialDescriptor.k("countryName", false);
            pluginGeneratedSerialDescriptor.k("baseUrl", false);
            pluginGeneratedSerialDescriptor.k("supportedLanguageCodes", true);
            pluginGeneratedSerialDescriptor.k("supportedLanguages", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = n97.f;
            mve mveVar = mve.a;
            return new KSerializer[]{mveVar, mveVar, mveVar, lazyArr[3].getValue(), lazyArr[4].getValue()};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = n97.f;
            boolean z = true;
            int i = 0;
            String strO = null;
            String strO2 = null;
            String strO3 = null;
            List list = null;
            List list2 = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                if (iP == -1) {
                    z = false;
                } else if (iP == 0) {
                    strO = ul2VarB.o(serialDescriptor, 0);
                    i |= 1;
                } else if (iP == 1) {
                    strO2 = ul2VarB.o(serialDescriptor, 1);
                    i |= 2;
                } else if (iP == 2) {
                    strO3 = ul2VarB.o(serialDescriptor, 2);
                    i |= 4;
                } else if (iP == 3) {
                    list = (List) ul2VarB.z(serialDescriptor, 3, lazyArr[3].getValue(), list);
                    i |= 8;
                } else {
                    if (iP != 4) {
                        b0.m(iP);
                        return null;
                    }
                    list2 = (List) ul2VarB.z(serialDescriptor, 4, lazyArr[4].getValue(), list2);
                    i |= 16;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new n97(i, strO, strO2, strO3, list, list2);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            n97 n97Var = (n97) obj;
            n97Var.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = n97.f;
            String str = n97Var.a;
            List<String> list = n97Var.e;
            List<String> list2 = n97Var.d;
            vl2VarB.x(serialDescriptor, 0, str);
            vl2VarB.x(serialDescriptor, 1, n97Var.b);
            vl2VarB.x(serialDescriptor, 2, n97Var.c);
            boolean zM = vl2VarB.m(serialDescriptor);
            zr4 zr4Var = zr4.a;
            if (zM || !wl7.b(list2, zr4Var)) {
                vl2VarB.y(serialDescriptor, 3, lazyArr[3].getValue(), list2);
            }
            if (vl2VarB.m(serialDescriptor) || !wl7.b(list, zr4Var)) {
                vl2VarB.y(serialDescriptor, 4, lazyArr[4].getValue(), list);
            }
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<n97> serializer() {
            return a.a;
        }
    }

    static {
        mz mzVar = new mz(5);
        qt8 qt8Var = qt8.b;
        f = new Lazy[]{null, null, null, boa.E(qt8Var, mzVar), boa.E(qt8Var, new cp0(6))};
    }

    public /* synthetic */ n97(int i, String str, String str2, String str3, List list, List list2) {
        if (7 != (i & 7)) {
            ewa.M(i, 7, a.a.get$$serialDesc());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        int i2 = i & 8;
        zr4 zr4Var = zr4.a;
        if (i2 == 0) {
            this.d = zr4Var;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = zr4Var;
        } else {
            this.e = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n97)) {
            return false;
        }
        n97 n97Var = (n97) obj;
        return wl7.b(this.a, n97Var.a) && wl7.b(this.b, n97Var.b) && wl7.b(this.c, n97Var.c) && wl7.b(this.d, n97Var.d) && wl7.b(this.e, n97Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ia.g(this.d, akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("IndeedSupportedCountry(countryCode=", this.a, ", countryName=", this.b, ", baseUrl=");
        sbF.append(this.c);
        sbF.append(", supportedLanguageCodes=");
        sbF.append(this.d);
        sbF.append(", supportedLanguages=");
        return g7.i(sbF, this.e, ")");
    }

    public n97(List list, List list2, String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }
}
