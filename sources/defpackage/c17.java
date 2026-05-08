package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class c17 implements b17 {
    public final int a;
    public final int b;
    public final Map<String, Object> c;

    public c17(int i, int i2, HashMap map) {
        this.a = i;
        this.b = i2;
        this.c = map;
    }

    @Override // defpackage.jg6
    public final Map<String, Object> getExtras() {
        return this.c;
    }

    @Override // defpackage.b17
    public final int getHeight() {
        return this.b;
    }

    @Override // defpackage.b17
    public final int getWidth() {
        return this.a;
    }
}
