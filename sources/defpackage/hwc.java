package defpackage;

import defpackage.gwc;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class hwc {

    public static abstract class a {
        public static final a a;

        /* JADX INFO: renamed from: hwc$a$a, reason: collision with other inner class name */
        public class C0259a extends a {
            public final /* synthetic */ Method b;

            public C0259a(Method method) {
                this.b = method;
            }

            @Override // hwc.a
            public final boolean a(Object obj, AccessibleObject accessibleObject) {
                try {
                    return ((Boolean) this.b.invoke(accessibleObject, obj)).booleanValue();
                } catch (Exception e) {
                    l6.p("Failed invoking canAccess", e);
                    return false;
                }
            }
        }

        public class b extends a {
            @Override // hwc.a
            public final boolean a(Object obj, AccessibleObject accessibleObject) {
                return true;
            }
        }

        static {
            a c0259a;
            if (yw7.a >= 9) {
                try {
                    c0259a = new C0259a(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
                } catch (NoSuchMethodException unused) {
                    c0259a = null;
                }
            } else {
                c0259a = null;
            }
            if (c0259a == null) {
                c0259a = new b();
            }
            a = c0259a;
        }

        public abstract boolean a(Object obj, AccessibleObject accessibleObject);
    }

    public static gwc.a a(Class cls) {
        Iterator it = Collections.EMPTY_LIST.iterator();
        while (it.hasNext()) {
            gwc.a aVarA = ((gwc) it.next()).a();
            if (aVarA != gwc.a.b) {
                return aVarA;
            }
        }
        return gwc.a.a;
    }
}
