package defpackage;

import com.datadog.android.rum.internal.metric.SessionEndedMetric;
import defpackage.iw4;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes2.dex */
public final class sc6 {
    public static final ra8 a = sa8.a(new bh(6));

    @o7e
    public static final class a {
        public static final b Companion = new b();
        public final b a;

        /* JADX INFO: renamed from: sc6$a$a, reason: collision with other inner class name */
        @sy3
        public /* synthetic */ class C0414a implements sw5<a> {
            public static final C0414a a;
            private static final SerialDescriptor descriptor;

            static {
                C0414a c0414a = new C0414a();
                a = c0414a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.backendservices.graphql.api.GraphQlErrorsParser.GraphQlNestedErrorRoot", c0414a, 1);
                pluginGeneratedSerialDescriptor.k("error", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{qp1.b(b.a.a)};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                boolean z = true;
                int i = 0;
                b bVar = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    if (iP == -1) {
                        z = false;
                    } else {
                        if (iP != 0) {
                            b0.m(iP);
                            return null;
                        }
                        bVar = (b) ul2VarB.h(serialDescriptor, 0, b.a.a, bVar);
                        i = 1;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new a(i, bVar);
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
                vl2VarB.k(serialDescriptor, 0, b.a.a, aVar.a);
                vl2VarB.c(serialDescriptor);
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] typeParametersSerializers() {
                return ypd.V;
            }
        }

        public static final class b {
            public final KSerializer<a> serializer() {
                return C0414a.a;
            }
        }

        public /* synthetic */ a(int i, b bVar) {
            if (1 == (i & 1)) {
                this.a = bVar;
            } else {
                ewa.M(i, 1, C0414a.a.get$$serialDesc());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && wl7.b(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            b bVar = this.a;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        public final String toString() {
            return "GraphQlNestedErrorRoot(error=" + this.a + ")";
        }
    }

    @o7e
    public static final class b {
        public static final C0415b Companion = new C0415b();
        public static final Lazy<KSerializer<Object>>[] b = {boa.E(qt8.b, new zw(3))};
        public final List<Map<String, JsonElement>> a;

        @sy3
        public /* synthetic */ class a implements sw5<b> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.backendservices.graphql.api.GraphQlErrorsParser.GraphQlRoot", aVar, 1);
                pluginGeneratedSerialDescriptor.k(SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{qp1.b(b.b[0].getValue())};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = b.b;
                boolean z = true;
                int i = 0;
                List list = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    if (iP == -1) {
                        z = false;
                    } else {
                        if (iP != 0) {
                            b0.m(iP);
                            return null;
                        }
                        list = (List) ul2VarB.h(serialDescriptor, 0, lazyArr[0].getValue(), list);
                        i = 1;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new b(i, list);
            }

            @Override // defpackage.r7e, defpackage.i04
            /* JADX INFO: renamed from: getDescriptor */
            public final SerialDescriptor get$$serialDesc() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                b bVar = (b) obj;
                bVar.getClass();
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                vl2VarB.k(serialDescriptor, 0, b.b[0].getValue(), bVar.a);
                vl2VarB.c(serialDescriptor);
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] typeParametersSerializers() {
                return ypd.V;
            }
        }

        /* JADX INFO: renamed from: sc6$b$b, reason: collision with other inner class name */
        public static final class C0415b {
            public final KSerializer<b> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ b(int i, List list) {
            if (1 == (i & 1)) {
                this.a = list;
            } else {
                ewa.M(i, 1, a.a.get$$serialDesc());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && wl7.b(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            List<Map<String, JsonElement>> list = this.a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final String toString() {
            return g7.h("GraphQlRoot(errors=", ")", this.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlinx.serialization.json.JsonElement] */
    public static iw4 a(Map map) {
        int i;
        String strA;
        String strA2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ?? arrayList = zr4.a;
        while (true) {
            String strA3 = "";
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                ?? r5 = (JsonElement) entry.getValue();
                if (wl7.b(str, "message")) {
                    if (r5 == 0 || (strA3 = la8.g(r5).a()) == null) {
                        break;
                    }
                } else if (wl7.b(str, "locations")) {
                    List list = r5 instanceof List ? (List) r5 : null;
                    if (list != null) {
                        List<Map> list2 = list;
                        arrayList = new ArrayList(t92.r0(list2, 10));
                        for (Map map2 : list2) {
                            int i2 = -1;
                            if (map2 != null) {
                                i = -1;
                                for (Map.Entry entry2 : map2.entrySet()) {
                                    String str2 = (String) entry2.getKey();
                                    JsonElement jsonElement = (JsonElement) entry2.getValue();
                                    if (wl7.b(str2, "line")) {
                                        i2 = (jsonElement == null || (strA = la8.g(jsonElement).a()) == null) ? 0 : Integer.parseInt(strA);
                                    } else if (wl7.b(str2, "column")) {
                                        i = (jsonElement == null || (strA2 = la8.g(jsonElement).a()) == null) ? 0 : Integer.parseInt(strA2);
                                    }
                                }
                            } else {
                                i = -1;
                            }
                            arrayList.add(new iw4.a(i2, i));
                        }
                    } else {
                        arrayList = arrayList;
                    }
                } else {
                    linkedHashMap.put(str, r5);
                }
            }
            return new iw4(strA3, arrayList, null, linkedHashMap, null);
        }
    }
}
