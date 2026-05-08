package defpackage;

import com.datadog.android.rum.internal.domain.event.RumEventDeserializer;
import defpackage.nz;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@o7e
public final class xig {
    public static final b Companion = new b();
    public static final Lazy<KSerializer<Object>>[] f;
    public final String a;
    public final p7 b;
    public final ho7 c;
    public final String d;
    public final nz e;

    @sy3
    public static final /* synthetic */ class a implements sw5<xig> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.messaging.api.messaging.logging.UserActionLogPayload", aVar, 5);
            pluginGeneratedSerialDescriptor.k("pageLoadTk", false);
            pluginGeneratedSerialDescriptor.k(RumEventDeserializer.EVENT_TYPE_ACTION, false);
            pluginGeneratedSerialDescriptor.k("itemType", false);
            pluginGeneratedSerialDescriptor.k("itemUid", false);
            pluginGeneratedSerialDescriptor.k("additionalParams", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = xig.f;
            mve mveVar = mve.a;
            return new KSerializer[]{mveVar, lazyArr[1].getValue(), lazyArr[2].getValue(), mveVar, nz.a.a};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = xig.f;
            boolean z = true;
            int i = 0;
            String strO = null;
            p7 p7Var = null;
            ho7 ho7Var = null;
            String strO2 = null;
            nz nzVar = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                if (iP == -1) {
                    z = false;
                } else if (iP == 0) {
                    strO = ul2VarB.o(serialDescriptor, 0);
                    i |= 1;
                } else if (iP == 1) {
                    p7Var = (p7) ul2VarB.z(serialDescriptor, 1, lazyArr[1].getValue(), p7Var);
                    i |= 2;
                } else if (iP == 2) {
                    ho7Var = (ho7) ul2VarB.z(serialDescriptor, 2, lazyArr[2].getValue(), ho7Var);
                    i |= 4;
                } else if (iP == 3) {
                    strO2 = ul2VarB.o(serialDescriptor, 3);
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
            return new xig(i, strO, p7Var, ho7Var, strO2, nzVar);
        }

        @Override // defpackage.r7e, defpackage.i04
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            xig xigVar = (xig) obj;
            xigVar.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = xig.f;
            vl2VarB.x(serialDescriptor, 0, xigVar.a);
            vl2VarB.y(serialDescriptor, 1, lazyArr[1].getValue(), xigVar.b);
            vl2VarB.y(serialDescriptor, 2, lazyArr[2].getValue(), xigVar.c);
            vl2VarB.x(serialDescriptor, 3, xigVar.d);
            vl2VarB.y(serialDescriptor, 4, nz.a.a, xigVar.e);
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<xig> serializer() {
            return a.a;
        }
    }

    static {
        j7 j7Var = new j7(18);
        qt8 qt8Var = qt8.b;
        f = new Lazy[]{null, boa.E(qt8Var, j7Var), boa.E(qt8Var, new l7(21)), null, null};
    }

    public /* synthetic */ xig(int i, String str, p7 p7Var, ho7 ho7Var, String str2, nz nzVar) {
        if (31 != (i & 31)) {
            ewa.M(i, 31, a.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = p7Var;
        this.c = ho7Var;
        this.d = str2;
        this.e = nzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xig)) {
            return false;
        }
        xig xigVar = (xig) obj;
        return wl7.b(this.a, xigVar.a) && this.b == xigVar.b && this.c == xigVar.c && wl7.b(this.d, xigVar.d) && wl7.b(this.e, xigVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + akb.d((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        return "UserActionLogPayload(pageLoadTk=" + this.a + ", action=" + this.b + ", itemType=" + this.c + ", itemUid=" + this.d + ", additionalParams=" + this.e + ")";
    }

    public xig(String str, p7 p7Var, String str2, nz nzVar) {
        ho7 ho7Var = ho7.b;
        str.getClass();
        this.a = str;
        this.b = p7Var;
        this.c = ho7Var;
        this.d = str2;
        this.e = nzVar;
    }
}
