package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class l7b extends HashMap<String, Object> {

    public class a extends HashMap<Object, Object> {

        /* JADX INFO: renamed from: l7b$a$a, reason: collision with other inner class name */
        public class C0306a extends HashMap<String, String> {
            public C0306a() {
                put("bubbled", "onPageChange");
            }
        }

        public a() {
            put("phasedRegistrationNames", new C0306a());
        }
    }

    public class b extends HashMap<Object, Object> {

        public class a extends HashMap<String, String> {
            public a() {
                put("bubbled", "onError");
            }
        }

        public b() {
            put("phasedRegistrationNames", new a());
        }
    }
}
