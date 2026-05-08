package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class w8e {
    public static final w8e b = new w8e(new HashSet());
    public static final String c;
    public final i47<v8e> a;

    static {
        String str = vjg.a;
        c = Integer.toString(0, 36);
    }

    public w8e(HashSet hashSet) {
        this.a = i47.k(hashSet);
    }

    public static w8e a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(c);
        if (parcelableArrayList == null) {
            zkd.T("SessionCommands", "Missing commands. Creating an empty SessionCommands");
            return b;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < parcelableArrayList.size(); i++) {
            hashSet.add(v8e.a((Bundle) parcelableArrayList.get(i)));
        }
        return new w8e(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w8e) {
            return this.a.equals(((w8e) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
