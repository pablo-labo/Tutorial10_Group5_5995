package defpackage;

import defpackage.nz;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@o7e
public final class l0b {
    public static final b Companion = new b();
    public final String a;
    public final nz b;

    @sy3
    public static final /* synthetic */ class a implements sw5<l0b> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.messaging.api.messaging.logging.PageLoadLogPayload", aVar, 2);
            pluginGeneratedSerialDescriptor.k("pageLoadTk", false);
            pluginGeneratedSerialDescriptor.k("additionalParams", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{mve.a, nz.a.a};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            boolean z = true;
            int i = 0;
            String strO = null;
            nz nzVar = null;
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
                    nzVar = (nz) ul2VarB.z(serialDescriptor, 1, nz.a.a, nzVar);
                    i |= 2;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new l0b(i, strO, nzVar);
        }

        @Override // defpackage.r7e, defpackage.i04
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            l0b l0bVar = (l0b) obj;
            l0bVar.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            vl2VarB.x(serialDescriptor, 0, l0bVar.a);
            vl2VarB.y(serialDescriptor, 1, nz.a.a, l0bVar.b);
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<l0b> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ l0b(int i, String str, nz nzVar) {
        if (3 != (i & 3)) {
            ewa.M(i, 3, a.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = nzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0b)) {
            return false;
        }
        l0b l0bVar = (l0b) obj;
        return wl7.b(this.a, l0bVar.a) && wl7.b(this.b, l0bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PageLoadLogPayload(pageLoadTk=" + this.a + ", additionalParams=" + this.b + ")";
    }

    public l0b(String str, nz nzVar) {
        str.getClass();
        this.a = str;
        this.b = nzVar;
    }
}
