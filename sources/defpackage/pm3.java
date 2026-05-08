package defpackage;

import android.content.Context;
import io.jsonwebtoken.JwtParser;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public class pm3 implements th3 {
    public final Context a;
    public final d2f b = new d2f(new a());

    public static final class a extends mj8 implements gu5<Class<?>> {
        public a() {
            super(0);
        }

        @Override // defpackage.gu5
        public final Class<?> invoke() {
            String strA = pm3.this.a();
            Class<?> cls = null;
            while (strA.length() != 0) {
                try {
                    cls = Class.forName(strA + ".BuildConfig");
                } catch (Exception unused) {
                }
                int iV = zve.V(strA, JwtParser.SEPARATOR_CHAR, 0, 6);
                strA = iV == -1 ? "" : strA.substring(0, iV);
            }
            return cls;
        }
    }

    public pm3(Context context) {
        this.a = context;
    }

    @Override // defpackage.th3
    public final String a() {
        String packageName = this.a.getPackageName();
        packageName.getClass();
        return packageName;
    }

    public final String e(String str) {
        try {
            Class cls = (Class) this.b.getValue();
            Field field = cls != null ? cls.getField(str) : null;
            if (field != null) {
                Object obj = field.get(null);
                if (obj instanceof String) {
                    return (String) obj;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
