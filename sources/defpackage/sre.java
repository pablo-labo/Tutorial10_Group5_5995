package defpackage;

import defpackage.ep0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@o7e
public final class sre {
    public static final b Companion = new b();
    public final String a;
    public final String b;
    public final ep0 c;

    @sy3
    public static final /* synthetic */ class a implements sw5<sre> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.ghostwriter.models.backend.StartScheduleApplyResponse", aVar, 3);
            pluginGeneratedSerialDescriptor.k("status", false);
            pluginGeneratedSerialDescriptor.k("message", false);
            pluginGeneratedSerialDescriptor.k("application", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            mve mveVar = mve.a;
            return new KSerializer[]{mveVar, mveVar, ep0.a.a};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            boolean z = true;
            int i = 0;
            String strO = null;
            String strO2 = null;
            ep0 ep0Var = null;
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
                } else {
                    if (iP != 2) {
                        b0.m(iP);
                        return null;
                    }
                    ep0Var = (ep0) ul2VarB.z(serialDescriptor, 2, ep0.a.a, ep0Var);
                    i |= 4;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new sre(i, strO, strO2, ep0Var);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            sre sreVar = (sre) obj;
            sreVar.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            vl2VarB.x(serialDescriptor, 0, sreVar.a);
            vl2VarB.x(serialDescriptor, 1, sreVar.b);
            vl2VarB.y(serialDescriptor, 2, ep0.a.a, sreVar.c);
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<sre> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ sre(int i, String str, String str2, ep0 ep0Var) {
        if (7 != (i & 7)) {
            ewa.M(i, 7, a.a.get$$serialDesc());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = ep0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sre)) {
            return false;
        }
        sre sreVar = (sre) obj;
        return wl7.b(this.a, sreVar.a) && wl7.b(this.b, sreVar.b) && wl7.b(this.c, sreVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + akb.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("StartScheduleApplyResponse(status=", this.a, ", message=", this.b, ", application=");
        sbF.append(this.c);
        sbF.append(")");
        return sbF.toString();
    }
}
