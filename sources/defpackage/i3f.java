package defpackage;

import android.os.Trace;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class i3f extends h91 {
    public final String b;
    public final ArrayList c;

    public i3f(String str) {
        super(11);
        this.b = str;
        this.c = new ArrayList();
    }

    public final void R(String str, String str2) {
        this.c.add(str + ": " + str2);
    }

    public final h91 S(Object obj, String str) {
        obj.getClass();
        R(str, obj.toString());
        return this;
    }

    public final void T() {
        Trace.beginSection(jpf.g(this.b + ""));
    }
}
