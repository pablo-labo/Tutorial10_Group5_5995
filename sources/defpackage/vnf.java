package defpackage;

import java.util.Comparator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class vnf implements Comparator<Pair<? extends qtc, ? extends List<f5e>>> {
    public static final vnf a = new vnf();

    @Override // java.util.Comparator
    public final int compare(Pair<? extends qtc, ? extends List<f5e>> pair, Pair<? extends qtc, ? extends List<f5e>> pair2) {
        Pair<? extends qtc, ? extends List<f5e>> pair3 = pair;
        Pair<? extends qtc, ? extends List<f5e>> pair4 = pair2;
        int iCompare = Float.compare(pair3.d().b, pair4.d().b);
        return iCompare != 0 ? iCompare : Float.compare(pair3.d().d, pair4.d().d);
    }
}
