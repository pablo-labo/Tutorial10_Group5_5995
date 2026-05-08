package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class id8 implements o8a {
    public static final List<String> d;
    public final String[] a;
    public final Set<Integer> b;
    public final ArrayList c;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String strW0 = z92.W0(u63.a0('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
        List<String> listA0 = u63.a0(strW0.concat("/Any"), strW0.concat("/Nothing"), strW0.concat("/Unit"), strW0.concat("/Throwable"), strW0.concat("/Number"), strW0.concat("/Byte"), strW0.concat("/Double"), strW0.concat("/Float"), strW0.concat("/Int"), strW0.concat("/Long"), strW0.concat("/Short"), strW0.concat("/Boolean"), strW0.concat("/Char"), strW0.concat("/CharSequence"), strW0.concat("/String"), strW0.concat("/Comparable"), strW0.concat("/Enum"), strW0.concat("/Array"), strW0.concat("/ByteArray"), strW0.concat("/DoubleArray"), strW0.concat("/FloatArray"), strW0.concat("/IntArray"), strW0.concat("/LongArray"), strW0.concat("/ShortArray"), strW0.concat("/BooleanArray"), strW0.concat("/CharArray"), strW0.concat("/Cloneable"), strW0.concat("/Annotation"), strW0.concat("/collections/Iterable"), strW0.concat("/collections/MutableIterable"), strW0.concat("/collections/Collection"), strW0.concat("/collections/MutableCollection"), strW0.concat("/collections/List"), strW0.concat("/collections/MutableList"), strW0.concat("/collections/Set"), strW0.concat("/collections/MutableSet"), strW0.concat("/collections/Map"), strW0.concat("/collections/MutableMap"), strW0.concat("/collections/Map.Entry"), strW0.concat("/collections/MutableMap.MutableEntry"), strW0.concat("/collections/Iterator"), strW0.concat("/collections/MutableIterator"), strW0.concat("/collections/ListIterator"), strW0.concat("/collections/MutableListIterator"));
        d = listA0;
        na7 na7VarG1 = z92.G1(listA0);
        int iV = kc9.V(t92.r0(na7VarG1, 10));
        if (iV < 16) {
            iV = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iV);
        Iterator it = na7VarG1.iterator();
        while (true) {
            oa7 oa7Var = (oa7) it;
            if (!oa7Var.a.hasNext()) {
                return;
            }
            ma7 ma7Var = (ma7) oa7Var.next();
            linkedHashMap.put((String) ma7Var.b, Integer.valueOf(ma7Var.a));
        }
    }

    public id8(String[] strArr, Set set, ArrayList arrayList) {
        strArr.getClass();
        this.a = strArr;
        this.b = set;
        this.c = arrayList;
    }

    @Override // defpackage.o8a
    public final boolean a(int i) {
        return this.b.contains(Integer.valueOf(i));
    }

    @Override // defpackage.o8a
    public final String b(int i) {
        return getString(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    @Override // defpackage.o8a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String getString(int r8) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.id8.getString(int):java.lang.String");
    }
}
