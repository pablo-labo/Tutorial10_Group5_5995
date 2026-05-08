package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class uc2 extends mj8 implements Function1<Integer, Boolean> {
    final /* synthetic */ String $line;
    final /* synthetic */ juc $offset;
    final /* synthetic */ juc $spacesSeen;
    final /* synthetic */ juc $totalSpaces;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc2(juc jucVar, juc jucVar2, String str, juc jucVar3) {
        super(1);
        this.$spacesSeen = jucVar;
        this.$offset = jucVar2;
        this.$line = str;
        this.$totalSpaces = jucVar3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Integer num) {
        boolean z;
        int i;
        int iIntValue = num.intValue();
        int i2 = this.$spacesSeen.element;
        int i3 = this.$offset.element;
        while (true) {
            z = true;
            if (this.$spacesSeen.element >= iIntValue || this.$offset.element >= this.$line.length()) {
                break;
            }
            char cCharAt = this.$line.charAt(this.$offset.element);
            if (cCharAt != ' ') {
                if (cCharAt != '\t') {
                    break;
                }
                i = 4 - (this.$totalSpaces.element % 4);
            } else {
                i = 1;
            }
            this.$spacesSeen.element += i;
            this.$totalSpaces.element += i;
            this.$offset.element++;
        }
        if (this.$offset.element == this.$line.length()) {
            this.$spacesSeen.element = Integer.MAX_VALUE;
        }
        juc jucVar = this.$spacesSeen;
        int i4 = jucVar.element;
        if (iIntValue <= i4) {
            jucVar.element = i4 - iIntValue;
        } else {
            this.$offset.element = i3;
            jucVar.element = i2;
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
