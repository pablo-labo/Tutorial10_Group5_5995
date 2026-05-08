package defpackage;

import androidx.compose.ui.layout.g;
import androidx.compose.ui.layout.q;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface ag9 {
    default int a(ql7 ql7Var, List<? extends pl7> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new mo3(list.get(i3), rl7.b, ul7.a, i2));
        }
        return c(new g(ql7Var, ql7Var.getLayoutDirection()), arrayList, mq2.b(0, i, 7)).getWidth();
    }

    bg9 c(q qVar, List<? extends vf9> list, long j);

    default int e(ql7 ql7Var, List<? extends pl7> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new mo3(list.get(i3), rl7.a, ul7.a, i2));
        }
        return c(new g(ql7Var, ql7Var.getLayoutDirection()), arrayList, mq2.b(0, i, 7)).getWidth();
    }

    default int f(ql7 ql7Var, List<? extends pl7> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new mo3(list.get(i3), rl7.b, ul7.b, i2));
        }
        return c(new g(ql7Var, ql7Var.getLayoutDirection()), arrayList, mq2.b(i, 0, 13)).getHeight();
    }

    default int h(ql7 ql7Var, List<? extends pl7> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new mo3(list.get(i3), rl7.a, ul7.b, i2));
        }
        return c(new g(ql7Var, ql7Var.getLayoutDirection()), arrayList, mq2.b(i, 0, 13)).getHeight();
    }
}
