package defpackage;

import defpackage.cad;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@o7e
public final class xn2 {
    public static final b Companion = new b();
    public final cad a;

    @sy3
    public static final /* synthetic */ class a implements sw5<xn2> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.messaging.utils.ConfigData", aVar, 1);
            pluginGeneratedSerialDescriptor.k("retryConfig", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{qp1.b(cad.a.a)};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            boolean z = true;
            int i = 0;
            cad cadVar = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                if (iP == -1) {
                    z = false;
                } else {
                    if (iP != 0) {
                        b0.m(iP);
                        return null;
                    }
                    cadVar = (cad) ul2VarB.h(serialDescriptor, 0, cad.a.a, cadVar);
                    i = 1;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new xn2(i, cadVar);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            xn2 xn2Var = (xn2) obj;
            xn2Var.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            vl2VarB.k(serialDescriptor, 0, cad.a.a, xn2Var.a);
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<xn2> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ xn2(int i, cad cadVar) {
        if (1 == (i & 1)) {
            this.a = cadVar;
        } else {
            ewa.M(i, 1, a.a.get$$serialDesc());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xn2) && wl7.b(this.a, ((xn2) obj).a);
    }

    public final int hashCode() {
        cad cadVar = this.a;
        if (cadVar == null) {
            return 0;
        }
        return cadVar.hashCode();
    }

    public final String toString() {
        return "ConfigData(retryConfig=" + this.a + ")";
    }
}
