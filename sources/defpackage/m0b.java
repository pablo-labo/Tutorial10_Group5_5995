package defpackage;

import defpackage.oz;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public final class m0b {
    public static final b Companion = new b();
    public final String a;
    public final oz b;

    @sy3
    public static final /* synthetic */ class a implements sw5<m0b> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.rnmessaging.api.logging.PageLoadLogPayload", aVar, 2);
            pluginGeneratedSerialDescriptor.k("pageLoadTk", false);
            pluginGeneratedSerialDescriptor.k("additionalParams", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{mve.a, oz.a.a};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            boolean z = true;
            int i = 0;
            String strO = null;
            oz ozVar = null;
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
                    ozVar = (oz) ul2VarB.z(serialDescriptor, 1, oz.a.a, ozVar);
                    i |= 2;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new m0b(i, strO, ozVar);
        }

        @Override // defpackage.r7e, defpackage.i04
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            m0b m0bVar = (m0b) obj;
            m0bVar.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            vl2VarB.x(serialDescriptor, 0, m0bVar.a);
            vl2VarB.y(serialDescriptor, 1, oz.a.a, m0bVar.b);
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<m0b> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ m0b(int i, String str, oz ozVar) {
        if (3 != (i & 3)) {
            ewa.M(i, 3, a.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = ozVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0b)) {
            return false;
        }
        m0b m0bVar = (m0b) obj;
        return wl7.b(this.a, m0bVar.a) && wl7.b(this.b, m0bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PageLoadLogPayload(pageLoadTk=" + this.a + ", additionalParams=" + this.b + ")";
    }

    public m0b(String str, oz ozVar) {
        str.getClass();
        ozVar.getClass();
        this.a = str;
        this.b = ozVar;
    }
}
