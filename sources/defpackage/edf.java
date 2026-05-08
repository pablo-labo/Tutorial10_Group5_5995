package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class edf extends xcf {
    public final String b;
    public final int c;
    public final Function1<kdf, j6g> d;

    /* JADX WARN: Multi-variable type inference failed */
    public edf(Object obj, String str, int i, Function1<? super kdf, j6g> function1) {
        super(obj);
        this.b = str;
        this.c = i;
        this.d = function1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuItem(key=");
        sb.append(this.a);
        sb.append(", label=\"");
        sb.append(this.b);
        sb.append("\", leadingIcon=");
        return k6.h(sb, this.c, ')');
    }
}
