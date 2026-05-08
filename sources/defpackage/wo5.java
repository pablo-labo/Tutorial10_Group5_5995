package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class wo5 {
    public final int a;
    public final Object b;

    @Deprecated
    public wo5() {
        this.a = 1;
        this.b = Collections.singletonList(null);
    }

    public wo5(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public wo5(ArrayList arrayList) {
        this.a = 0;
        this.b = arrayList;
    }
}
