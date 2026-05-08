package defpackage;

import androidx.media3.exoplayer.hls.playlist.b;
import defpackage.cke;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ub1 implements Comparator {
    public final /* synthetic */ int a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                tb1 tb1Var = (tb1) obj;
                tb1 tb1Var2 = (tb1) obj2;
                int iCompare = Integer.compare(tb1Var.c, tb1Var2.c);
                return iCompare != 0 ? iCompare : tb1Var.b.compareTo(tb1Var2.b);
            case 1:
                return ((b.a) obj).a.compareTo(((b.a) obj2).a);
            default:
                return ((cke.a) obj).a - ((cke.a) obj2).a;
        }
    }
}
