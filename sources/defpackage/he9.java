package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class he9 {
    public final ArrayList a;
    public final ArrayList b;
    public final List<ge9> c;

    public he9(List<ge9> list) {
        this.c = list;
        this.a = new ArrayList(list.size());
        this.b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.a.add(new qce((List) list.get(i).b.c));
            this.b.add(list.get(i).c.t());
        }
    }
}
