package defpackage;

import android.accounts.Account;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class w72 {
    public final Account a;
    public final Set b;
    public final Set c;
    public final Map d;
    public final String e;
    public final String f;
    public final yee g;
    public Integer h;

    public static final class a {
        public Account a;
        public ot0 b;
        public String c;
        public String d;
    }

    public w72(Account account, Set set, String str, String str2) {
        this.a = account;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.b = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.d = map;
        this.e = str;
        this.f = str2;
        this.g = yee.a;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((n9h) it.next()).getClass();
            hashSet.addAll(null);
        }
        this.c = Collections.unmodifiableSet(hashSet);
    }
}
