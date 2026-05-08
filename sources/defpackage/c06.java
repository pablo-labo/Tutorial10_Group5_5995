package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c06 {
    public final List<v63> a;

    public c06(List list) {
        this.a = list;
        if (list.isEmpty()) {
            l5.q("credentialOptions should not be empty");
            throw null;
        }
    }
}
