package defpackage;

import android.net.Uri;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class f1a implements ot1 {
    public final ArrayList a;

    public f1a(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.ot1
    public final String a() {
        return ((ot1) this.a.get(0)).a();
    }

    @Override // defpackage.ot1
    public final boolean b(Uri uri) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((ot1) arrayList.get(i)).b(uri)) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.ot1
    public final boolean c() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1a) {
            return this.a.equals(((f1a) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiCacheKey:" + this.a.toString();
    }
}
