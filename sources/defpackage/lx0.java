package defpackage;

import com.datadog.android.log.LogAttributes;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public final class lx0 {
    public static final b Companion = new b();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    @sy3
    public static final /* synthetic */ class a implements sw5<lx0> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.wlproctor.loader.jsonmodels.AttributionParamsModel", aVar, 10);
            pluginGeneratedSerialDescriptor.k("affiliateKey", false);
            pluginGeneratedSerialDescriptor.k("keywords", false);
            pluginGeneratedSerialDescriptor.k("newCookieValue", false);
            pluginGeneratedSerialDescriptor.k("referrer", false);
            pluginGeneratedSerialDescriptor.k(LogAttributes.HOST, false);
            pluginGeneratedSerialDescriptor.k("refType", false);
            pluginGeneratedSerialDescriptor.k("refTime", false);
            pluginGeneratedSerialDescriptor.k("reqAffiliateKey", false);
            pluginGeneratedSerialDescriptor.k("reqKeywords", false);
            pluginGeneratedSerialDescriptor.k("reqRefType", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            mve mveVar = mve.a;
            return new KSerializer[]{qp1.b(mveVar), qp1.b(mveVar), qp1.b(mveVar), qp1.b(mveVar), qp1.b(mveVar), qp1.b(mveVar), qp1.b(mveVar), qp1.b(mveVar), qp1.b(mveVar), qp1.b(mveVar)};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            String str = null;
            boolean z = true;
            String str2 = null;
            int i = 0;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                switch (iP) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        str3 = (String) ul2VarB.h(serialDescriptor, 0, mve.a, str3);
                        i |= 1;
                        break;
                    case 1:
                        str4 = (String) ul2VarB.h(serialDescriptor, 1, mve.a, str4);
                        i |= 2;
                        break;
                    case 2:
                        str5 = (String) ul2VarB.h(serialDescriptor, 2, mve.a, str5);
                        i |= 4;
                        break;
                    case 3:
                        str6 = (String) ul2VarB.h(serialDescriptor, 3, mve.a, str6);
                        i |= 8;
                        break;
                    case 4:
                        str7 = (String) ul2VarB.h(serialDescriptor, 4, mve.a, str7);
                        i |= 16;
                        break;
                    case 5:
                        str8 = (String) ul2VarB.h(serialDescriptor, 5, mve.a, str8);
                        i |= 32;
                        break;
                    case 6:
                        str9 = (String) ul2VarB.h(serialDescriptor, 6, mve.a, str9);
                        i |= 64;
                        break;
                    case 7:
                        str10 = (String) ul2VarB.h(serialDescriptor, 7, mve.a, str10);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        break;
                    case 8:
                        str2 = (String) ul2VarB.h(serialDescriptor, 8, mve.a, str2);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        break;
                    case DatadogLogGenerator.CRASH /* 9 */:
                        str = (String) ul2VarB.h(serialDescriptor, 9, mve.a, str);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        break;
                    default:
                        b0.m(iP);
                        return null;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new lx0(i, str3, str4, str5, str6, str7, str8, str9, str10, str2, str);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            lx0 lx0Var = (lx0) obj;
            lx0Var.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            mve mveVar = mve.a;
            vl2VarB.k(serialDescriptor, 0, mveVar, lx0Var.a);
            vl2VarB.k(serialDescriptor, 1, mveVar, lx0Var.b);
            vl2VarB.k(serialDescriptor, 2, mveVar, lx0Var.c);
            vl2VarB.k(serialDescriptor, 3, mveVar, lx0Var.d);
            vl2VarB.k(serialDescriptor, 4, mveVar, lx0Var.e);
            vl2VarB.k(serialDescriptor, 5, mveVar, lx0Var.f);
            vl2VarB.k(serialDescriptor, 6, mveVar, lx0Var.g);
            vl2VarB.k(serialDescriptor, 7, mveVar, lx0Var.h);
            vl2VarB.k(serialDescriptor, 8, mveVar, lx0Var.i);
            vl2VarB.k(serialDescriptor, 9, mveVar, lx0Var.j);
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<lx0> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ lx0(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        if (1023 != (i & 1023)) {
            ewa.M(i, 1023, a.a.get$$serialDesc());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx0)) {
            return false;
        }
        lx0 lx0Var = (lx0) obj;
        return wl7.b(this.a, lx0Var.a) && wl7.b(this.b, lx0Var.b) && wl7.b(this.c, lx0Var.c) && wl7.b(this.d, lx0Var.d) && wl7.b(this.e, lx0Var.e) && wl7.b(this.f, lx0Var.f) && wl7.b(this.g, lx0Var.g) && wl7.b(this.h, lx0Var.h) && wl7.b(this.i, lx0Var.i) && wl7.b(this.j, lx0Var.j);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.h;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.i;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.j;
        return iHashCode9 + (str10 != null ? str10.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("AttributionParamsModel(affiliateKey=", this.a, ", keywords=", this.b, ", newCookieValue=");
        ia.r(sbF, this.c, ", referrer=", this.d, ", host=");
        ia.r(sbF, this.e, ", refType=", this.f, ", refTime=");
        ia.r(sbF, this.g, ", reqAffiliateKey=", this.h, ", reqKeywords=");
        return z3.n(sbF, this.i, ", reqRefType=", this.j, ")");
    }

    public lx0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
    }
}
