package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ea {
    public final long a;
    public final int b;
    public final List<l3d> c;
    public final List<ez3> d;
    public final List<ez3> e;
    public final List<ez3> f;

    public ea(long j, int i, ArrayList arrayList, List list, List list2, List list3) {
        this.a = j;
        this.b = i;
        this.c = Collections.unmodifiableList(arrayList);
        this.d = Collections.unmodifiableList(list);
        this.e = Collections.unmodifiableList(list2);
        this.f = Collections.unmodifiableList(list3);
    }
}
