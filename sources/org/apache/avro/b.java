package org.apache.avro;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import defpackage.l5;
import defpackage.ob9;
import defpackage.r40;
import defpackage.r6;
import defpackage.tt7;
import defpackage.w6;
import java.io.IOException;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final c a;
    private ConcurrentMap<String, JsonNode> props = new C0374b();
    private Set<String> reserved;

    public class a extends w6.b {
    }

    /* JADX INFO: renamed from: org.apache.avro.b$b, reason: collision with other inner class name */
    public class C0374b extends ConcurrentHashMap<String, JsonNode> {
        private static final long serialVersionUID = 1;
        private Queue<ob9<String, JsonNode>> propOrder = new ConcurrentLinkedQueue();

        /* JADX INFO: renamed from: org.apache.avro.b$b$a */
        public class a extends AbstractSet<Map.Entry<String, JsonNode>> {

            /* JADX INFO: renamed from: org.apache.avro.b$b$a$a, reason: collision with other inner class name */
            public class C0375a implements Iterator<Map.Entry<String, JsonNode>> {
                public Iterator<ob9<String, JsonNode>> a;

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    return this.a.hasNext();
                }

                @Override // java.util.Iterator
                public final Map.Entry<String, JsonNode> next() {
                    return this.a.next();
                }
            }

            public a() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<String, JsonNode>> iterator() {
                C0375a c0375a = new C0375a();
                c0375a.a = C0374b.this.propOrder.iterator();
                return c0375a;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                return C0374b.this.propOrder.size();
            }
        }

        public C0374b() {
        }

        @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
        public final Set<Map.Entry<String, JsonNode>> entrySet() {
            return new a();
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [V, com.fasterxml.jackson.databind.JsonNode, java.lang.Object] */
        @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
        public final Object put(Object obj, Object obj2) {
            String str = (String) obj;
            ?? r4 = (JsonNode) obj2;
            JsonNode jsonNode = (JsonNode) super.putIfAbsent(str, r4);
            if (jsonNode == null) {
                Queue<ob9<String, JsonNode>> queue = this.propOrder;
                ob9<String, JsonNode> ob9Var = new ob9<>();
                ob9Var.a = str;
                ob9Var.b = r4;
                queue.add(ob9Var);
            }
            return jsonNode;
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [V, com.fasterxml.jackson.databind.JsonNode, java.lang.Object] */
        @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
        public final Object putIfAbsent(Object obj, Object obj2) {
            String str = (String) obj;
            ?? r4 = (JsonNode) obj2;
            JsonNode jsonNode = (JsonNode) super.putIfAbsent(str, r4);
            if (jsonNode == null) {
                Queue<ob9<String, JsonNode>> queue = this.propOrder;
                ob9<String, JsonNode> ob9Var = new ob9<>();
                ob9Var.a = str;
                ob9Var.b = r4;
                queue.add(ob9Var);
            }
            return jsonNode;
        }
    }

    public static class c {
    }

    static {
        a aVar = new a();
        if (w6.a != null) {
            r6.g("JsonPropertiesAccessor already initialized");
        } else {
            w6.a = aVar;
            a = new c();
        }
    }

    public b(Set<String> set) {
        this.reserved = set;
    }

    public void a(Object obj, String str) {
        JsonNode jsonNode;
        if (obj instanceof JsonNode) {
            b(str, (JsonNode) obj);
            return;
        }
        if (obj == null) {
            jsonNode = null;
        } else {
            try {
                TokenBuffer tokenBuffer = new TokenBuffer((ObjectCodec) new ObjectMapper(), false);
                tt7.a(obj, tokenBuffer);
                jsonNode = (JsonNode) new ObjectMapper().readTree(tokenBuffer.asParser());
            } catch (IOException e) {
                throw new AvroRuntimeException(e);
            }
        }
        b(str, jsonNode);
    }

    public final void b(String str, JsonNode jsonNode) {
        if (this.reserved.contains(str)) {
            r40.m(l5.l("Can't set reserved property: ", str));
            return;
        }
        if (jsonNode == null) {
            r40.m(l5.l("Can't set a property to null: ", str));
            return;
        }
        JsonNode jsonNodePutIfAbsent = this.props.putIfAbsent(str, jsonNode);
        if (jsonNodePutIfAbsent == null || jsonNodePutIfAbsent.equals(jsonNode)) {
            return;
        }
        r40.m(l5.l("Can't overwrite property: ", str));
    }

    public final Object c(String str) {
        return tt7.b(this.props.get(str), null);
    }

    public final Map<String, Object> d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, JsonNode> entry : this.props.entrySet()) {
            linkedHashMap.put(entry.getKey(), tt7.b(entry.getValue(), null));
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    public final String e(String str) {
        JsonNode jsonNode = this.props.get(str);
        if (jsonNode == null || !jsonNode.isTextual()) {
            return null;
        }
        return jsonNode.textValue();
    }

    public final boolean f() {
        return !this.props.isEmpty();
    }

    public final boolean g(String str) {
        return this.props.containsKey(str);
    }

    public final boolean h(b bVar) {
        return Objects.equals(this.props, bVar.props);
    }

    public final int i() {
        return this.props.hashCode();
    }

    public final void j(b bVar) {
        for (Map.Entry<String, JsonNode> entry : bVar.props.entrySet()) {
            b(entry.getKey(), entry.getValue());
        }
    }

    public final void k(JsonGenerator jsonGenerator) {
        for (Map.Entry<String, JsonNode> entry : this.props.entrySet()) {
            jsonGenerator.writeObjectField(entry.getKey(), entry.getValue());
        }
    }
}
