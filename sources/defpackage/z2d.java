package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public final class z2d {
    public static final b Companion = new b();
    public final String a;
    public final String b;

    @sy3
    public static final /* synthetic */ class a implements sw5<z2d> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.rnmessaging.api.ReportSpamPayload", aVar, 2);
            pluginGeneratedSerialDescriptor.k("reportType", false);
            pluginGeneratedSerialDescriptor.k("reportDetails", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            mve mveVar = mve.a;
            return new KSerializer[]{mveVar, mveVar};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            boolean z = true;
            int i = 0;
            String strO = null;
            String strO2 = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                if (iP == -1) {
                    z = false;
                } else if (iP == 0) {
                    strO = ul2VarB.o(serialDescriptor, 0);
                    i |= 1;
                } else {
                    if (iP != 1) {
                        b0.m(iP);
                        return null;
                    }
                    strO2 = ul2VarB.o(serialDescriptor, 1);
                    i |= 2;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new z2d(i, strO, strO2);
        }

        @Override // defpackage.r7e, defpackage.i04
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            z2d z2dVar = (z2d) obj;
            z2dVar.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            String str = z2dVar.a;
            String str2 = z2dVar.b;
            vl2VarB.x(serialDescriptor, 0, str);
            if (vl2VarB.m(serialDescriptor) || !wl7.b(str2, "")) {
                vl2VarB.x(serialDescriptor, 1, str2);
            }
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<z2d> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ z2d(int i, String str, String str2) {
        if (1 != (i & 1)) {
            ewa.M(i, 1, a.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2d)) {
            return false;
        }
        z2d z2dVar = (z2d) obj;
        return wl7.b(this.a, z2dVar.a) && wl7.b(this.b, z2dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return akb.k("ReportSpamPayload(reportType=", this.a, ", reportDetails=", this.b, ")");
    }

    public z2d(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }
}
