package defpackage;

import java.io.File;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b43 implements Comparator {
    public final /* synthetic */ int a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                String name = ((File) obj).getName();
                int i = c43.f;
                return name.substring(0, i).compareTo(((File) obj2).getName().substring(0, i));
            default:
                return wl7.c(((br8) obj).getIndex(), ((br8) obj2).getIndex());
        }
    }
}
