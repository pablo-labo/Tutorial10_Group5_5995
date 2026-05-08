package defpackage;

import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import java.util.List;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public final class ts7 {
    public static final b Companion = new b();
    public static final Lazy<KSerializer<Object>>[] f;
    public final String a;
    public final String b;
    public final String c;
    public final List<String> d;
    public final List<String> e;

    @sy3
    public static final /* synthetic */ class a implements sw5<ts7> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.tare.profile.forms.JSTProfileTaxonomyConcept", aVar, 5);
            pluginGeneratedSerialDescriptor.k("label", false);
            pluginGeneratedSerialDescriptor.k("suid", false);
            pluginGeneratedSerialDescriptor.k("type", false);
            pluginGeneratedSerialDescriptor.k("sectionIds", false);
            pluginGeneratedSerialDescriptor.k(RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = ts7.f;
            mve mveVar = mve.a;
            return new KSerializer[]{mveVar, mveVar, qp1.b(mveVar), qp1.b(lazyArr[3].getValue()), qp1.b(lazyArr[4].getValue())};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = ts7.f;
            boolean z = true;
            int i = 0;
            String strO = null;
            String strO2 = null;
            String str = null;
            List list = null;
            List list2 = null;
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
                } else if (iP == 2) {
                    str = (String) ul2VarB.h(serialDescriptor, 2, mve.a, str);
                    i |= 4;
                } else if (iP == 3) {
                    list = (List) ul2VarB.h(serialDescriptor, 3, lazyArr[3].getValue(), list);
                    i |= 8;
                } else {
                    if (iP != 4) {
                        b0.m(iP);
                        return null;
                    }
                    list2 = (List) ul2VarB.h(serialDescriptor, 4, lazyArr[4].getValue(), list2);
                    i |= 16;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new ts7(i, strO, strO2, str, list, list2);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            ts7 ts7Var = (ts7) obj;
            ts7Var.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = ts7.f;
            vl2VarB.x(serialDescriptor, 0, ts7Var.a);
            vl2VarB.x(serialDescriptor, 1, ts7Var.b);
            vl2VarB.k(serialDescriptor, 2, mve.a, ts7Var.c);
            vl2VarB.k(serialDescriptor, 3, lazyArr[3].getValue(), ts7Var.d);
            vl2VarB.k(serialDescriptor, 4, lazyArr[4].getValue(), ts7Var.e);
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<ts7> serializer() {
            return a.a;
        }
    }

    static {
        int i = 13;
        bo0 bo0Var = new bo0(i);
        qt8 qt8Var = qt8.b;
        f = new Lazy[]{null, null, null, boa.E(qt8Var, bo0Var), boa.E(qt8Var, new vm1(i))};
    }

    public /* synthetic */ ts7(int i, String str, String str2, String str3, List list, List list2) {
        if (31 != (i & 31)) {
            ewa.M(i, 31, a.a.get$$serialDesc());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ts7)) {
            return false;
        }
        ts7 ts7Var = (ts7) obj;
        return wl7.b(this.a, ts7Var.a) && wl7.b(this.b, ts7Var.b) && wl7.b(this.c, ts7Var.c) && wl7.b(this.d, ts7Var.d) && wl7.b(this.e, ts7Var.e);
    }

    public final int hashCode() {
        int iD = akb.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.d;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.e;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("JSTProfileTaxonomyConcept(label=", this.a, ", suid=", this.b, ", type=");
        sbF.append(this.c);
        sbF.append(", sectionIds=");
        sbF.append(this.d);
        sbF.append(", context=");
        return g7.i(sbF, this.e, ")");
    }

    public ts7(List list, List list2, String str, String str2, String str3) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }
}
