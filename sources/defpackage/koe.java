package defpackage;

import androidx.media3.ui.d;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class koe implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        d.b bVar = (d.b) obj;
        d.b bVar2 = (d.b) obj2;
        int iCompare = Integer.compare(bVar2.b, bVar.b);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompareTo = bVar.c.compareTo(bVar2.c);
        return iCompareTo != 0 ? iCompareTo : bVar.d.compareTo(bVar2.d);
    }
}
