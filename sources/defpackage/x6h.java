package defpackage;

import java.io.IOException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class x6h extends mj8 implements Function2<Integer, Long, j6g> {
    final /* synthetic */ luc<Integer> $extendedCreatedAtSeconds;
    final /* synthetic */ luc<Integer> $extendedLastAccessedAtSeconds;
    final /* synthetic */ luc<Integer> $extendedLastModifiedAtSeconds;
    final /* synthetic */ to1 $this_readOrSkipLocalHeader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6h(uqc uqcVar, luc lucVar, luc lucVar2, luc lucVar3) {
        super(2);
        this.$this_readOrSkipLocalHeader = uqcVar;
        this.$extendedLastModifiedAtSeconds = lucVar;
        this.$extendedLastAccessedAtSeconds = lucVar2;
        this.$extendedCreatedAtSeconds = lucVar3;
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r13v5, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r13v7, types: [T, java.lang.Integer] */
    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(Integer num, Long l) throws IOException {
        int iIntValue = num.intValue();
        long jLongValue = l.longValue();
        if (iIntValue == 21589) {
            if (jLongValue < 1) {
                r40.h("bad zip: extended timestamp extra too short");
                return null;
            }
            byte b = this.$this_readOrSkipLocalHeader.readByte();
            boolean z = (b & 1) == 1;
            boolean z2 = (b & 2) == 2;
            boolean z3 = (b & 4) == 4;
            to1 to1Var = this.$this_readOrSkipLocalHeader;
            long j = z ? 5L : 1L;
            if (z2) {
                j += 4;
            }
            if (z3) {
                j += 4;
            }
            if (jLongValue < j) {
                r40.h("bad zip: extended timestamp extra too short");
                return null;
            }
            if (z) {
                this.$extendedLastModifiedAtSeconds.element = Integer.valueOf(to1Var.x1());
            }
            if (z2) {
                this.$extendedLastAccessedAtSeconds.element = Integer.valueOf(this.$this_readOrSkipLocalHeader.x1());
            }
            if (z3) {
                this.$extendedCreatedAtSeconds.element = Integer.valueOf(this.$this_readOrSkipLocalHeader.x1());
            }
        }
        return j6g.a;
    }
}
