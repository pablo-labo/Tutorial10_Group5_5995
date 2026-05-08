package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public final class oy7 extends d4f {
    public static final b Companion = new b();
    public final String i;
    public final String j;
    public final String k;

    @sy3
    public static final /* synthetic */ class a implements sw5<oy7> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("jobDetails", aVar, 8);
            pluginGeneratedSerialDescriptor.k("accessibilityLabel", true);
            pluginGeneratedSerialDescriptor.k("accessibilityHide", true);
            pluginGeneratedSerialDescriptor.k("accessibilityRole", true);
            pluginGeneratedSerialDescriptor.k("impressionLogName", true);
            pluginGeneratedSerialDescriptor.k("clickLogName", true);
            pluginGeneratedSerialDescriptor.k("company", false);
            pluginGeneratedSerialDescriptor.k("jobTitle", false);
            pluginGeneratedSerialDescriptor.k("location", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            mve mveVar = mve.a;
            return new KSerializer[]{qp1.b(mveVar), qp1.b(ni1.a), qp1.b(mveVar), qp1.b(mveVar), qp1.b(mveVar), mveVar, mveVar, qp1.b(mveVar)};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            Object obj = null;
            boolean z = true;
            int i = 0;
            String str = null;
            Boolean bool = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String strO = null;
            String strO2 = null;
            String str5 = null;
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
                        strO = ul2VarB.o(serialDescriptor, 5);
                        i |= 32;
                        break;
                    case 6:
                        strO2 = ul2VarB.o(serialDescriptor, 6);
                        i |= 64;
                        break;
                    case 7:
                        str5 = (String) ul2VarB.h(serialDescriptor, 7, mve.a, str5);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        break;
                    default:
                        b0.m(iP);
                        return obj;
                }
                obj = null;
            }
            ul2VarB.c(serialDescriptor);
            return new oy7(i, str, bool, str2, str3, str4, strO, strO2, str5);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            oy7 oy7Var = (oy7) obj;
            oy7Var.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            d4f.a(oy7Var, vl2VarB, serialDescriptor);
            String str = oy7Var.i;
            String str2 = oy7Var.k;
            vl2VarB.x(serialDescriptor, 5, str);
            vl2VarB.x(serialDescriptor, 6, oy7Var.j);
            if (vl2VarB.m(serialDescriptor) || str2 != null) {
                vl2VarB.k(serialDescriptor, 7, mve.a, str2);
            }
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<oy7> serializer() {
            return a.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oy7(int i, String str, Boolean bool, String str2, String str3, String str4, String str5, String str6, String str7) {
        super(i, str, bool, str2, str3, str4);
        if (96 != (i & 96)) {
            ewa.M(i, 96, a.a.get$$serialDesc());
            throw null;
        }
        this.i = str5;
        this.j = str6;
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
            this.k = null;
        } else {
            this.k = str7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oy7)) {
            return false;
        }
        oy7 oy7Var = (oy7) obj;
        return wl7.b(this.i, oy7Var.i) && wl7.b(this.j, oy7Var.j) && wl7.b(this.k, oy7Var.k);
    }

    public final int hashCode() {
        int iD = akb.d(this.i.hashCode() * 31, 31, this.j);
        String str = this.k;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return l6.i(u40.f("JobDetailsComponent(company=", this.i, ", jobTitle=", this.j, ", location="), this.k, ")");
    }
}
