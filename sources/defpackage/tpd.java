package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tpd {
    public static final HashMap b = new HashMap();
    public static final tpd c = new tpd("profile");
    public static final tpd d;
    public final String a;

    static {
        new tpd("friends");
        new tpd("groups");
        new tpd("message.write");
        d = new tpd("openid");
        new tpd("email");
        new tpd("phone");
        new tpd("gender");
        new tpd("birthdate");
        new tpd("address");
        new tpd("real_name");
        new tpd("onetime.share");
        new tpd("openchat.term.agreement.status");
        new tpd("openchat.create.join");
        new tpd("openchat.info");
        new tpd("openchatplug.managament");
        new tpd("openchatplug.info");
        new tpd("openchatplug.profile");
        new tpd("openchatplug.send.message");
        new tpd("openchatplug.receive.message.and.event");
    }

    public tpd(String str) {
        this.a = str;
        b.put(str, this);
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((tpd) it.next()).a);
        }
        return arrayList;
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            tpd tpdVar = (tpd) b.get(str);
            if (tpdVar != null) {
                arrayList.add(tpdVar);
            } else {
                arrayList.add(new tpd(str));
            }
        }
        return arrayList;
    }

    public static List<tpd> c(String str) {
        return TextUtils.isEmpty(str) ? Collections.EMPTY_LIST : b(Arrays.asList(str.split(" ")));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tpd.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((tpd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return l6.i(new StringBuilder("Scope{code='"), this.a, "'}");
    }
}
