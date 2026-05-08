package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
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
public final class lp5 {
    public static final b Companion = new b();
    public static final Lazy<KSerializer<Object>>[] l;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List<String> f;
    public final String g;
    public final String h;
    public final String i;
    public final o09 j;
    public final o09 k;

    @sy3
    public static final /* synthetic */ class a implements sw5<lp5> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.ghostwriter.models.backend.FormFieldResponse", aVar, 11);
            pluginGeneratedSerialDescriptor.k("id", false);
            pluginGeneratedSerialDescriptor.k("application_id", false);
            pluginGeneratedSerialDescriptor.k("form_field_id", false);
            pluginGeneratedSerialDescriptor.k("form_field", false);
            pluginGeneratedSerialDescriptor.k("response_value", false);
            pluginGeneratedSerialDescriptor.k("selected_options", false);
            pluginGeneratedSerialDescriptor.k("validation_status", false);
            pluginGeneratedSerialDescriptor.k("validation_error", false);
            pluginGeneratedSerialDescriptor.k("source", false);
            pluginGeneratedSerialDescriptor.k("responded_at", false);
            pluginGeneratedSerialDescriptor.k("updated_at", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = lp5.l;
            mve mveVar = mve.a;
            return new KSerializer[]{mveVar, mveVar, mveVar, qp1.b(mveVar), qp1.b(mveVar), qp1.b(lazyArr[5].getValue()), mveVar, qp1.b(mveVar), mveVar, lazyArr[9].getValue(), lazyArr[10].getValue()};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            Lazy<KSerializer<Object>>[] lazyArr;
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr2 = lp5.l;
            o09 o09Var = null;
            o09 o09Var2 = null;
            boolean z = true;
            String str = null;
            int i = 0;
            String strO = null;
            String strO2 = null;
            String strO3 = null;
            String str2 = null;
            String str3 = null;
            List list = null;
            String strO4 = null;
            String strO5 = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                switch (iP) {
                    case -1:
                        lazyArr = lazyArr2;
                        z = false;
                        break;
                    case 0:
                        lazyArr = lazyArr2;
                        strO = ul2VarB.o(serialDescriptor, 0);
                        i |= 1;
                        break;
                    case 1:
                        lazyArr = lazyArr2;
                        strO2 = ul2VarB.o(serialDescriptor, 1);
                        i |= 2;
                        break;
                    case 2:
                        lazyArr = lazyArr2;
                        strO3 = ul2VarB.o(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        lazyArr = lazyArr2;
                        str2 = (String) ul2VarB.h(serialDescriptor, 3, mve.a, str2);
                        i |= 8;
                        break;
                    case 4:
                        lazyArr = lazyArr2;
                        str3 = (String) ul2VarB.h(serialDescriptor, 4, mve.a, str3);
                        i |= 16;
                        break;
                    case 5:
                        lazyArr = lazyArr2;
                        list = (List) ul2VarB.h(serialDescriptor, 5, lazyArr[5].getValue(), list);
                        i |= 32;
                        break;
                    case 6:
                        lazyArr = lazyArr2;
                        strO4 = ul2VarB.o(serialDescriptor, 6);
                        i |= 64;
                        break;
                    case 7:
                        lazyArr = lazyArr2;
                        str = (String) ul2VarB.h(serialDescriptor, 7, mve.a, str);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        break;
                    case 8:
                        lazyArr = lazyArr2;
                        strO5 = ul2VarB.o(serialDescriptor, 8);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        break;
                    case DatadogLogGenerator.CRASH /* 9 */:
                        lazyArr = lazyArr2;
                        o09Var2 = (o09) ul2VarB.z(serialDescriptor, 9, lazyArr[9].getValue(), o09Var2);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        break;
                    case 10:
                        lazyArr = lazyArr2;
                        o09Var = (o09) ul2VarB.z(serialDescriptor, 10, lazyArr2[10].getValue(), o09Var);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        break;
                    default:
                        b0.m(iP);
                        return null;
                }
                lazyArr2 = lazyArr;
            }
            ul2VarB.c(serialDescriptor);
            return new lp5(i, strO, strO2, strO3, str2, str3, list, strO4, str, strO5, o09Var2, o09Var);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            lp5 lp5Var = (lp5) obj;
            lp5Var.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = lp5.l;
            vl2VarB.x(serialDescriptor, 0, lp5Var.a);
            vl2VarB.x(serialDescriptor, 1, lp5Var.b);
            vl2VarB.x(serialDescriptor, 2, lp5Var.c);
            mve mveVar = mve.a;
            vl2VarB.k(serialDescriptor, 3, mveVar, lp5Var.d);
            vl2VarB.k(serialDescriptor, 4, mveVar, lp5Var.e);
            vl2VarB.k(serialDescriptor, 5, lazyArr[5].getValue(), lp5Var.f);
            vl2VarB.x(serialDescriptor, 6, lp5Var.g);
            vl2VarB.k(serialDescriptor, 7, mveVar, lp5Var.h);
            vl2VarB.x(serialDescriptor, 8, lp5Var.i);
            vl2VarB.y(serialDescriptor, 9, lazyArr[9].getValue(), lp5Var.j);
            vl2VarB.y(serialDescriptor, 10, lazyArr[10].getValue(), lp5Var.k);
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<lp5> serializer() {
            return a.a;
        }
    }

    static {
        cp0 cp0Var = new cp0(3);
        qt8 qt8Var = qt8.b;
        l = new Lazy[]{null, null, null, null, null, boa.E(qt8Var, cp0Var), null, null, null, boa.E(qt8Var, new dp0(4)), boa.E(qt8Var, new pl0(2))};
    }

    public /* synthetic */ lp5(int i, String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, String str8, o09 o09Var, o09 o09Var2) {
        if (2047 != (i & 2047)) {
            ewa.M(i, 2047, a.a.get$$serialDesc());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = list;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = o09Var;
        this.k = o09Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp5)) {
            return false;
        }
        lp5 lp5Var = (lp5) obj;
        return wl7.b(this.a, lp5Var.a) && wl7.b(this.b, lp5Var.b) && wl7.b(this.c, lp5Var.c) && wl7.b(this.d, lp5Var.d) && wl7.b(this.e, lp5Var.e) && wl7.b(this.f, lp5Var.f) && wl7.b(this.g, lp5Var.g) && wl7.b(this.h, lp5Var.h) && wl7.b(this.i, lp5Var.i) && wl7.b(this.j, lp5Var.j) && wl7.b(this.k, lp5Var.k);
    }

    public final int hashCode() {
        int iD = akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.f;
        int iD2 = akb.d((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.g);
        String str3 = this.h;
        return this.k.a.hashCode() + ((this.j.a.hashCode() + akb.d((iD2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.i)) * 31);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("FormFieldResponse(id=", this.a, ", application_id=", this.b, ", form_field_id=");
        ia.r(sbF, this.c, ", form_field=", this.d, ", response_value=");
        sbF.append(this.e);
        sbF.append(", selected_options=");
        sbF.append(this.f);
        sbF.append(", validation_status=");
        ia.r(sbF, this.g, ", validation_error=", this.h, ", source=");
        sbF.append(this.i);
        sbF.append(", responded_at=");
        sbF.append(this.j);
        sbF.append(", updated_at=");
        sbF.append(this.k);
        sbF.append(")");
        return sbF.toString();
    }
}
