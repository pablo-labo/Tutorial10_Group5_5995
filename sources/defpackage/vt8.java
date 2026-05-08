package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vt8 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        au1 au1Var = (au1) obj;
        au1 au1Var2 = (au1) obj2;
        long j = au1Var.f;
        long j2 = au1Var2.f;
        return j - j2 == 0 ? au1Var.compareTo(au1Var2) : j < j2 ? -1 : 1;
    }
}
