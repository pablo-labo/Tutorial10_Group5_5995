package defpackage;

import defpackage.dad;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public final class yn2 {
    public static final b Companion = new b();
    public final dad a;

    @sy3
    public /* synthetic */ class a implements sw5<yn2> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.realtimemessaging.models.ConfigData", aVar, 1);
            pluginGeneratedSerialDescriptor.k("retryConfig", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{qp1.b(dad.a.a)};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            boolean z = true;
            int i = 0;
            dad dadVar = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                if (iP == -1) {
                    z = false;
                } else {
                    if (iP != 0) {
                        b0.m(iP);
                        return null;
                    }
                    dadVar = (dad) ul2VarB.h(serialDescriptor, 0, dad.a.a, dadVar);
                    i = 1;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new yn2(i, dadVar);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            yn2 yn2Var = (yn2) obj;
            yn2Var.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            vl2VarB.k(serialDescriptor, 0, dad.a.a, yn2Var.a);
            vl2VarB.c(serialDescriptor);
        }
    }

    public static final class b {
        public final KSerializer<yn2> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ yn2(int i, dad dadVar) {
        if (1 == (i & 1)) {
            this.a = dadVar;
        } else {
            ewa.M(i, 1, a.a.get$$serialDesc());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yn2) && wl7.b(this.a, ((yn2) obj).a);
    }

    public final int hashCode() {
        dad dadVar = this.a;
        if (dadVar == null) {
            return 0;
        }
        return dadVar.hashCode();
    }

    public final String toString() {
        return "ConfigData(retryConfig=" + this.a + ")";
    }
}
