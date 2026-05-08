package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class mxg implements w7b, Continuation {
    public static boolean a(String str, byte[] bArr) {
        if (bArr.length == str.length()) {
            Iterable oh7Var = new oh7(0, bArr.length - 1, 1);
            if (!(oh7Var instanceof Collection) || !((Collection) oh7Var).isEmpty()) {
                Iterator<Integer> it = oh7Var.iterator();
                while (((nh7) it).c) {
                    int iNextInt = ((fh7) it).nextInt();
                    if (((byte) str.charAt(iNextInt)) != bArr[iNextInt]) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static void b(InputStream inputStream) throws IOException {
        inputStream.read();
        inputStream.read();
        inputStream.read();
        inputStream.read();
    }

    public static Pair c(InputStream inputStream) throws IOException {
        inputStream.skip(7L);
        int i = inputStream.read() & 255;
        int i2 = inputStream.read() & 255;
        int i3 = inputStream.read() & 255;
        if (i != 157 || i2 != 1 || i3 != 42) {
            return null;
        }
        return new Pair(Integer.valueOf((inputStream.read() & 255) | ((inputStream.read() & 255) << 8)), Integer.valueOf(((inputStream.read() & 255) << 8) | (inputStream.read() & 255)));
    }

    public static Pair e(InputStream inputStream) throws IOException {
        b(inputStream);
        if ((inputStream.read() & 255) != 47) {
            return null;
        }
        int i = inputStream.read() & 255;
        int i2 = inputStream.read();
        return new Pair(Integer.valueOf((i | ((i2 & 63) << 8)) + 1), Integer.valueOf((((inputStream.read() & 15) << 10) | ((inputStream.read() & 255) << 2) | ((i2 & 192) >> 6)) + 1));
    }

    public static Object f(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        String canonicalName = cls.getCanonicalName();
        r6.g(l6.i(u40.f("Invalid conditional user property field type. '", str, "' expected [", canonicalName, "] but was ["), obj2.getClass().getCanonicalName(), "]"));
        return null;
    }

    public static void g(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    @Override // defpackage.w7b
    public /* bridge */ /* synthetic */ Object d(p7d p7dVar) {
        return null;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws IOException {
        Bundle bundle = (Bundle) task.getResult(IOException.class);
        if (bundle == null) {
            r40.h("SERVICE_NOT_AVAILABLE");
            return null;
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            r40.h("INSTANCE_ID_RESET");
            return null;
        }
        if (string3 != null) {
            r40.h(string3);
            return null;
        }
        String strValueOf = String.valueOf(bundle);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 21);
        sb.append("Unexpected response: ");
        sb.append(strValueOf);
        Log.w("FirebaseInstanceId", sb.toString(), new Throwable());
        r40.h("SERVICE_NOT_AVAILABLE");
        return null;
    }
}
