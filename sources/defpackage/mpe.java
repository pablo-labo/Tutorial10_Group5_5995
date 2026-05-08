package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class mpe extends ipe {
    public final List<b> a;

    public static final class a {
    }

    public static final class b {
        public final List<a> a;

        public b(ArrayList arrayList) {
            this.a = Collections.unmodifiableList(arrayList);
        }
    }

    public mpe(ArrayList arrayList) {
        this.a = Collections.unmodifiableList(arrayList);
    }
}
