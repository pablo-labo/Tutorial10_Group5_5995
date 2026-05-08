package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class v8e {
    public static final qyc d = e47.n(40010);
    public static final qyc e;
    public static final String f;
    public static final String g;
    public static final String h;
    public final int a;
    public final String b;
    public final Bundle c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        pg8.l(7, objArr);
        e = e47.i(7, objArr);
        String str = vjg.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public v8e(int i) {
        ka2.k("commandCode shouldn't be COMMAND_CODE_CUSTOM", i != 0);
        this.a = i;
        this.b = "";
        this.c = Bundle.EMPTY;
    }

    public static v8e a(Bundle bundle) {
        int i = bundle.getInt(f, 0);
        if (i != 0) {
            return new v8e(i);
        }
        String string = bundle.getString(g);
        string.getClass();
        Bundle bundle2 = bundle.getBundle(h);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new v8e(string, bundle2);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f, this.a);
        bundle.putString(g, this.b);
        bundle.putBundle(h, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v8e)) {
            return false;
        }
        v8e v8eVar = (v8e) obj;
        return this.a == v8eVar.a && TextUtils.equals(this.b, v8eVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.b, Integer.valueOf(this.a));
    }

    public v8e(String str, Bundle bundle) {
        this.a = 0;
        str.getClass();
        this.b = str;
        bundle.getClass();
        this.c = new Bundle(bundle);
    }
}
