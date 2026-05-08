package defpackage;

import defpackage.jo7;
import defpackage.nz;
import java.util.List;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@o7e
public final class m47 {
    public static final b Companion = new b();
    public static final Lazy<KSerializer<Object>>[] f;
    public final String a;
    public final ho7 b;
    public final List<String> c;
    public final jo7 d;
    public final nz e;

    @sy3
    public static final /* synthetic */ class a implements sw5<m47> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.messaging.api.messaging.logging.ImpressionLogPayload", aVar, 5);
            pluginGeneratedSerialDescriptor.k("pageLoadTk", false);
            pluginGeneratedSerialDescriptor.k("itemType", false);
            pluginGeneratedSerialDescriptor.k("itemUids", false);
            pluginGeneratedSerialDescriptor.k("itemsAttributes", false);
            pluginGeneratedSerialDescriptor.k("additionalParams", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = m47.f;
            return new KSerializer[]{mve.a, lazyArr[1].getValue(), lazyArr[2].getValue(), jo7.a.a, nz.a.a};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = m47.f;
            boolean z = true;
            int i = 0;
            String strO = null;
            ho7 ho7Var = null;
            List list = null;
            jo7 jo7Var = null;
            nz nzVar = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                if (iP == -1) {
                    z = false;
                } else if (iP == 0) {
                    strO = ul2VarB.o(serialDescriptor, 0);
                    i |= 1;
                } else if (iP == 1) {
                    ho7Var = (ho7) ul2VarB.z(serialDescriptor, 1, lazyArr[1].getValue(), ho7Var);
                    i |= 2;
                } else if (iP == 2) {
                    list = (List) ul2VarB.z(serialDescriptor, 2, lazyArr[2].getValue(), list);
                    i |= 4;
                } else if (iP == 3) {
                    jo7Var = (jo7) ul2VarB.z(serialDescriptor, 3, jo7.a.a, jo7Var);
                    i |= 8;
                } else {
                    if (iP != 4) {
                        b0.m(iP);
                        return null;
                    }
                    nzVar = (nz) ul2VarB.z(serialDescriptor, 4, nz.a.a, nzVar);
                    i |= 16;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new m47(i, strO, ho7Var, list, jo7Var, nzVar);
        }

        @Override // defpackage.r7e, defpackage.i04
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            m47 m47Var = (m47) obj;
            m47Var.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = m47.f;
            vl2VarB.x(serialDescriptor, 0, m47Var.a);
            vl2VarB.y(serialDescriptor, 1, lazyArr[1].getValue(), m47Var.b);
            vl2VarB.y(serialDescriptor, 2, lazyArr[2].getValue(), m47Var.c);
            vl2VarB.y(serialDescriptor, 3, jo7.a.a, m47Var.d);
            vl2VarB.y(serialDescriptor, 4, nz.a.a, m47Var.e);
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<m47> serializer() {
            return a.a;
        }
    }

    static {
        ym0 ym0Var = new ym0(7);
        qt8 qt8Var = qt8.b;
        f = new Lazy[]{null, boa.E(qt8Var, ym0Var), boa.E(qt8Var, new oz0(7)), null, null};
    }

    public /* synthetic */ m47(int i, String str, ho7 ho7Var, List list, jo7 jo7Var, nz nzVar) {
        if (31 != (i & 31)) {
            ewa.M(i, 31, a.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = ho7Var;
        this.c = list;
        this.d = jo7Var;
        this.e = nzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m47)) {
            return false;
        }
        m47 m47Var = (m47) obj;
        return wl7.b(this.a, m47Var.a) && this.b == m47Var.b && wl7.b(this.c, m47Var.c) && wl7.b(this.d, m47Var.d) && wl7.b(this.e, m47Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ia.g(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "ImpressionLogPayload(pageLoadTk=" + this.a + ", itemType=" + this.b + ", itemUids=" + this.c + ", itemsAttributes=" + this.d + ", additionalParams=" + this.e + ")";
    }

    public m47(String str, List list, jo7 jo7Var, nz nzVar) {
        ho7 ho7Var = ho7.b;
        str.getClass();
        this.a = str;
        this.b = ho7Var;
        this.c = list;
        this.d = jo7Var;
        this.e = nzVar;
    }
}
