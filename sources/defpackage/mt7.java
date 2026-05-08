package defpackage;

import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public abstract class mt7 {
    public static final a Companion = new a();
    public static final Lazy<KSerializer<Object>> a = boa.E(qt8.b, new kr(8));

    public static final class a {
        public final KSerializer<mt7> serializer() {
            return (KSerializer) mt7.a.getValue();
        }
    }

    @o7e
    public static final class b extends mt7 {
        public static final C0324b Companion = new C0324b();
        public final String b;

        @sy3
        public static final /* synthetic */ class a implements sw5<b> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("Url", aVar, 1);
                pluginGeneratedSerialDescriptor.k("url", false);
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
                return new b(i, strO);
            }

            @Override // defpackage.r7e, defpackage.i04
            /* JADX INFO: renamed from: getDescriptor */
            public final SerialDescriptor get$$serialDesc() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                b bVar = (b) obj;
                bVar.getClass();
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                vl2VarB.x(serialDescriptor, 0, bVar.b);
                vl2VarB.c(serialDescriptor);
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] typeParametersSerializers() {
                return ypd.V;
            }
        }

        /* JADX INFO: renamed from: mt7$b$b, reason: collision with other inner class name */
        public static final class C0324b {
            public final KSerializer<b> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ b(int i, String str) {
            if (1 == (i & 1)) {
                this.b = str;
            } else {
                ewa.M(i, 1, a.a.get$$serialDesc());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && wl7.b(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return l5.m("Url(url=", this.b, ")");
        }

        public b(String str) {
            str.getClass();
            this.b = str;
        }
    }
}
