package defpackage;

import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class a7e extends v6e {
    public static <T> int P(r6e<? extends T> r6eVar) {
        r6eVar.getClass();
        Iterator<? extends T> it = r6eVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                u63.n0();
                throw null;
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> r6e<T> Q(r6e<? extends T> r6eVar, int i) {
        if (i >= 0) {
            return i == 0 ? r6eVar : r6eVar instanceof ld4 ? ((ld4) r6eVar).a(i) : new gd4(r6eVar, i);
        }
        h5.k(bg.d(i, "Requested element count ", " is less than zero."));
        return null;
    }

    public static <T> T R(r6e<? extends T> r6eVar, int i) {
        r6eVar.getClass();
        if (i < 0) {
            l5.s(bg.c(JwtParser.SEPARATOR_CHAR, i, "Sequence doesn't contain element at index "));
            return null;
        }
        int i2 = 0;
        for (T t : r6eVar) {
            int i3 = i2 + 1;
            if (i == i2) {
                return t;
            }
            i2 = i3;
        }
        l5.s(bg.c(JwtParser.SEPARATOR_CHAR, i, "Sequence doesn't contain element at index "));
        return null;
    }

    public static <T> T S(r6e<? extends T> r6eVar) {
        Iterator<? extends T> it = r6eVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static String T(r6e r6eVar, String str) {
        r6eVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : r6eVar) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            awd.c(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static <T> T U(r6e<? extends T> r6eVar) {
        Iterator<? extends T> it = r6eVar.iterator();
        if (!it.hasNext()) {
            s6.j("Sequence is empty.");
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static cc5 V(r6e r6eVar, Function1 function1) {
        function1.getClass();
        return new cc5(new xrf(r6eVar, function1), false, new tb(13));
    }

    public static <T> List<T> W(r6e<? extends T> r6eVar) {
        r6eVar.getClass();
        Iterator<? extends T> it = r6eVar.iterator();
        if (!it.hasNext()) {
            return zr4.a;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return u63.Z(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
