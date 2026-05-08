package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@o7e
public final class rha {
    public static final b Companion = new b();
    public final String a;
    public final String b;

    @sy3
    public static final /* synthetic */ class a implements sw5<rha> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.messaging.utils.NewMessagePayload", aVar, 2);
            pluginGeneratedSerialDescriptor.k("eventId", false);
            pluginGeneratedSerialDescriptor.k("conversationId", false);
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
            return new rha(i, strO, strO2);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            rha rhaVar = (rha) obj;
            rhaVar.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            vl2VarB.x(serialDescriptor, 0, rhaVar.a);
            vl2VarB.x(serialDescriptor, 1, rhaVar.b);
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<rha> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ rha(int i, String str, String str2) {
        if (3 != (i & 3)) {
            ewa.M(i, 3, a.a.get$$serialDesc());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rha)) {
            return false;
        }
        rha rhaVar = (rha) obj;
        return wl7.b(this.a, rhaVar.a) && wl7.b(this.b, rhaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return akb.k("NewMessagePayload(eventId=", this.a, ", conversationId=", this.b, ")");
    }
}
