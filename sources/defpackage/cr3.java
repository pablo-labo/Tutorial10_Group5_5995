package defpackage;

import defpackage.hr3;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cr3 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Integer.compare(((hr3.b) ((List) obj).get(0)).f, ((hr3.b) ((List) obj2).get(0)).f);
    }
}
