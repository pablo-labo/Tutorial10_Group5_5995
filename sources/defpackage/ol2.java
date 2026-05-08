package defpackage;

import defpackage.v33;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ol2 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ ol2(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return wl7.c(((im7) obj).b, ((im7) obj2).b);
            case 1:
                ox4 ox4Var = (ox4) obj;
                ox4 ox4Var2 = (ox4) obj2;
                if (ox4Var != null || ox4Var2 != null) {
                    if (ox4Var != null) {
                        if (ox4Var2 != null) {
                            long timestampMs = ox4Var.getTimestampMs() - ox4Var2.getTimestampMs();
                            if (timestampMs != 0) {
                                if (timestampMs < 0) {
                                }
                            }
                        }
                        return 1;
                    }
                    return -1;
                }
                return 0;
            default:
                return ((v33.c) obj).a().compareTo(((v33.c) obj2).a());
        }
    }
}
