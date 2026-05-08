package defpackage;

import java.util.Map;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public final class k77 extends d4f {
    public static final b Companion = new b();
    public static final Lazy<KSerializer<Object>>[] k;
    public final Map<String, String> i;
    public final d4f j;

    @sy3
    public static final /* synthetic */ class a implements sw5<k77> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("indeedApplyInterviewButton", aVar, 7);
            pluginGeneratedSerialDescriptor.k("accessibilityLabel", true);
            pluginGeneratedSerialDescriptor.k("accessibilityHide", true);
            pluginGeneratedSerialDescriptor.k("accessibilityRole", true);
            pluginGeneratedSerialDescriptor.k("impressionLogName", true);
            pluginGeneratedSerialDescriptor.k("clickLogName", true);
            pluginGeneratedSerialDescriptor.k("buttonParams", false);
            pluginGeneratedSerialDescriptor.k("content", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = k77.k;
            mve mveVar = mve.a;
            return new KSerializer[]{qp1.b(mveVar), qp1.b(ni1.a), qp1.b(mveVar), qp1.b(mveVar), qp1.b(mveVar), lazyArr[5].getValue(), qp1.b(lazyArr[6].getValue())};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = k77.k;
            Object obj = null;
            boolean z = true;
            int i = 0;
            String str = null;
            Boolean bool = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Map map = null;
            d4f d4fVar = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                switch (iP) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        str = (String) ul2VarB.h(serialDescriptor, 0, mve.a, str);
                        i |= 1;
                        break;
                    case 1:
                        bool = (Boolean) ul2VarB.h(serialDescriptor, 1, ni1.a, bool);
                        i |= 2;
                        break;
                    case 2:
                        str2 = (String) ul2VarB.h(serialDescriptor, 2, mve.a, str2);
                        i |= 4;
                        break;
                    case 3:
                        str3 = (String) ul2VarB.h(serialDescriptor, 3, mve.a, str3);
                        i |= 8;
                        break;
                    case 4:
                        str4 = (String) ul2VarB.h(serialDescriptor, 4, mve.a, str4);
                        i |= 16;
                        break;
                    case 5:
                        map = (Map) ul2VarB.z(serialDescriptor, 5, lazyArr[5].getValue(), map);
                        i |= 32;
                        break;
                    case 6:
                        d4fVar = (d4f) ul2VarB.h(serialDescriptor, 6, lazyArr[6].getValue(), d4fVar);
                        i |= 64;
                        break;
                    default:
                        b0.m(iP);
                        return obj;
                }
                obj = null;
            }
            ul2VarB.c(serialDescriptor);
            return new k77(i, str, bool, str2, str3, str4, map, d4fVar);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            k77 k77Var = (k77) obj;
            k77Var.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            d4f.a(k77Var, vl2VarB, serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = k77.k;
            KSerializer<Object> value = lazyArr[5].getValue();
            Map<String, String> map = k77Var.i;
            d4f d4fVar = k77Var.j;
            vl2VarB.y(serialDescriptor, 5, value, map);
            if (vl2VarB.m(serialDescriptor) || d4fVar != null) {
                vl2VarB.k(serialDescriptor, 6, lazyArr[6].getValue(), d4fVar);
            }
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<k77> serializer() {
            return a.a;
        }
    }

    static {
        bo0 bo0Var = new bo0(9);
        qt8 qt8Var = qt8.b;
        k = new Lazy[]{null, null, null, null, null, boa.E(qt8Var, bo0Var), boa.E(qt8Var, new vm1(8))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k77(int i, String str, Boolean bool, String str2, String str3, String str4, Map map, d4f d4fVar) {
        super(i, str, bool, str2, str3, str4);
        if (32 != (i & 32)) {
            ewa.M(i, 32, a.a.get$$serialDesc());
            throw null;
        }
        this.i = map;
        if ((i & 64) == 0) {
            this.j = null;
        } else {
            this.j = d4fVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k77)) {
            return false;
        }
        k77 k77Var = (k77) obj;
        return wl7.b(this.i, k77Var.i) && wl7.b(this.j, k77Var.j);
    }

    public final int hashCode() {
        int iHashCode = this.i.hashCode() * 31;
        d4f d4fVar = this.j;
        return iHashCode + (d4fVar == null ? 0 : d4fVar.hashCode());
    }

    public final String toString() {
        return "IndeedApplyInterviewButtonComponent(buttonParams=" + this.i + ", content=" + this.j + ")";
    }
}
