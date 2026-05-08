package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public final class hq7 {
    public static final b Companion = new b();
    public final String a;
    public final String b;

    @sy3
    public static final /* synthetic */ class a implements sw5<hq7> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.tare.nav.interviewprep.JSTInterviewPrepJobDetails", aVar, 2);
            pluginGeneratedSerialDescriptor.k("jobKey", true);
            pluginGeneratedSerialDescriptor.k("jobTitle", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            mve mveVar = mve.a;
            return new KSerializer[]{qp1.b(mveVar), qp1.b(mveVar)};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            boolean z = true;
            int i = 0;
            String str = null;
            String str2 = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                if (iP == -1) {
                    z = false;
                } else if (iP == 0) {
                    str = (String) ul2VarB.h(serialDescriptor, 0, mve.a, str);
                    i |= 1;
                } else {
                    if (iP != 1) {
                        b0.m(iP);
                        return null;
                    }
                    str2 = (String) ul2VarB.h(serialDescriptor, 1, mve.a, str2);
                    i |= 2;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new hq7(i, str, str2);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            hq7 hq7Var = (hq7) obj;
            hq7Var.getClass();
            String str = hq7Var.b;
            String str2 = hq7Var.a;
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            if (vl2VarB.m(serialDescriptor) || str2 != null) {
                vl2VarB.k(serialDescriptor, 0, mve.a, str2);
            }
            if (vl2VarB.m(serialDescriptor) || str != null) {
                vl2VarB.k(serialDescriptor, 1, mve.a, str);
            }
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<hq7> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ hq7(int i, String str, String str2) {
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hq7)) {
            return false;
        }
        hq7 hq7Var = (hq7) obj;
        return wl7.b(this.a, hq7Var.a) && wl7.b(this.b, hq7Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return akb.k("JSTInterviewPrepJobDetails(jobKey=", this.a, ", jobTitle=", this.b, ")");
    }

    public hq7() {
        this((String) null, 3);
    }

    public /* synthetic */ hq7(String str, int i) {
        this((i & 1) != 0 ? null : str, (String) null);
    }

    public hq7(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
