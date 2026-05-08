package defpackage;

import android.util.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class cbb extends mj8 implements gu5<String> {
    final /* synthetic */ Pair<String, String> $appSetIdAndScope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbb(Pair<String, String> pair) {
        super(0);
        this.$appSetIdAndScope = pair;
    }

    @Override // defpackage.gu5
    public final String invoke() {
        Pair<String, String> pair = this.$appSetIdAndScope;
        if (pair != null) {
            return (String) pair.first;
        }
        return null;
    }
}
