package defpackage;

import android.content.res.Resources;
import android.util.TypedValue;
import defpackage.o7d;

/* JADX INFO: loaded from: classes3.dex */
public final class y35 {
    public static final y35 a = new y35();

    public static Integer a(Resources resources, int i) {
        Object aVar;
        try {
            aVar = Integer.valueOf(resources.getColor(i, null));
        } catch (Throwable th) {
            aVar = new o7d.a(th);
        }
        return (Integer) (aVar instanceof o7d.a ? null : aVar);
    }

    public static Integer b(Resources.Theme theme, int i) {
        Object aVar;
        try {
            TypedValue typedValue = new TypedValue();
            aVar = theme.resolveAttribute(i, typedValue, true) ? Integer.valueOf(typedValue.data) : null;
        } catch (Throwable th) {
            aVar = new o7d.a(th);
        }
        return (Integer) (aVar instanceof o7d.a ? null : aVar);
    }
}
