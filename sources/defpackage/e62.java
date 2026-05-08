package defpackage;

import io.jsonwebtoken.JwtParser;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e62 {
    public static final String a = z92.W0(u63.a0('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
    public static final LinkedHashMap b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listA0 = u63.a0("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iO = ojh.o(0, listA0.size() - 1, 2);
        if (iO >= 0) {
            int i = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                String str = a;
                sb.append(str);
                sb.append('/');
                sb.append((String) listA0.get(i));
                int i2 = i + 1;
                linkedHashMap.put(sb.toString(), listA0.get(i2));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append('/');
                linkedHashMap.put(l6.i(sb2, (String) listA0.get(i), "Array"), "[" + ((String) listA0.get(i2)));
                if (i == iO) {
                    break;
                } else {
                    i += 2;
                }
            }
        }
        linkedHashMap.put(a + "/Unit", "V");
        a(linkedHashMap, "Any", "java/lang/Object");
        a(linkedHashMap, "Nothing", "java/lang/Void");
        a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : u63.a0("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : u63.a0("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(linkedHashMap, l5.l("collections/", str3), "java/util/" + str3);
            a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i3 = 0; i3 < 23; i3++) {
            String strC = p6.c(i3, "Function");
            StringBuilder sb3 = new StringBuilder();
            String str4 = a;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i3);
            a(linkedHashMap, strC, sb3.toString());
            a(linkedHashMap, "reflect/KFunction" + i3, str4 + "/reflect/KFunction");
        }
        for (String str5 : u63.a0("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(linkedHashMap, t40.k(str5, ".Companion"), z3.n(new StringBuilder(), a, "/jvm/internal/", str5, "CompanionObject"));
        }
        b = linkedHashMap;
    }

    public static final void a(LinkedHashMap linkedHashMap, String str, String str2) {
        linkedHashMap.put(a + '/' + str, "L" + str2 + ';');
    }

    public static final String b(String str) {
        str.getClass();
        String str2 = (String) b.get(str);
        if (str2 != null) {
            return str2;
        }
        StringBuilder sb = new StringBuilder("L");
        String strReplace = str.replace(JwtParser.SEPARATOR_CHAR, '$');
        strReplace.getClass();
        sb.append(strReplace);
        sb.append(';');
        return sb.toString();
    }
}
