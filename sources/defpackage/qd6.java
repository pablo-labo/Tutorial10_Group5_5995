package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class qd6 {
    public ArrayList<Object> a;

    public final boolean a(x20 x20Var) {
        ArrayList<Object> arrayList = this.a;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Object obj = arrayList.get(i);
                if (wl7.b(obj, x20Var)) {
                    return true;
                }
                if ((obj instanceof qd6) && ((qd6) obj).a(x20Var)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final qd6 b() {
        Object obj;
        ArrayList<Object> arrayList = this.a;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                obj = arrayList.get(size);
                if (obj instanceof qd6) {
                    break;
                }
            }
            obj = null;
        } else {
            obj = null;
        }
        qd6 qd6Var = obj instanceof qd6 ? (qd6) obj : null;
        return qd6Var != null ? qd6Var.b() : this;
    }

    public final boolean c(x20 x20Var) {
        ArrayList<Object> arrayList = this.a;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Object obj = arrayList.get(size);
                if (obj instanceof x20) {
                    if (obj == x20Var) {
                        arrayList.remove(size);
                    }
                } else if ((obj instanceof qd6) && !((qd6) obj).c(x20Var)) {
                    arrayList.remove(size);
                }
            }
            if (arrayList.isEmpty()) {
                this.a = null;
                return false;
            }
        }
        return true;
    }
}
