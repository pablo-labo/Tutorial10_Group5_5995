package defpackage;

import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public class qoe {
    public static final ArrayList a;
    public static final ArrayList b;
    public static final Map<a.C0395a, c> c;
    public static final LinkedHashMap d;
    public static final Set<n8a> e;
    public static final Set<String> f;
    public static final a.C0395a g;
    public static final Map<a.C0395a, n8a> h;
    public static final LinkedHashMap i;
    public static final HashSet j;
    public static final LinkedHashMap k;

    public static final class a {

        /* JADX INFO: renamed from: qoe$a$a, reason: collision with other inner class name */
        public static final class C0395a {
            public final String a;
            public final n8a b;
            public final String c;
            public final String d;
            public final String e;

            public C0395a(String str, n8a n8aVar, String str2, String str3) {
                this.a = str;
                this.b = n8aVar;
                this.c = str2;
                this.d = str3;
                this.e = g7.e(JwtParser.SEPARATOR_CHAR, str, n8aVar + '(' + str2 + ')' + str3);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0395a)) {
                    return false;
                }
                C0395a c0395a = (C0395a) obj;
                return this.a.equals(c0395a.a) && this.b.equals(c0395a.b) && this.c.equals(c0395a.c) && this.d.equals(c0395a.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + akb.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("NameAndSignature(classInternalName=");
                sb.append(this.a);
                sb.append(", name=");
                sb.append(this.b);
                sb.append(", parameters=");
                sb.append(this.c);
                sb.append(", returnType=");
                return w40.f(sb, this.d, ')');
            }
        }

        public static final C0395a a(String str, String str2, String str3, String str4) {
            ArrayList arrayList = qoe.a;
            return new C0395a(str, n8a.h(str2), str3, str4);
        }
    }

    public enum b {
        a("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        b(null, true),
        c("Ljava/lang/Object;", true);

        private final boolean isObjectReplacedWithTypeParameter;
        private final String valueParametersSignature;

        b(String str, boolean z) {
            this.valueParametersSignature = str;
            this.isObjectReplacedWithTypeParameter = z;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final c a;
        public static final c b;
        public static final c c;
        public static final a d;
        public static final /* synthetic */ c[] e;
        private final Object defaultValue;

        public static final class a extends c {
        }

        static {
            c cVar = new c("NULL", 0, null);
            a = cVar;
            c cVar2 = new c("INDEX", 1, -1);
            b = cVar2;
            c cVar3 = new c("FALSE", 2, Boolean.FALSE);
            c = cVar3;
            a aVar = new a("MAP_GET_OR_DEFAULT", 3, null);
            d = aVar;
            e = new c[]{cVar, cVar2, cVar3, aVar};
        }

        public c(String str, int i, Object obj) {
            this.defaultValue = obj;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) e.clone();
        }
    }

    static {
        Set<String> setI0 = ut0.I0(new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(t92.r0(setI0, 10));
        for (String str : setI0) {
            String strE = md8.BOOLEAN.e();
            strE.getClass();
            arrayList.add(a.a("java/util/Collection", str, "Ljava/util/Collection;", strE));
        }
        a = arrayList;
        ArrayList arrayList2 = new ArrayList(t92.r0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((a.C0395a) it.next()).e);
        }
        b = arrayList2;
        ArrayList arrayList3 = a;
        ArrayList arrayList4 = new ArrayList(t92.r0(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((a.C0395a) it2.next()).b.c());
        }
        String strConcat = "java/util/".concat("Collection");
        md8 md8Var = md8.BOOLEAN;
        String strE2 = md8Var.e();
        strE2.getClass();
        a.C0395a c0395aA = a.a(strConcat, "contains", "Ljava/lang/Object;", strE2);
        c cVar = c.c;
        Pair pair = new Pair(c0395aA, cVar);
        String strConcat2 = "java/util/".concat("Collection");
        String strE3 = md8Var.e();
        strE3.getClass();
        Pair pair2 = new Pair(a.a(strConcat2, "remove", "Ljava/lang/Object;", strE3), cVar);
        String strConcat3 = "java/util/".concat("Map");
        String strE4 = md8Var.e();
        strE4.getClass();
        Pair pair3 = new Pair(a.a(strConcat3, "containsKey", "Ljava/lang/Object;", strE4), cVar);
        String strConcat4 = "java/util/".concat("Map");
        String strE5 = md8Var.e();
        strE5.getClass();
        Pair pair4 = new Pair(a.a(strConcat4, "containsValue", "Ljava/lang/Object;", strE5), cVar);
        String strConcat5 = "java/util/".concat("Map");
        String strE6 = md8Var.e();
        strE6.getClass();
        Pair pair5 = new Pair(a.a(strConcat5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", strE6), cVar);
        Pair pair6 = new Pair(a.a("java/util/".concat("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), c.d);
        a.C0395a c0395aA2 = a.a("java/util/".concat("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        c cVar2 = c.a;
        Pair pair7 = new Pair(c0395aA2, cVar2);
        Pair pair8 = new Pair(a.a("java/util/".concat("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), cVar2);
        String strConcat6 = "java/util/".concat("List");
        md8 md8Var2 = md8.INT;
        String strE7 = md8Var2.e();
        strE7.getClass();
        a.C0395a c0395aA3 = a.a(strConcat6, "indexOf", "Ljava/lang/Object;", strE7);
        c cVar3 = c.b;
        Pair pair9 = new Pair(c0395aA3, cVar3);
        String strConcat7 = "java/util/".concat("List");
        String strE8 = md8Var2.e();
        strE8.getClass();
        Map<a.C0395a, c> mapA0 = lc9.a0(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, new Pair(a.a(strConcat7, "lastIndexOf", "Ljava/lang/Object;", strE8), cVar3));
        c = mapA0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kc9.V(mapA0.size()));
        Iterator<T> it3 = mapA0.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            linkedHashMap.put(((a.C0395a) entry.getKey()).e, entry.getValue());
        }
        d = linkedHashMap;
        LinkedHashSet linkedHashSetO = bbe.o(c.keySet(), a);
        ArrayList arrayList5 = new ArrayList(t92.r0(linkedHashSetO, 10));
        Iterator it4 = linkedHashSetO.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((a.C0395a) it4.next()).b);
        }
        e = z92.E1(arrayList5);
        ArrayList arrayList6 = new ArrayList(t92.r0(linkedHashSetO, 10));
        Iterator it5 = linkedHashSetO.iterator();
        while (it5.hasNext()) {
            arrayList6.add(((a.C0395a) it5.next()).e);
        }
        f = z92.E1(arrayList6);
        md8 md8Var3 = md8.INT;
        String strE9 = md8Var3.e();
        strE9.getClass();
        a.C0395a c0395aA4 = a.a("java/util/List", "removeAt", strE9, "Ljava/lang/Object;");
        g = c0395aA4;
        String strConcat8 = "java/lang/".concat("Number");
        String strE10 = md8.BYTE.e();
        strE10.getClass();
        Pair pair10 = new Pair(a.a(strConcat8, "toByte", "", strE10), n8a.h("byteValue"));
        String strConcat9 = "java/lang/".concat("Number");
        String strE11 = md8.SHORT.e();
        strE11.getClass();
        Pair pair11 = new Pair(a.a(strConcat9, "toShort", "", strE11), n8a.h("shortValue"));
        String strConcat10 = "java/lang/".concat("Number");
        String strE12 = md8Var3.e();
        strE12.getClass();
        Pair pair12 = new Pair(a.a(strConcat10, "toInt", "", strE12), n8a.h("intValue"));
        String strConcat11 = "java/lang/".concat("Number");
        String strE13 = md8.LONG.e();
        strE13.getClass();
        Pair pair13 = new Pair(a.a(strConcat11, "toLong", "", strE13), n8a.h("longValue"));
        String strConcat12 = "java/lang/".concat("Number");
        String strE14 = md8.FLOAT.e();
        strE14.getClass();
        Pair pair14 = new Pair(a.a(strConcat12, "toFloat", "", strE14), n8a.h("floatValue"));
        String strConcat13 = "java/lang/".concat("Number");
        String strE15 = md8.DOUBLE.e();
        strE15.getClass();
        Pair pair15 = new Pair(a.a(strConcat13, "toDouble", "", strE15), n8a.h("doubleValue"));
        Pair pair16 = new Pair(c0395aA4, n8a.h("remove"));
        String strConcat14 = "java/lang/".concat("CharSequence");
        String strE16 = md8Var3.e();
        strE16.getClass();
        String strE17 = md8.CHAR.e();
        strE17.getClass();
        Map<a.C0395a, n8a> mapA02 = lc9.a0(pair10, pair11, pair12, pair13, pair14, pair15, pair16, new Pair(a.a(strConcat14, "get", strE16, strE17), n8a.h("charAt")), new Pair(a.a("java/util/concurrent/atomic/".concat("AtomicInteger"), "load", "", "I"), n8a.h("get")), new Pair(a.a("java/util/concurrent/atomic/".concat("AtomicInteger"), "store", "I", "V"), n8a.h("set")), new Pair(a.a("java/util/concurrent/atomic/".concat("AtomicInteger"), "exchange", "I", "I"), n8a.h("getAndSet")), new Pair(a.a("java/util/concurrent/atomic/".concat("AtomicInteger"), "fetchAndAdd", "I", "I"), n8a.h("getAndAdd")), new Pair(a.a("java/util/concurrent/atomic/".concat("AtomicInteger"), "addAndFetch", "I", "I"), n8a.h("addAndGet")), new Pair(a.a("java/util/concurrent/atomic/".concat("AtomicLong"), "load", "", "J"), n8a.h("get")), new Pair(a.a("java/util/concurrent/atomic/".concat("AtomicLong"), "store", "J", "V"), n8a.h("set")), new Pair(a.a("java/util/concurrent/atomic/".concat("AtomicLong"), "exchange", "J", "J"), n8a.h("getAndSet")), new Pair(a.a("java/util/concurrent/atomic/".concat("AtomicLong"), "fetchAndAdd", "J", "J"), n8a.h("getAndAdd")), new Pair(a.a("java/util/concurrent/atomic/".concat("AtomicLong"), "addAndFetch", "J", "J"), n8a.h("addAndGet")), new Pair(a.a("java/util/concurrent/atomic/".concat("AtomicBoolean"), "load", "", "Z"), n8a.h("get")), new Pair(a.a("java/util/concurrent/atomic/".concat("AtomicBoolean"), "store", "Z", "V"), n8a.h("set")), new Pair(a.a("java/util/concurrent/atomic/".concat("AtomicBoolean"), "exchange", "Z", "Z"), n8a.h("getAndSet")), new Pair(a.a("java/util/concurrent/atomic/".concat("AtomicReference"), "load", "", "Ljava/lang/Object;"), n8a.h("get")), new Pair(a.a("java/util/concurrent/atomic/".concat("AtomicReference"), "store", "Ljava/lang/Object;", "V"), n8a.h("set")), new Pair(a.a("java/util/concurrent/atomic/".concat("AtomicReference"), "exchange", "Ljava/lang/Object;", "Ljava/lang/Object;"), n8a.h("getAndSet")), new Pair(a.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "loadAt", "I", "I"), n8a.h("get")), new Pair(a.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "storeAt", "II", "V"), n8a.h("set")), new Pair(a.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "exchangeAt", "II", "I"), n8a.h("getAndSet")), new Pair(a.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "compareAndSetAt", "III", "Z"), n8a.h("compareAndSet")), new Pair(a.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "fetchAndAddAt", "II", "I"), n8a.h("getAndAdd")), new Pair(a.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "addAndFetchAt", "II", "I"), n8a.h("addAndGet")), new Pair(a.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "loadAt", "I", "J"), n8a.h("get")), new Pair(a.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "storeAt", "IJ", "V"), n8a.h("set")), new Pair(a.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "exchangeAt", "IJ", "J"), n8a.h("getAndSet")), new Pair(a.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "compareAndSetAt", "IJJ", "Z"), n8a.h("compareAndSet")), new Pair(a.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "fetchAndAddAt", "IJ", "J"), n8a.h("getAndAdd")), new Pair(a.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "addAndFetchAt", "IJ", "J"), n8a.h("addAndGet")), new Pair(a.a("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "loadAt", "I", "Ljava/lang/Object;"), n8a.h("get")), new Pair(a.a("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "storeAt", "ILjava/lang/Object;", "V"), n8a.h("set")), new Pair(a.a("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "exchangeAt", "ILjava/lang/Object;", "Ljava/lang/Object;"), n8a.h("getAndSet")), new Pair(a.a("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "compareAndSetAt", "ILjava/lang/Object;Ljava/lang/Object;", "Z"), n8a.h("compareAndSet")));
        h = mapA02;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(kc9.V(mapA02.size()));
        Iterator<T> it6 = mapA02.entrySet().iterator();
        while (it6.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it6.next();
            linkedHashMap2.put(((a.C0395a) entry2.getKey()).e, entry2.getValue());
        }
        i = linkedHashMap2;
        Map<a.C0395a, n8a> map = h;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<a.C0395a, n8a> entry3 : map.entrySet()) {
            a.C0395a key = entry3.getKey();
            n8a value = entry3.getValue();
            String str2 = key.a;
            String str3 = key.c;
            String str4 = key.d;
            value.getClass();
            linkedHashSet.add(str2 + JwtParser.SEPARATOR_CHAR + (value + '(' + str3 + ')' + str4));
        }
        Set<a.C0395a> setKeySet = h.keySet();
        HashSet hashSet = new HashSet();
        Iterator<T> it7 = setKeySet.iterator();
        while (it7.hasNext()) {
            hashSet.add(((a.C0395a) it7.next()).b);
        }
        j = hashSet;
        Set<Map.Entry<a.C0395a, n8a>> setEntrySet = h.entrySet();
        ArrayList<Pair> arrayList7 = new ArrayList(t92.r0(setEntrySet, 10));
        Iterator<T> it8 = setEntrySet.iterator();
        while (it8.hasNext()) {
            Map.Entry entry4 = (Map.Entry) it8.next();
            arrayList7.add(new Pair(((a.C0395a) entry4.getKey()).b, entry4.getValue()));
        }
        int iV = kc9.V(t92.r0(arrayList7, 10));
        if (iV < 16) {
            iV = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iV);
        for (Pair pair17 : arrayList7) {
            linkedHashMap3.put((n8a) pair17.e(), (n8a) pair17.d());
        }
        k = linkedHashMap3;
    }
}
