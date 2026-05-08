package defpackage;

import java.text.BreakIterator;

/* JADX INFO: loaded from: classes.dex */
public final class vc6 extends v1 {
    public final BreakIterator b;

    public vc6(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.b = characterInstance;
    }

    @Override // defpackage.v1
    public final int j0(int i) {
        return this.b.following(i);
    }

    @Override // defpackage.v1
    public final int m0(int i) {
        return this.b.preceding(i);
    }
}
