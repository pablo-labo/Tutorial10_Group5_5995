package defpackage;

import java.util.Map;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes2.dex */
@o7e
public final class rre {
    public static final b Companion = new b();
    public static final Lazy<KSerializer<Object>>[] d = {null, null, boa.E(qt8.b, new fc2(16))};
    public final String a;
    public final String b;
    public final Map<String, JsonElement> c;

    @sy3
    public static final /* synthetic */ class a implements sw5<rre> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.ghostwriter.services.StartScheduleApplyBody", aVar, 3);
            pluginGeneratedSerialDescriptor.k("job_key", false);
            pluginGeneratedSerialDescriptor.k("view_job_url", false);
            pluginGeneratedSerialDescriptor.k("user_profile_data", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = rre.d;
            mve mveVar = mve.a;
            return new KSerializer[]{mveVar, mveVar, lazyArr[2].getValue()};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = rre.d;
            boolean z = true;
            int i = 0;
            String strO = null;
            String strO2 = null;
            Map map = null;
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
                } else {
                    if (iP != 2) {
                        b0.m(iP);
                        return null;
                    }
                    map = (Map) ul2VarB.z(serialDescriptor, 2, lazyArr[2].getValue(), map);
                    i |= 4;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new rre(i, strO, strO2, map);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            rre rreVar = (rre) obj;
            rreVar.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = rre.d;
            vl2VarB.x(serialDescriptor, 0, rreVar.a);
            vl2VarB.x(serialDescriptor, 1, rreVar.b);
            vl2VarB.y(serialDescriptor, 2, lazyArr[2].getValue(), rreVar.c);
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<rre> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ rre(int i, String str, String str2, Map map) {
        if (7 != (i & 7)) {
            ewa.M(i, 7, a.a.get$$serialDesc());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rre)) {
            return false;
        }
        rre rreVar = (rre) obj;
        return wl7.b(this.a, rreVar.a) && wl7.b(this.b, rreVar.b) && wl7.b(this.c, rreVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + akb.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return b0.k(u40.f("StartScheduleApplyBody(job_key=", this.a, ", view_job_url=", this.b, ", user_profile_data="), this.c, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rre(String str, String str2, Map<String, ? extends JsonElement> map) {
        str.getClass();
        str2.getClass();
        map.getClass();
        this.a = str;
        this.b = str2;
        this.c = map;
    }
}
