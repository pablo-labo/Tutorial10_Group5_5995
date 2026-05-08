package defpackage;

import defpackage.hr3;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c90 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ c90(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return wl7.c(((qnb) obj2).a, ((qnb) obj).a);
            default:
                return ((hr3.g) ((List) obj).get(0)).compareTo((hr3.g) ((List) obj2).get(0));
        }
    }
}
