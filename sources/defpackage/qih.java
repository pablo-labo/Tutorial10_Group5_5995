package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class qih {
    public final String a;
    public final lb4 b;
    public lb4 c;

    public /* synthetic */ qih(String str) {
        lb4 lb4Var = new lb4();
        this.b = lb4Var;
        this.c = lb4Var;
        this.a = str;
    }

    public final void a(Object obj, String str) {
        lb4 lb4Var = new lb4();
        this.c.c = lb4Var;
        this.c = lb4Var;
        lb4Var.b = obj;
        lb4Var.a = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.a);
        sb.append('{');
        lb4 lb4Var = (lb4) this.b.c;
        String str = "";
        while (lb4Var != null) {
            Object obj = lb4Var.b;
            sb.append(str);
            String str2 = (String) lb4Var.a;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r1.length() - 1);
            }
            lb4Var = (lb4) lb4Var.c;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
