package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public final class jhb {
    public static final b Companion = new b();
    public final String a;
    public final String b;
    public final String c;

    @sy3
    public static final /* synthetic */ class a implements sw5<jhb> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.tare.nav.PostApplyInfo", aVar, 3);
            pluginGeneratedSerialDescriptor.k("postApplyUrl", true);
            pluginGeneratedSerialDescriptor.k("postApplyConfirmMessage", true);
            pluginGeneratedSerialDescriptor.k("postApplyConfirmUrl", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            mve mveVar = mve.a;
            return new KSerializer[]{qp1.b(mveVar), qp1.b(mveVar), qp1.b(mveVar)};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            boolean z = true;
            int i = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                if (iP == -1) {
                    z = false;
                } else if (iP == 0) {
                    str = (String) ul2VarB.h(serialDescriptor, 0, mve.a, str);
                    i |= 1;
                } else if (iP == 1) {
                    str2 = (String) ul2VarB.h(serialDescriptor, 1, mve.a, str2);
                    i |= 2;
                } else {
                    if (iP != 2) {
                        b0.m(iP);
                        return null;
                    }
                    str3 = (String) ul2VarB.h(serialDescriptor, 2, mve.a, str3);
                    i |= 4;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new jhb(i, str, str2, str3);
        }

        @Override // defpackage.r7e, defpackage.i04
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            jhb jhbVar = (jhb) obj;
            jhbVar.getClass();
            String str = jhbVar.c;
            String str2 = jhbVar.b;
            String str3 = jhbVar.a;
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            if (vl2VarB.m(serialDescriptor) || str3 != null) {
                vl2VarB.k(serialDescriptor, 0, mve.a, str3);
            }
            if (vl2VarB.m(serialDescriptor) || str2 != null) {
                vl2VarB.k(serialDescriptor, 1, mve.a, str2);
            }
            if (vl2VarB.m(serialDescriptor) || str != null) {
                vl2VarB.k(serialDescriptor, 2, mve.a, str);
            }
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<jhb> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ jhb(int i, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhb)) {
            return false;
        }
        jhb jhbVar = (jhb) obj;
        return wl7.b(this.a, jhbVar.a) && wl7.b(this.b, jhbVar.b) && wl7.b(this.c, jhbVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return l6.i(u40.f("PostApplyInfo(postApplyUrl=", this.a, ", postApplyConfirmMessage=", this.b, ", postApplyConfirmUrl="), this.c, ")");
    }

    public jhb() {
        this(0);
    }

    public jhb(int i) {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
