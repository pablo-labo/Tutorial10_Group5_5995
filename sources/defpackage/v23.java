package defpackage;

import defpackage.hr3;
import defpackage.id2;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class v23 implements Comparator {
    public final /* synthetic */ int a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            default:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i = 0;
                return id2.a.f(hr3.i.e((hr3.i) Collections.max(list, new jr3()), (hr3.i) Collections.max(list2, new jr3()))).a(list.size(), list2.size()).b((hr3.i) Collections.max(list, new kr3(i)), (hr3.i) Collections.max(list2, new kr3(i)), new kr3(i)).e();
        }
    }
}
