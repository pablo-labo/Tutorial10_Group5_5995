package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@o7e
public final class waf {
    public static final b Companion = new b();
    public final String a;
    public final String b;
    public final String c;

    @sy3
    public /* synthetic */ class a implements sw5<waf> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.backendservices.autocomplete.data.TaxonomyClassificationPathElement", aVar, 3);
            pluginGeneratedSerialDescriptor.k("label", false);
            pluginGeneratedSerialDescriptor.k("suid", false);
            pluginGeneratedSerialDescriptor.k("uuid", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            mve mveVar = mve.a;
            return new KSerializer[]{mveVar, mveVar, mveVar};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            boolean z = true;
            int i = 0;
            String strO = null;
            String strO2 = null;
            String strO3 = null;
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
                    strO3 = ul2VarB.o(serialDescriptor, 2);
                    i |= 4;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new waf(i, strO, strO2, strO3);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            waf wafVar = (waf) obj;
            wafVar.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            vl2VarB.x(serialDescriptor, 0, wafVar.a);
            vl2VarB.x(serialDescriptor, 1, wafVar.b);
            vl2VarB.x(serialDescriptor, 2, wafVar.c);
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<waf> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ waf(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            ewa.M(i, 7, a.a.get$$serialDesc());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof waf)) {
            return false;
        }
        waf wafVar = (waf) obj;
        return wl7.b(this.a, wafVar.a) && wl7.b(this.b, wafVar.b) && wl7.b(this.c, wafVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + akb.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return l6.i(u40.f("TaxonomyClassificationPathElement(label=", this.a, ", suid=", this.b, ", uuid="), this.c, ")");
    }
}
