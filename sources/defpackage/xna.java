package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class xna {

    public static final class a {
        public final ArrayList a = new ArrayList();
        public final Object b;

        public /* synthetic */ a(Object obj) {
            this.b = obj;
        }

        public final void a(Object obj, String str) {
            int length = str.length();
            String strValueOf = String.valueOf(obj);
            this.a.add(m6.h(new StringBuilder(length + 1 + strValueOf.length()), str, "=", strValueOf));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.b.getClass().getSimpleName());
            sb.append('{');
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                sb.append((String) arrayList.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
