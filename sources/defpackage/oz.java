package defpackage;

import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public final class oz {
    public static final b Companion = new b();
    public static final Lazy<KSerializer<Object>>[] f = {null, null, null, null, boa.E(qt8.b, new lz(0))};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final cs0 e;

    @sy3
    public static final /* synthetic */ class a implements sw5<oz> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.rnmessaging.api.logging.AdditionalParams", aVar, 5);
            pluginGeneratedSerialDescriptor.k("deviceId", true);
            pluginGeneratedSerialDescriptor.k("nativeAppVersion", true);
            pluginGeneratedSerialDescriptor.k("mobileAppProctorGrps", true);
            pluginGeneratedSerialDescriptor.k("from", true);
            pluginGeneratedSerialDescriptor.k("cause", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = oz.f;
            mve mveVar = mve.a;
            return new KSerializer[]{qp1.b(mveVar), qp1.b(mveVar), qp1.b(mveVar), qp1.b(mveVar), qp1.b(lazyArr[4].getValue())};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = oz.f;
            boolean z = true;
            int i = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            cs0 cs0Var = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                if (iP == -1) {
                    z = false;
                } else if (iP == 0) {
                    str = (String) ul2VarB.h(serialDescriptor, 0, mve.a, str);
                    i |= 1;
                } else if (iP == 1) {
                    str2 = (String) ul2VarB.h(serialDescriptor, 1, mve.a, str2);
                    i |= 2;
                } else if (iP == 2) {
                    str3 = (String) ul2VarB.h(serialDescriptor, 2, mve.a, str3);
                    i |= 4;
                } else if (iP == 3) {
                    str4 = (String) ul2VarB.h(serialDescriptor, 3, mve.a, str4);
                    i |= 8;
                } else {
                    if (iP != 4) {
                        b0.m(iP);
                        return null;
                    }
                    cs0Var = (cs0) ul2VarB.h(serialDescriptor, 4, lazyArr[4].getValue(), cs0Var);
                    i |= 16;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new oz(i, str, str2, str3, str4, cs0Var);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            oz ozVar = (oz) obj;
            ozVar.getClass();
            cs0 cs0Var = ozVar.e;
            String str = ozVar.d;
            String str2 = ozVar.c;
            String str3 = ozVar.b;
            String str4 = ozVar.a;
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = oz.f;
            if (vl2VarB.m(serialDescriptor) || str4 != null) {
                vl2VarB.k(serialDescriptor, 0, mve.a, str4);
            }
            if (vl2VarB.m(serialDescriptor) || str3 != null) {
                vl2VarB.k(serialDescriptor, 1, mve.a, str3);
            }
            if (vl2VarB.m(serialDescriptor) || str2 != null) {
                vl2VarB.k(serialDescriptor, 2, mve.a, str2);
            }
            if (vl2VarB.m(serialDescriptor) || str != null) {
                vl2VarB.k(serialDescriptor, 3, mve.a, str);
            }
            if (vl2VarB.m(serialDescriptor) || cs0Var != null) {
                vl2VarB.k(serialDescriptor, 4, lazyArr[4].getValue(), cs0Var);
            }
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<oz> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ oz(int i, String str, String str2, String str3, String str4, cs0 cs0Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = cs0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oz)) {
            return false;
        }
        oz ozVar = (oz) obj;
        return wl7.b(this.a, ozVar.a) && wl7.b(this.b, ozVar.b) && wl7.b(this.c, ozVar.c) && wl7.b(this.d, ozVar.d) && this.e == ozVar.e;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        cs0 cs0Var = this.e;
        return iHashCode4 + (cs0Var != null ? cs0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("AdditionalParams(deviceId=", this.a, ", nativeAppVersion=", this.b, ", mobileAppProctorGrps=");
        ia.r(sbF, this.c, ", from=", this.d, ", cause=");
        sbF.append(this.e);
        sbF.append(")");
        return sbF.toString();
    }

    public oz() {
        this(0);
    }

    public /* synthetic */ oz(int i) {
        this(null, null, null, null, null);
    }

    public oz(String str, String str2, String str3, String str4, cs0 cs0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = cs0Var;
    }
}
