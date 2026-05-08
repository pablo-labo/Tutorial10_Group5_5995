package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d8b {
    public final String a;
    public final long b;
    public final List<ea> c;
    public final List<u05> d;

    public d8b() {
        throw null;
    }

    public d8b(String str, long j, ArrayList arrayList, List list) {
        this.a = str;
        this.b = j;
        this.c = Collections.unmodifiableList(arrayList);
        this.d = Collections.unmodifiableList(list);
    }
}
