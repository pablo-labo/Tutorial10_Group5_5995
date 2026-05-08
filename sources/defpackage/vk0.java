package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class vk0 {
    public static final vk0 a;
    public static final /* synthetic */ vk0[] b;

    /* JADX INFO: Fake field, exist only in values array */
    vk0 EF0;

    static {
        vk0 vk0Var = new vk0("TEST", 0);
        vk0 vk0Var2 = new vk0("JOB_SEARCH_ANDROID", 1);
        a = vk0Var2;
        b = new vk0[]{vk0Var, vk0Var2, new vk0("EMPLOYER_ANDROID", 2)};
    }

    public vk0() {
        throw null;
    }

    public static vk0 valueOf(String str) {
        return (vk0) Enum.valueOf(vk0.class, str);
    }

    public static vk0[] values() {
        return (vk0[]) b.clone();
    }
}
