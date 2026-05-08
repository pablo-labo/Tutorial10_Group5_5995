package defpackage;

import com.datadog.android.rum.internal.metric.SessionEndedMetric;
import defpackage.vob;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public final class jpb {
    public static final b Companion = new b();
    public static final Lazy<KSerializer<Object>>[] g;
    public final long a;
    public final String b;
    public final List<String> c;
    public final Map<String, Integer> d;
    public final vob e;
    public final String f;

    @sy3
    public static final /* synthetic */ class a implements sw5<jpb> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.wlproctor.loader.jsonmodels.ProctorResultsModel", aVar, 6);
            pluginGeneratedSerialDescriptor.k("proctorResultUpdateInterval", false);
            pluginGeneratedSerialDescriptor.k("deviceId", false);
            pluginGeneratedSerialDescriptor.k(SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, false);
            pluginGeneratedSerialDescriptor.k("forcedProctorGroups", false);
            pluginGeneratedSerialDescriptor.k("proctorResult", false);
            pluginGeneratedSerialDescriptor.k("proctorGroupsAllocationsString", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = jpb.g;
            mve mveVar = mve.a;
            return new KSerializer[]{p59.a, mveVar, qp1.b(lazyArr[2].getValue()), lazyArr[3].getValue(), vob.a.a, qp1.b(mveVar)};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = jpb.g;
            Object obj = null;
            int i = 0;
            long jF = 0;
            String str = null;
            String strO = null;
            List list = null;
            Map map = null;
            vob vobVar = null;
            boolean z = true;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                switch (iP) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        jF = ul2VarB.f(serialDescriptor, 0);
                        i |= 1;
                        break;
                    case 1:
                        strO = ul2VarB.o(serialDescriptor, 1);
                        i |= 2;
                        break;
                    case 2:
                        list = (List) ul2VarB.h(serialDescriptor, 2, lazyArr[2].getValue(), list);
                        i |= 4;
                        break;
                    case 3:
                        map = (Map) ul2VarB.z(serialDescriptor, 3, lazyArr[3].getValue(), map);
                        i |= 8;
                        break;
                    case 4:
                        vobVar = (vob) ul2VarB.z(serialDescriptor, 4, vob.a.a, vobVar);
                        i |= 16;
                        break;
                    case 5:
                        str = (String) ul2VarB.h(serialDescriptor, 5, mve.a, str);
                        i |= 32;
                        break;
                    default:
                        b0.m(iP);
                        return obj;
                }
                obj = null;
            }
            ul2VarB.c(serialDescriptor);
            return new jpb(i, jF, strO, list, map, vobVar, str);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            jpb jpbVar = (jpb) obj;
            jpbVar.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = jpb.g;
            vl2VarB.D(serialDescriptor, 0, jpbVar.a);
            vl2VarB.x(serialDescriptor, 1, jpbVar.b);
            vl2VarB.k(serialDescriptor, 2, lazyArr[2].getValue(), jpbVar.c);
            vl2VarB.y(serialDescriptor, 3, lazyArr[3].getValue(), jpbVar.d);
            vl2VarB.y(serialDescriptor, 4, vob.a.a, jpbVar.e);
            vl2VarB.k(serialDescriptor, 5, mve.a, jpbVar.f);
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<jpb> serializer() {
            return a.a;
        }
    }

    static {
        oz0 oz0Var = new oz0(14);
        qt8 qt8Var = qt8.b;
        g = new Lazy[]{null, null, boa.E(qt8Var, oz0Var), boa.E(qt8Var, new zr0(11)), null, null};
    }

    public /* synthetic */ jpb(int i, long j, String str, List list, Map map, vob vobVar, String str2) {
        if (63 != (i & 63)) {
            ewa.M(i, 63, a.a.get$$serialDesc());
            throw null;
        }
        this.a = j;
        this.b = str;
        this.c = list;
        this.d = map;
        this.e = vobVar;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof jpb)) {
            jpb jpbVar = (jpb) obj;
            if (this.a == jpbVar.a && wl7.b(this.b, jpbVar.b) && wl7.b(this.c, jpbVar.c) && wl7.b(this.d, jpbVar.d) && wl7.b(this.e, jpbVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iD = akb.d(Long.hashCode(this.a) * 31, 31, this.b);
        List<String> list = this.c;
        int iHashCode = (this.e.hashCode() + k20.b(this.d, (iD + (list == null ? 0 : list.hashCode())) * 31, 31)) * 31;
        String str = this.f;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ProctorResultsModel(proctorResultUpdateInterval=" + this.a + ", deviceId=" + this.b + ", errors=" + this.c + ", forcedProctorGroups=" + this.d + ", proctorResult=" + this.e + ", proctorGroupsAllocationsString=" + this.f + ")";
    }

    public jpb(long j, String str, List<String> list, Map<String, Integer> map, vob vobVar, String str2) {
        this.a = j;
        this.b = str;
        this.c = list;
        this.d = map;
        this.e = vobVar;
        this.f = str2;
    }
}
