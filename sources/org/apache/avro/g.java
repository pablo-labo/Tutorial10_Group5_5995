package org.apache.avro;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.DoubleNode;
import com.fasterxml.jackson.databind.node.TextNode;
import defpackage.bg;
import defpackage.e49;
import defpackage.h49;
import defpackage.l5;
import defpackage.lod;
import defpackage.mod;
import defpackage.nod;
import defpackage.ood;
import defpackage.p49;
import defpackage.pod;
import defpackage.qod;
import defpackage.r40;
import defpackage.r6;
import defpackage.sod;
import defpackage.t40;
import defpackage.tod;
import defpackage.u40;
import defpackage.w6;
import defpackage.wkf;
import defpackage.z3;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.apache.avro.d;
import org.apache.avro.g;
import org.apache.avro.path.TracingAvroTypeException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g extends org.apache.avro.b implements Serializable {
    public static final Set<String> V;
    public static final wkf W;
    public static final wkf X;
    public static final HashMap Y;
    public static final wkf Z;
    public static final wkf a0;
    public static final JsonFactory b;
    public static final e49 c;
    public static final ObjectMapper d;
    public static final HashSet e;
    public static final HashSet f;
    private static final long serialVersionUID = 1;
    int hashCode;
    private p49 logicalType;
    private final u type;

    public static class a extends g {
        private final g elementType;

        public a(g gVar) {
            super(u.ARRAY);
            this.elementType = gVar;
        }

        @Override // org.apache.avro.g
        @Deprecated
        public final void Z(HashSet hashSet, String str, JsonGenerator jsonGenerator) {
            jsonGenerator.writeStartObject();
            jsonGenerator.writeStringField("type", "array");
            jsonGenerator.writeFieldName("items");
            this.elementType.Z(hashSet, str, jsonGenerator);
            k(jsonGenerator);
            jsonGenerator.writeEndObject();
        }

        @Override // org.apache.avro.g
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return t(aVar) && this.elementType.equals(aVar.elementType) && h(aVar);
        }

        @Override // org.apache.avro.g
        public final int r() {
            return this.elementType.r() + super.r();
        }

        @Override // org.apache.avro.g
        public final g x() {
            return this.elementType;
        }
    }

    public static class b extends g {
    }

    public static class c extends g {
    }

    public static class d extends g {
    }

    public static class e extends n {
        private final String enumDefault;
        private final Map<String, Integer> ordinals;
        private final List<String> symbols;

        public e(m mVar, String str, j<String> jVar, String str2) {
            super(u.ENUM, mVar, str);
            jVar.d();
            this.symbols = jVar;
            this.ordinals = new HashMap(Math.multiplyExact(2, jVar.size()));
            this.enumDefault = str2;
            int i = 0;
            for (String str3 : jVar) {
                Map<String, Integer> map = this.ordinals;
                g.m(str3);
                int i2 = i + 1;
                if (map.put(str3, Integer.valueOf(i)) != null) {
                    throw new SchemaParseException(l5.l("Duplicate enum symbol: ", str3));
                }
                i = i2;
            }
            if (str2 != null && !jVar.contains(str2)) {
                throw new SchemaParseException(t40.l("The Enum Default: ", str2, " is not in the enum symbol set: ", String.valueOf(jVar)));
            }
        }

        @Override // org.apache.avro.g
        public final List<String> A() {
            return this.symbols;
        }

        @Override // org.apache.avro.g
        @Deprecated
        public final void Z(HashSet hashSet, String str, JsonGenerator jsonGenerator) {
            if (c0(hashSet, str, jsonGenerator)) {
                return;
            }
            jsonGenerator.writeStartObject();
            jsonGenerator.writeStringField("type", "enum");
            b0(str, jsonGenerator);
            String str2 = this.doc;
            if (str2 != null) {
                jsonGenerator.writeStringField("doc", str2);
            }
            jsonGenerator.writeArrayFieldStart("symbols");
            Iterator<String> it = this.symbols.iterator();
            while (it.hasNext()) {
                jsonGenerator.writeString(it.next());
            }
            jsonGenerator.writeEndArray();
            String str3 = this.enumDefault;
            if (str3 != null) {
                jsonGenerator.writeStringField("default", str3);
            }
            k(jsonGenerator);
            a0(jsonGenerator);
            jsonGenerator.writeEndObject();
        }

        @Override // org.apache.avro.g
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return t(eVar) && this.name.equals(eVar.name) && this.symbols.equals(eVar.symbols) && h(eVar);
        }

        @Override // org.apache.avro.g.n, org.apache.avro.g
        public final int r() {
            return this.symbols.hashCode() + super.r();
        }

        @Override // org.apache.avro.g
        public final String y() {
            return this.enumDefault;
        }

        @Override // org.apache.avro.g
        public final int z(String str) {
            Integer num = this.ordinals.get(str);
            if (num != null) {
                return num.intValue();
            }
            throw new TracingAvroTypeException(new AvroTypeException(t40.l("enum value '", str, "' is not in the enum symbol set: ", String.valueOf(this.symbols))));
        }
    }

    public static class f extends org.apache.avro.b {
        public final b V;
        public LinkedHashSet W;
        public final String b;
        public int c;
        public final g d;
        public final String e;
        public final JsonNode f;

        public class a extends w6.a {
        }

        public enum b {
            ASCENDING,
            DESCENDING,
            IGNORE;

            private final String name = name().toLowerCase(Locale.ENGLISH);

            b() {
            }
        }

        static {
            a aVar = new a();
            if (w6.b == null) {
                w6.b = aVar;
            } else {
                r6.g("FieldAccessor already initialized");
            }
        }

        public f(String str, g gVar, String str2, JsonNode jsonNode, b bVar) {
            super(g.V);
            this.c = -1;
            g.m(str);
            this.b = str;
            Objects.requireNonNull(gVar, "schema is required and cannot be null");
            this.d = gVar;
            this.e = str2;
            if (!((Boolean) g.a0.get()).booleanValue() || jsonNode == null || gVar.P(jsonNode)) {
                this.f = jsonNode;
                Objects.requireNonNull(bVar, "Order cannot be null");
                this.V = bVar;
            } else {
                String strValueOf = String.valueOf(jsonNode);
                String strValueOf2 = String.valueOf(gVar);
                StringBuilder sbF = u40.f("Invalid default for field ", str, ": ", strValueOf, " not a ");
                sbF.append(strValueOf2);
                throw new AvroTypeException(sbF.toString());
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean equals(java.lang.Object r7) {
            /*
                r6 = this;
                r0 = 1
                if (r7 != r6) goto L4
                return r0
            L4:
                boolean r1 = r7 instanceof org.apache.avro.g.f
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                org.apache.avro.g$f r7 = (org.apache.avro.g.f) r7
                java.lang.String r1 = r6.b
                java.lang.String r3 = r7.b
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L55
                org.apache.avro.g r1 = r6.d
                org.apache.avro.g r3 = r7.d
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L55
                com.fasterxml.jackson.databind.JsonNode r1 = r7.f
                com.fasterxml.jackson.databind.JsonNode r3 = r6.f
                if (r3 != 0) goto L2c
                if (r1 != 0) goto L2a
                r1 = r0
                goto L46
            L2a:
                r1 = r2
                goto L46
            L2c:
                if (r1 != 0) goto L2f
                goto L2a
            L2f:
                double r4 = r3.doubleValue()
                boolean r4 = java.lang.Double.isNaN(r4)
                if (r4 == 0) goto L42
                double r3 = r1.doubleValue()
                boolean r1 = java.lang.Double.isNaN(r3)
                goto L46
            L42:
                boolean r1 = r3.equals(r1)
            L46:
                if (r1 == 0) goto L55
                org.apache.avro.g$f$b r1 = r6.V
                org.apache.avro.g$f$b r3 = r7.V
                if (r1 != r3) goto L55
                boolean r6 = r6.h(r7)
                if (r6 == 0) goto L55
                return r0
            L55:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.avro.g.f.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            return this.d.r() + this.b.hashCode();
        }

        public final String toString() {
            return this.b + " type:" + String.valueOf(this.d.type) + " pos:" + this.c;
        }
    }

    /* JADX INFO: renamed from: org.apache.avro.g$g, reason: collision with other inner class name */
    public static class C0379g extends n {
        private final int size;

        public C0379g(m mVar, String str, int i) {
            super(u.FIXED, mVar, str);
            SystemLimitException.c(i);
            this.size = i;
        }

        @Override // org.apache.avro.g
        public final int D() {
            return this.size;
        }

        @Override // org.apache.avro.g
        @Deprecated
        public final void Z(HashSet hashSet, String str, JsonGenerator jsonGenerator) {
            if (c0(hashSet, str, jsonGenerator)) {
                return;
            }
            jsonGenerator.writeStartObject();
            jsonGenerator.writeStringField("type", "fixed");
            b0(str, jsonGenerator);
            String str2 = this.doc;
            if (str2 != null) {
                jsonGenerator.writeStringField("doc", str2);
            }
            jsonGenerator.writeNumberField("size", this.size);
            k(jsonGenerator);
            a0(jsonGenerator);
            jsonGenerator.writeEndObject();
        }

        @Override // org.apache.avro.g
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0379g)) {
                return false;
            }
            C0379g c0379g = (C0379g) obj;
            return t(c0379g) && this.name.equals(c0379g.name) && this.size == c0379g.size && h(c0379g);
        }

        @Override // org.apache.avro.g.n, org.apache.avro.g
        public final int r() {
            return super.r() + this.size;
        }
    }

    public static class h extends g {
    }

    public static class i extends g {
    }

    public static class k extends g {
    }

    public static class l extends g {
        private final g valueType;

        public l(g gVar) {
            super(u.MAP);
            this.valueType = gVar;
        }

        @Override // org.apache.avro.g
        public final g M() {
            return this.valueType;
        }

        @Override // org.apache.avro.g
        @Deprecated
        public final void Z(HashSet hashSet, String str, JsonGenerator jsonGenerator) {
            jsonGenerator.writeStartObject();
            jsonGenerator.writeStringField("type", "map");
            jsonGenerator.writeFieldName("values");
            this.valueType.Z(hashSet, str, jsonGenerator);
            k(jsonGenerator);
            jsonGenerator.writeEndObject();
        }

        @Override // org.apache.avro.g
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return t(lVar) && this.valueType.equals(lVar.valueType) && h(lVar);
        }

        @Override // org.apache.avro.g
        public final int r() {
            return this.valueType.r() + super.r();
        }
    }

    public static class m {
        public final String a;
        public final String b;
        public final String c;

        public m(String str, String str2) {
            if (str == null) {
                this.c = null;
                this.b = null;
                this.a = null;
                return;
            }
            int iLastIndexOf = str.lastIndexOf(46);
            if (iLastIndexOf < 0) {
                g.m(str);
                this.a = str;
            } else {
                str2 = str.substring(0, iLastIndexOf);
                String strSubstring = str.substring(iLastIndexOf + 1);
                g.m(strSubstring);
                this.a = strSubstring;
            }
            String str3 = "".equals(str2) ? null : str2;
            this.b = str3;
            String str4 = this.a;
            this.c = str3 != null ? z3.m(str3, ".", str4) : str4;
        }

        public final String a(String str) {
            String str2 = this.b;
            if (str2 != null && str2.equals(str)) {
                u[] uVarArrValues = u.values();
                int length = uVarArrValues.length;
                int i = 0;
                while (true) {
                    String str3 = this.a;
                    if (i >= length) {
                        return str3;
                    }
                    if (uVarArrValues[i].name.equals(str3)) {
                        break;
                    }
                    i++;
                }
            }
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof m) {
                return Objects.equals(this.c, ((m) obj).c);
            }
            return false;
        }

        public final int hashCode() {
            String str = this.c;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return this.c;
        }
    }

    public static abstract class n extends g {
        Set<m> aliases;
        final String doc;
        final m name;

        public n(u uVar, m mVar, String str) {
            super(uVar);
            this.name = mVar;
            this.doc = str;
            String str2 = mVar.c;
            if (g.Y.containsKey(str2)) {
                r40.l(l5.l("Schemas may not be named after primitives: ", str2));
                throw null;
            }
        }

        @Override // org.apache.avro.g
        public final String E() {
            return this.name.c;
        }

        @Override // org.apache.avro.g
        public final String H() {
            return this.name.a;
        }

        @Override // org.apache.avro.g
        public final String I() {
            return this.name.b;
        }

        public final void a0(JsonGenerator jsonGenerator) {
            Set<m> set = this.aliases;
            if (set == null || set.isEmpty()) {
                return;
            }
            jsonGenerator.writeFieldName("aliases");
            jsonGenerator.writeStartArray();
            Iterator<m> it = this.aliases.iterator();
            while (it.hasNext()) {
                jsonGenerator.writeString(it.next().a(this.name.b));
            }
            jsonGenerator.writeEndArray();
        }

        public final void b0(String str, JsonGenerator jsonGenerator) {
            m mVar = this.name;
            String str2 = mVar.b;
            String str3 = mVar.a;
            if (str3 != null) {
                jsonGenerator.writeStringField("name", str3);
            }
            if (str2 != null) {
                if (str2.equals(str)) {
                    return;
                }
                jsonGenerator.writeStringField("namespace", str2);
            } else if (str != null) {
                jsonGenerator.writeStringField("namespace", "");
            }
        }

        public final boolean c0(HashSet hashSet, String str, JsonGenerator jsonGenerator) {
            m mVar = this.name;
            if (mVar.a == null || hashSet.add(mVar.c)) {
                return false;
            }
            jsonGenerator.writeString(this.name.a(str));
            return true;
        }

        @Override // org.apache.avro.g
        public final void n(String str) {
            if (this.aliases == null) {
                this.aliases = new LinkedHashSet();
            }
            this.aliases.add(new m(str, this.name.b));
        }

        @Override // org.apache.avro.g
        public int r() {
            return this.name.hashCode() + super.r();
        }

        @Override // org.apache.avro.g
        public final Set<String> u() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Set<m> set = this.aliases;
            if (set != null) {
                for (m mVar : set) {
                    if (mVar.b != null || this.name.b == null) {
                        linkedHashSet.add(mVar.c);
                    } else {
                        linkedHashSet.add("." + mVar.a);
                    }
                }
            }
            return linkedHashSet;
        }

        @Override // org.apache.avro.g
        public final String w() {
            return this.doc;
        }
    }

    public static class o extends g {
    }

    public static class p {
        public final org.apache.avro.e a;
        public final org.apache.avro.d b;

        public p() {
            d.b bVar = org.apache.avro.d.b;
            this.b = bVar;
            this.a = new org.apache.avro.e(bVar);
        }

        public final g a(JsonParser jsonParser) {
            String strTrim;
            org.apache.avro.e eVar = this.a;
            wkf wkfVar = g.Z;
            org.apache.avro.d dVar = (org.apache.avro.d) wkfVar.get();
            wkf wkfVar2 = g.a0;
            Boolean bool = (Boolean) wkfVar2.get();
            bool.getClass();
            try {
                try {
                    wkfVar.set(this.b);
                    wkfVar2.set(Boolean.TRUE);
                    g gVarS = g.S((JsonNode) g.d.readTree(jsonParser), eVar, null);
                    LinkedHashMap linkedHashMap = eVar.a;
                    LinkedHashMap linkedHashMap2 = eVar.b;
                    linkedHashMap.putAll(linkedHashMap2);
                    linkedHashMap2.clear();
                    g gVarC = eVar.c(gVarS);
                    StringWriter stringWriter = new StringWriter();
                    if (jsonParser.releaseBuffered(stringWriter) == -1) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        jsonParser.releaseBuffered(byteArrayOutputStream);
                        strTrim = new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8).trim();
                    } else {
                        strTrim = stringWriter.toString().trim();
                    }
                    if (!strTrim.isEmpty()) {
                        throw new SchemaParseException("dangling content after end of schema: ".concat(strTrim));
                    }
                    jsonParser.close();
                    wkfVar.set(dVar);
                    wkfVar2.set(bool);
                    return gVarC;
                } catch (JsonParseException e) {
                    throw new SchemaParseException(e);
                }
            } catch (Throwable th) {
                jsonParser.close();
                g.Z.set(dVar);
                g.a0.set(bool);
                throw th;
            }
        }

        public final g b(String str) {
            try {
                return a(g.b.createParser(str));
            } catch (IOException e) {
                throw new SchemaParseException(e);
            }
        }
    }

    public static class r {
        public final Object a;
        public final Object b;

        public r(g gVar, g gVar2) {
            this.a = gVar;
            this.b = gVar2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return this.a == rVar.a && this.b == rVar.b;
        }

        public final int hashCode() {
            return System.identityHashCode(this.b) + System.identityHashCode(this.a);
        }
    }

    public static final class s implements Serializable {
        private static final long serialVersionUID = 1;
        private String schemaString;

        private Object readResolve() {
            return new p().b(this.schemaString);
        }
    }

    public static class t extends g {
    }

    public enum u {
        RECORD,
        ENUM,
        ARRAY,
        MAP,
        UNION,
        FIXED,
        STRING,
        BYTES,
        INT,
        LONG,
        FLOAT,
        DOUBLE,
        BOOLEAN,
        NULL;

        private final String name = name().toLowerCase(Locale.ENGLISH);

        u() {
        }

        public final String c() {
            return this.name;
        }
    }

    public static class v extends g {
        private final Map<String, Integer> indexByName;
        private final List<g> types;

        public v(j<g> jVar) {
            super(u.UNION);
            this.indexByName = new HashMap(Math.multiplyExact(2, jVar.size()));
            jVar.d();
            this.types = jVar;
            int i = 0;
            for (g gVar : jVar) {
                if (gVar.K() == u.UNION) {
                    r40.m("Nested union: ".concat(String.valueOf(this)));
                    throw null;
                }
                String strE = gVar.E();
                if (strE == null) {
                    r40.m("Nameless in union:".concat(String.valueOf(this)));
                    throw null;
                }
                int i2 = i + 1;
                if (this.indexByName.put(strE, Integer.valueOf(i)) != null) {
                    r40.m("Duplicate in union:".concat(strE));
                    throw null;
                }
                i = i2;
            }
        }

        @Override // org.apache.avro.g
        public final Integer F(String str) {
            return this.indexByName.get(str);
        }

        @Override // org.apache.avro.g
        public final String H() {
            return t40.k(super.H(), (String) this.types.stream().map(new sod()).collect(Collectors.joining(", ", "[", "]")));
        }

        @Override // org.apache.avro.g
        public final List<g> L() {
            return this.types;
        }

        @Override // org.apache.avro.g
        public final boolean P(JsonNode jsonNode) {
            return this.types.stream().anyMatch(new tod(jsonNode, 0));
        }

        @Override // org.apache.avro.g
        @Deprecated
        public final void Z(HashSet hashSet, String str, JsonGenerator jsonGenerator) {
            jsonGenerator.writeStartArray();
            Iterator<g> it = this.types.iterator();
            while (it.hasNext()) {
                it.next().Z(hashSet, str, jsonGenerator);
            }
            jsonGenerator.writeEndArray();
        }

        @Override // org.apache.avro.g
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof v)) {
                return false;
            }
            v vVar = (v) obj;
            return t(vVar) && this.types.equals(vVar.types) && h(vVar);
        }

        @Override // org.apache.avro.g
        public final void o(String str, String str2) {
            throw new AvroRuntimeException("Can't set properties on a union: ".concat(String.valueOf(this)));
        }

        @Override // org.apache.avro.g
        public final int r() {
            int iR = super.r();
            Iterator<g> it = this.types.iterator();
            while (it.hasNext()) {
                iR += it.next().r();
            }
            return iR;
        }
    }

    static {
        JsonFactory jsonFactory = new JsonFactory();
        b = jsonFactory;
        c = h49.b(g.class);
        ObjectMapper objectMapper = new ObjectMapper(jsonFactory);
        d = objectMapper;
        jsonFactory.enable(JsonParser.Feature.ALLOW_COMMENTS);
        jsonFactory.setCodec(objectMapper);
        HashSet hashSet = new HashSet(Arrays.asList("doc", "fields", "items", "name", "namespace", "size", "symbols", "values", "type", "aliases"));
        e = hashSet;
        HashSet hashSet2 = new HashSet(hashSet);
        f = hashSet2;
        hashSet2.add("default");
        V = Collections.unmodifiableSet(new HashSet(Arrays.asList("default", "doc", "name", "order", "type", "aliases")));
        W = new wkf(new lod());
        X = new wkf(new mod());
        HashMap map = new HashMap();
        Y = map;
        map.put("string", u.STRING);
        map.put("bytes", u.BYTES);
        map.put("int", u.INT);
        map.put("long", u.LONG);
        map.put("float", u.FLOAT);
        map.put("double", u.DOUBLE);
        map.put("boolean", u.BOOLEAN);
        map.put("null", u.NULL);
        Z = new wkf(new nod());
        a0 = new wkf(new ood());
    }

    public g(u uVar) {
        super(uVar == u.ENUM ? f : e);
        this.logicalType = null;
        this.hashCode = Integer.MIN_VALUE;
        this.type = uVar;
    }

    public static String J(JsonNode jsonNode, String str, String str2) {
        JsonNode jsonNode2 = jsonNode.get(str);
        String strTextValue = jsonNode2 != null ? jsonNode2.textValue() : null;
        if (strTextValue != null) {
            return strTextValue;
        }
        throw new SchemaParseException(z3.m(str2, ": ", String.valueOf(jsonNode)));
    }

    public static boolean Q(final JsonNode jsonNode, g gVar) {
        if (jsonNode == null) {
            return false;
        }
        switch (gVar.type.ordinal()) {
            case 0:
                if (!jsonNode.isObject()) {
                    return false;
                }
                for (f fVar : gVar.C()) {
                    g gVar2 = fVar.d;
                    String str = fVar.b;
                    if (!R(jsonNode.has(str) ? jsonNode.get(str) : fVar.f, gVar2)) {
                        return false;
                    }
                }
                return true;
            case 1:
            case 5:
            case 6:
            case 7:
                return jsonNode.isTextual();
            case 2:
                if (!jsonNode.isArray()) {
                    return false;
                }
                Iterator<JsonNode> it = jsonNode.iterator();
                while (it.hasNext()) {
                    if (!Q(it.next(), gVar.x())) {
                        return false;
                    }
                }
                return true;
            case 3:
                if (!jsonNode.isObject()) {
                    return false;
                }
                Iterator<JsonNode> it2 = jsonNode.iterator();
                while (it2.hasNext()) {
                    if (!Q(it2.next(), gVar.M())) {
                        return false;
                    }
                }
                return true;
            case 4:
                return gVar.L().stream().anyMatch(new Predicate() { // from class: rod
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return g.R(jsonNode, (g) obj);
                    }
                });
            case 8:
                return jsonNode.isIntegralNumber() && jsonNode.canConvertToInt();
            case DatadogLogGenerator.CRASH /* 9 */:
                return jsonNode.isIntegralNumber() && jsonNode.canConvertToLong();
            case 10:
            case 11:
                return jsonNode.isNumber();
            case 12:
                return jsonNode.isBoolean();
            case 13:
                return jsonNode.isNull();
            default:
                return false;
        }
    }

    public static boolean R(JsonNode jsonNode, g gVar) {
        if (jsonNode == null) {
            return false;
        }
        gVar.getClass();
        if (!(gVar instanceof v)) {
            return Q(jsonNode, gVar);
        }
        Iterator<g> it = gVar.L().iterator();
        while (it.hasNext()) {
            if (Q(jsonNode, it.next())) {
                return true;
            }
        }
        return false;
    }

    public static g S(JsonNode jsonNode, org.apache.avro.e eVar, String str) {
        HashSet hashSet;
        JsonNode doubleNode;
        if (jsonNode == null) {
            throw new SchemaParseException("Cannot parse <null> schema");
        }
        if (jsonNode.isTextual()) {
            return eVar.a(jsonNode.textValue(), str);
        }
        if (!jsonNode.isObject()) {
            if (!jsonNode.isArray()) {
                throw new SchemaParseException("Schema not yet supported: ".concat(String.valueOf(jsonNode)));
            }
            j jVar = new j(jsonNode.size());
            Iterator<JsonNode> it = jsonNode.iterator();
            while (it.hasNext()) {
                jVar.add(S(it.next(), eVar, str));
            }
            return new v(jVar);
        }
        String strJ = J(jsonNode, "type", "No type");
        boolean zEquals = "error".equals(strJ);
        HashMap map = Y;
        boolean zContainsKey = map.containsKey(strJ);
        HashSet hashSet2 = e;
        if (zContainsKey) {
            g gVarS = s((u) map.get(strJ));
            W(jsonNode, gVarS, hashSet2);
            return gVarS;
        }
        if (!"record".equals(strJ) && !zEquals) {
            if ("enum".equals(strJ)) {
                m mVarV = V(str, jsonNode);
                JsonNode jsonNode2 = jsonNode.get("doc");
                String strTextValue = jsonNode2 != null ? jsonNode2.textValue() : null;
                JsonNode jsonNode3 = jsonNode.get("symbols");
                if (jsonNode3 == null || !jsonNode3.isArray()) {
                    throw new SchemaParseException("Enum has no symbols: ".concat(String.valueOf(jsonNode)));
                }
                j jVar2 = new j(jsonNode3.size());
                Iterator<JsonNode> it2 = jsonNode3.iterator();
                while (it2.hasNext()) {
                    jVar2.add(it2.next().textValue());
                }
                JsonNode jsonNode4 = jsonNode.get("default");
                n eVar2 = new e(mVarV, strTextValue, jVar2, jsonNode4 != null ? jsonNode4.textValue() : null);
                eVar.b(eVar2);
                W(jsonNode, eVar2, f);
                U(jsonNode, eVar2);
                return eVar2;
            }
            if (strJ.equals("array")) {
                JsonNode jsonNode5 = jsonNode.get("items");
                if (jsonNode5 == null) {
                    throw new SchemaParseException("Array has no items type: ".concat(String.valueOf(jsonNode)));
                }
                a aVar = new a(S(jsonNode5, eVar, str));
                W(jsonNode, aVar, hashSet2);
                return aVar;
            }
            if (strJ.equals("map")) {
                JsonNode jsonNode6 = jsonNode.get("values");
                if (jsonNode6 == null) {
                    throw new SchemaParseException("Map has no values type: ".concat(String.valueOf(jsonNode)));
                }
                l lVar = new l(S(jsonNode6, eVar, str));
                W(jsonNode, lVar, hashSet2);
                return lVar;
            }
            if (!"fixed".equals(strJ)) {
                return eVar.a(strJ, str);
            }
            m mVarV2 = V(str, jsonNode);
            JsonNode jsonNode7 = jsonNode.get("doc");
            String strTextValue2 = jsonNode7 != null ? jsonNode7.textValue() : null;
            JsonNode jsonNode8 = jsonNode.get("size");
            if (jsonNode8 == null || !jsonNode8.isInt()) {
                throw new SchemaParseException("Invalid or no size: ".concat(String.valueOf(jsonNode)));
            }
            n c0379g = new C0379g(mVarV2, strTextValue2, jsonNode8.intValue());
            eVar.b(c0379g);
            W(jsonNode, c0379g, hashSet2);
            U(jsonNode, c0379g);
            return c0379g;
        }
        m mVarV3 = V(str, jsonNode);
        JsonNode jsonNode9 = jsonNode.get("doc");
        n qVar = new q(mVarV3, jsonNode9 != null ? jsonNode9.textValue() : null, zEquals);
        eVar.b(qVar);
        JsonNode jsonNode10 = jsonNode.get("fields");
        if (jsonNode10 == null || !jsonNode10.isArray()) {
            throw new SchemaParseException("Record has no fields: ".concat(String.valueOf(jsonNode)));
        }
        ArrayList arrayList = new ArrayList();
        for (JsonNode jsonNode11 : jsonNode10) {
            String str2 = mVarV3.b;
            String strJ2 = J(jsonNode11, "name", "No field name");
            JsonNode jsonNode12 = jsonNode11.get("doc");
            String strTextValue3 = jsonNode12 != null ? jsonNode12.textValue() : null;
            JsonNode jsonNode13 = jsonNode11.get("type");
            if (jsonNode13 == null) {
                throw new SchemaParseException("No field type: ".concat(String.valueOf(jsonNode11)));
            }
            g gVarS2 = S(jsonNode13, eVar, str2);
            f.b bVarValueOf = f.b.ASCENDING;
            JsonNode jsonNode14 = jsonNode11.get("order");
            if (jsonNode14 != null) {
                bVarValueOf = f.b.valueOf(jsonNode14.textValue().toUpperCase(Locale.ENGLISH));
            }
            f.b bVar = bVarValueOf;
            JsonNode jsonNode15 = jsonNode11.get("default");
            if (jsonNode15 == null || !((u.FLOAT.equals(gVarS2.type) || u.DOUBLE.equals(gVarS2.type)) && jsonNode15.isTextual())) {
                hashSet = hashSet2;
                doubleNode = jsonNode15;
            } else {
                hashSet = hashSet2;
                doubleNode = new DoubleNode(Double.parseDouble(jsonNode15.textValue()));
            }
            f fVar = new f(strJ2, gVarS2, strTextValue3, doubleNode, bVar);
            jsonNode11.fieldNames().forEachRemaining(new qod(V, fVar, jsonNode11));
            fVar.W = T(jsonNode11);
            arrayList.add(fVar);
            if (fVar.d.logicalType == null) {
                JsonNode jsonNode16 = jsonNode11.get("logicalType");
                if ((jsonNode16 != null ? jsonNode16.textValue() : null) != null) {
                    JsonNode jsonNode17 = jsonNode11.get("logicalType");
                    c.h(mVarV3, fVar.b, jsonNode17 != null ? jsonNode17.textValue() : null);
                }
            }
            hashSet2 = hashSet;
        }
        qVar.X(arrayList);
        W(jsonNode, qVar, hashSet2);
        U(jsonNode, qVar);
        return qVar;
    }

    public static LinkedHashSet T(JsonNode jsonNode) {
        JsonNode jsonNode2 = jsonNode.get("aliases");
        if (jsonNode2 == null) {
            return null;
        }
        if (!jsonNode2.isArray()) {
            throw new SchemaParseException("aliases not an array: ".concat(String.valueOf(jsonNode)));
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (JsonNode jsonNode3 : jsonNode2) {
            if (!jsonNode3.isTextual()) {
                throw new SchemaParseException("alias not a string: ".concat(String.valueOf(jsonNode3)));
            }
            linkedHashSet.add(jsonNode3.textValue());
        }
        return linkedHashSet;
    }

    public static void U(JsonNode jsonNode, n nVar) {
        LinkedHashSet linkedHashSetT = T(jsonNode);
        if (linkedHashSetT != null) {
            Iterator it = linkedHashSetT.iterator();
            while (it.hasNext()) {
                nVar.n((String) it.next());
            }
        }
    }

    public static m V(String str, JsonNode jsonNode) {
        JsonNode jsonNode2 = jsonNode.get("namespace");
        String strTextValue = jsonNode2 != null ? jsonNode2.textValue() : null;
        if (strTextValue != null) {
            str = strTextValue;
        }
        return new m(J(jsonNode, "name", "No name in schema"), str);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b0 A[Catch: RuntimeException -> 0x002e, TryCatch #0 {RuntimeException -> 0x002e, blocks: (B:5:0x0019, B:6:0x001d, B:46:0x00b0, B:51:0x00c2, B:49:0x00bc, B:8:0x0022, B:10:0x002a, B:13:0x0031, B:15:0x0039, B:16:0x003d, B:18:0x0045, B:19:0x0049, B:21:0x0051, B:22:0x0055, B:24:0x005d, B:25:0x0063, B:27:0x006b, B:28:0x006e, B:30:0x0076, B:31:0x0079, B:33:0x0081, B:34:0x0084, B:36:0x008c, B:37:0x008f, B:39:0x0097, B:40:0x009a, B:42:0x00a2, B:43:0x00a5, B:45:0x00ad), top: B:56:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bc A[Catch: RuntimeException -> 0x002e, TryCatch #0 {RuntimeException -> 0x002e, blocks: (B:5:0x0019, B:6:0x001d, B:46:0x00b0, B:51:0x00c2, B:49:0x00bc, B:8:0x0022, B:10:0x002a, B:13:0x0031, B:15:0x0039, B:16:0x003d, B:18:0x0045, B:19:0x0049, B:21:0x0051, B:22:0x0055, B:24:0x005d, B:25:0x0063, B:27:0x006b, B:28:0x006e, B:30:0x0076, B:31:0x0079, B:33:0x0081, B:34:0x0084, B:36:0x008c, B:37:0x008f, B:39:0x0097, B:40:0x009a, B:42:0x00a2, B:43:0x00a5, B:45:0x00ad), top: B:56:0x0019 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void W(com.fasterxml.jackson.databind.JsonNode r2, org.apache.avro.g r3, java.util.Set<java.lang.String> r4) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.avro.g.W(com.fasterxml.jackson.databind.JsonNode, org.apache.avro.g, java.util.Set):void");
    }

    public static void m(String str) {
        d.c cVarA = ((org.apache.avro.d) Z.get()).a(str);
        if (cVarA != org.apache.avro.d.a) {
            throw new SchemaParseException(cVarA.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.apache.avro.g p(org.apache.avro.g r12, java.util.IdentityHashMap r13, java.util.HashMap r14, java.util.HashMap r15) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.avro.g.p(org.apache.avro.g, java.util.IdentityHashMap, java.util.HashMap, java.util.HashMap):org.apache.avro.g");
    }

    public static g q(g gVar, g gVar2) {
        if (!gVar.equals(gVar2)) {
            IdentityHashMap identityHashMap = new IdentityHashMap(1);
            HashMap map = new HashMap(1);
            HashMap map2 = new HashMap(1);
            v(gVar2, identityHashMap, map, map2);
            if (!map.isEmpty() || !map2.isEmpty()) {
                identityHashMap.clear();
                return p(gVar, identityHashMap, map, map2);
            }
        }
        return gVar;
    }

    public static g s(u uVar) {
        switch (uVar.ordinal()) {
            case 6:
                return new t(u.STRING);
            case 7:
                return new c(u.BYTES);
            case 8:
                return new i(u.INT);
            case DatadogLogGenerator.CRASH /* 9 */:
                return new k(u.LONG);
            case 10:
                return new h(u.FLOAT);
            case 11:
                return new d(u.DOUBLE);
            case 12:
                return new b(u.BOOLEAN);
            case 13:
                return new o(u.NULL);
            default:
                r40.m("Can't create a: ".concat(String.valueOf(uVar)));
                return null;
        }
    }

    public static void v(g gVar, IdentityHashMap identityHashMap, HashMap map, HashMap map2) {
        n nVar;
        Set<m> set;
        if ((gVar instanceof n) && (set = (nVar = (n) gVar).aliases) != null) {
            Iterator<m> it = set.iterator();
            while (it.hasNext()) {
                map.put(it.next(), nVar.name);
            }
        }
        int iOrdinal = gVar.type.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 2) {
                v(gVar.x(), identityHashMap, map, map2);
                return;
            }
            if (iOrdinal == 3) {
                v(gVar.M(), identityHashMap, map, map2);
                return;
            } else {
                if (iOrdinal != 4) {
                    return;
                }
                Iterator<g> it2 = gVar.L().iterator();
                while (it2.hasNext()) {
                    v(it2.next(), identityHashMap, map, map2);
                }
                return;
            }
        }
        if (identityHashMap.containsKey(gVar)) {
            return;
        }
        identityHashMap.put(gVar, gVar);
        q qVar = (q) gVar;
        for (f fVar : gVar.C()) {
            LinkedHashSet linkedHashSet = fVar.W;
            if (linkedHashSet != null) {
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    ((Map) map2.computeIfAbsent(qVar.name, new pod())).put((String) it3.next(), fVar.b);
                }
            }
            v(fVar.d, identityHashMap, map, map2);
        }
        if (qVar.aliases == null || !map2.containsKey(qVar.name)) {
            return;
        }
        Iterator<m> it4 = qVar.aliases.iterator();
        while (it4.hasNext()) {
            map2.put(it4.next(), (Map) map2.get(qVar.name));
        }
    }

    public List<String> A() {
        throw new AvroRuntimeException("Not an enum: ".concat(String.valueOf(this)));
    }

    public f B(String str) {
        throw new AvroRuntimeException("Not a record: ".concat(String.valueOf(this)));
    }

    public List<f> C() {
        throw new AvroRuntimeException("Not a record: ".concat(String.valueOf(this)));
    }

    public int D() {
        throw new AvroRuntimeException("Not fixed: ".concat(String.valueOf(this)));
    }

    public String E() {
        return H();
    }

    public Integer F(String str) {
        throw new AvroRuntimeException("Not a union: ".concat(String.valueOf(this)));
    }

    public final p49 G() {
        return this.logicalType;
    }

    public String H() {
        return this.type.name;
    }

    public String I() {
        throw new AvroRuntimeException("Not a named type: ".concat(String.valueOf(this)));
    }

    public final u K() {
        return this.type;
    }

    public List<g> L() {
        throw new AvroRuntimeException("Not a union: ".concat(String.valueOf(this)));
    }

    public g M() {
        throw new AvroRuntimeException("Not a map: ".concat(String.valueOf(this)));
    }

    public boolean N() {
        throw new AvroRuntimeException("Not a record: ".concat(String.valueOf(this)));
    }

    public boolean O() {
        throw new AvroRuntimeException("Not a record: ".concat(String.valueOf(this)));
    }

    public boolean P(JsonNode jsonNode) {
        return Q(jsonNode, this);
    }

    public void X(List<f> list) {
        throw new AvroRuntimeException("Not a record: ".concat(String.valueOf(this)));
    }

    public final void Y(p49 p49Var) {
        this.logicalType = p49Var;
    }

    @Deprecated
    public void Z(HashSet hashSet, String str, JsonGenerator jsonGenerator) {
        if (!f()) {
            jsonGenerator.writeString(H());
            return;
        }
        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("type", H());
        k(jsonGenerator);
        jsonGenerator.writeEndObject();
    }

    @Override // org.apache.avro.b
    public final void a(Object obj, String str) {
        super.a(obj, str);
        this.hashCode = Integer.MIN_VALUE;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.type == gVar.type && t(gVar) && h(gVar);
    }

    public final int hashCode() {
        if (this.hashCode == Integer.MIN_VALUE) {
            this.hashCode = r();
        }
        return this.hashCode;
    }

    public void n(String str) {
        throw new AvroRuntimeException("Not a named type: ".concat(String.valueOf(this)));
    }

    public void o(String str, String str2) {
        b(str, TextNode.valueOf(str2));
        this.hashCode = Integer.MIN_VALUE;
    }

    public int r() {
        return i() + this.type.hashCode();
    }

    public final boolean t(g gVar) {
        int i2 = this.hashCode;
        int i3 = gVar.hashCode;
        return i2 == i3 || i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE;
    }

    public final String toString() {
        HashSet hashSet = new HashSet();
        try {
            StringWriter stringWriter = new StringWriter();
            JsonGenerator jsonGeneratorCreateGenerator = b.createGenerator(stringWriter);
            Z(hashSet, null, jsonGeneratorCreateGenerator);
            jsonGeneratorCreateGenerator.flush();
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new AvroRuntimeException(e2);
        }
    }

    public Set<String> u() {
        throw new AvroRuntimeException("Not a named type: ".concat(String.valueOf(this)));
    }

    public String w() {
        return null;
    }

    public Object writeReplace() {
        s sVar = new s();
        sVar.schemaString = toString();
        return sVar;
    }

    public g x() {
        throw new AvroRuntimeException("Not an array: ".concat(String.valueOf(this)));
    }

    public String y() {
        throw new AvroRuntimeException("Not an enum: ".concat(String.valueOf(this)));
    }

    public int z(String str) {
        throw new AvroRuntimeException("Not an enum: ".concat(String.valueOf(this)));
    }

    public static class j<E> extends ArrayList<E> {
        private static final long serialVersionUID = 1;
        private boolean locked;

        @SafeVarargs
        public j(E... eArr) {
            super(eArr.length);
            this.locked = false;
            Collections.addAll(this, eArr);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean add(E e) {
            c();
            return super.add(e);
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean addAll(Collection<? extends E> collection) {
            c();
            return super.addAll(collection);
        }

        public final void c() {
            if (this.locked) {
                bg.h();
            }
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final void clear() {
            c();
            super.clear();
        }

        public final void d() {
            this.locked = true;
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean remove(Object obj) {
            c();
            return super.remove(obj);
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean removeAll(Collection<?> collection) {
            c();
            return super.removeAll(collection);
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean retainAll(Collection<?> collection) {
            c();
            return super.retainAll(collection);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final boolean addAll(int i, Collection<? extends E> collection) {
            c();
            return super.addAll(i, collection);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final E remove(int i) {
            c();
            return (E) super.remove(i);
        }

        public j(List<E> list) {
            super(list);
            this.locked = false;
        }

        public j(int i) {
            super(i);
            this.locked = false;
        }
    }

    public static class q extends n {
        private Map<String, f> fieldMap;
        private List<f> fields;
        private final boolean isError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(m mVar) {
            super(u.RECORD, mVar, "unresolved schema");
            List<f> list = Collections.EMPTY_LIST;
            this.isError = false;
            X(list);
        }

        @Override // org.apache.avro.g
        public final f B(String str) {
            Map<String, f> map = this.fieldMap;
            if (map != null) {
                return map.get(str);
            }
            r40.m("Schema fields not set yet");
            return null;
        }

        @Override // org.apache.avro.g
        public final List<f> C() {
            List<f> list = this.fields;
            if (list != null) {
                return list;
            }
            r40.m("Schema fields not set yet");
            return null;
        }

        @Override // org.apache.avro.g
        public final boolean N() {
            return this.fields != null;
        }

        @Override // org.apache.avro.g
        public final boolean O() {
            return this.isError;
        }

        @Override // org.apache.avro.g
        public final void X(List<f> list) {
            if (this.fields != null) {
                r40.m("Fields are already set");
                return;
            }
            this.fieldMap = new HashMap(Math.multiplyExact(2, list.size()));
            j jVar = new j(list.size());
            int i = 0;
            for (f fVar : list) {
                int i2 = fVar.c;
                String str = fVar.b;
                if (i2 != -1) {
                    r40.m("Field already used: ".concat(String.valueOf(fVar)));
                    return;
                }
                int i3 = i + 1;
                fVar.c = i;
                f fVarPut = this.fieldMap.put(str, fVar);
                if (fVarPut != null) {
                    throw new AvroRuntimeException("Duplicate field " + str + " in record " + this.name + ": " + fVar + " and " + fVarPut + ".");
                }
                jVar.add(fVar);
                i = i3;
            }
            jVar.d();
            this.fields = jVar;
            this.hashCode = Integer.MIN_VALUE;
        }

        @Override // org.apache.avro.g
        @Deprecated
        public final void Z(HashSet hashSet, String str, JsonGenerator jsonGenerator) {
            if (c0(hashSet, str, jsonGenerator)) {
                return;
            }
            jsonGenerator.writeStartObject();
            jsonGenerator.writeStringField("type", this.isError ? "error" : "record");
            b0(str, jsonGenerator);
            String str2 = this.doc;
            if (str2 != null) {
                jsonGenerator.writeStringField("doc", str2);
            }
            if (this.fields != null) {
                jsonGenerator.writeFieldName("fields");
                String str3 = this.name.b;
                jsonGenerator.writeStartArray();
                for (f fVar : this.fields) {
                    jsonGenerator.writeStartObject();
                    String str4 = fVar.b;
                    JsonNode jsonNode = fVar.f;
                    jsonGenerator.writeStringField("name", str4);
                    jsonGenerator.writeFieldName("type");
                    fVar.d.Z(hashSet, str3, jsonGenerator);
                    String str5 = fVar.e;
                    if (str5 != null) {
                        jsonGenerator.writeStringField("doc", str5);
                    }
                    if (jsonNode != null) {
                        jsonGenerator.writeFieldName("default");
                        jsonGenerator.writeTree(jsonNode);
                    }
                    f.b bVar = fVar.V;
                    if (bVar != f.b.ASCENDING) {
                        jsonGenerator.writeStringField("order", bVar.name);
                    }
                    LinkedHashSet linkedHashSet = fVar.W;
                    if (linkedHashSet != null && !linkedHashSet.isEmpty()) {
                        jsonGenerator.writeFieldName("aliases");
                        jsonGenerator.writeStartArray();
                        Iterator it = fVar.W.iterator();
                        while (it.hasNext()) {
                            jsonGenerator.writeString((String) it.next());
                        }
                        jsonGenerator.writeEndArray();
                    }
                    fVar.k(jsonGenerator);
                    jsonGenerator.writeEndObject();
                }
                jsonGenerator.writeEndArray();
            }
            k(jsonGenerator);
            a0(jsonGenerator);
            jsonGenerator.writeEndObject();
        }

        @Override // org.apache.avro.g
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            if (!t(qVar) || !this.name.equals(qVar.name) || !h(qVar)) {
                return false;
            }
            Set set = (Set) g.W.get();
            r rVar = new r(this, (g) obj);
            if (set.contains(rVar)) {
                return true;
            }
            boolean zIsEmpty = set.isEmpty();
            try {
                set.add(rVar);
                return Objects.equals(this.fields, qVar.fields);
            } finally {
                if (zIsEmpty) {
                    set.clear();
                }
            }
        }

        @Override // org.apache.avro.g.n, org.apache.avro.g
        public final int r() {
            Map map = (Map) g.X.get();
            if (map.containsKey(this)) {
                return 0;
            }
            boolean zIsEmpty = map.isEmpty();
            try {
                map.put(this, this);
                return super.r() + this.fields.hashCode();
            } finally {
                if (zIsEmpty) {
                    map.clear();
                }
            }
        }

        public q(m mVar, String str, boolean z) {
            super(u.RECORD, mVar, str);
            this.isError = z;
        }
    }
}
