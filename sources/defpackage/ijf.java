package defpackage;

import com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ijf {
    public static final ijf a;
    public static final /* synthetic */ ijf[] b;

    /* JADX INFO: Fake field, exist only in values array */
    ijf EF0;

    static {
        ijf ijfVar = new ijf(GesturesListener.SCROLL_DIRECTION_LEFT, 0);
        ijf ijfVar2 = new ijf(GesturesListener.SCROLL_DIRECTION_RIGHT, 1);
        a = ijfVar2;
        b = new ijf[]{ijfVar, ijfVar2};
    }

    public ijf() {
        throw null;
    }

    public static ijf valueOf(String str) {
        return (ijf) Enum.valueOf(ijf.class, str);
    }

    public static ijf[] values() {
        return (ijf[]) b.clone();
    }
}
