package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class y5e {
    public static final wrd a(int i, ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((wrd) arrayList.get(i2)).a == i) {
                return (wrd) arrayList.get(i2);
            }
        }
        return null;
    }

    public static final mif b(w4e w4eVar) {
        Function1 function1;
        ArrayList arrayList = new ArrayList();
        r5 r5Var = (r5) x4e.a(w4eVar, v4e.a);
        if (r5Var == null || (function1 = (Function1) r5Var.b) == null || !((Boolean) function1.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (mif) arrayList.get(0);
    }

    public static final pb0 c(tb0 tb0Var, int i) {
        Object next;
        Iterator<T> it = tb0Var.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((pm8) ((Map.Entry) next).getKey()).b == i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (pb0) entry.getValue();
        }
        return null;
    }

    public static final String d(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}
