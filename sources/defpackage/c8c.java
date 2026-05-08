package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@o7e
public final class c8c {
    public static final b Companion = new b();
    public static final Lazy<KSerializer<Object>>[] c = {boa.E(qt8.b, new k7(15)), null};
    public final Map<String, Integer> a;
    public final boolean b;

    @sy3
    public static final /* synthetic */ class a implements sw5<c8c> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.jobsearch.util.PushNotificationLogSnapshot", aVar, 2);
            pluginGeneratedSerialDescriptor.k("importanceByChannelId", false);
            pluginGeneratedSerialDescriptor.k("areNotificationsEnabled", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{c8c.c[0].getValue(), ni1.a};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = c8c.c;
            boolean z = true;
            int i = 0;
            boolean zE = false;
            Map map = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                if (iP == -1) {
                    z = false;
                } else if (iP == 0) {
                    map = (Map) ul2VarB.z(serialDescriptor, 0, lazyArr[0].getValue(), map);
                    i |= 1;
                } else {
                    if (iP != 1) {
                        b0.m(iP);
                        return null;
                    }
                    zE = ul2VarB.E(serialDescriptor, 1);
                    i |= 2;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new c8c(i, map, zE);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            c8c c8cVar = (c8c) obj;
            c8cVar.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            vl2VarB.y(serialDescriptor, 0, c8c.c[0].getValue(), c8cVar.a);
            vl2VarB.w(serialDescriptor, 1, c8cVar.b);
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<c8c> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ c8c(int i, Map map, boolean z) {
        if (3 != (i & 3)) {
            ewa.M(i, 3, a.a.get$$serialDesc());
            throw null;
        }
        this.a = map;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8c)) {
            return false;
        }
        c8c c8cVar = (c8c) obj;
        return wl7.b(this.a, c8cVar.a) && this.b == c8cVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PushNotificationLogSnapshot(importanceByChannelId=" + this.a + ", areNotificationsEnabled=" + this.b + ")";
    }

    public c8c(LinkedHashMap linkedHashMap, boolean z) {
        this.a = linkedHashMap;
        this.b = z;
    }
}
