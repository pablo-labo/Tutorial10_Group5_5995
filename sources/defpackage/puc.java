package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class puc implements ouc {
    public final LinkedHashMap a = new LinkedHashMap();

    @Override // defpackage.ouc
    public final void a(String str, String str2) {
        this.a.put(str, str2);
    }

    @Override // defpackage.ouc
    public final String b(String str) {
        str.getClass();
        String str2 = (String) this.a.get(str);
        return str2 == null ? str : str2;
    }
}
