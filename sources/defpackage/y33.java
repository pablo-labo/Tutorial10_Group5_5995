package defpackage;

import defpackage.hr3;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y33 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ y33(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            default:
                return ((hr3.a) Collections.max((List) obj)).compareTo((hr3.a) Collections.max((List) obj2));
        }
    }
}
