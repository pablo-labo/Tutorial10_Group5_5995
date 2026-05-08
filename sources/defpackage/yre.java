package defpackage;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class yre {
    public static final HashSet a = new HashSet();

    public static class a extends yre {
    }

    public static class b extends yre {
    }

    public yre() {
        a.add(this);
    }
}
