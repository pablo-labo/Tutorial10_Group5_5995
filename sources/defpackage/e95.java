package defpackage;

import com.datadog.android.log.LogAttributes;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class e95 {
    public static final /* synthetic */ e95[] a = {new e95("text", 0), new e95("email", 1), new e95("tel", 2), new e95("url", 3), new e95("textarea", 4), new e95("radio", 5), new e95("checkbox", 6), new e95("single_select_list", 7), new e95("input_list", 8), new e95(LogAttributes.DATE, 9), new e95("file", 10), new e95("city", 11), new e95("state", 12), new e95("city_state", 13), new e95("country", 14), new e95("select", 15)};

    /* JADX INFO: Fake field, exist only in values array */
    e95 EF5;

    public e95() {
        throw null;
    }

    public static e95 valueOf(String str) {
        return (e95) Enum.valueOf(e95.class, str);
    }

    public static e95[] values() {
        return (e95[]) a.clone();
    }
}
