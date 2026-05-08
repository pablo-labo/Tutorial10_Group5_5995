package defpackage;

import android.app.Person;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class t9b {

    public static class a {
        public static Person a(t9b t9bVar) {
            return new Person.Builder().setName(null).setIcon(null).setUri(null).setKey(null).setBot(false).setImportant(false).build();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof t9b)) {
            return false;
        }
        if (!"null".equals("null")) {
            return false;
        }
        Object obj2 = Boolean.FALSE;
        return obj2.equals(obj2) && obj2.equals(obj2);
    }

    public final int hashCode() {
        Boolean bool = Boolean.FALSE;
        return Objects.hash(null, null, bool, bool);
    }
}
