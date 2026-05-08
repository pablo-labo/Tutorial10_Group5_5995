package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.List;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@o7e
public final class pz0 {
    public static final b Companion = new b();
    public static final Lazy<KSerializer<Object>>[] i;
    public final List<String> a;
    public final boolean b;
    public final boolean c;
    public final List<waf> d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;

    @sy3
    public /* synthetic */ class a implements sw5<pz0> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.backendservices.autocomplete.data.AutoCompleteTaxonomyPayload", aVar, 8);
            pluginGeneratedSerialDescriptor.k("alternateLabels", false);
            pluginGeneratedSerialDescriptor.k("alternateSuggestion", false);
            pluginGeneratedSerialDescriptor.k("genericAttribute", false);
            pluginGeneratedSerialDescriptor.k("pathToRoot", false);
            pluginGeneratedSerialDescriptor.k("score", false);
            pluginGeneratedSerialDescriptor.k("suggestion", false);
            pluginGeneratedSerialDescriptor.k("suid", false);
            pluginGeneratedSerialDescriptor.k("uuid", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = pz0.i;
            ni1 ni1Var = ni1.a;
            mve mveVar = mve.a;
            return new KSerializer[]{lazyArr[0].getValue(), ni1Var, ni1Var, lazyArr[3].getValue(), rh7.a, mveVar, mveVar, mveVar};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = pz0.i;
            Object obj = null;
            boolean z = true;
            int i = 0;
            boolean zE = false;
            boolean zE2 = false;
            int iM = 0;
            List list = null;
            List list2 = null;
            String strO = null;
            String strO2 = null;
            String strO3 = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                switch (iP) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        list = (List) ul2VarB.z(serialDescriptor, 0, lazyArr[0].getValue(), list);
                        i |= 1;
                        break;
                    case 1:
                        zE = ul2VarB.E(serialDescriptor, 1);
                        i |= 2;
                        break;
                    case 2:
                        zE2 = ul2VarB.E(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        list2 = (List) ul2VarB.z(serialDescriptor, 3, lazyArr[3].getValue(), list2);
                        i |= 8;
                        break;
                    case 4:
                        iM = ul2VarB.m(serialDescriptor, 4);
                        i |= 16;
                        continue;
                    case 5:
                        strO = ul2VarB.o(serialDescriptor, 5);
                        i |= 32;
                        continue;
                    case 6:
                        strO2 = ul2VarB.o(serialDescriptor, 6);
                        i |= 64;
                        continue;
                    case 7:
                        strO3 = ul2VarB.o(serialDescriptor, 7);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        continue;
                    default:
                        b0.m(iP);
                        return obj;
                }
                obj = null;
            }
            ul2VarB.c(serialDescriptor);
            return new pz0(i, list, zE, zE2, list2, iM, strO, strO2, strO3);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            pz0 pz0Var = (pz0) obj;
            pz0Var.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = pz0.i;
            vl2VarB.y(serialDescriptor, 0, lazyArr[0].getValue(), pz0Var.a);
            vl2VarB.w(serialDescriptor, 1, pz0Var.b);
            vl2VarB.w(serialDescriptor, 2, pz0Var.c);
            vl2VarB.y(serialDescriptor, 3, lazyArr[3].getValue(), pz0Var.d);
            vl2VarB.r(4, pz0Var.e, serialDescriptor);
            vl2VarB.x(serialDescriptor, 5, pz0Var.f);
            vl2VarB.x(serialDescriptor, 6, pz0Var.g);
            vl2VarB.x(serialDescriptor, 7, pz0Var.h);
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<pz0> serializer() {
            return a.a;
        }
    }

    static {
        oz0 oz0Var = new oz0(0);
        qt8 qt8Var = qt8.b;
        i = new Lazy[]{boa.E(qt8Var, oz0Var), null, null, boa.E(qt8Var, new zr0(1)), null, null, null, null};
    }

    public /* synthetic */ pz0(int i2, List list, boolean z, boolean z2, List list2, int i3, String str, String str2, String str3) {
        if (255 != (i2 & 255)) {
            ewa.M(i2, 255, a.a.get$$serialDesc());
            throw null;
        }
        this.a = list;
        this.b = z;
        this.c = z2;
        this.d = list2;
        this.e = i3;
        this.f = str;
        this.g = str2;
        this.h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pz0)) {
            return false;
        }
        pz0 pz0Var = (pz0) obj;
        return wl7.b(this.a, pz0Var.a) && this.b == pz0Var.b && this.c == pz0Var.c && wl7.b(this.d, pz0Var.d) && this.e == pz0Var.e && wl7.b(this.f, pz0Var.f) && wl7.b(this.g, pz0Var.g) && wl7.b(this.h, pz0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + akb.d(akb.d(w40.c(this.e, ia.g(this.d, ia.f(ia.f(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoCompleteTaxonomyPayload(alternateLabels=");
        sb.append(this.a);
        sb.append(", alternateSuggestion=");
        sb.append(this.b);
        sb.append(", genericAttribute=");
        sb.append(this.c);
        sb.append(", pathToRoot=");
        sb.append(this.d);
        sb.append(", score=");
        sb.append(this.e);
        sb.append(", suggestion=");
        sb.append(this.f);
        sb.append(", suid=");
        return z3.n(sb, this.g, ", uuid=", this.h, ")");
    }
}
