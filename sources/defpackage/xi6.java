package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class xi6 implements wb5<xi6> {
    public final String a;
    public final List<String> b;
    public final boolean c;

    public xi6(String str, List<String> list, boolean z) {
        this.a = str;
        this.b = Collections.unmodifiableList(list);
        this.c = z;
    }
}
