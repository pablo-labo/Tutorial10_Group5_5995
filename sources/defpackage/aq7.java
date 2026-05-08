package defpackage;

import java.util.List;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public final class aq7 {
    public static final b Companion = new b();
    public static final Lazy<KSerializer<Object>>[] b = {boa.E(qt8.b, new k7(7))};
    public final List<du4> a;

    @sy3
    public static final /* synthetic */ class a implements sw5<aq7> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.tare.logging.JSTEventMetadata", aVar, 1);
            pluginGeneratedSerialDescriptor.k("enrichableFields", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{aq7.b[0].getValue()};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = aq7.b;
            boolean z = true;
            int i = 0;
            List list = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                if (iP == -1) {
                    z = false;
                } else {
                    if (iP != 0) {
                        b0.m(iP);
                        return null;
                    }
                    list = (List) ul2VarB.z(serialDescriptor, 0, lazyArr[0].getValue(), list);
                    i = 1;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new aq7(i, list);
        }

        @Override // defpackage.r7e, defpackage.i04
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            aq7 aq7Var = (aq7) obj;
            aq7Var.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            vl2VarB.y(serialDescriptor, 0, aq7.b[0].getValue(), aq7Var.a);
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<aq7> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ aq7(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            ewa.M(i, 1, a.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aq7) && wl7.b(this.a, ((aq7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return g7.h("JSTEventMetadata(enrichableFields=", ")", this.a);
    }
}
