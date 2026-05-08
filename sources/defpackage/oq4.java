package defpackage;

import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public final class oq4 {
    public final a a;

    public static class a extends b {
        public final EditText a;
        public final xq4 b;

        public a(EditText editText) {
            this.a = editText;
            xq4 xq4Var = new xq4(editText);
            this.b = xq4Var;
            editText.addTextChangedListener(xq4Var);
            if (pq4.b == null) {
                synchronized (pq4.a) {
                    try {
                        if (pq4.b == null) {
                            pq4 pq4Var = new pq4();
                            try {
                                pq4.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, pq4.class.getClassLoader());
                            } catch (Throwable unused) {
                            }
                            pq4.b = pq4Var;
                        }
                    } finally {
                    }
                }
            }
            editText.setEditableFactory(pq4.b);
        }
    }

    public static class b {
    }

    public oq4(EditText editText) {
        this.a = new a(editText);
    }
}
