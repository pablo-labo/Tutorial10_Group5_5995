package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class uje<T> implements Comparator {
    public final /* synthetic */ tje a;

    public uje(tje tjeVar) {
        this.a = tjeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int iCompare = this.a.compare(t, t2);
        if (iCompare != 0) {
            return iCompare;
        }
        yie yieVar = (yie) t;
        String str = yieVar != null ? yieVar.b : null;
        if (str == null) {
            str = "";
        }
        yie yieVar2 = (yie) t2;
        String str2 = yieVar2 != null ? yieVar2.b : null;
        return ak2.i(str, str2 != null ? str2 : "");
    }
}
