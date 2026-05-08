package defpackage;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class j9 extends mj8 implements gu5<String> {
    public static final j9 a = new j9(0);

    @Override // defpackage.gu5
    public final String invoke() {
        return UUID.randomUUID().toString();
    }
}
