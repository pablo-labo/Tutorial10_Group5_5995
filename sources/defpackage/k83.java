package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public final class k83 {
    public static final b Companion = new b();
    public final String a;

    @sy3
    public static final /* synthetic */ class a implements sw5<k83> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.wlproctor.loader.jsonmodels.CtkResultsModel", aVar, 1);
            pluginGeneratedSerialDescriptor.k("ctk", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{mve.a};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            boolean z = true;
            int i = 0;
            String strO = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                if (iP == -1) {
                    z = false;
                } else {
                    if (iP != 0) {
                        b0.m(iP);
                        return null;
                    }
                    strO = ul2VarB.o(serialDescriptor, 0);
                    i = 1;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new k83(i, strO);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            k83 k83Var = (k83) obj;
            k83Var.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            vl2VarB.x(serialDescriptor, 0, k83Var.a);
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<k83> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ k83(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            ewa.M(i, 1, a.a.get$$serialDesc());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k83) && wl7.b(this.a, ((k83) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return l5.m("CtkResultsModel(ctk=", this.a, ")");
    }

    public k83(String str) {
        this.a = str;
    }
}
