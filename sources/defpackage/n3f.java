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
public abstract class n3f {
    public static final b Companion = new b();
    public static final Lazy<KSerializer<Object>> a = boa.E(qt8.b, new j7(16));

    @o7e
    public static final class a extends n3f {
        public static final b Companion = new b();
        public static final Lazy<KSerializer<Object>>[] h;
        public final String b;
        public final Map<String, String> c;
        public final Map<String, String> d;
        public final c e;
        public final Boolean f;
        public final String g;

        /* JADX INFO: renamed from: n3f$a$a, reason: collision with other inner class name */
        @sy3
        public static final /* synthetic */ class C0327a implements sw5<a> {
            public static final C0327a a;
            private static final SerialDescriptor descriptor;

            static {
                C0327a c0327a = new C0327a();
                a = c0327a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("apiAction", c0327a, 6);
                pluginGeneratedSerialDescriptor.k("actionId", false);
                pluginGeneratedSerialDescriptor.k("body", true);
                pluginGeneratedSerialDescriptor.k("headers", true);
                pluginGeneratedSerialDescriptor.k("method", false);
                pluginGeneratedSerialDescriptor.k("refresh", true);
                pluginGeneratedSerialDescriptor.k("url", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                Lazy<KSerializer<Object>>[] lazyArr = a.h;
                mve mveVar = mve.a;
                return new KSerializer[]{mveVar, qp1.b(lazyArr[1].getValue()), qp1.b(lazyArr[2].getValue()), lazyArr[3].getValue(), qp1.b(ni1.a), mveVar};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = a.h;
                boolean z = true;
                int i = 0;
                String strO = null;
                Map map = null;
                Map map2 = null;
                c cVar = null;
                Boolean bool = null;
                String strO2 = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    switch (iP) {
                        case -1:
                            z = false;
                            break;
                        case 0:
                            strO = ul2VarB.o(serialDescriptor, 0);
                            i |= 1;
                            break;
                        case 1:
                            map = (Map) ul2VarB.h(serialDescriptor, 1, lazyArr[1].getValue(), map);
                            i |= 2;
                            break;
                        case 2:
                            map2 = (Map) ul2VarB.h(serialDescriptor, 2, lazyArr[2].getValue(), map2);
                            i |= 4;
                            break;
                        case 3:
                            cVar = (c) ul2VarB.z(serialDescriptor, 3, lazyArr[3].getValue(), cVar);
                            i |= 8;
                            break;
                        case 4:
                            bool = (Boolean) ul2VarB.h(serialDescriptor, 4, ni1.a, bool);
                            i |= 16;
                            break;
                        case 5:
                            strO2 = ul2VarB.o(serialDescriptor, 5);
                            i |= 32;
                            break;
                        default:
                            b0.m(iP);
                            return null;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new a(i, strO, map, map2, cVar, bool, strO2);
            }

            @Override // defpackage.r7e, defpackage.i04
            /* JADX INFO: renamed from: getDescriptor */
            public final SerialDescriptor get$$serialDesc() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                a aVar = (a) obj;
                aVar.getClass();
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = a.h;
                String str = aVar.b;
                Boolean bool = aVar.f;
                Map<String, String> map = aVar.d;
                Map<String, String> map2 = aVar.c;
                vl2VarB.x(serialDescriptor, 0, str);
                if (vl2VarB.m(serialDescriptor) || map2 != null) {
                    vl2VarB.k(serialDescriptor, 1, lazyArr[1].getValue(), map2);
                }
                if (vl2VarB.m(serialDescriptor) || map != null) {
                    vl2VarB.k(serialDescriptor, 2, lazyArr[2].getValue(), map);
                }
                vl2VarB.y(serialDescriptor, 3, lazyArr[3].getValue(), aVar.e);
                if (vl2VarB.m(serialDescriptor) || bool != null) {
                    vl2VarB.k(serialDescriptor, 4, ni1.a, bool);
                }
                vl2VarB.x(serialDescriptor, 5, aVar.g);
                vl2VarB.c(serialDescriptor);
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] typeParametersSerializers() {
                return ypd.V;
            }
        }

        public static final class b {
            public final KSerializer<a> serializer() {
                return C0327a.a;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class c {
            public static final /* synthetic */ c[] a = {new c("POST", 0), new c("PUT", 1), new c("DELETE", 2), new c("PATCH", 3)};

            /* JADX INFO: Fake field, exist only in values array */
            c EF5;

            public c() {
                throw null;
            }

            public static c valueOf(String str) {
                return (c) Enum.valueOf(c.class, str);
            }

            public static c[] values() {
                return (c[]) a.clone();
            }
        }

        static {
            k7 k7Var = new k7(18);
            qt8 qt8Var = qt8.b;
            h = new Lazy[]{null, boa.E(qt8Var, k7Var), boa.E(qt8Var, new l7(19)), boa.E(qt8Var, new n7(11)), null, null};
        }

        public /* synthetic */ a(int i, String str, Map map, Map map2, c cVar, Boolean bool, String str2) {
            if (41 != (i & 41)) {
                ewa.M(i, 41, C0327a.a.get$$serialDesc());
                throw null;
            }
            this.b = str;
            if ((i & 2) == 0) {
                this.c = null;
            } else {
                this.c = map;
            }
            if ((i & 4) == 0) {
                this.d = null;
            } else {
                this.d = map2;
            }
            this.e = cVar;
            if ((i & 16) == 0) {
                this.f = null;
            } else {
                this.f = bool;
            }
            this.g = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return wl7.b(this.b, aVar.b) && wl7.b(this.c, aVar.c) && wl7.b(this.d, aVar.d) && this.e == aVar.e && wl7.b(this.f, aVar.f) && wl7.b(this.g, aVar.g);
        }

        public final int hashCode() {
            int iHashCode = this.b.hashCode() * 31;
            Map<String, String> map = this.c;
            int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, String> map2 = this.d;
            int iHashCode3 = (this.e.hashCode() + ((iHashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31)) * 31;
            Boolean bool = this.f;
            return this.g.hashCode() + ((iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "APIAction(actionId=" + this.b + ", body=" + this.c + ", headers=" + this.d + ", method=" + this.e + ", refresh=" + this.f + ", url=" + this.g + ")";
        }
    }

    public static final class b {
        public final KSerializer<n3f> serializer() {
            return (KSerializer) n3f.a.getValue();
        }
    }

    @o7e
    public static final class d extends n3f {
        public static final b Companion = new b();
        public final String b;
        public final String c;
        public final Boolean d;

        @sy3
        public static final /* synthetic */ class a implements sw5<d> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("gqlAction", aVar, 3);
                pluginGeneratedSerialDescriptor.k("actionId", false);
                pluginGeneratedSerialDescriptor.k("mutation", false);
                pluginGeneratedSerialDescriptor.k("refresh", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                KSerializer<?> kSerializerB = qp1.b(ni1.a);
                mve mveVar = mve.a;
                return new KSerializer[]{mveVar, mveVar, kSerializerB};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                boolean z = true;
                int i = 0;
                String strO = null;
                String strO2 = null;
                Boolean bool = null;
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
                        bool = (Boolean) ul2VarB.h(serialDescriptor, 2, ni1.a, bool);
                        i |= 4;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new d(i, bool, strO, strO2);
            }

            @Override // defpackage.r7e, defpackage.i04
            /* JADX INFO: renamed from: getDescriptor */
            public final SerialDescriptor get$$serialDesc() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                d dVar = (d) obj;
                dVar.getClass();
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                String str = dVar.b;
                Boolean bool = dVar.d;
                vl2VarB.x(serialDescriptor, 0, str);
                vl2VarB.x(serialDescriptor, 1, dVar.c);
                if (vl2VarB.m(serialDescriptor) || bool != null) {
                    vl2VarB.k(serialDescriptor, 2, ni1.a, bool);
                }
                vl2VarB.c(serialDescriptor);
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] typeParametersSerializers() {
                return ypd.V;
            }
        }

        public static final class b {
            public final KSerializer<d> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ d(int i, Boolean bool, String str, String str2) {
            if (3 != (i & 3)) {
                ewa.M(i, 3, a.a.get$$serialDesc());
                throw null;
            }
            this.b = str;
            this.c = str2;
            if ((i & 4) == 0) {
                this.d = null;
            } else {
                this.d = bool;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return wl7.b(this.b, dVar.b) && wl7.b(this.c, dVar.c) && wl7.b(this.d, dVar.d);
        }

        public final int hashCode() {
            int iD = akb.d(this.b.hashCode() * 31, 31, this.c);
            Boolean bool = this.d;
            return iD + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            return l5.n(u40.f("GQLAction(actionId=", this.b, ", mutation=", this.c, ", refresh="), this.d, ")");
        }
    }

    @o7e
    public static final class e extends n3f {
        public static final b Companion = new b();
        public final String b;
        public final Boolean c;
        public final String d;

        @sy3
        public static final /* synthetic */ class a implements sw5<e> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("navigationAction", aVar, 3);
                pluginGeneratedSerialDescriptor.k("actionId", false);
                pluginGeneratedSerialDescriptor.k("newTab", true);
                pluginGeneratedSerialDescriptor.k("url", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                KSerializer<?> kSerializerB = qp1.b(ni1.a);
                mve mveVar = mve.a;
                return new KSerializer[]{mveVar, kSerializerB, mveVar};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                boolean z = true;
                int i = 0;
                String strO = null;
                Boolean bool = null;
                String strO2 = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    if (iP == -1) {
                        z = false;
                    } else if (iP == 0) {
                        strO = ul2VarB.o(serialDescriptor, 0);
                        i |= 1;
                    } else if (iP == 1) {
                        bool = (Boolean) ul2VarB.h(serialDescriptor, 1, ni1.a, bool);
                        i |= 2;
                    } else {
                        if (iP != 2) {
                            b0.m(iP);
                            return null;
                        }
                        strO2 = ul2VarB.o(serialDescriptor, 2);
                        i |= 4;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new e(i, bool, strO, strO2);
            }

            @Override // defpackage.r7e, defpackage.i04
            /* JADX INFO: renamed from: getDescriptor */
            public final SerialDescriptor get$$serialDesc() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                e eVar = (e) obj;
                eVar.getClass();
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                String str = eVar.b;
                Boolean bool = eVar.c;
                vl2VarB.x(serialDescriptor, 0, str);
                if (vl2VarB.m(serialDescriptor) || bool != null) {
                    vl2VarB.k(serialDescriptor, 1, ni1.a, bool);
                }
                vl2VarB.x(serialDescriptor, 2, eVar.d);
                vl2VarB.c(serialDescriptor);
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] typeParametersSerializers() {
                return ypd.V;
            }
        }

        public static final class b {
            public final KSerializer<e> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ e(int i, Boolean bool, String str, String str2) {
            if (5 != (i & 5)) {
                ewa.M(i, 5, a.a.get$$serialDesc());
                throw null;
            }
            this.b = str;
            if ((i & 2) == 0) {
                this.c = null;
            } else {
                this.c = bool;
            }
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return wl7.b(this.b, eVar.b) && wl7.b(this.c, eVar.c) && wl7.b(this.d, eVar.d);
        }

        public final int hashCode() {
            int iHashCode = this.b.hashCode() * 31;
            Boolean bool = this.c;
            return this.d.hashCode() + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NavigationAction(actionId=");
            sb.append(this.b);
            sb.append(", newTab=");
            sb.append(this.c);
            sb.append(", url=");
            return l6.i(sb, this.d, ")");
        }
    }

    @o7e
    public static final class c extends n3f {
        public static final b Companion = new b();
        public static final Lazy<KSerializer<Object>>[] d = {null, boa.E(qt8.b, new o7(15))};
        public final String b;
        public final Map<String, String> c;

        @sy3
        public static final /* synthetic */ class a implements sw5<c> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("customAction", aVar, 2);
                pluginGeneratedSerialDescriptor.k("actionId", false);
                pluginGeneratedSerialDescriptor.k("data", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{mve.a, qp1.b(c.d[1].getValue())};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = c.d;
                boolean z = true;
                int i = 0;
                String strO = null;
                Map map = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    if (iP == -1) {
                        z = false;
                    } else if (iP == 0) {
                        strO = ul2VarB.o(serialDescriptor, 0);
                        i |= 1;
                    } else {
                        if (iP != 1) {
                            b0.m(iP);
                            return null;
                        }
                        map = (Map) ul2VarB.h(serialDescriptor, 1, lazyArr[1].getValue(), map);
                        i |= 2;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new c(i, strO, map);
            }

            @Override // defpackage.r7e, defpackage.i04
            /* JADX INFO: renamed from: getDescriptor */
            public final SerialDescriptor get$$serialDesc() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                c cVar = (c) obj;
                cVar.getClass();
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = c.d;
                String str = cVar.b;
                Map<String, String> map = cVar.c;
                vl2VarB.x(serialDescriptor, 0, str);
                if (vl2VarB.m(serialDescriptor) || map != null) {
                    vl2VarB.k(serialDescriptor, 1, lazyArr[1].getValue(), map);
                }
                vl2VarB.c(serialDescriptor);
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] typeParametersSerializers() {
                return ypd.V;
            }
        }

        public static final class b {
            public final KSerializer<c> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ c(int i, String str, Map map) {
            if (1 != (i & 1)) {
                ewa.M(i, 1, a.a.get$$serialDesc());
                throw null;
            }
            this.b = str;
            if ((i & 2) == 0) {
                this.c = null;
            } else {
                this.c = map;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return wl7.b(this.b, cVar.b) && wl7.b(this.c, cVar.c);
        }

        public final int hashCode() {
            int iHashCode = this.b.hashCode() * 31;
            Map<String, String> map = this.c;
            return iHashCode + (map == null ? 0 : map.hashCode());
        }

        public final String toString() {
            return "CustomAction(actionId=" + this.b + ", data=" + this.c + ")";
        }

        public c(Map map) {
            this.b = "request_and_navigate_to_interview";
            this.c = map;
        }
    }
}
