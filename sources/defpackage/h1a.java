package defpackage;

import androidx.compose.ui.layout.g;
import androidx.compose.ui.layout.q;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface h1a {
    default int a(ql7 ql7Var, List<? extends List<? extends pl7>> list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new mo3((pl7) list2.get(i3), rl7.b, ul7.a, 0));
            }
            arrayList2.add(arrayList3);
        }
        return c(new g(ql7Var, ql7Var.getLayoutDirection()), arrayList2, mq2.b(0, i, 7)).getWidth();
    }

    bg9 c(q qVar, List<? extends List<? extends vf9>> list, long j);

    default int e(ql7 ql7Var, List<? extends List<? extends pl7>> list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new mo3((pl7) list2.get(i3), rl7.a, ul7.a, 0));
            }
            arrayList2.add(arrayList3);
        }
        return c(new g(ql7Var, ql7Var.getLayoutDirection()), arrayList2, mq2.b(0, i, 7)).getWidth();
    }

    default int f(ql7 ql7Var, List<? extends List<? extends pl7>> list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new mo3((pl7) list2.get(i3), rl7.b, ul7.b, 0));
            }
            arrayList2.add(arrayList3);
        }
        return c(new g(ql7Var, ql7Var.getLayoutDirection()), arrayList2, mq2.b(i, 0, 13)).getHeight();
    }

    default int h(ql7 ql7Var, List<? extends List<? extends pl7>> list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new mo3((pl7) list2.get(i3), rl7.a, ul7.b, 0));
            }
            arrayList2.add(arrayList3);
        }
        return c(new g(ql7Var, ql7Var.getLayoutDirection()), arrayList2, mq2.b(i, 0, 13)).getHeight();
    }
}
