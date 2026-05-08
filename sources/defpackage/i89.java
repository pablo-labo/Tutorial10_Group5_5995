package defpackage;

import android.os.Build;
import androidx.compose.foundation.MagnifierElement;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class i89 {
    public static final r5e<gu5<ooa>> a = new r5e<>("MagnifierPositionInRoot");

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static e b(Function1 function1, Function1 function12, wbb wbbVar) {
        return a() ? new MagnifierElement(function1, function12, wbbVar) : e.a.b;
    }
}
